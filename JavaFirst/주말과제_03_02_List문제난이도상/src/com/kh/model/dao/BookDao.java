package com.kh.model.dao;

import java.util.ArrayList;
import java.util.Collections;

import com.kh.model.comparator.AscCategory;
import com.kh.model.comparator.DescCategory;
import com.kh.model.vo.Book;

public class BookDao {

	ArrayList<Book> bookList = new ArrayList<>();

	public BookDao() {

	}

	public BookDao(ArrayList<Book> bookList) {
		this.bookList = bookList;
	}

	public int getLastBookNo() {
		int res = bookList.size() - 1;
		return res;
	}

	public void addBook(Book book) {
		bookList.add(book);

	}

	public int deleteBook(int no) {
		for (int i = 0; i < bookList.size(); i++) {
			if (bookList.get(i).getbNo() == no) {
				bookList.remove(i);
				return 0;
			}
		}
		return 1;
	}

	public int searchBook(String title) {

		int res = -1;
		for (int i = 0; i < bookList.size(); i++) {
			if (bookList.get(i).getTitle().contains(title)) {
				res = i;
			}
		}
		return res;
	}

	public Book selectBook(int index) {

		Book book = new Book();
		book = bookList.get(index);
		return book;
	}

	public ArrayList<Book> selectAll() {
		return bookList;
	}

	public ArrayList<Book> sortedBookList(int i) {

		ArrayList<Book> sortList = new ArrayList<Book>();
		sortList.addAll(bookList);
		if (i == 0) {
			Collections.sort(sortList, new AscCategory());
		} else {
			Collections.sort(sortList, new DescCategory());
		}
		return sortList;
	}

}
