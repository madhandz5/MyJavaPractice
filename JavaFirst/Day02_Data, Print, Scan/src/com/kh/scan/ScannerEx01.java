package com.kh.scan;

import java.util.Scanner;

public class ScannerEx01 {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("�̸��� �Է� �� �ּ���.");
		String name = sc.nextLine();

		System.out.println("���̸� �Է� �ϼ���.");
		int age = sc.nextInt();
		sc.nextLine();

		System.out.println("������ �����ϼ���.");
		System.out.println("[1] : ����");
		System.out.println("[2] : ����");
		int sex = sc.nextInt();
		sc.nextLine();

		System.out.println("�ּҸ� �Է��ϼ���.");
		String adress = sc.nextLine();

		System.out.println("�̸� : " + name);
		if (sex == 1) {
			System.out.println("���� : ����");
		} else if (sex == 2) {
			System.out.println("���� : ����");
		} else {
			System.out.println("�߸��� ���� �Է��Ͽ����ϴ�.");
		}
		System.out.println("���� : " + age);
		System.out.println("�ּ� : " + adress);

	}

}
