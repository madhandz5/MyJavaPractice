package com.kh.controllstatment.decisionMaking;

import java.util.Scanner;

public class E_Practice {

	Scanner sc = new Scanner(System.in);

	public void ifQuiz() {
		// 회원등급 (Dia / Gold / Silver / Bronze)을 입력받은 다음
		// 등급에 따라 쿠폰을 발급해 주는 프로그램을 작성하시오.
		// Dia : 다이아쿠폰 / 50% 할인쿠폰 / 영화티켓 2매 쿠폰 / 20% 할인쿠폰
		// Gold : 50% 할인쿠폰 / 영화티켓 2매 쿠폰 / 20% 할인쿠폰
		// Silver : 20% 할인쿠폰 / 영화티켓 2매 쿠폰
		// Bronze : 20% 할인쿠폰

		// 쿠폰발급은 "00쿠폰발급" 이라고 출력할 경우 발급되었다고 간주.
		// if문을 활용해서 작성해야 합니다.

		System.out.println("회원등급을 입력해주세요. (Dia/Gold/Silver/Bronze)");
		String mg = sc.nextLine();

		if (mg.equals("dia")) {
			System.out.println("다이아쿠폰");
			System.out.println("50%할인쿠폰");
			System.out.println("영화티켓 2매 쿠폰");
			System.out.println("20%할인쿠폰");
		} else if (mg.equals("gold")) {
			System.out.println("50%할인쿠폰");
			System.out.println("영화티켓 2매 쿠폰");
			System.out.println("20%할인쿠폰");
		} else if (mg.equals("silver")) {
			System.out.println("영화티켓 2매 쿠폰");
			System.out.println("20%할인쿠폰");
		} else if (mg.equals("bronze")) {
			System.out.println("20%할인쿠폰");
		} else {
			System.out.println("모두  소문자로 입력해주세요.");
		}
	}

	public void caseQuiz() {

		// 회원등급 (Dia / Gold / Silver / Bronze)을 입력받은 다음
		// 등급에 따라 쿠폰을 발급해 주는 프로그램을 작성하시오.
		// Dia : 다이아쿠폰 / 50% 할인쿠폰 / 영화티켓 2매 쿠폰 / 20% 할인쿠폰
		// Gold : 50% 할인쿠폰 / 영화티켓 2매 쿠폰 / 20% 할인쿠폰
		// Silver : 20% 할인쿠폰 / 영화티켓 2매 쿠폰
		// Bronze : 20% 할인쿠폰

		// 쿠폰발급은 "00쿠폰발급" 이라고 출력할 경우 발급되었다고 간주.
		// switch case문을 활용해서 작성해야 합니다.

		System.out.println("회원등급을 입력해주세요. (dia/gold/silver/bronze)");
		String mg = sc.nextLine();

		switch (mg) {
		case "dia":
			System.out.println("다이아쿠폰");
		case "gold":
			System.out.println("50% 할인쿠폰");
		case "silver":
			System.out.println("영화티켓 2매 쿠폰");
		case "bronze":
			System.out.println("20%할인쿠폰");
			break;
		default:
			System.out.println("모두 소문자로 입력해주세요");
			break;
		}

	}

	public void switchQuiz2() {
		// 1~12월까지 입력받아, 해당하는 달의 마지막 날짜를 출력하세요.
		// default문을 제외하고 출력문 4개로 작성할 수 있습니다.
		System.out.println("1월부터 12월까지 한 달을 선택하여 입력해주세요.");
		int month = sc.nextInt();
		String mDay = "";
		switch (month) {
		case 1:
		case 3:
		case 5:
		case 7:
		case 8:
		case 12:
			mDay = "31";
			break;
		case 2:
			mDay = "28";
			break;
		case 4:
		case 6:
		case 9:
		case 11:
			mDay = "30";
			break;

		default:
			System.out.println("잘못입력하셨습니다.");
			break;
		}
		if (month <= 12) {
			System.out.println(month + "월 의 마지막 날짜는 " + mDay + "일 입니다.");
		}
	}

