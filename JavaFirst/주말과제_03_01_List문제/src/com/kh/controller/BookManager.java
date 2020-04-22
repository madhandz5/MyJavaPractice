package com.kh.controller;

import java.util.ArrayList;

import com.kh.model.vo.Book;

public class BookManager {

	ArrayList<Book> bookList = new ArrayList<>();

	public void insertBook(Book book) {
		// 전달 받은 book은 현재 도서번호가 null인 채로 들어오는데
		// 우선 변수 생성 및 초기화 lastNo = bookList.get(bookList.size()-1).getbNo() + 1;
		// 마지막 도서 번호 + 1
		// 새로운 도서가 추가될 때마다 추가되는 도서의 도서번호는 리스트 마지막 도서 번호의 다음번호로 부여해야됨
		// 해당 예외 발생 시 lastNo = 1; 로 초기화
		// setter를 이용하여 book 도서 번호를 lastNo로 적용
		// bookList의 book 추가
		int lastNo = 0;
		try {
			lastNo = bookList.get(bookList.size() - 1).getbNo() + 1;
			book.setbNo(lastNo);
			bookList.add(book);
		} catch (ArrayIndexOutOfBoundsException e) {
			lastNo = 1;
			book.setbNo(lastNo);
			bookList.add(book);
		}
	}

	public int deleteBook(int bNo) {
		// for문을 이용하여 전달받은 도서번호가 존재하는 도서 삭제
		// 성공적으로 삭제 할 경우 1 리턴
		// 삭제 되지 않은 경우 즉, 존재하는 도서 번호가 없는 경우 0 리턴
		int result = 0;
		for (int i = 0; i < bookList.size(); i++) {
			if (bookList.get(i).getbNo() == bNo) {
				bookList.remove(i);
				result = 1;
			} else {
				result = 0;
			}
		}
		return result;
	}

	public ArrayList<Book> searchBook(String title) {
		// 검색 결과값들을 보관할 리스트
		ArrayList<Book> searchList = new ArrayList<Book>();
		// for문을 이용하여 전달받은 제목을 포함한 도서를 searchList에 추가
		for (int i = 0; i < bookList.size(); i++) {
			if (bookList.get(i).getTitle().contains(title)) {
				searchList.add(bookList.get(i));
			}
		}
		// searchList 리턴
		return searchList;
	}

	public ArrayList<Book> selectList() {
		// bookList 리턴
		return bookList;
	}
}
