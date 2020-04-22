package model.dao;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import member.exception.MemberException;

import static common.JdbcTemplate.*;
import model.vo.Member;

public class MemberDao {

	public MemberDao() {

	}

	// * 초그인 조회 요청 처리용

	public boolean selectLogin(String userId, String userPwd) throws MemberException {
		boolean res = false;
		Connection con = getConnection();
		PreparedStatement pstm = null;
		ResultSet rs = null;

		String sql = "select count(userid) from member where userid = ? and userpwd = ?";
		try {
			pstm = con.prepareStatement(sql);

			pstm.setString(1, userId);
			pstm.setString(2, userPwd);
			rs = pstm.executeQuery();

			if (rs.next()) {
				if (rs.getInt(1) == 1) {
					res = true;
				} else {
					throw new MemberException("로그인 실패");
				}
			}
			return res;
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			close(rs, pstm, con);
		}
		return res;
	}

	// 아이디로 회원 조회 처리

	public Member selectMember(String userId) {

		Member m = null;
		Connection con = getConnection();
		PreparedStatement pstm = null;
		ResultSet rset = null;
		String sql = "SELECT * FROM MEMBER WHERE USERID = ?";
		try {
			pstm = con.prepareStatement(sql);
			pstm.setString(1, userId);
			rset = pstm.executeQuery();

			if (rset.next()) {
				m = new Member();
				m.setUserId(rset.getString(1));
				m.setUserPwd(rset.getString(2));
				m.setUserName(rset.getString(3));
				m.setGender(rset.getString(4));
				m.setAge(rset.getInt(5));
				m.setPhone(rset.getString(6));
				m.seteMail(rset.getString(7));
				m.setEtc(rset.getString(8));
				m.setEnroll_date(rset.getDate(9));
				m.setLastModified(rset.getDate(10));
			}
			return m;
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			close(rset, pstm, con);
		}
		return m;
	}

	// 회원 전체 조회 처리용 : List
	public ArrayList<Member> selectList() throws MemberException {
		ArrayList<Member> memberList = new ArrayList<>();
		Connection con = getConnection();
		Statement stmt = null;
		ResultSet rset = null;

		String sql = "SELECT * FROM MEMBER";

		try {
			stmt = con.createStatement();
			rset = stmt.executeQuery(sql);
			while (rset.next()) {
				Member m = new Member();
				m.setUserId(rset.getString(1));
				m.setUserPwd(rset.getString(2));
				m.setUserName(rset.getString(3));
				m.setGender(rset.getString(4));
				m.setAge(rset.getInt(5));
				m.setPhone(rset.getString(6));
				m.seteMail(rset.getString(7));
				m.setEtc(rset.getString(8));
				m.setEnroll_date(rset.getDate(9));
				m.setLastModified(rset.getDate(10));

				memberList.add(m);
			}
			if (memberList.isEmpty()) {
				throw new MemberException("회원이 없습니다.");
			}
			return memberList;
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			close(rset, stmt, con);
		}
		return memberList;
	}

	public List<Member> selectSearchAge(int beginAge, int endAge) throws MemberException {
		List<Member> memberList = new ArrayList<Member>();

		Connection con = getConnection();
		PreparedStatement ptmt = null;
		ResultSet rset = null;

		String sql = "select * from member where age between ? and ? ";

		try {
			ptmt = con.prepareStatement(sql);
			ptmt.setInt(1, beginAge);
			ptmt.setInt(2, endAge);
			rset = ptmt.executeQuery();
			while (rset.next()) {
				Member m = new Member();
				m.setUserId(rset.getString(1));
				m.setUserPwd(rset.getString(2));
				m.setUserName(rset.getString(3));
				m.setGender(rset.getString(4));
				m.setAge(rset.getInt(5));
				m.setPhone(rset.getString(6));
				m.seteMail(rset.getString(7));
				m.setEtc(rset.getString(8));
				m.setEnroll_date(rset.getDate(9));
				m.setLastModified(rset.getDate(10));

				memberList.add(m);
			}
			if (memberList.isEmpty()) {
				throw new MemberException("해당 회원이 없습니다.");
			}

			return memberList;
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			close(rset, ptmt, con);
		}
		return memberList;

	}

