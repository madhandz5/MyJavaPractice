package model.service;

import java.sql.Connection;
import java.sql.Date;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import common.JdbcTemplate;
import member.exception.MemberException;
import model.dao.MemberDao;
import model.vo.Member;

public class MemberService {

	// DAO에서 DB연결, 연결닫기, 트랜잭션 관리를 담당하는 코드를 분리
	// 컨트롤러가 요청한 내용을 처리하고 컨트롤러에게 돌려주는 역할

	private MemberDao mDao = new MemberDao();

	public Map<String, Object> selectLogin(String userId, String userPwd) {
		Map<String, Object> resultMap = new HashMap<String, Object>();
		boolean result = false;
		Connection con = JdbcTemplate.getConnection();
		try {
			result = mDao.selectLogin(con, userId, userPwd);
			resultMap.put("isSuccess", true);
			resultMap.put("res", result);

		} catch (MemberException e) {
			resultMap.put("isSuccess", false);
			resultMap.put("res", "시스템 관리자에게 문의해주세요. \n" + e.getMessage());
		} finally {
			JdbcTemplate.close(con);
		}

		return resultMap;
	}

	public Map<String, Object> selectMember(String userId) {
		Map<String, Object> selectMemberMap = new HashMap<>();
		Member mem = new Member();
		Connection con = JdbcTemplate.getConnection();

		try {
			mem = mDao.selectMember(con, userId);
			selectMemberMap.put("isSuccess", true);
			if (mem != null) {
				selectMemberMap.put("res", mem);
			} else {
				selectMemberMap.put("res", "회원정보가 없습니다.");
			}
		} catch (MemberException e) {
			selectMemberMap.put("isSuccess", false);
			selectMemberMap.put("res", "시스템 관리자에게 문의해주세요. \n" + e.getMessage());
		}

		return selectMemberMap;
	}

	public Map<String, Object> selectList() {
		Connection con = JdbcTemplate.getConnection();
		Map<String, Object> selectListMap = new HashMap<>();
		try {
			ArrayList<Member> result = mDao.selectList(con);
			selectListMap.put("isSuccess", true);
			if (!result.isEmpty()) {
				selectListMap.put("res", result);
			} else {
				selectListMap.put("res", "회원이 없습니다.");
			}
		} catch (MemberException e) {
			JdbcTemplate.rollback(con);
			selectListMap.put("isSuccess", false);
			selectListMap.put("res", "시스템 관리자에게 문의해주세요.\n" + e.getMessage());
		} finally {
			JdbcTemplate.close(con);
		}
		return selectListMap;
	}

	public Map<String, Object> selectSearchAge(int beginAge, int endAge) {
		Connection con = JdbcTemplate.getConnection();
		Map<String, Object> selectSearchAgeMap = new HashMap<>();
		try {
			List<Member> result = mDao.selectSearchAge(con, beginAge, endAge);
			selectSearchAgeMap.put("isSuccess", true);
			if (!result.isEmpty()) {
				selectSearchAgeMap.put("res", result);
			} else {
				selectSearchAgeMap.put("res", "회원이 없습니다.");
			}
		} catch (MemberException e) {
			selectSearchAgeMap.put("isSuccess", false);
			selectSearchAgeMap.put("res", "시스템 관리자에게 문의해주세요.\n" + e.getMessage());
		} finally {
			JdbcTemplate.close(con);
		}

		return selectSearchAgeMap;
	}

	public Map<String, Object> selectSearchGender(String gender) {
		Connection con = JdbcTemplate.getConnection();
		Map<String, Object> selectSearchGenderMap = new HashMap<>();
		try {
			List<Member> result = mDao.selectSearchGender(con, gender);
			selectSearchGenderMap.put("isSuccess", true);
			if (!result.isEmpty()) {
				selectSearchGenderMap.put("res", result);
			} else {
				selectSearchGenderMap.put("res", "회원이 없습니다.");
			}
		} catch (MemberException e) {
			selectSearchGenderMap.put("isSuccess", false);
			selectSearchGenderMap.put("res", "시스템 관리자에게 문의해주세요.\n" + e.getMessage());
		} finally {
			JdbcTemplate.close(con);
		}

		return selectSearchGenderMap;
	}

