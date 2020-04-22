package bm.model.serivce;

import java.sql.Connection;
import java.util.HashMap;
import java.util.Map;

import bm.exception.BMException;
import bm.model.dao.RentbookDao;
import common.JdbcTemplate;

public class RentBookService {

	private RentbookDao rentbookDao = new RentbookDao();
	private JdbcTemplate jdt = JdbcTemplate.getInstance();

	public Map<String, Object> updateExtendRentbook(int rb_idx) {
		Map<String, Object> resultMap = new HashMap<String, Object>();
		Connection con = jdt.getConnection();
		try {
			int resultExtend = rentbookDao.updateExtendRentBook(con, rb_idx);
			int resultInsert = rentbookDao.insertUpdateHistory(con, rb_idx);
			resultMap.put("isSuccess", true);
			if (resultExtend > 0 && resultInsert > 0) {
				resultMap.put("res", "도서 연장신청이 완료되었습니다.");
			} else {
				resultMap.put("res", "도서 연장신청이 실패하였습니다.데이터를 확인하세요.");
			}
			jdt.commit(con);
		} catch (BMException e) {
			jdt.rollback(con);
			resultMap.put("isSuccess", false);
			resultMap.put("res", "시스템 관리자에게 문의하세요.\n" + e.getMessage());
		} finally {
			jdt.close(con);
		}
		return resultMap;
	}

	public Map<String, Object> updateReturnRentBook(int rb_idx) {
		Map<String, Object> resultMap = new HashMap<>();
		Connection con = jdt.getConnection();
		try {
			rentbookDao.updateReturnRentBook(con, rb_idx);
			rentbookDao.insertUpdateHistory(con, rb_idx);
			resultMap.put("isSuccess", true);
			resultMap.put("res", "반납이 정상적으로 처리되었습니다.");
			jdt.commit(con);
		} catch (BMException e) {
			jdt.rollback(con);
			resultMap.put("isSuccess", false);
			resultMap.put("res", "시스템 관리자에게 문의하세요.\n" + e.getMessage());
		} finally {
			jdt.close(con);
		}
		return resultMap;
	}

	public Map<String, Object> insertRentInfo(String b_bno) {
		Map<String, Object> resultMap = new HashMap<>();
		Connection con = jdt.getConnection();
		try {
			rentbookDao.insertRentInfo(con, b_bno);
			resultMap.put("isSuccess", true);
			resultMap.put("res", "대여가 정상적으로 처리되었습니다.");
			jdt.commit(con);
		} catch (BMException e) {
			jdt.rollback(con);
			resultMap.put("isSuccess", false);
			resultMap.put("res", "시스템 관리자에게 문의하세요.\n" + e.getMessage());
		} finally {
			jdt.close(con);
		}
		return resultMap;
	}
}