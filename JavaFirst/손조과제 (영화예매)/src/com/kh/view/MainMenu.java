package com.kh.view;

import java.util.Scanner;

import com.kh.controller.MovieManager;
import com.kh.model.vo.User;

public class MainMenu {
	Scanner scanner = new Scanner(System.in);
	MovieManager mm = new MovieManager();

	public MainMenu() {

		{
			System.out.println("====== KH영화관에 오신 것을 환영합니다. ======");
			System.out.println();
			System.out.println("★영화관의 30% 할인혜택★");
			System.out.println("1. 영화 관람일과 사용자의 생일이 같은경우");
			System.out.println("2. 영화가 11시 이전 시작영화일 경우");
			System.out.println("3. 할인쿠폰을 보유하고 계신 경우");
			System.out.println("함께 관람하는 모두가 할인된 가격을 적용 받습니다.");
			System.out.println("==================================");
			System.out.println();
		}
	}

	public void mainMenu() {
		System.out.println("이름을 입력하시오 : ");
		String name = scanner.nextLine();
		System.out.println("나이를 입력하시오 : ");
		int age = scanner.nextInt();
		scanner.nextLine();
		System.out.println("생일 4자리를 입력하세요 : ");
		int birth = scanner.nextInt();
		scanner.nextLine();
		System.out.println("가지고 계신 쿠폰의 개수를 입력 해 주세요 : ");
		int couponCount = scanner.nextInt();
		scanner.nextLine();

		mm.insertMember(new User(name, age, birth, couponCount));

		System.out.println("입력하신 정보로 회원등록이 완료되었습니다.");

		while (true) {

			System.out.println("======메뉴======");
			System.out.println("1. 마이페이지");
			System.out.println("2. 영화 전체 조회");
			System.out.println("3. 영화 예약하기");
			System.out.println("9. 프로그램 종료하기");
			System.out.println("===============");
			System.out.println("원하시는 메뉴의 번호를 입력하세요 : ");

			int input = scanner.nextInt();
			scanner.nextLine();

			switch (input) {
			case 1:
				// MovieManager의 myPage() 호출
				System.out.println(mm.myPage());
				break;
			case 2:
				// MovieManager의 selectAll() 호출
				mm.selectAll();
				break;
			case 3:
				// MovieManager의 selectAll()과 reservation() 호출
				mm.selectAll();
				reservation();
				break;
			case 9:
				// return 처리
				System.out.println("프로그램 종료");
				break;
			}
		}
	}

	public void reservation() {
		System.out.println("예약 할 영화 번호를 선택하세요  : ");
		int input = scanner.nextInt();
		scanner.nextLine();

		int mIndex = mm.reservation(input - 1);

		if (mIndex == 0) {
		} else if (mIndex == 1) {
			System.out.println("아동과 함께 예약이 불가능합니다.");
		} else if (mIndex == 2) {
			System.out.println("나이제한으로 인해 예약이 불가능합니다.");
		} else if (mIndex == 3) {
		}
	}
}
