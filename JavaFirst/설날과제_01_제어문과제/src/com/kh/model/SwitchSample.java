package com.kh.model;

import java.util.Scanner;

public class SwitchSample {

	Scanner scanner = new Scanner(System.in);

	public void calculator() {
		System.out.println("===�� ���� ������ �� ���� ���깮�ڸ� �Է¹޾� ����� ��� Ȯ���ϱ�===");
		System.out.println("ù�� ° ������ �Է��ϼ��� : ");
		int a = scanner.nextInt();
		scanner.nextLine();
		System.out.println("�ι� ° ������ �Է��ϼ��� : ");
		int b = scanner.nextInt();
		scanner.nextLine();
		System.out.println("���깮�ڸ� �Է��ϼ��� : ");
		char ch = scanner.next().charAt(0);
		scanner.nextLine();

		switch (ch) {
		case '+':
			System.out.println("" + a + ch + b + " = " + (a + b));
			break;
		case '-':
			System.out.println("" + a + ch + b + " = " + (a - b));
			break;
		case '*':
			System.out.println("" + a + ch + b + " = " + (a * b));
			break;
		case '/':
			System.out.println("" + a + ch + b + " = " + (a / b));
			break;
		case '%':
			System.out.println("" + a + ch + b + " = " + (a % b));
			break;
		default:
			System.out.println("�߸� �Է��߽��ϴ�.");
			break;
		}
	}

	public void fruitPrice() {
		System.out.println("===�����̸��� ���ڿ��� �Է¹޾�, �� ������ ���� ����ϱ�===");
		System.out.println("���� �̸��� �Է��ϼ��� (���, ��, ����, ��): ");
		String name = scanner.nextLine();
		char ch = 'z';
		int price = 0;
		if (name.equals("���")) {
			ch = 'a';
		} else if (name.equals("��")) {
			ch = 'p';
		} else if (name.equals("����")) {
			ch = 'g';
		} else if (name.equals("��")) {
			ch = 'o';
		}

		switch (ch) {
		case 'a':
			price = 5000;
			break;
		case 'p':
			price = 14000;
			break;
		case 'g':
			price = 2500;
			break;
		case 'o':
			price = 9900;
			break;
		case 'z':
			System.out.println("������ �� �� ���� �����Դϴ�.");
			break;
		}
		System.out.println(name + "�� ������ " + price + "�� �Դϴ�.");
	}

}
