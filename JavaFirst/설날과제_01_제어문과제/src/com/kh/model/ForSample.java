package com.kh.model;

import java.util.Scanner;

public class ForSample {

	Scanner scanner = new Scanner(System.in);

	public void sum1To10() {
		System.out.println("===1~10���� �������� �հ� ���ϱ�===");
		int sum = 0;
		for (int i = 1; i < 11; i++) {
			sum += i;
		}
		System.out.println("1~10���� ������ �հ� : " + sum);
	}

	public void sumEven1To100() {
		System.out.println("===1~100������ ¦������ �հ� ���ϱ�===");
		int sum = 0;
		for (int i = 1; i < 101; i++) {
			if (i % 2 == 0) {
				sum += i;
			}
		}
		System.out.println("1~100���� ¦������ �հ� : " + sum);

	}

	public void oneGugudan() {
		System.out.println("===���� �ϳ� �Է¹޾�, �� ���� ������ ����ϱ�===");
		System.out.println("���� �ϳ��� �Է��ϼ��� : ");
		int gugu = scanner.nextInt();
		scanner.nextLine();

		System.out.println(gugu + "�� �������� ����մϴ�.");
		for (int i = 1; i < 10; i++) {
			System.out.println("" + gugu + " X " + i + " = " + (gugu * i));
		}
	}

	public void sumMinToMax() {
		System.out.println("===�� ���� ������ �Է¹޾�, �� ���� ���� ������ ū �������� �հ� ���ϱ�===");
		System.out.println("ù�� ° ������ �Է��ϼ��� : ");
		int a = scanner.nextInt();
		scanner.nextLine();
		System.out.println("�ι� ° ������ �Է��ϼ��� : ");
		int b = scanner.nextInt();
		scanner.nextLine();
		int sum = 0;
		if (a > b) {
			for (int i = a; i < b + 1; i++) {
				sum += i;
			}
			System.out.println("" + a + "���� " + b + " ���� �հ�� " + sum + " �Դϴ�.");
		} else {
			for (int i = b; i < a + 1; i++) {
				sum += i;
			}
			System.out.println("" + b + "���� " + a + " ���� �հ�� " + sum + " �Դϴ�.");
		}
	}

	public void printStar() {
		System.out.println("===�ټ��� ĭ�� �Է¹޾�, �Էµ� �ټ�/ĭ����ŭ ��ǥ ���� ����ϱ�===");
		System.out.println("�� ���� �׸���� : ");
		int vert = scanner.nextInt();
		scanner.nextLine();
		System.out.println("�� ĭ�� �׸���� : ");
		int hori = scanner.nextInt();
		scanner.nextLine();
		for (int i = 0; i < vert; i++) {
			for (int j = 0; j < hori; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}

	public void printNumberStar() {
		System.out.println("===7�ٿ� 7ĭ�� ��ǥ ���� ����ϵ�, �� �ٿ� �� ��ȣ�� ���� ĭ�� ���� ����ϱ�===");

		for (int i = 1; i < 8; i++) {
			for (int j = 1; j < 8; j++) {
				if (i == j) {
					System.out.print(i);
				} else {
					System.out.print("*");
				}
			}
			System.out.println();
		}
	}

	public void printTriangleStar() {
		System.out.println("====�� ���� �Է¹޾�, �ﰢ�� ������� ��ǥ ���� ����ϱ�(��� : �����ﰢ��, ���� : ���ﰢ��)====");
		System.out.println("������ �׸����?");
		int row = scanner.nextInt();
		scanner.nextLine();
		if (row > 0) {
			for (int i = 0; i < row; i++) {
				for (int j = 0; j < i + 1; j++) {
					System.out.print("*");
				}
				System.out.println();
			}
		} else {
			for (int i = 0; i < Math.abs(row); i++) {
				for (int j = i; j < Math.abs(row); j++) {
					System.out.print("*");
				}
				System.out.println();
			}
		}

	}

	public void guguDan() {
		System.out.println("====������ 2�ܺ��� 9�ܱ��� ����ϱ�====");

		for (int i = 2; i < 10; i++) {
			System.out.println("=====" + i + " �� =====");
			for (int j = 1; j < 10; j++) {
				System.out.println("" + i + " X " + j + " = " + (i * j));
			}
		}
	}
}
