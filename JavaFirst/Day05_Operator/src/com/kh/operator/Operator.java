package com.kh.operator;

import java.util.Scanner;

public class Operator {

	Scanner scan = new Scanner(System.in);

	public void ��������Ȯ��() {
		// &&, ||
		int num;
		int num2;

		System.out.println("ù��° ���� �ϳ� �Է� : ");
		num = scan.nextInt();
		System.out.println("�ι�° ���� �ϳ� �Է� : ");
		num2 = scan.nextInt();

		// && : ���� ����� �����̸�, �ڸ� �������� ����
		// ||���� ����� ���̸�, �ڸ� �������� ����

		String res = num >= 1 && num++ <= 100 ? "num������ ���� 1~100 ������ ���̴�." : "num������ ���� 1~100������ ���� �ƴϴ�.";

		System.out.println("num�� ���� : " + num);

		String res2 = num2 >= 1 || num2++ <= 100 ? "num2������ ���� 1���� ũ�ų� 100���� �۴�." : " num2�� ���� 1���� �۰� 100���ٴ� ũ��.";
		System.out.println("num2�� ���� : " + num2);
	}

	public void work() {
		
		System.out.println("�ֹε�Ϲ�ȣ�� �Է��ϼ��� (-�� �����ؼ� �Է�)");
		String idNum = scan.next();
		int age = Integer.parseInt(idNum.substring(0, 2));
		char ch = idNum.charAt(7);
		// ���� �����ϱ�( 1=>1900��� ���� 2=>1900��� ���� 3=>2000��� ���� 4=>2000��� ����)
		// if (ch == '1' || ch == '3') {
		// gender = "����";
		// } else if (ch == '2' || ch == '4') {
		// gender = "����";
		// } else {
		// gender = "�ܱ���";
		// }
		String gender = ch == '1' || ch == '3' ? "����" : ch == '2' || ch == '4' ? "����" : "�ܱ���";
		// ���̱��ϱ�
		if (ch == '1' || ch == '2') {
			age = 2019 - (1900 + age) + 1;
		} else if (ch == '3' || ch == '4') {
			age = 2019 - (2000 + age) + 1;
		}

		System.out.println("�Է��Ͻ� �ֹε�� ��ȣ�� " + idNum + " �Դϴ�.");
		System.out.println("������ " + gender + "�̰�, " + "���̴� " + age + "�� �Դϴ�.");

		if (age >= 20) {
			System.out.println("����� �����Դϴ�.");
		} else {
			System.out.println("����� �̼����� �Դϴ�.");
		}
	}
}
