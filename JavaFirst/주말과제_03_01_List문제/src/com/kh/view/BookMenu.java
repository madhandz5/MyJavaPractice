package com.kh.view;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

import com.kh.controller.BookManager;
import com.kh.model.vo.Book;

public class BookMenu {

	Scanner scanner = new Scanner(System.in);
	BookManager bm = new BookManager();

	public BookMenu() {

	}

	public void mainMenu() {

		while (true) {
			System.out.println("*** 도서 관리 프로그램 ***");
			System.out.println("1. 새 도서 추가");
			System.out.println("2. 도서 삭제");
			System.out.println("3. 도서 검색 출력");
			System.out.println("4. 전체 출력");
			System.out.println("0. 끝내기");
			System.out.println("===================");
			System.out.println("메뉴 번호 선택 : ");
			int input = scanner.nextInt();
			scanner.nextLine();

			switch (input) {
			case 1:
				insertBook();
				break;
			case 2:
				deleteBook();
				break;
			case 3:
				searchBook();
				break;
			case 4:
				selectList();
				break;
			case 0:
				System.out.println("프로그램 종료");
				break;
			}
		}
	}

	public void insertBook() {

		System.out.println("도서 제목 : ");
		String title = scanner.nextLine();
		System.out.println("도서 장르 (1 : 인문 / 2 : 자연과학 / 3 : 의료 / 4 : 기타");
		int category = scanner.nextInt();
		scanner.nextLine();
		System.out.println("도서 저자 : ");
		String author = scanner.nextLine();
		// 위에서 입력 받은 title, category, author를 매개변수로 한 Book 객체 생성 (book)
		// BookManager의 insertBook 메소드로 book 전달
		Book book = new Book(category, title, author);
		bm.insertBook(book);

	}

	public void deleteBook() {
		// “도서 번호 : >> 입력 받음 (bNo)
		System.out.println("도서 번호 : ");
		int bNo = scanner.nextInt();
		scanner.nextLine();
		// BookManager의 deleteBook 메소드로 bNo 전달 //리턴 값 전달 받음 (result)
		int result = bm.deleteBook(bNo);
		// result가 1일 경우 >> “성공적으로 삭제” 출력 // result가 0일 경우 >> “삭제할 글이 존재하지 않습니다.”출력
		if (result == 1) {
			System.out.println("성공적으로 삭제");
		} else if (result == 0) {
			System.out.println("삭제할 글이 존재하지 않습니다.");
		}
	}

	public void searchBook() {
		// “도서 제목 : >> 입력 받음 (title)
		System.out.println("도서 제목 : ");
		String title = scanner.nextLine();
		// BookManager의 searchBook 메소드로 title 전달 // 리턴 값 전달 받음 (searchList)
		ArrayList<Book> searchList = new ArrayList<Book>(bm.searchBook(title));
		// searchList가 비어 있을 경우 >> 검색 결과가 존재하지 않습니다.출력
		// searchList가 비어있지 않을 경우 >> for문을 이용하여 searchList 출력 또는 Iterator 이용하여 출력
		if (searchList.isEmpty()) {
			System.out.println("검색 결과가 존재하지 않습니다.");
		} else {
			Iterator<Book> iterator = searchList.iterator();
			while (iterator.hasNext()) {
				System.out.println(iterator.next());
			}
		}
	}

	public void selectList() {
		for (Book bookList : bm.selectList()) {
			System.out.println(bookList);
		}
	}
}
