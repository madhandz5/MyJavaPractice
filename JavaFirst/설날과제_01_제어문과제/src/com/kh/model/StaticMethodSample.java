package com.kh.model;

public class StaticMethodSample {

	public void testMathRandom() {
		System.out.println("===MathŬ������ ������ ���ϴ� �޼ҵ� : 1~45������ ������ ���� ���===");
		int randomNum = (int) (Math.random() * 45 + 1);
		System.out.println("1~45 ������ ���� �� : " + randomNum);
	}

	public void testMathAbs() {
		System.out.println("===MathŬ������ �Ǽ����� ���� ���밪 ���ϴ� �޼ҵ� : -12.77 ���밪 ����ϱ�===");
		double num = -12.77;
		double absNum = Math.abs(num);
		System.out.println(num + "�� ���밪 �� : " + absNum);
	}

	public void testMathMax() {
		System.out.println("===Math Ŭ������ �� ������ ū�� ���ϴ� �޼ҵ� : 120,54�� ū �� ����ϱ�===");
		int a = 120;
		int b = 54;
		int bigNum = Math.max(a, b);

		System.out.println(a + " �� " + b + " �� ū ���� : " + bigNum);
	}
}
