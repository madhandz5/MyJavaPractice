package com.kh.training.view;

import java.util.Scanner;

import com.kh.training.controller.TrainingManager;

public class MainMenu {
	Scanner sc = new Scanner(System.in);

	public MainMenu() {

	}

	public void mainMenu() {
		System.out.println("훈련생이 몇명입니까?");
		TrainingManager tManager = new TrainingManager(sc.nextInt());
		while (true) {
			System.out.println("======= 메뉴 =======");
			System.out.println("1. 훈련생 추가");
			System.out.println("2. 훈련생 전체 조회");
			System.out.println("3. 훈련생 이름으로 검색");
			System.out.println("9. 프로그램 종료");
			System.out.println("==================");
			System.out.println("원하는 메뉴를 선택하세요 : ");
			int input = sc.nextInt();
			switch (input) {
			case 1:
				tManager.insertTrainees();
				break;
			case 2:
				tManager.printTrainees();
				break;
			case 3:
				tManager.searchTrainees();
				break;
			case 9:
				break;
			default:
				System.out.println("잘못입력하셨습니다. 다시 입력해주세요.");
				break;
			}
			if (input == 9) {
				break;
			}
		}
		System.out.println("프로그램 종료");
	}
}
