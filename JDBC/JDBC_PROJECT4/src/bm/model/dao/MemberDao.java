package bm.model.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

import bm.exception.BMException;
import bm.model.vo.Member;
import common.JdbcTemplate;

public class MemberDao {

	private JdbcTemplate jdt = JdbcTemplate.getInstance();

	// 회원 가입 처리용
	public int insertMember(Connection con, Member member) throws BMException {
		PreparedStatement pstm = null;
		int res = 0;
		try {
			String sql = "INSERT INTO TB_MEMBER VALUES(?,?,1001,?,SYSDATE)";
			pstm = con.prepareStatement(sql);
			pstm.setString(1, member.getmId());
			pstm.setString(2, member.getmPwd());
			pstm.setString(3, member.getPhone());

			res = pstm.executeUpdate();
		} catch (SQLException e) {
			throw new BMException(e.getMessage());
		} finally {
			jdt.close(pstm);
		}
		return res;
	}

	public Member logIn(Connection con, String mId, String mPwd) throws BMException {

		PreparedStatement pstm = null;
		ResultSet rs = null;
		Member member = null;
		String sql = "SELECT * FROM TB_MEMBER WHERE M_ID = ? AND M_PASSWORD = ?";
		try {
			pstm = con.prepareStatement(sql);
			pstm.setString(1, mId);
			pstm.setString(2, mPwd);
			rs = pstm.executeQuery();

			if (rs.next()) {
				member = new Member();
				member.setmId(rs.getString(1));
				member.setmPwd(rs.getString(2));
				member.setmGrade(rs.getInt(3));
				member.setPhone(rs.getString(4));
				member.setRentAble_Date(rs.getDate(5));
			}
		} catch (SQLException e) {
			throw new BMException(e.getMessage());
		} finally {
			jdt.close(rs, pstm);
		}
		return member;
	}

	public int updateInfo(Connection con, String mId, String newPwd, String newPhone) throws BMException {
		int res = 0;
		String sql = "";
		Statement stmt = null;
		ResultSet rSet = null;
		try {

			if (newPwd.toUpperCase().equals("X")) {
				// 전화번호만 변경
				sql = "UPDATE TB_MEMBER SET M_PASSWORD = M_PASSWORD, M_TELL = " + "\'" + newPhone + "\'"
						+ " WHERE M_ID = " + "'" + mId + "'";
				res = 1;
				if (newPhone.toUpperCase().equals("X")) {
					// 비밀번호, 전화번호 둘다 변경하지 않음
					sql = "UPDATE TB_MEMBER SET M_PASSWORD = M_PASSWORD, M_TELL = M_TELL WHERE M_ID = " + "\'" + mId
							+ "\'";
					res = 0;
				}
			} else if (newPhone.toUpperCase().equals("X")) {
				// 비밀번호만 변경
				sql = "UPDATE TB_MEMBER SET M_PASSWORD = " + "\'" + newPwd + "\'" + ", M_TELL = M_TELL WHERE M_ID = "
						+ "'" + mId + "'";
				res = 2;

			} else {
				// 비밀번호, 전화번호 둘다 변경
				sql = "UPDATE TB_MEMBER SET M_PASSWORD = " + "\'" + newPwd + "\'" + ", M_TELL = " + "\'" + newPhone
						+ "\'" + " WHERE M_ID = " + "'" + mId + "'";
				res = 3;

			}

			stmt = con.createStatement();
			rSet = stmt.executeQuery(sql);
		} catch (SQLException e) {
			throw new BMException(e.getMessage());
		} finally {
			jdt.close(rSet, stmt);
		}
		return res;
	}

	public List<Member> printAllMembers(Connection con) throws BMException {
		List<Member> memberList = new ArrayList<>();
		Member member = null;
		Statement stmt = null;
		ResultSet rSet = null;
		String sql = "SELECT * FROM TB_MEMBER";
		try {
			stmt = con.createStatement();
			rSet = stmt.executeQuery(sql);
			while (rSet.next()) {
				member = new Member();
				member.setmId(rSet.getString(1));
				member.setmPwd(rSet.getString(2));
				member.setmGrade(rSet.getInt(3));
				member.setPhone(rSet.getString(4));
				member.setRentAble_Date(rSet.getDate(5));
				memberList.add(member);
			}
		} catch (SQLException e) {
			throw new BMException(e.getMessage());
		} finally {
			jdt.close(rSet, stmt);
		}
		return memberList;

	}

