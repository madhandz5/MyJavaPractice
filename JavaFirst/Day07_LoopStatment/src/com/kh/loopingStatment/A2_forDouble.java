package com.kh.loopingStatment;

import java.util.Scanner;

public class A2_forDouble {

	Scanner sc = new Scanner(System.in);

	// 2�� for�� �ۼ��غ���
	public void testForDouble() {
		System.out.println("��� �� �ټ� : ");
		int row = sc.nextInt();

		for (int i = 1; i <= row; i++) {
			for (int j = 1; j <= 5; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
	// 2�� for������ ������ ����غ���

	public void testForDouble2() {

		for (int i = 2; i < 10; i++) {
			System.out.println("======= " + i + "�� =======");
			for (int j = 1; j < 10; j++) {
				System.out.println(i + " X " + j + " = " + (i * j));
			}
		}
	}

	public void testForDouble3() {

		// �ٿ�ε� ���� ���α׷� ������ �Է��ϼ���.

		// n��° ���α׷� �ٿ�ε� �޽��ϴ�.
		// 0% ������...
		// 20% ������...
		// 40% ������...
		// 60% ������...
		// 80% ������...
		// 100% ������...
		// n��° ���α׷� �ٿ�ε� �Ϸ�Ǿ����ϴ�.
		// ------------------------------
		// ������α׷� �ٿ�ε� �Ϸ�

		System.out.println("��� ���α׷��� �ٿ�ε� �������");
		int many = sc.nextInt();

		for (int i = 1; i < many + 1; i++) {
			System.out.println(i + "��° ���α׷��� �ٿ�ε� �޽��ϴ�.");
			for (int j = 0; j <= 100; j += 20) {
				System.out.println(j + "% ������...");

			}
			System.out.println(i + "��° ���α׷� �ٿ�ε� �Ϸ�Ǿ����ϴ�.");
			System.out.println("---------------------------------");
		}
		System.out.println("��� ���α׷� �ٿ�ε� �Ϸ�Ǿ����ϴ�.");
	}

	public void testForDouble4() {

		// �� �� :
		// ĭ �� :

		int horizontal = 0;
		int vertical = 0;

		System.out.println("����?");
		horizontal = sc.nextInt();
		System.out.println("��ĭ?");
		vertical = sc.nextInt();

		for (int i = 1; i <= horizontal; i++) {
			for (int j = 1; j <= vertical; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}

	public void testForDouble5() {

		// �� �� :
		// ĭ �� :
		// �밢������ 1,2,3,4,5,6,7 ���

		int horizontal = 0;
		int vertical = 0;

		System.out.println("����?");
		horizontal = sc.nextInt();
		System.out.println("��ĭ?");
		vertical = sc.nextInt();

		for (int i = 1; i <= horizontal; i++) {
			for (int j = 1; j <= vertical; j++) {
				if (i == j) {
					System.out.print(i);
				} else {
					System.out.print("*");
				}
			}
			System.out.println();
		}
	}

	public void drawDiamond() {

		System.out.println("����?");
		int num = sc.nextInt();
		for (int i = 0; i < num; i++) {
			for (int j = 0; j < num; j++) {
				if (i <= num / 2) {
					if (i + j <= num / 2 - 1)
						System.out.print(" ");
					else if (j - i >= num / 2 + 1)
						System.out.print(" ");
					else
						System.out.print("*");
				} else if (i > num / 2) {
					if (i - j >= num / 2 + 1)
						System.out.print(" ");
					else if (i + j >= num / 2 * 3 + 1)
						System.out.print(" ");
					else
						System.out.print("*");
				}
			}
			System.out.println();
		}
	}

}
