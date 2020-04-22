package com.kh.operator;

public class Arithmatic {

	// 산술연산자
	// +, -, *, /(나누기), %(나머지)

	public void method1() {
		int num1 = 10;
		int num2 = 3;

		double dNum1 = 10;
		double dNum2 = 3;

		// + - * 출력

		System.out.println("num1 = " + num1);
		System.out.println("num2 = " + num2);
		System.out.println("num1 + num2 = " + (num1 + num2));
		System.out.println("num1 - num2 = " + (num1 - num2));
		System.out.println("num1 * num2 = " + (num1 * num2));

		// / % 출력
		System.out.println("num1 / num2 = " + (num1 / num2));
		System.out.println("num1 % num2 = " + (num1 % num2));

		// 실수형의 '/' , '%' 연산
		System.out.println("dNum1 / dNum2 = " + (dNum1 / dNum2));
		System.out.println("dNum1 % dnum2 = " + (dNum1 % dNum2));

		// % 연산자를 주로 사용하는 경우
		// 배수 확인
		// num1 % num2 == 0
		// 짝수 홀수 확인
		// num1 % num2 == 0 (짝수)
		// num1 % num2 == 1 (홀수)

	}

}
