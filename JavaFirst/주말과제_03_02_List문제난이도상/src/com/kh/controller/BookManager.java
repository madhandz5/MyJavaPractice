package com.kh.controller;

import java.util.ArrayList;

import com.kh.model.dao.BookDao;
import com.kh.model.vo.Book;

public class BookManager {

	BookDao bDao = new BookDao();
	ArrayList<Book> bookList = new ArrayList<>();

	public void addBook(Book book) {
		// BookDao의 getLastBookNo() 메소드를 통해 도서의 마지막 도서 번호를 알아옴
		// setter를 이용하여 도서 번호를 마지막 도서 번호 +1 처리
		// 애초에 리스트에 도서가 없는 경우,
		// 즉 첫 도서 등록일 경우 예외 발생 어떤 예외처리가 발생하는지 알아보고 try-catch문을 이용하여 오류 해결
		// BookDao의 addBook()메소드에 해당 Book 객체 전달
		int lastNum = bDao.getLastBookNo() + 1;
		book.setbNo(lastNum + 1);
		bDao.addBook(book);

	}

	public int deleteBook(int no) {
		// BookDao의 deleteBook() 메소드에 전달받은 도서 번호 전달
		// 그 결과 값을 받아 리턴
		int res = bDao.deleteBook(no);
		return res;
	}

	public int searchBook(String title) {
		// BookDao의 searchBook() 메소드에 전달받은 도서 제목 전달
		// 그 결과 값(리스트의 인덱스 값)을 받아 리턴
		int res = bDao.searchBook(title);
		return res;
	}

	public Book selectBook(int index) {
		// BookDao의 selectBook() 메소드에 전달받은 인덱스 전달
		// 그 결과 값(해당 Book객체)을 받아 리턴
		Book book = bDao.selectBook(index);
		return book;
	}

	public ArrayList<Book> selectAll() {
		// BookDao의 selectAll() 메소드를 통해 도서 전체 리스트를 전달 받아 리턴
		ArrayList<Book> selectAll = bDao.selectAll();
		return selectAll;
	}

	public Book[] sortedBookList(int num) {
		// BookDao의 sortedBookList() 메소드를 통해 정렬된 도서 리스트를 전달 받아
		// for문을 이용하여 Book[] 배열에 추가
		// 해당 배열 주소 값 리턴
		ArrayList<Book> bList = bDao.sortedBookList(num);
		Book[] books = new Book[bList.size()];
		for (int i = 0; i < bList.size(); i++) {
			books[i] = bList.get(i);
		}
		return books;
	}

	public void printBookList(Book[] br) {
		// for each문을 이용하여 전달받은 Book[] 배열 전체 출력
		for (Book book : br) {
			System.out.println(book);
		}
	}
}
