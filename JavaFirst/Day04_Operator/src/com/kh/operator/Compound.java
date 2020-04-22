package com.kh.operator;

public class Compound {

	// 복합대입연산자
	// 다른 연산자와 대입연산자를 함께 사용하는 연산자를 말한다.
	// += -+ *= /= %=
	// 연산처리속도가 훨씬 빠르다는 장점이 있다.
	// 익숙해지고 나면 쓰는걸 권장드립니다.

	public void method1() {

		int num = 12;
		System.out.println("num : " + num);

		// num을 3 증가시키기

		num = num + 3;
		System.out.println("num + 3 : " + num);

		num += 3;
		System.out.println("num += 3 : " + num);

		num -= 5;
		System.out.println("num -= 5 : " + num);

		num *= 6;
		System.out.println("num *= 6 : " + num);

		num /= 2;
		System.out.println("num /= 2 : " + num);

		num %= 4;
		System.out.println("num %= 4 : " + num);

	}

}
