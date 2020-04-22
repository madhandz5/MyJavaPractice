package com.kh.model;

import java.util.Scanner;

public class DoWhileSample {
	Scanner scanner = new Scanner(System.in);

	public void addDashToken() {

		System.out.println("===문자열값 입력받아, 문자 사이에 '-' 끼워넣어 출력하기===");
		System.out.println("문자열을 입력하세요 : ");
		String str = scanner.nextLine();
		int arrIndex = 0;
		String[] strArr = str.split("");
		int newArrIndexSize = (strArr.length * 2) - 1;
		String[] newStrArr = new String[newArrIndexSize];
		int newArrIndex = 0;
		do {
			if (newArrIndex % 2 == 0) {
				newStrArr[newArrIndex] = strArr[arrIndex];
				arrIndex++;
				newArrIndex++;
			} else {
				newStrArr[newArrIndex] = "-";
				newArrIndex++;
			}

		} while (!(newArrIndex == newArrIndexSize));
		for (int i = 0; i < newArrIndexSize; i++) {
			System.out.print(newStrArr[i]);
		}
		System.out.println();

	}

	// 이건 또다른 버전 한번 구현해봄.
	public void addDashToken2() {
		System.out.println("===문자열값 입력받아, 문자 사이에 '-' 끼워넣어 출력하기===");
		System.out.println("문자열을 입력하세요 : ");
		String str = scanner.nextLine();
		int index = 0;
		do {
			System.out.print(str.charAt(index++));
			if (index != str.length()) {
				System.out.print("-");
			}
		} while (index < str.length());
		System.out.println();
	}

	public void burgerKingMenu() {
		System.out.println("====버거킹 메뉴 주문 테스트====");
		boolean cont = true;
		do {
			System.out.println("메뉴를 선택하세요 : ");
			System.out.println("1. 와퍼세트");
			System.out.println("2. 와퍼주니어세트");
			System.out.println("3. 콜라");
			System.out.println("9. 나가기");
			System.out.println("===============");
			System.out.println("번호를 선택하세요 : ");
			int input = scanner.nextInt();
			scanner.nextLine();
			switch (input) {
			case 1:
				System.out.println("와퍼세트 주문 완료");
				break;
			case 2:
				System.out.println("와퍼주니어세트 주문 완료");
				break;
			case 3:
				System.out.println("콜라 주문 완료");
				break;
			case 9:
				System.out.println("안녕히 가세요.");
				cont = false;
				break;
			default:
				System.out.println("잘못입력했습니다.");
				break;
			}
		} while (cont);
		System.out.println("프로그램 종료");
	}

	public void isStringAlphabet() {
		System.out.println("===문자열 입력받아, \"모든 글자 영문자다\" \"영문자 아니다.\"출력하기===");
		System.out.println("문자열을 입력 하세요 : ");
		String str = scanner.nextLine();
		char[] strArr = str.toCharArray();
		int check = 0;
		int length = 0;
		do {
			if (strArr[length] > 64 && strArr[length] < 91) {
				check += 0;
			} else if (strArr[length] > 96 && strArr[length] < 123) {
				check += 0;
			} else {
				check++;
			}
			length++;
		} while (!(length == strArr.length));
		if (check == 0) {
			System.out.println("모든 글자(공백제외) 영문자다");
		} else {
			System.out.println("모든 글자 영문자 아니다.");
		}
	}

}