	public void switchQuiz3() {

		// 월과 기온을 사용자로 부터 입력받아
		// 계절과 주의보를 출력하는 코드를 작성하시오
		// 12,1,2 : 겨울
		// (기온이 -15도 이하일 경우 한파 경보)
		// (기온이 -12도 이하일 경우 한파 주의보)

		// 3,4,5 : 봄
		// 6,7,8 : 여름
		// (기온이 35도 이상일 경우 폭염경보)
		// (기온이 33도 이상일 경우 폭염주의보)

		// 9,10,11 : 가을

		int month;
		double temp;
		String season = "";
		String warn = "";

		System.out.println("몇월인지 입력하세요");
		while (true) {
			try {
				month = sc.nextInt();
				if (month >= 1 && month <= 12)
					break;
				else {
					System.out.println("잘못 입력하셨습니다. 1~12의 값을 입력해주세요.");
				}
			} catch (Exception e) {
				System.out.println("잘못 입력하셨습니다. 1~12의 값을 입력해주세요.");
				sc = new Scanner(System.in);
			}
		}
		System.out.println("기온을 입력하세요");
		while (true) {
			try {
				temp = sc.nextDouble();
				break;
			} catch (Exception e) {
				System.out.println("잘못 입력하셨습니다. 실수 값만 입력할 수 있습니다. 다시 입력해주세요.");
				sc = new Scanner(System.in);
			}
		}
		switch (month) {
		case 12:
		case 1:
		case 2:
			season = "겨울";
			if (temp <= -15) {
				warn = "한파 경보";
			} else if (temp <= -12) {
				warn = " 한파 주의보";
			}
			break;
		case 3:
		case 4:
		case 5:
			season = "봄";
			break;
		case 6:
		case 7:
		case 8:
			season = "여름";
			if (temp >= 35) {
				warn = "폭염 경보";
			} else if (temp >= 33) {
				warn = "폭염 주의보";
			}
			break;
		case 9:
		case 10:
		case 11:
			season = "가을";
			break;
		}

		System.out.println("입력하신 " + month + "월은 " + season + " 이고,");
		if (warn.isEmpty()) {
			System.out.println("현재 기온은 " + temp + "'c 입니다.");
		} else {
			System.out.println("현재 기온은 " + temp + "'c로 " + warn + "가 발령중입니다.");
		}
	}

	public void switchQuiz4() {
		// 두개의 정수를 입력받고, 문자 혹은 문자열로 연산기호 (+,-,*,/,%)를 입력받아
		// 연산의 수행결과를 출력하시오
		// 연산의 경우 0 이상의 값이 나오도록 계산하세요.

		// 단, 0으로 나눌 경우 "0으로 나눌 수 없습니다"를 출력하고 결과 값을 0으로 처리하며,
		// 연산기호에 없는 문자를 입력하면 "입력하신 연산은 없습니다. 프로그램을종료합니다." 를
		// 출력 후 프로그램을 종료하시오

		System.out.println("첫번 째 정수를 입력하세요");
		int numA = sc.nextInt();
		System.out.println("두번 째 정수를 입력하세요");
		int numB = sc.nextInt();
		sc.nextLine();
		System.out.println("연산 기호를 입력하세요.(+,-,*,/,%)");
		char c = sc.next().charAt(0);
		int result = 0;
		switch (c) {
		case '+':
			result = numA + numB;
			break;
		case '-':
			if (numA > numB) {
				result = numA - numB;
			} else {
				result = numB - numA;
			}
			break;

		case '*':
			result = numA * numB;
			break;
		case '/':
			if (numB != 0) {
				result = numA / numB;
			} else {
				System.out.println("0으로는 나눌 수 없습니다.");
			}
			break;
		case '%':
			if (numB != 0) {
				result = numA % numB;
				break;
			} else {
				System.out.println("0으로는 나눌 수 없습니다.");
			}
		default:
			System.out.println("잘못 입력하였습니다.");
			break;
		}
		System.out.println(result);
	}
}