package com.kh.print;

import java.util.Scanner;

public class PrintEx01 {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.print("�̸��� �Է��� �ּ��� : ");
		String name = sc.nextLine();

		System.out.print("���̸� �Է��� �ּ��� : ");
		int age = sc.nextInt();
		sc.nextLine();

		System.out.print("�ּҸ� �Է��� �ּ��� : ");
		String addr = sc.nextLine();

		System.out.print("Ű�� �Է��� �ּ��� : ");
		double height = sc.nextDouble();

		System.out.print("�����Ը� �Է��� �ּ��� : ");
		double weight = sc.nextDouble();

		System.out.print("������ �Է��� �ּ��� : ");
		char gender = sc.next().charAt(0);

		System.out.println("����� �̸��� : " + name);
		System.out.println("����� ���̴� : " + age);
		System.out.println("����� �ּҴ� : " + addr);
		System.out.println("����� Ű��:  " + (int) height);
		System.out.printf("����� �����Դ� : %.1f\n", weight);
		System.out.println("����� ������ : " + gender);
		
	

	}

}
