package bm.model.serivce;

import java.sql.Connection;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import bm.exception.BMException;
import bm.model.dao.BookDao;
import bm.model.vo.Book;
import common.JdbcTemplate;

public class BookService {

	BookDao bDao = new BookDao();
	private JdbcTemplate jdt = JdbcTemplate.getInstance();

	public Map<String, Object> searchBookByTitle(String bookTitle) {
		Map<String, Object> resultMap = new HashMap<String, Object>();
		Connection con = jdt.getConnection();
		try {
			resultMap.put("isSuccess", true);
			resultMap.put("res", bDao.searchBookByTitle(con, bookTitle));
		} catch (BMException e) {
			resultMap.put("isSuccess", false);
			resultMap.put("res", "검색된 결과가 없습니다.");
		} finally {
			jdt.close(con);
		}
		return resultMap;
	}

	public Map<String, Object> searchBookByAuthor(String author) {
		Map<String, Object> resultMap = new HashMap<String, Object>();
		Connection con = jdt.getConnection();
		try {
			resultMap.put("isSuccess", true);
			resultMap.put("res", bDao.searchBookByAuthor(con, author));
		} catch (BMException e) {
			resultMap.put("isSuccess", false);
			resultMap.put("res", "검색된 결과가 없습니다.");
		} finally {
			jdt.close(con);
		}
		return resultMap;
	}

}
