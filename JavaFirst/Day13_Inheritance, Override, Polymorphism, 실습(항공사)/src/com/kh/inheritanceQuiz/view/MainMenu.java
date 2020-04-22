package com.kh.inheritanceQuiz.view;

import java.util.Scanner;

import com.kh.inheritanceQuiz.controller.TourController;

public class MainMenu {

	Scanner sc = new Scanner(System.in);
	TourController tc = new TourController();

	// 초기화 블록
	{
		System.out.println("*****말도안되는 가격 / 안전은 장담하지 못하는 KH항공사에 오신 고객님 환영합니다*****");
	}

	public MainMenu() {

	}

	public void mainMenu() {
		System.out.println("현재 보유 금액 : " + tc.bringMyMoney());
		System.out.println("현재 보유 마일리지 : " + tc.bringMyMile());

		while (true) {
			tc.drawMenu();
			System.out.println("목적지 번호를 선택하세요 : ");
			int num = sc.nextInt();
			if (tc.isAble(tc.bringMyMoney(), num - 1))
				tc.buyTicket(num - 1);
			else {
				System.out.println("현재 보유 금액이 부족합니다.");
				break;
			}
			System.out.println("티켓팅 후 잔액은 : " + tc.bringMyMoney());
			System.out.println("티켓팅 후 마일리지는 : " + tc.bringMyMile());
			System.out.println("===============================");
		}
		System.out.println("===프로그램 종료===");
	}
}
