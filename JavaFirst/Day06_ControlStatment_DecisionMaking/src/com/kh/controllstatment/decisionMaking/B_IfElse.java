package com.kh.controllstatment.decisionMaking;

import java.util.Scanner;

public class B_IfElse {

	Scanner sc = new Scanner(System.in);

	public void testIfElse() {

		// 들 중 한개를 선택하는 조건문으로, 조건이 참인 경우와
		// 조건이 거짓인 경우를 수행하는 조건문
		// 양자 택일이다.

		// [표현식]
		// if(조건식){
		// 실행코드1
		// }

		// else {
		// 실행코드2
		// }

		System.out.println("정수 하나를 입력하세요.");
		int a = sc.nextInt();

		if (a % 2 == 0) {
			if (a == 0) {
				System.out.println("입력하신 정수는 0입니다.");
			} else {
				System.out.println("입력하신 정수는 짝수입니다.");
			}
		} else {
			System.out.println("입력하신 정수는 홀수입니다.");
		}

		System.out.println("프로그램종료");

	}
}