	// 회원 삭제용
	public int deleteMember(Connection con, String mId) throws BMException {
		int res = 0;
		PreparedStatement pstm = null;
		try {
			String sql = "DELETE FROM TB_MEMBER WHERE M_ID = ? ";
			pstm = con.prepareStatement(sql);
			pstm.setString(1, mId);
			res = pstm.executeUpdate();
		} catch (SQLException e) {
			throw new BMException(e.getMessage());
		} finally {
			jdt.close(pstm);
		}

		return res;
	}

	public Member refreshInfo(Connection con, String mId) throws BMException {
		Member member = null;
		PreparedStatement pstm = null;
		ResultSet rSet = null;
		try {
			String sql = "SELECT * FROM TB_MEMBER WHERE M_ID = ?";
			pstm = con.prepareStatement(sql);
			pstm.setString(1, mId);
			rSet = pstm.executeQuery();
			if (rSet.next()) {
				member = new Member();
				member.setmId(rSet.getString(1));
				member.setmPwd(rSet.getString(2));
				member.setmGrade(rSet.getInt(3));
				member.setPhone(rSet.getString(4));
				member.setRentAble_Date(rSet.getDate(5));
			}
		} catch (SQLException e) {
			throw new BMException(e.getMessage());
		} finally {
			jdt.close(rSet, pstm);
		}

		return member;
	}

	public Map<String, Object> myRentInfo(Connection con, String mId) throws BMException {
		Map<String, Object> rentResultMap = new LinkedHashMap<>();
		PreparedStatement pstm = null;
		ResultSet rSet = null;

		String sql = "SELECT * FROM TB_RENT_MASTER WHERE M_ID = ?";
		try {
			pstm = con.prepareStatement(sql);
			pstm.setString(1, mId);
			rSet = pstm.executeQuery();
			while (rSet.next()) {
				rentResultMap.put("대출번호", rSet.getInt(1));
				rentResultMap.put("대출일자", rSet.getDate(3));
				rentResultMap.put("대출건", rSet.getString(5));
				rentResultMap.put("완납여부", rSet.getNString(4));
			}
		} catch (SQLException e) {
			throw new BMException(e.getMessage());
		} finally {
			jdt.close(rSet, pstm);
		}
		return rentResultMap;
	}

	public Map<Integer, Object> rentInfoDetail(Connection con, int rmIdx) throws BMException {
		Map<Integer, Object> returnMap = new LinkedHashMap<>();
		Map<String, Object> resultMap = new LinkedHashMap<>();
		PreparedStatement pstm = null;
		ResultSet rSet = null;
		try {
			String sql = "SELECT RM_RETURN_YN, TRM.RM_IDX, TRB.RB_IDX, TC.C_INFO, TB.B_TITLE, TB.B_AUTHOR, TRB.RB_REGDATE, TRB.RB_RETURN_DATE, TRB.RB_EXTENTION_CNT FROM TB_RENT_MASTER TRM JOIN TB_RENT_BOOK TRB ON (TRM.RM_IDX=TRB.RM_IDX)  JOIN TB_BOOK TB ON (TB.B_BNO=TRB.B_BNO) JOIN TB_CODE TC ON (TB.B_CATEGORY = TC.C_CODE) WHERE TRM.RM_IDX = ?";
			pstm = con.prepareStatement(sql);
			pstm.setInt(1, rmIdx);
			rSet = pstm.executeQuery();
			while (rSet.next()) {
				resultMap = new LinkedHashMap<>();
				resultMap.put("반납여부", rSet.getString(1));
				resultMap.put("대출코드", rSet.getInt(2));
				resultMap.put("대출도서코드", rSet.getInt(3));
				resultMap.put("카테고리", rSet.getString(4));
				resultMap.put("제목", rSet.getString(5));
				resultMap.put("작가", rSet.getString(6));
				resultMap.put("등록일", rSet.getDate(7));
				resultMap.put("반납일", rSet.getDate(8));
				resultMap.put("연장횟수", rSet.getInt(9));
				returnMap.put(rSet.getInt(3), resultMap);
			}
		} catch (SQLException e) {
			throw new BMException(e.getMessage());
		} finally {
			jdt.close(rSet, pstm);
		}

		return returnMap;
	}

}
