package com.kh.scan;

import java.util.Scanner;

public class MyScanner {
	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		System.out.println("int�� �Է��� �ּ��� : ");
		int iNum = scanner.nextInt();

		System.out.println("float�� �Է��� �ּ���: ");
		float fNum = scanner.nextFloat();

		System.out.println("double�� �Է��� �ּ���: ");
		double dNum = scanner.nextDouble();

		System.out.println("char�� �Է��� �ּ���: ");
		char ch = scanner.next().charAt(0);
		scanner.nextLine();

		System.out.println("�ϰ���� ���� �Է��� �ּ���");
		String str = scanner.nextLine();

		System.out.println("�Է��� ���� " + iNum + "�Դϴ�.");
		System.out.println("�Է��� float����" + fNum + "�Դϴ�.");
		System.out.println("�Է��� double���� " + dNum + "�Դϴ�.");
		System.out.println("�Է��� char�� " + ch + "�Դϴ�.");
		System.out.println("�Է��� String�� " + str + "�Դϴ�.");

	}
}
