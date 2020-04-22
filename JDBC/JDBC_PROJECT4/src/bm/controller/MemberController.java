package bm.controller;

import java.util.HashMap;
import java.util.Map;

import bm.model.serivce.MemberService;
import bm.model.vo.Member;
import bm.view.ErrMsg;

public class MemberController {

	private MemberService mService = new MemberService();
	private ErrMsg err = new ErrMsg();

	// 회원 가입 처리용
	public Map<String, Object> insertMember(Member member) {
		Map<String, Object> res = mService.insertMember(member);
		if ((boolean) res.get("isSuccess")) {
			return res;
		} else {
			err.printErr(res);
			res.put("res", "");
		}
		return res;
	}

	// 로그인 처리용
	public Map<String, Object> logIn(String mId, String mPwd) {
		Map<String, Object> resultMap = new HashMap<String, Object>();

		resultMap = mService.logIn(mId, mPwd);

		if ((boolean) resultMap.get("isSuccess")) {
			return resultMap;
		} else {
			err.printErr(resultMap);
			resultMap.put("res", "");
		}

		return resultMap;
	}

	// 회원정보 수정
	public Map<String, Object> updateInfo(String mId, String newPwd, String newPhone) {
		Map<String, Object> resultMap = new HashMap<String, Object>();
		resultMap = mService.updateInfo(mId, newPwd, newPhone);
		if ((boolean) resultMap.get("isSuccess")) {
			return resultMap;
		} else {
			err.printErr(resultMap);
			resultMap.put("res", "");
		}
		return resultMap;
	}

	// 회원 전체 조회
	public Map<String, Object> printAllMembers() {
		Map<String, Object> resultMap = new HashMap<>();
		resultMap = mService.printAllMembers();
		if ((boolean) resultMap.get("isSuccess")) {
			return resultMap;
		} else {
			err.printErr(resultMap);
			resultMap.put("res", "");
		}
		return resultMap;
	}

	// 회원탈퇴

	public Map<String, Object> deleteMember(String mId) {
		Map<String, Object> resultMap = new HashMap<String, Object>();
		resultMap = mService.deleteMember(mId);
		if ((boolean) resultMap.get("isSuccess")) {
			return resultMap;
		} else {
			err.printErr(resultMap);
			resultMap.put("res", "");
		}
		return resultMap;
	}

	// 새로 고침용

	public Map<String, Object> refreshInfo(String mId) {
		Map<String, Object> resultMap = new HashMap<String, Object>();
		resultMap = mService.refreshInfo(mId);
		if ((boolean) resultMap.get("isSuccess")) {
			return resultMap;
		} else {
			err.printErr(resultMap);
			resultMap.put("res", "");
		}
		return resultMap;
	}

	// 대출 내역 조회
	public Map<String, Object> myRentInfo(String mId) {
		Map<String, Object> resultMap = new HashMap<String, Object>();
		resultMap = mService.myRentInfo(mId);
		if ((boolean) resultMap.get("isSuccess")) {
			return resultMap;
		} else {
			err.printErr(resultMap);
			resultMap.put("res", "");
		}
		return resultMap;
	}

	// 대출내역 상세 조회
	public Map<String, Object> rentInfoDetail(int rmIdx) {
		Map<String, Object> resultMap = new HashMap<String, Object>();
		resultMap = mService.rentInfoDetail(rmIdx);
		if ((boolean) resultMap.get("isSuccess")) {
			return resultMap;
		} else {
			err.printErr(resultMap);
			resultMap.put("res", "");
		}
		return resultMap;
	}

}
