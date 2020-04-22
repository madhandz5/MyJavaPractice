package member.controller;

import java.sql.Date;
import java.util.List;
import java.util.Map;

import member.exception.MemberException;
import member.view.ErrorMsg;
import model.dao.MemberDao;
import model.service.MemberService;
import model.vo.Member;

// MVC 패턴에서 C는 Controller를 의미한다.
// Controller는 사용자로부터 전달받은 요청을 Model(service,dao)에 전달하고
// Model이 처리한 결과를 View(View선택해서) 에 전달해주는 역할을 한다.
// Controller는 Model에서 전달받은 데이터를 View에게 전달해줄때
// 데이터를 가공 처리 및 확인처리 하거나 View에게 전달받은 데이터를 Model에 넘길 때 데이터를 가공처리 및 확인처리 한다.

public class MemberController {
	private MemberService mService = new MemberService();
	private ErrorMsg errMsg = new ErrorMsg();

	public MemberController() {

	}

	// 로그인 조회 요청 처리용
	public Map<String, Object> selectLogin(String userId, String userPwd) {
		Map<String, Object> resultMap = mService.selectLogin(userId, userPwd);
		if ((boolean) resultMap.get("isSuccess")) {
			return resultMap;
		} else {
			errMsg.printErr(resultMap);
			resultMap.put("res", "");
		}

		return resultMap;
	}

	// 회원 전체 조회 처리용 : List 방식
	public Map<String, Object> selectList() {
		Map<String, Object> resultMap = mService.selectList();
		if ((boolean) resultMap.get("isSuccess")) {
			return resultMap;
		} else {
			errMsg.printErr(resultMap);
			resultMap.put("res", "");
		}
		return resultMap;
	}

	// 아이디로 회원 조회 처리 public
	public Map<String, Object> selectMember(String userId) {

		Map<String, Object> resultMap = mService.selectMember(userId);
		if ((boolean) resultMap.get("isSuccess")) {
			return resultMap;
		} else {
			errMsg.printErr(resultMap);
			resultMap.put("res", "");
		}

		return resultMap;
	}

	// 회원 가입 처리용
	public Map<String, Object> insertMember(Member member) {
		Map<String, Object> res = mService.insertMember(member);
		if ((boolean) res.get("isSuccess")) {
			return res;
		} else {
			errMsg.printErr(res);
			res.put("res", "");
		}
		return res;
	}

	// 회원 정보 수정 처리 : 수정 항목별로 처리하기에는 경우의 수가 너무 많다.
	// 하나의 객체로 처리
	public Map<String, Object> updateMember(Member member) {

		Map<String, Object> res = mService.updateMember(member);
		if ((boolean) res.get("isSuccess")) {
			return res;
		} else {
			errMsg.printErr(res);
			res.put("res", "");
		}
		return res;
	}

	// 회원 정보 삭제 처리용
	public Map<String, Object> deleteMember(String userId) {
		Map<String, Object> res = mService.deleteMember(userId);
		if ((boolean) res.get("isSuccess")) {
			return res;
		} else {
			errMsg.printErr(res);
			res.put("res", "");
		}
		return res;
	}

	// 회원 검색 : 이름 키워드로 검색
	public Map<String, Object> selectSearchName(String nameKeyword) {
		Map<String, Object> res = mService.selectSearchName(nameKeyword);
		if ((boolean) res.get("isSuccess")) {
			return res;
		} else {
			errMsg.printErr(res);
			res.put("res", "");
		}
		return res;
	}

	// 회원 검색 : 나이별 검색
	public Map<String, Object> selectSearchAge(int beginAge, int endAge) {
		Map<String, Object> result = mService.selectSearchAge(beginAge, endAge);
		if ((boolean) result.get("isSuccess")) {
			return result;
		} else {
			errMsg.printErr(result);
			result.put("res", "");
		}
		return result;
	}

	// 회원 검색 : 성별별 검색
	public Map<String, Object> selectSearchGender(String gender) {
		Map<String, Object> res = mService.selectSearchGender(gender);
		if ((boolean) res.get("isSuccess")) {
			return res;
		} else {
			errMsg.printErr(res);
			res.put("res", "");
		}
		return res;
	}

	// 회원 검색 : 가입날짜별 검색
	public Map<String, Object> selectSearchEnrollDate(Date begin, Date end) {
		Map<String, Object> res = mService.selectSearchEnrollDate(begin, end);
		if ((boolean) res.get("isSuccess")) {
			return res;
		} else {
			errMsg.printErr(res);
			res.put("res", "");
		}
		return res;
	}

}
