package com.kh.model;

import java.util.Scanner;

public class SwitchSample {

	Scanner scanner = new Scanner(System.in);

	public void calculator() {
		System.out.println("===두 개의 정수와 한 개의 연산문자를 입력받아 계산한 결과 확인하기===");
		System.out.println("첫번 째 정수를 입력하세요 : ");
		int a = scanner.nextInt();
		scanner.nextLine();
		System.out.println("두번 째 정수를 입력하세요 : ");
		int b = scanner.nextInt();
		scanner.nextLine();
		System.out.println("연산문자를 입력하세요 : ");
		char ch = scanner.next().charAt(0);
		scanner.nextLine();

		switch (ch) {
		case '+':
			System.out.println("" + a + ch + b + " = " + (a + b));
			break;
		case '-':
			System.out.println("" + a + ch + b + " = " + (a - b));
			break;
		case '*':
			System.out.println("" + a + ch + b + " = " + (a * b));
			break;
		case '/':
			System.out.println("" + a + ch + b + " = " + (a / b));
			break;
		case '%':
			System.out.println("" + a + ch + b + " = " + (a % b));
			break;
		default:
			System.out.println("잘못 입력했습니다.");
			break;
		}
	}

	public void fruitPrice() {
		System.out.println("===과일이름을 문자열로 입력받아, 그 과일의 가격 출력하기===");
		System.out.println("과일 이름을 입력하세요 (사과, 배, 포도, 귤): ");
		String name = scanner.nextLine();
		char ch = 'z';
		int price = 0;
		if (name.equals("사과")) {
			ch = 'a';
		} else if (name.equals("배")) {
			ch = 'p';
		} else if (name.equals("포도")) {
			ch = 'g';
		} else if (name.equals("귤")) {
			ch = 'o';
		}

		switch (ch) {
		case 'a':
			price = 5000;
			break;
		case 'p':
			price = 14000;
			break;
		case 'g':
			price = 2500;
			break;
		case 'o':
			price = 9900;
			break;
		case 'z':
			System.out.println("가격을 알 수 없는 과일입니다.");
			break;
		}
		System.out.println(name + "의 가격은 " + price + "원 입니다.");
	}

}
