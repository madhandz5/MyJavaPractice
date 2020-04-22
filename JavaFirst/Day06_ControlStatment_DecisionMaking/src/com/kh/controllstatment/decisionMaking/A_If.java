package com.kh.controllstatment.decisionMaking;

import java.util.Scanner;

public class A_If {

	// 단독 if문
	// if문은 조건식의 결과 같이 참(true)이면 {} 안의 코드를
	// 실행하고, 조건식의 결과값이 거짓(false)이면
	// {}안의 코드를 무시하고 넘어간다.

	// [표현식]
	// if(조건식){
	// 실행코드
	// }

	Scanner sc = new Scanner(System.in);

	public void testIf() {

		// 정수하나를 입력받은 뒤
		// 짝수인지 홀수 인지 판단하여 결과를 출력하라.
		// 짝수이면 "입력하신 숫자는 짝수 입니다."
		// 홀수이면 "입력하신 숫자는 홀수 입니다."

		System.out.println("정수 하나를 입력하세요.");
		int a = sc.nextInt();

		if (a % 2 == 0) {
			System.out.println("짝수입니다.");
		}
		if (a % 2 != 0) {
			System.out.println("홀수입니다.");
		}

		System.out.println("프로그램종료");

	}
}
