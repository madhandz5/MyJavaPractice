package com.kh.operator;

public class Comparison {

	// 비교연산자
	// 두 값을 비교하는 연산자.
	// 조건을 만족하면 true, 아니면 false를 반환한다.

	public void method1() {

		int a = 10;
		int b = 25;

		boolean result, result2, result3, result4;

		result = (a == b);

		result2 = (a <= b);

		result3 = (a > b);

		result4 = (b % 2 == 0);

		System.out.println("result1 : " + result);
		System.out.println("result2 : " + result2);
		System.out.println("result3 : " + result3);

		// b는 짝수인지 홀수있지 출력하기
		// "b는 짝수인가? : " true/false

		System.out.println("b는 짝수인가 ? : " + result4);

	}
}
