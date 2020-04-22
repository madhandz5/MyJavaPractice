package com.kh.controllstatment.decisionMaking;

import java.util.Scanner;

public class D_Switch {

	// 변수의 값을 case에서 찾아 명령을 수행하는 조건문이다.
	// (범위가 아니라 정확한 값이어야 한다. i < 10 (x), i == 10 (o)
	// 해당 값이 없을 경우 default문을 수행한다(if문의 else와 유사)
	// case와 명령문 사이에는 (;)을 써야한다.
	// break가 없으면 멈추지 않고 다음 case나 default를 수행한다.

	// [표현식]
	// switch(변수){
	// case 1 : 실행문; break; // 변수값이 1일경우 여기만 실행
	// case 2 : 실행문2; break; // 변수값이 2일경우 여기만 실행
	// default : 실행문3; break; // 1도 2도 아니면 여기 실행

	Scanner sc = new Scanner(System.in);

	public void testSwitch1() {

		// 정수를 하나 입력받은 뒤 입력받은 숫자가 짝수인지 홀수 인지 판별

		System.out.println("정수를 하나 입력하세요.");
		int num = sc.nextInt();
		int isEven = num % 2;

		switch (isEven) {
		case 0:
			System.out.println("입력하신 정수는 짝수입니다.");
			break;
		default:
			System.out.println("입력하신 정수는 홀수입니다.");
			break;
		}

	}

	// Switch 문 안에 if문 작성
	public void testSwitch2() {

		// 하나의 정수를 입력받은 뒤
		// 해당 정수가 0인지 짝수인지 홀수인지 출력하는
		// switch문을 작성하시오.

		System.out.println("정수 하나를 입력하세요");
		int num = sc.nextInt();

		switch (num % 2) {
		case 0:
			if (num != 0) {
				System.out.println("짝수입니다.");
			} else {
				System.out.println("입력하신 정수는 0입니다.");
			}
			break;
		default:
			System.out.println("홀수입니다.");
			break;
		}
	}

	public void testSwitch3() {

		// 하나의 정수를 입력받은 뒤
		// 해당 정수가 0인지 짝수인지 홀수인지 출력하는
		// switch문을 작성하시오.

		System.out.println("정수 하나를 입력하세요");
		int num = sc.nextInt();

		switch (num % 2) {
		case 0:
			switch (num) {
			case 0:
				System.out.println("입력하신 정수는 0입니다.");
				break;
			default:
				System.out.println("입력하신 정수는 짝수입니다.");
				break;
			}
			break;
		default:
			System.out.println("입력하신 정수는 홀수입니다.");
			break;
		}
	}

	public void testSwitch4() {
		// break문 삭제해보기
		// Fall Through
		// 활용할 수는 있지만 가독성이 떨어진다.
		// 만약에 사용한다면 주석을 필수로 달아줘야 한다.

		// 하나의 정수를 입력받은 뒤
		// 해당 정수가 0인지 짝수인지 홀수인지 출력하는
		// switch문을 작성하시오.

		System.out.println("정수 하나를 입력하세요");
		int num = sc.nextInt();

		switch (num % 2) {
		case 0:
			switch (num) {
			case 0:
				System.out.println("입력하신 정수는 0입니다.");
				// break;
			default:
				System.out.println("입력하신 정수는 짝수입니다.");
				// break;
			}
			// break;
		default:
			System.out.println("입력하신 정수는 홀수입니다.");
			// break;
		}
	}


}
