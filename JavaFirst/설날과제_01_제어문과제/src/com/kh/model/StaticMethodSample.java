package com.kh.model;

public class StaticMethodSample {

	public void testMathRandom() {
		System.out.println("===Math클래스의 랜덤값 구하는 메소드 : 1~45사이의 임의의 정수 출력===");
		int randomNum = (int) (Math.random() * 45 + 1);
		System.out.println("1~45 사이의 난수 는 : " + randomNum);
	}

	public void testMathAbs() {
		System.out.println("===Math클래스의 실수값에 대한 절대값 구하는 메소드 : -12.77 절대값 출력하기===");
		double num = -12.77;
		double absNum = Math.abs(num);
		System.out.println(num + "의 절대값 은 : " + absNum);
	}

	public void testMathMax() {
		System.out.println("===Math 클래스의 두 정수중 큰값 구하는 메소드 : 120,54중 큰 값 출력하기===");
		int a = 120;
		int b = 54;
		int bigNum = Math.max(a, b);

		System.out.println(a + " 와 " + b + " 중 큰 값은 : " + bigNum);
	}
}
