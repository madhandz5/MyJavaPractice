package com.kh.operator;

public class Arithmatic {

	// ���������
	// +, -, *, /(������), %(������)

	public void method1() {
		int num1 = 10;
		int num2 = 3;

		double dNum1 = 10;
		double dNum2 = 3;

		// + - * ���

		System.out.println("num1 = " + num1);
		System.out.println("num2 = " + num2);
		System.out.println("num1 + num2 = " + (num1 + num2));
		System.out.println("num1 - num2 = " + (num1 - num2));
		System.out.println("num1 * num2 = " + (num1 * num2));

		// / % ���
		System.out.println("num1 / num2 = " + (num1 / num2));
		System.out.println("num1 % num2 = " + (num1 % num2));

		// �Ǽ����� '/' , '%' ����
		System.out.println("dNum1 / dNum2 = " + (dNum1 / dNum2));
		System.out.println("dNum1 % dnum2 = " + (dNum1 % dNum2));

		// % �����ڸ� �ַ� ����ϴ� ���
		// ��� Ȯ��
		// num1 % num2 == 0
		// ¦�� Ȧ�� Ȯ��
		// num1 % num2 == 0 (¦��)
		// num1 % num2 == 1 (Ȧ��)

	}

}
