package com.kh.view;

import java.util.Iterator;
import java.util.Scanner;

import com.kh.controller.BookManager;
import com.kh.model.dao.BookDao;
import com.kh.model.vo.Book;

public class BookMenu {

	Scanner scanner = new Scanner(System.in);
	BookManager bm = new BookManager();

	public BookMenu() {

	}

	public void mainMenu() {

		while (true) {
			System.out.println("***도서 관리 프로그램***");
			System.out.println("1. 새 도서 추가");
			System.out.println("2. 도서정보 정렬 후 출력");
			System.out.println("3. 도서 삭제");
			System.out.println("4. 도서 검색 출력");
			System.out.println("5. 전체 출력");
			System.out.println("6. 끝내기");
			System.out.println("=================");
			System.out.println("메뉴 번호 선택 : ");
			int input = scanner.nextInt();
			scanner.nextLine();

			switch (input) {
			// 해당 메뉴 번호에 따라 BookManager 클래스 메소드 실행

			case 1:
				bm.addBook(inputBook());
				// addBook(inputBook()이 리턴한 객체) 실행
				break;
			case 2:
				bm.printBookList(bm.sortedBookList());
				// sortedBookList() 실행 -> Book[]리턴받아 printBookList(Book[]) 실행
				break;
			case 3:
				// deleteBook (inputBookNo()이 리턴한 도서번호 실행)
				// -> Book 리턴받아 null 이 아닌 경우 "성공적으로 삭제" null 일 경우 "삭제할 글이 존재하지 않음"
				if (bm.deleteBook(inputBookNo()).getTitle() == null) {
					System.out.println("삭제할 글이 존재하지 않음");
				} else {
					System.out.println("성공적으로 삭제");
				}
				break;
			case 4:
				// searchBook (inputBookTitle()이 리턴한 도서 제목) 실행
				// => key 리턴 받아 null일 경우 “조회한 글이 존재하지 않음”
				// null이 아닐 경우 selectBook(key) 출력
				String title = inputBookTitle();
				String keyword = bm.searchBook(title);
				if (bm.selectBook(keyword).getTitle() == null) {
					System.out.println("조회한 글이 존재하지 않음");
				} else {
					System.out.println(bm.selectBook(keyword));
				}
				break;
			case 5:
				// selectAll() 실행 => 결과 map 리턴 받아 비어있을 경우 “없습니다.” 아닐 경우 Iterator, keySet()을 이용하여
				// 전체 출력
				if (bm.selectAll().isEmpty()) {
					System.out.println("없습니다.");
				} else {
					Iterator iterator = bm.selectAll().keySet().iterator();
					while (iterator.hasNext()) {
						String key = (String) iterator.next();
						System.out.println(bm.selectAll().get(key));
					}
				}
				break;
			case 6:
				System.out.println("종료");
				break;
			}
		}

	}

	public Book inputBook() {

		// "도서 제목 : " >> 입력 받음
		// "도서 장르 (1:인문 / 2:자연과학 / 3:의료 / 4:기타) : " >> 입력 받음
		// (숫자로)
		// "도서 저자 : " >> 입력 받음
		// 매개변수 생성자를 이용하여 위의 초기값을 이용한 Book객체 리턴
		System.out.println("도서 제목 : ");
		String title = scanner.nextLine();
		System.out.println("도서 장르 (1:인문 / 2:자연과학 / 3:의료 / 4:기타) :");
		int category = scanner.nextInt();
		scanner.nextLine();
		System.out.println("도서 저자 : ");
		String author = scanner.nextLine();
		Book inputBook = new Book(category, title, author);
		return inputBook;
	}

	public String inputBookNo() {
		// “도서 번호 : “ >> 입력 받음 >> 리턴
		System.out.println("도서 번호 : ");
		String bNo = scanner.nextLine();
		return bNo;
	}

	public String inputBookTitle() {
		// “도서 제목 : “ >> 입력 받음 >> 리턴
		System.out.println("도서 제목 : ");
		String title = scanner.nextLine();
		return title;
	}

}
