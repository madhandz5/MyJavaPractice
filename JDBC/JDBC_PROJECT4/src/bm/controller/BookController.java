package bm.controller;

import java.util.HashMap;
import java.util.Map;

import bm.model.serivce.BookService;
import bm.view.ErrMsg;

public class BookController {
	BookService bService = new BookService();
	ErrMsg errMsg = new ErrMsg();

	public Map<String, Object> searchBookByTitle(String bookTitle) {
		Map<String, Object> resultMap = new HashMap<String, Object>();
		resultMap = bService.searchBookByTitle(bookTitle);
		if ((boolean) resultMap.get("isSuccess")) {
			return resultMap;
		} else {
			errMsg.printErr(resultMap);
			resultMap.put("res", "");
		}
		return resultMap;
	}

	public Map<String, Object> searchBookByAuthor(String author) {
		Map<String, Object> resultMap = new HashMap<String, Object>();
		resultMap = bService.searchBookByAuthor(author);
		if ((boolean) resultMap.get("isSuccess")) {
			return resultMap;
		} else {
			errMsg.printErr(resultMap);
			resultMap.put("res", "");
		}
		return resultMap;
	}

}
