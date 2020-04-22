package com.kh.controller;

import java.util.HashMap;
import java.util.Scanner;

import com.kh.model.dao.BookDao;
import com.kh.model.vo.Book;

public class BookManager {

	Scanner scanner = new Scanner(System.in);
	BookDao bd = new BookDao();

	public BookManager() {

	}

	public void addBook(Book book) {
		// BookDao의 getLastBookNo() 메소드를 통해 도서의 마지막 도서 번호를 알아옴
		// 첫 글일 경우 0으로 받아오게끔
		// BookDao의 getLastBookNo() 내용 구현 할 것!
		// setter를 이용하여 도서 번호를 마지막 도서 번호 +1 처리
		// BookDao의 addBook()메소드에 해당 Book 객체 전달
		String lastNoStr = Integer.toString(bd.getLastBookNo() + 1);
		bd.addBook(book);
		book.setbNo(lastNoStr);

	}

	public Book deleteBook(String key) {
		// BookDao의 deleteBook() 메소드에 전달받은 도서 번호 전달
		// 그 결과 값을 받아 리턴
		Book deleteBook = bd.deleteBook(key);
		return deleteBook;
	}

	public String searchBook(String title) {
		// BookDao의 searchBook() 메소드에 전달받은 도서 제목 전달
		// 그 결과 값(map의 key값)을 받아 리턴
		String searchBook = bd.searchBook(title);
		return searchBook;
	}

	public Book selectBook(String key) {
		// BookDao의 selectBook() 메소드에 전달받은 key값 전달
		// 그 결과 값(해당 Book객체)을 받아 리턴
		Book selectBook = bd.selectBook(key);
		return selectBook;
	}

	public HashMap<String, Book> selectAll() {
		// BookDao의 selectAll() 메소드를 통해 도서 전체를 전달 받아 리턴
		HashMap<String, Book> bookMap = bd.selectAll();
		return bookMap;
	}

	public Book[] sortedBookList() {
		// BookDao의 sortedBookList() 메소드를 통해 정렬된 도서 리스트를 전달 받아
		// for문을 이용하여 Book[] 배열에
		// 해당 배열 주소 값 리턴
		Book[] sortedBookList = new Book[bd.sortedBookList().size()];
		for (int i = 0; i < bd.sortedBookList().size(); i++) {
			sortedBookList[i] = bd.sortedBookList().get(i);
		}
		return sortedBookList;
	}

	public void printBookList(Book[] br) {
		// for each문을 이용하여 전달받은 Book[] 배열 전체 출력
		for (Book book : br) {
			System.out.println(book);
		}
	}

}
