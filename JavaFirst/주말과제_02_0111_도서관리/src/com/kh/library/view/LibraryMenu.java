package com.kh.library.view;

import java.util.Scanner;

import com.kh.library.controller.LibraryManager;
import com.kh.library.model.vo.Book;
import com.kh.library.model.vo.Member;

public class LibraryMenu {

	LibraryManager lm = new LibraryManager();
	Scanner sc = new Scanner(System.in);

	public LibraryMenu() {
		System.out.println("이름을 입력하세요 : ");
		String name = sc.nextLine();
		System.out.println("나이를 입력하세요 : ");
		int age = sc.nextInt();
		sc.nextLine();
		System.out.println("성별을 입력하세요(M/F)  : ");
		char gender = sc.nextLine().charAt(0);
		lm.insertMember(new Member(name, age, gender, 0));
	}

	public void mainMenu() {
		boolean cont = true;
		do {
			System.out.println("====== 메뉴 ======");
			System.out.println("1. 마이페이지");
			System.out.println("2. 도서 전체 조회");
			System.out.println("3. 도서 검색");
			System.out.println("4. 도서 대여하기");
			System.out.println("9. 프로그램 종료하기");
			System.out.println("================");
			System.out.println("원하시는 번호를 입력하세요 : ");
			int input = sc.nextInt();
			sc.nextLine();
			switch (input) {
			case 1:
				System.out.println(lm.myPage());
				lm.rentList();
				break;
			case 2:
				selectAll();
				break;
			case 3:
				searchBook();
				break;
			case 4:
				rentBook();
				break;
			case 9:
				cont = false;
				break;
			default:
				System.out.println("잘못입력하셨습니다. 다시 입력해주세요.");
				break;
			}
		} while (cont);
		System.out.println("프로그램 종료");
	}

	public void selectAll() {
		Book[] bList = lm.selectAll();

		System.out.println("=====================도서 목록=====================");
		for (int i = 0; i < bList.length; i++) {
			System.out.println((i + 1) + "번 도서 : " + bList[i].toString());
		}
		System.out.println("================================================");
	}

	// 내 코드

	// public void searchBook() {
	// System.out.println("검색하실 책 제목을 입력해 주세요 : ");
	// String search = sc.nextLine();
	// Book[] searchList = lm.searchBook(search);
	// for (int i = 0; i < searchList.length; i++) {
	// System.out.println((i + 1) + "번째 - " + searchList[i].getTitle());
	// }
	// }

	public void searchBook() {

		System.out.println("검색하실 책 제목을 입력해 주세요 : ");
		String search = sc.nextLine();
		Book[] searchList = lm.searchBook(search);

		for (int i = 0; i < searchList.length; i++) {
			try {
				System.out.println(i + "번째 - " + searchList[i].getTitle());

			} catch (NullPointerException e) {
			} finally {
				System.out.println("무조건 실행");
			}
		}
	}

	public void rentBook() {
		selectAll();
		System.out.println("몇번 도서를 대여할까요? : ");
		int index = lm.rentBook(sc.nextInt() - 1);
		sc.nextLine();
		if (index == 0) {
			System.out.println("성공적으로 대여 되었습니다.");
		} else if (index == 1) {
			System.out.println("나이제한으로 대여 불가능입니다.");
		} else if (index == 2) {
			System.out.println("성공적으로 대여되었습니다. 요리학원 쿠폰이 발급되었습니다.");
			System.out.println("마이페이지에서 확인하세요");
		}
	}
}
