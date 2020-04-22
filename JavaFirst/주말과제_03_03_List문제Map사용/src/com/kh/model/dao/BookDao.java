package com.kh.model.dao;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

import com.kh.model.vo.Book;

public class BookDao {

	HashMap<String, Book> bookMap = new HashMap<String, Book>();

	public BookDao() {

	}

	public BookDao(HashMap<String, Book> bookMap) {
		this.bookMap = bookMap;
	}

	public int getLastBookNo() {
		int lastNo = 0;
		Iterator iterator = bookMap.keySet().iterator();
		while (iterator.hasNext()) {
			String lastKey = (String) iterator.next();
			lastNo = Integer.parseInt(bookMap.get(lastKey).getbNo());
		}
		return lastNo;
	}

	public void addBook(Book book) {
		bookMap.put(book.getTitle(), book);
	}

	public Book deleteBook(String key) {

		Book deleteBook = new Book();

		Iterator iterator = bookMap.keySet().iterator();
		while (iterator.hasNext()) {
			String delKey = (String) iterator.next();
			if (bookMap.get(delKey).getbNo().equals(key)) {
				deleteBook = bookMap.remove(delKey);
			}
		}
		return deleteBook;
	}

	public String searchBook(String title) {
		String searchBook = "";
		Set entrySet = bookMap.entrySet();
		Iterator iterator2 = entrySet.iterator();
		while (iterator2.hasNext()) {
			Map.Entry<String, Object> entry = (Entry<String, Object>) iterator2.next();
			if (title.equals((String) entry.getKey())) {
				searchBook = (String) entry.getKey();
			}
		}
		return searchBook;
	}

	public Book selectBook(String key) {
		Book selectBook = new Book();
		if (bookMap.containsKey(key)) {
			selectBook = bookMap.get(key);
		}
		return selectBook;
	}

	public HashMap<String, Book> selectAll() {
		return bookMap;
	}

	public ArrayList<Book> sortedBookList() {

		ArrayList<Book> sortedBookList = new ArrayList<>(bookMap.values());
		Collections.sort(sortedBookList);

		return sortedBookList;
	}

}