	public Map<String, Object> selectSearchEnrollDate(Date begin, Date end) {
		Map<String, Object> selectSearchEnrollDateMap = new HashMap<>();
		Connection con = JdbcTemplate.getConnection();
		try {
			List<Member> result = mDao.selectSearchEnrollDate(con, begin, end);
			selectSearchEnrollDateMap.put("isSuccess", true);
			if (!result.isEmpty()) {
				selectSearchEnrollDateMap.put("res", result);
			} else {
				selectSearchEnrollDateMap.put("res", "회원이 없습니다.");
			}
		} catch (MemberException e) {
			selectSearchEnrollDateMap.put("isSuccess", false);
			selectSearchEnrollDateMap.put("res", "시스템 관리자에게 문의해주세요.\n" + e.getMessage());
		} finally {
			JdbcTemplate.close(con);
		}

		return selectSearchEnrollDateMap;
	}

	public Map<String, Object> selectSearchName(String nameKeyword) {
		Map<String, Object> selectSearchNameMap = new HashMap<>();
		Connection con = JdbcTemplate.getConnection();
		try {
			List<Member> result = mDao.selectSearchName(con, nameKeyword);
			selectSearchNameMap.put("isSuccess", true);
			if (!result.isEmpty()) {
				selectSearchNameMap.put("res", result);
			} else {
				selectSearchNameMap.put("res", "회원이 없습니다.");
			}
		} catch (MemberException e) {
			selectSearchNameMap.put("isSuccess", false);
			selectSearchNameMap.put("res", "시스템 관리자에게 문의해주세요.\n" + e.getMessage());
		} finally {
			JdbcTemplate.close(con);
		}

		return selectSearchNameMap;
	}

	public Map<String, Object> insertMember(Member member) {
		Map<String, Object> insertMemberMap = new HashMap<>();
		Connection con = JdbcTemplate.getConnection();
		int result = 0;
		try {
			result = mDao.insertMember(con, member);
			insertMemberMap.put("isSuccess", true);
			if (result > 0) {
				insertMemberMap.put("res", "회원 추가가 되었습니다.");
			} else {
				insertMemberMap.put("res", "변경된 데이터가 없습니다. 데이터를 확인하세요.");
			}
			JdbcTemplate.commit(con);
		} catch (MemberException e) {
			JdbcTemplate.rollback(con);
			insertMemberMap.put("isSuccess", false);
			insertMemberMap.put("res", "시스템 관리자에게 문의해주세요.\n" + e.getMessage());
		} finally {
			JdbcTemplate.close(con);
		}

		return insertMemberMap;
	}

	public Map<String, Object> updateMember(Member member) {
		Map<String, Object> updateMemberMap = new HashMap<>();
		Connection con = JdbcTemplate.getConnection();
		int result = 0;
		try {
			result = mDao.updateMember(con, member);
			updateMemberMap.put("isSuccess", true);
			if (result > 0) {
				updateMemberMap.put("res", "수정에 성공했습니다.");

			} else {
				updateMemberMap.put("res", "변경된 데이터가 없습니다. 데이터를 확인하세요");
			}
			JdbcTemplate.commit(con);

		} catch (MemberException e) {
			JdbcTemplate.rollback(con);
			updateMemberMap.put("isSuccess", false);
			updateMemberMap.put("res", "시스템 관리자에게 문의해주세요.\n" + e.getMessage());
		} finally {
			JdbcTemplate.close(con);
		}
		return updateMemberMap;
	}

	public Map<String, Object> deleteMember(String userId) {
		Map<String, Object> deleteMemberMap = new HashMap<>();
		Connection con = JdbcTemplate.getConnection();
		int result = 0;
		try {
			result = mDao.deleteMember(con, userId);
			deleteMemberMap.put("isSuccess", true);
			if (result > 0) {
				deleteMemberMap.put("res", "삭제가 되었습니다.");

			} else {
				deleteMemberMap.put("res", "변경된 데이터가 없습니다. 데이터를 확인하세요");
			}
			JdbcTemplate.commit(con);
		} catch (MemberException e) {
			JdbcTemplate.rollback(con);
			deleteMemberMap.put("isSuccess", false);
			deleteMemberMap.put("res", "시스템 관리자에게 문의해주세요.\n" + e.getMessage());
		} finally {
			JdbcTemplate.close(con);
		}
		return deleteMemberMap;
	}

}
