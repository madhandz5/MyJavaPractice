package com.kh.loopingStatment;

import java.util.Scanner;

public class A_For {

	Scanner sc = new Scanner(System.in);

	public void testFor() {

		char ch = 'A';
		for (int i = 0; i < 26; i++) {
			System.out.println((char) (ch + i) + "�� �ƽ�Ű�ڵ�� " + (int) (ch + i) + "�Դϴ�.");
		}

	}

	public void testFor3() {

		// 0,1,2,3,4 ����ϱ�

		// for (int i = 0; i < 5; i++) {
		// System.out.println(i);
		// }
		// // -5, -4, -3, -2, -1, 0
		// for (int i = -5; i <= 0; i++) {
		// System.out.println(i);
		// }

		// 2,4,6,8
		for (int i = 2; i < 9; i = i + 2) {
			System.out.println(i);
		}

	}

	public void testFor2() {
		for (int i = 1; i <= 100; i++) {
			if (i % 2 == 0) {
				System.out.println(i);
			}
		}
	}

	// for������ ������ ����غ���
	// ����ڷ� ���� ���� �Է¹޾Ƽ� �� ���� �������� ����Ͻÿ�

	public void testFor4() {

		System.out.println("�� ��?");
		int gugu = sc.nextInt();

		for (int i = 1; i < 10; i++) {
			System.out.println(gugu + " X " + i + " = " + (gugu * i));
		}

	}

}
