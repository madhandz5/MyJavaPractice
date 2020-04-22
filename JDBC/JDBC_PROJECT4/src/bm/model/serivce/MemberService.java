package bm.model.serivce;

import java.sql.Connection;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.apache.log4j.Logger;

import bm.exception.BMException;
import bm.model.dao.MemberDao;
import bm.model.vo.Member;
import common.BmLogFactory;
import common.JdbcTemplate;

public class MemberService {

	private MemberDao mDao = new MemberDao();
	private JdbcTemplate jdt = JdbcTemplate.getInstance();
	private Logger log = BmLogFactory.getInstance().getLogger(MemberService.class);

	public Map<String, Object> insertMember(Member member) {
		Map<String, Object> resultMap = new HashMap<>();
		Connection con = jdt.getConnection();
		int result = 0;
		try {
			result = mDao.insertMember(con, member);

			if (result > 0) {
				resultMap.put("isSuccess", true);
			} else {
				resultMap.put("isSuccess", false);
			}
			jdt.commit(con);
		} catch (BMException e) {
			jdt.rollback(con);
			resultMap.put("isSuccess", false);
			resultMap.put("res", "관리자에게 문의하세요.\n" + e.getMessage());
		} finally {
			jdt.close(con);
		}

		return resultMap;
	}

	public Map<String, Object> logIn(String mId, String mPwd) {

		Map<String, Object> resultMap = new HashMap<String, Object>();
		Connection con = jdt.getConnection();
		Member member = new Member();
		try {
			member = mDao.logIn(con, mId, mPwd);
			if (member != null) {
				resultMap.put("isSuccess", true);
				resultMap.put("res", member);
			} else {
				resultMap.put("isSuccess", false);
				resultMap.put("res", member);
			}
		} catch (BMException e) {
			resultMap.put("isSuccess", false);
			resultMap.put("res", "관리자에게 문의하세요.\n" + e.getMessage());
			log.debug(e.getMessage());
		} finally {
			jdt.close(con);
		}

		return resultMap;

	}

	public Map<String, Object> updateInfo(String mId, String newPwd, String newPhone) {
		Map<String, Object> resultMap = new HashMap<>();
		Connection con = jdt.getConnection();

		int result = 0;
		try {
			result = mDao.updateInfo(con, mId, newPwd, newPhone);
			resultMap.put("isSuccess", true);
			if (result == 1) {
				resultMap.put("res", "전화번호만  변경되었습니다.");
				jdt.commit(con);
			} else if (result == 2) {
				resultMap.put("res", "비밀번호만 변경되었습니다.");
			} else if (result == 3) {
				resultMap.put("res", "전화번호와 비밀번호가 모두 변경되었습니다.");
			} else if (result == 0) {

				resultMap.put("res", "변경된 정보가 없습니다.");
			}
			jdt.commit(con);
		} catch (BMException e) {
			jdt.rollback(con);
			resultMap.put("isSuccess", false);
			resultMap.put("res", "관리자에게 문의하세요.\n" + e.getMessage());
		} finally {
			jdt.close(con);
		}
		return resultMap;
	}

	// 회원 전체 조회

	public Map<String, Object> printAllMembers() {
		Map<String, Object> resultMap = new HashMap<>();
		List<Member> memberList = new ArrayList<>();
		Connection con = jdt.getConnection();
		try {
			memberList = mDao.printAllMembers(con);
			resultMap.put("isSuccess", true);
			resultMap.put("res", memberList);
		} catch (BMException e) {
			resultMap.put("isSuccess", false);
			resultMap.put("res", "관리자에게 문의하세요.\n" + e.getMessage());
		} finally {
			jdt.close(con);
		}
		return resultMap;
	}

	// 회원 삭제용
	public Map<String, Object> deleteMember(String mId) {
		Map<String, Object> resultMap = new HashMap<>();
		Connection con = jdt.getConnection();
		int result = 0;
		try {
			result = mDao.deleteMember(con, mId);
			if (result > 0) {
				resultMap.put("isSuccess", true);
				resultMap.put("res", "회원탈퇴가 성공적으로 이루어 졌습니다.");
				jdt.commit(con);
			}
		} catch (BMException e) {
			jdt.rollback(con);
			resultMap.put("isSuccess", false);
			resultMap.put("res", "관리자에게 문의하세요.\n" + e.getMessage());
		} finally {
			jdt.close(con);
		}
		return resultMap;
	}

	public Map<String, Object> refreshInfo(String mId) {
		Map<String, Object> resultMap = new HashMap<>();
		Member member = new Member();
		Connection con = jdt.getConnection();
		try {
			member = mDao.refreshInfo(con, mId);
			resultMap.put("isSuccess", true);
			if (member != null) {
				resultMap.put("res", member);
			} else {
				resultMap.put("res", "정보 조회에 실패했습니다. 다시 접속해주세요.");
			}
		} catch (BMException e) {
			resultMap.put("isSuccess", false);
			resultMap.put("res", "관리자에게 문의하세요.\n" + e.getMessage());
		} finally {
			jdt.close(con);
		}
		return resultMap;
	}

	public Map<String, Object> myRentInfo(String mId) {
		Map<String, Object> resultMap = new HashMap<>();
		Map<String, Object> rentResultMap = new HashMap<>();
		Connection con = jdt.getConnection();
		try {
			rentResultMap = mDao.myRentInfo(con, mId);
			resultMap.put("isSuccess", true);
			resultMap.put("res", rentResultMap);
		} catch (BMException e) {
			resultMap.put("isSuccess", false);
			resultMap.put("res", "시스템 관리자에게 문의하세요.\n" + e.getMessage());
		} finally {
			jdt.close(con);
		}
		return resultMap;
	}

	public Map<String, Object> rentInfoDetail(int rmIdx) {
		Map<String, Object> resultMap = new HashMap<>();
		Map<Integer, Object> getMap = new HashMap<>();
		Connection con = jdt.getConnection();
		try {
			getMap = mDao.rentInfoDetail(con, rmIdx);
			resultMap.put("isSuccess", true);
			resultMap.put("res", getMap);
		} catch (BMException e) {
			resultMap.put("isSuccess", false);
			resultMap.put("res", "관리자에게 문의하세요.\n" + e.getMessage());
		} finally {
			jdt.close(con);
		}
		return resultMap;

	}

}
