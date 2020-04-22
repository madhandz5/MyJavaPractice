package member.controller;

import java.sql.Date;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import member.exception.MemberException;
import model.dao.MemberDao;
import model.vo.Member;

public class MemberController {
	private MemberDao mdao = new MemberDao();

	public MemberController() {

	}

	// 로그인 조회 요청 처리용
	public boolean selectLogin(String userId, String userPwd) {
		boolean result = false;
		try {
			result = mdao.selectLogin(userId, userPwd);
			result = true;
			return result;
		} catch (MemberException e) {
			e.printStackTrace();
		}
		return result;
	}

	// 아이디로 회원 조회 처리 public
	public Map<String, Object> selectMember(String userId) {

		Map<String, Object> resultMap = new HashMap<String, Object>();
		try {
			resultMap.put(userId, mdao.selectList());
			return resultMap;
		} catch (MemberException e) {
			e.printStackTrace();
		}

		return resultMap;
	}

	// 회원 전체 조회 처리용 : List 방식
	public ArrayList<Member> selectList() {
		ArrayList<Member> result = null;
		try {
			result = mdao.selectList();
			return result;
		} catch (MemberException e) {
			e.printStackTrace();
		}
		return result;
	}

	// 회원 가입 처리용
	public int insertMember(Member member) {
		int res = 0;
		try {
			res = mdao.insertMember(member);
			return res;
		} catch (MemberException e) {
			e.printStackTrace();
		}
		return res;
	}

	// 회원 정보 수정 처리 : 수정 항목별로 처리하기에는 경우의 수가 너무 많다.
	// 하나의 객체로 처리
	public int updateMember(Member member) {
		int res = 0;
		try {
			res = mdao.updateMember(member);
			return res;
		} catch (MemberException e) {
			e.printStackTrace();
		}
		return res;
	}

	// 회원 정보 삭제 처리용
	public int deleteMember(String userId) {
		int res = 0;
		try {
			res = mdao.delectMember(userId);
			return res;
		} catch (MemberException e) {
			e.printStackTrace();
		}
		return res;
	}

	// 회원 검색 : 이름 키워드로 검색(성이 김씨인 , 이름에 제 자가 포함된...)
	public List<Member> selectSearchName(String nameKeyword) {
		List<Member> res = null;
		try {
			res = mdao.selectSearchName(nameKeyword);
			return res;
		} catch (MemberException e) {
			e.printStackTrace();
		}
		return res;
	}

	// 회원 검색 : 나이별 검색
	public List<Member> selectSearchAge(int beginAge, int endAge) {
		List<Member> res = null;
		try {
			res = mdao.selectSearchAge(beginAge, endAge);
		} catch (MemberException e) {
			e.printStackTrace();
		}
		return res;
	}

	// 회원 검색 : 성별별 검색
	public List<Member> selectSearchGender(String gender) {
		List<Member> res = null;
		try {
			res = mdao.selectSearchGender(gender);
			return res;
		} catch (MemberException e) {
			e.printStackTrace();
		}
		return res;
	}

	// 회원 검색 : 가입날짜별 검색
	public List<Member> selectSearchEnrollDate(Date begin, Date end) {
		List<Member> res = null;
		try {
			res = mdao.selectSearchEnrollDate(begin, end);
		} catch (MemberException e) {
			e.printStackTrace();
		}
		return res;
	}

}
