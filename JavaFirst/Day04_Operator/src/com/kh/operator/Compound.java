package com.kh.operator;

public class Compound {

	// ���մ��Կ�����
	// �ٸ� �����ڿ� ���Կ����ڸ� �Բ� ����ϴ� �����ڸ� ���Ѵ�.
	// += -+ *= /= %=
	// ����ó���ӵ��� �ξ� �����ٴ� ������ �ִ�.
	// �ͼ������� ���� ���°� ����帳�ϴ�.

	public void method1() {

		int num = 12;
		System.out.println("num : " + num);

		// num�� 3 ������Ű��

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
