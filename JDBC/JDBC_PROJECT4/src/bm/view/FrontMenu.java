package bm.view;

import java.util.Scanner;

import bm.model.vo.Member;

public class FrontMenu {

	Scanner sc = new Scanner(System.in);
	MemberMenu memberMenu = new MemberMenu();
	BookMenu bookMenu = new BookMenu();

	public void frontMenu() {

		do {
			System.out.println("***************Welcome*************");
			System.out.println("0. 회원가입");
			System.out.println("1. Login");
			System.out.println("5. 회원 전체 목록 보기");
			System.out.println("9. 프로그램 종료");

			System.out.print("입력 : ");
			int no = sc.nextInt();
			sc.nextLine();

			switch (no) {
			case 0:
				memberMenu.joinMenu();
				break;
			case 1:
				displayMenu(memberMenu.loginMenu());
				break;
			case 5:
				memberMenu.printAllMembers();
				System.out.println();
				System.out.println();
				break;
			case 9:
				System.out.println("프로그램을 종료합니다.");
				System.exit(0);
			default:
				System.out.println("정확한 값을 입력해주세요.");
				break;
			}
		} while (true);
	}

	public void displayMenu(Member m) {
		do {
			System.out.println("원하는 메뉴를 선택해주세요.");
			System.out.println("1. 도서 메뉴");
			System.out.println("2. MyPage");
			System.out.println("3. LogOut");
			System.out.print("입력 : ");
			int no = sc.nextInt();
			sc.nextLine();

			switch (no) {
			case 1:
				bookMenu.bookMenu(m);
				break;
			case 2:
				memberMenu.myPage(m);
				break;
			case 3:
				return;
			default:
				System.out.println("정확한 번호를 입력해주세요.");
				break;
			}

		} while (true);
	}

}
