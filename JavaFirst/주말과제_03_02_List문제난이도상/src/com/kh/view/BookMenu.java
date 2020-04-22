package com.kh.view;

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
			System.out.println("2. 도서정보 정렬 후 출력");
			System.out.println("3. 도서 삭제");
			System.out.println("4. 도서 검색출력");
			System.out.println("5. 전체 출력");
			System.out.println("6. 끝내기");
			System.out.println("===================");
			System.out.println("메뉴 번호 선택 : ");
			int input = scanner.nextInt();
			scanner.nextLine();

			switch (input) {
			case 1:
				bm.addBook(inputBook());
				break;
			case 2:
				System.out.println("어떻게 정렬할까요? ( 오름차순 : 0, 내림차순 : 1 )");
				int sortNum = scanner.nextInt();
				scanner.nextLine();
				bm.printBookList(bm.sortedBookList(sortNum));
				break;
			case 3:
				if (bm.deleteBook(inputBookNo()) == 0) {
					System.out.println("성공적으로 삭제");
				} else if (bm.deleteBook(inputBookNo()) == 1) {
					System.out.println("삭제할 글이 존재하지 않음");
				}
				break;
			case 4:
				String keyword = inputBookTitle();
				int index = bm.searchBook(keyword);
				if (index == -1) {
					System.out.println("조회한 글이 존재하지 않음");
				} else {
					System.out.println("도서번호 : " + index);
				}
				break;
			case 5:
				if (bm.selectAll().isEmpty()) {
					System.out.println("도서가 없습니다.");
				} else {
					Iterator<Book> iterator = bm.selectAll().iterator();
					while (iterator.hasNext()) {
						System.out.println(iterator.next());
					}
				}
				break;
			case 6:
				break;
			}
		}
	}

	public Book inputBook() {
		Book book = new Book();
		System.out.println("도서 제목 : ");
		String title = scanner.nextLine();
		System.out.println("도서 장르  (1 : 인문, 2 : 자연과학, 3 : 의료, 4 : 기타) : ");
		int category = scanner.nextInt();
		scanner.nextLine();
		System.out.println("도서 저자 : ");
		String author = scanner.nextLine();
		book = new Book(category, title, author);
		return book;
	}

	public int inputBookNo() {
		System.out.println("도서 번호 : ");
		int bNo = scanner.nextInt();
		scanner.nextLine();
		return bNo;
	}

	public String inputBookTitle() {
		System.out.println("도서 제목 : ");
		String title = scanner.nextLine();
		return title;
	}

}
