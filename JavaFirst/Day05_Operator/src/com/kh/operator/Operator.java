package com.kh.operator;

import java.util.Scanner;

public class Operator {

	Scanner scan = new Scanner(System.in);

	public void 논리연산자확인() {
		// &&, ||
		int num;
		int num2;

		System.out.println("첫번째 정수 하나 입력 : ");
		num = scan.nextInt();
		System.out.println("두번째 정수 하나 입력 : ");
		num2 = scan.nextInt();

		// && : 앞의 결과가 거짓이면, 뒤를 실행하지 않음
		// ||앞의 결과가 참이면, 뒤를 실행하지 않음

		String res = num >= 1 && num++ <= 100 ? "num변수의 값은 1~100 사이의 값이다." : "num변수의 값은 1~100사이의 값이 아니다.";

		System.out.println("num의 값은 : " + num);

		String res2 = num2 >= 1 || num2++ <= 100 ? "num2변수의 값은 1보다 크거나 100보다 작다." : " num2의 값은 1보다 작고 100보다는 크다.";
		System.out.println("num2의 값은 : " + num2);
	}

	public void work() {
		
		System.out.println("주민등록번호를 입력하세요 (-를 포함해서 입력)");
		String idNum = scan.next();
		int age = Integer.parseInt(idNum.substring(0, 2));
		char ch = idNum.charAt(7);
		// 성별 구분하기( 1=>1900년대 남자 2=>1900년대 여자 3=>2000년대 남자 4=>2000년대 여자)
		// if (ch == '1' || ch == '3') {
		// gender = "남성";
		// } else if (ch == '2' || ch == '4') {
		// gender = "여성";
		// } else {
		// gender = "외국인";
		// }
		String gender = ch == '1' || ch == '3' ? "남성" : ch == '2' || ch == '4' ? "여성" : "외국인";
		// 나이구하기
		if (ch == '1' || ch == '2') {
			age = 2019 - (1900 + age) + 1;
		} else if (ch == '3' || ch == '4') {
			age = 2019 - (2000 + age) + 1;
		}

		System.out.println("입력하신 주민등록 번호는 " + idNum + " 입니다.");
		System.out.println("성별은 " + gender + "이고, " + "나이는 " + age + "세 입니다.");

		if (age >= 20) {
			System.out.println("당신은 성인입니다.");
		} else {
			System.out.println("당신은 미성년자 입니다.");
		}
	}
}
