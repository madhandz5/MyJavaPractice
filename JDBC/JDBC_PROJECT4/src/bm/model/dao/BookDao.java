package bm.model.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

import bm.exception.BMException;
import bm.model.vo.Book;
import common.JdbcTemplate;

public class BookDao {

	JdbcTemplate jdt = JdbcTemplate.getInstance();

	public Map<Integer, Book> searchBookByTitle(Connection con, String bookTitle) throws BMException {
		Map<Integer, Book> resultMap = new LinkedHashMap<Integer, Book>();
		Book book = null;
		PreparedStatement pstm = null;
		ResultSet rSet = null;
		String sql = "select * from tb_book where b_title like '%'||?||'%'";
		try {
			pstm = con.prepareStatement(sql);
			pstm.setString(1, bookTitle);
			rSet = pstm.executeQuery();
			while (rSet.next()) {
				book = new Book();
				book.setBno(rSet.getInt(1));
				book.setCategory(rSet.getInt(2));
				book.setTitle(rSet.getString(3));
				book.setAuthor(rSet.getString(4));
				book.setRegDate(rSet.getDate(5));
				book.setRentYn(rSet.getString(6));
				book.setRentCnt(rSet.getInt(7));
				resultMap.put(rSet.getInt(1), book);
			}
		} catch (SQLException e) {
			throw new BMException(e.getMessage());
		} finally {
			jdt.close(rSet, pstm);
		}

		return resultMap;
	}

	public Map<Integer, Book> searchBookByAuthor(Connection con, String author) throws BMException {
		Map<Integer, Book> resultMap = new LinkedHashMap<Integer, Book>();
		Book book = null;
		PreparedStatement pstm = null;
		ResultSet rSet = null;
		String sql = "select * from tb_book where b_author like '%'||?||'%'";
		try {
			pstm = con.prepareStatement(sql);
			pstm.setString(1, author);
			rSet = pstm.executeQuery();
			while (rSet.next()) {
				book = new Book();
				book.setBno(rSet.getInt(1));
				book.setCategory(rSet.getInt(2));
				book.setTitle(rSet.getString(3));
				book.setAuthor(rSet.getString(4));
				book.setRegDate(rSet.getDate(5));
				book.setRentYn(rSet.getString(6));
				book.setRentCnt(rSet.getInt(7));
				resultMap.put(rSet.getInt(1), book);
			}
		} catch (SQLException e) {
			throw new BMException(e.getMessage());
		} finally {
			jdt.close(rSet, pstm);
		}
		return resultMap;
	}

}