	// 성별 별 검색
	public List<Member> selectSearchGender(String gender) throws MemberException {
		List<Member> memberList = new ArrayList<Member>();

		Connection con = getConnection();
		PreparedStatement ptmt = null;
		ResultSet rset = null;

		String sql = "select * from member where gender = ? ";

		try {
			ptmt = con.prepareStatement(sql);
			ptmt.setString(1, gender);
			rset = ptmt.executeQuery();
			while (rset.next()) {
				Member m = new Member();
				m.setUserId(rset.getString(1));
				m.setUserPwd(rset.getString(2));
				m.setUserName(rset.getString(3));
				m.setGender(rset.getString(4));
				m.setAge(rset.getInt(5));
				m.setPhone(rset.getString(6));
				m.seteMail(rset.getString(7));
				m.setEtc(rset.getString(8));
				m.setEnroll_date(rset.getDate(9));
				m.setLastModified(rset.getDate(10));

				memberList.add(m);
			}
			if (memberList.isEmpty()) {
				throw new MemberException("해당 회원이 없습니다.");
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			close(rset, ptmt, con);
		}
		return memberList;

	}

	// 회원 검색 : 가입 날짜 별 검색

	public List<Member> selectSearchEnrollDate(Date begin, Date end) throws MemberException {

		List<Member> memberList = new ArrayList<Member>();

		Connection con = getConnection();
		PreparedStatement ptmt = null;
		ResultSet rset = null;

		String sql = "select * from member where enroll_date between ? and ? ";

		try {
			ptmt = con.prepareStatement(sql);
			ptmt.setDate(1, begin);
			ptmt.setDate(2, end);
			rset = ptmt.executeQuery();
			while (rset.next()) {
				Member m = new Member();
				m.setUserId(rset.getString(1));
				m.setUserPwd(rset.getString(2));
				m.setUserName(rset.getString(3));
				m.setGender(rset.getString(4));
				m.setAge(rset.getInt(5));
				m.setPhone(rset.getString(6));
				m.seteMail(rset.getString(7));
				m.setEtc(rset.getString(8));
				m.setEnroll_date(rset.getDate(9));
				m.setLastModified(rset.getDate(10));

				memberList.add(m);
			}
			if (memberList.isEmpty()) {
				throw new MemberException("해당 회원이 없습니다.");
			}

			return memberList;
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			close(rset, ptmt, con);
		}
		return memberList;

	}

	public List<Member> selectSearchName(String nameKeyword) throws MemberException {

		List<Member> memberList = new ArrayList<Member>();

		Connection con = getConnection();
		PreparedStatement ptmt = null;
		ResultSet rset = null;

		String sql = "select * from member where username like '%'||?||'%'";

		try {
			ptmt = con.prepareStatement(sql);
			ptmt.setString(1, nameKeyword);
			rset = ptmt.executeQuery();
			while (rset.next()) {
				Member m = new Member();
				m.setUserId(rset.getString(1));
				m.setUserPwd(rset.getString(2));
				m.setUserName(rset.getString(3));
				m.setGender(rset.getString(4));
				m.setAge(rset.getInt(5));
				m.setPhone(rset.getString(6));
				m.seteMail(rset.getString(7));
				m.setEtc(rset.getString(8));
				m.setEnroll_date(rset.getDate(9));
				m.setLastModified(rset.getDate(10));

				memberList.add(m);
			}
			if (memberList.isEmpty()) {
				throw new MemberException("해당 회원이 없습니다.");
			}

			return memberList;
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			close(rset, ptmt, con);
		}
		return memberList;
	}

	// 회원 가입 처리용
	public int insertMember(Member member) throws MemberException {

		Connection con = getConnection();
		PreparedStatement pstm = null;

		int res = 0;

		try {
			// * 3. Query준비
			String sql = "insert into member values(?,?,?,?,?,?,?,?,sysdate,sysdate)";
			pstm = con.prepareStatement(sql);
			pstm.setString(1, member.getUserId());
			pstm.setString(2, member.getUserPwd());
			pstm.setString(3, member.getUserName());
			pstm.setString(4, member.getGender());
			pstm.setInt(5, member.getAge());
			pstm.setString(6, member.getPhone());
			pstm.setString(7, member.geteMail());
			pstm.setString(8, member.getEtc());
			// * 4. 실행 및 Return
			res = pstm.executeUpdate();
			if (res == 0) {
				throw new MemberException("추가된 행이 하나도 없습니다. 조건을 확인하세요.");
			}
			return res;
			// * 5. DB종료
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			close(pstm, con);
		}
		return res;
	}

	public int updateMember(Member member) throws MemberException {
		int res = 0;

		Connection con = getConnection();
		PreparedStatement pstm = null;

		try {
			String sql = "UPDATE MEMBER SET USERPWD = ? WHERE USERID = ?";
			pstm = con.prepareStatement(sql);
			pstm.setString(1, member.getUserPwd());
			pstm.setString(2, member.getUserId());

			res = pstm.executeUpdate();
			if (res == 0) {
				throw new MemberException("변경된 행이 하나도 없습니다. 조건을 확인하세요.");
			}
			return res;
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			close(pstm, con);
		}
		return res;
	}

	// 회원 삭제용
	public int delectMember(String userId) throws MemberException {
		int res = 0;
		Connection con = getConnection();
		PreparedStatement pstm = null;

		try {
			String sql = "DELETE FROM MEMBER WHERE USERID = ? ";
			pstm = con.prepareStatement(sql);
			pstm.setString(1, userId);
			res = pstm.executeUpdate();
			if (res == 0) {
				throw new MemberException("삭제된 행이 없습니다.  ID를 확인하세요. ");
			}
			return res;
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			close(pstm, con);
		}
		return res;
	}

}