package bm.controller;

import java.util.HashMap;
import java.util.Map;

import bm.model.serivce.RentBookService;
import bm.view.ErrMsg;

public class RentBookController {

	private RentBookService rbService = new RentBookService();
	private ErrMsg err = new ErrMsg();

	public Map<String, Object> updateExtendRentBook(int rb_idx) {
		Map<String, Object> resultMap = new HashMap<String, Object>();
		resultMap = rbService.updateExtendRentbook(rb_idx);

		if ((boolean) resultMap.get("isSuccess")) {
			return resultMap;
		} else {
			err.printErr(resultMap);
			resultMap.put("res", "");
		}
		return resultMap;
	}

	public Map<String, Object> updateReturnRentBook(int rb_idx) {
		Map<String, Object> resultMap = new HashMap<String, Object>();
		resultMap = rbService.updateReturnRentBook(rb_idx);
		if ((boolean) resultMap.get("isSuccess")) {
			return resultMap;
		} else {
			err.printErr(resultMap);
			resultMap.put("res", "");
		}
		return resultMap;
	}

	public Map<String, Object> insertRentInfo(String b_bno) {
		Map<String, Object> resultMap = new HashMap<>();
		resultMap = rbService.insertRentInfo(b_bno);
		if ((boolean) resultMap.get("isSuccess")) {
			return resultMap;
		} else {
			err.printErr(resultMap);
			resultMap.put("res", "");
		}
		return resultMap;
	}

}
