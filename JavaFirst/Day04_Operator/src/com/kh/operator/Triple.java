package com.kh.operator;

import java.util.Scanner;

public class Triple {

	// 3�� ������
	// ���ǽ� ? ��1 : ��2

	public void method1() {

		// �Է� ���� ������ Ȧ������ ¦������ �Ǻ� �� ���

		Scanner scanner1 = new Scanner(System.in);

		System.out.println("������ �Է��ϼ��� : ");
		int num = scanner1.nextInt();

		String result = (num % 2 == 0) ? "¦��" : "Ȧ��";

		System.out.println(num + " ��/�� " + result + "�̴�.");

	}

	public void method2() {
		// �Է¹��� ������ ������� �ƴ��� �Ǻ� �� ���
		// ��� : "num �� ��� / ���� �Դϴ�."
		Scanner scanner2 = new Scanner(System.in);

		System.out.println("������ �Է��ϼ��� : ");
		int num2 = scanner2.nextInt();

		String result2 = (num2 >= 0) ? "���" : "����";

		System.out.println(num2 + " ��/�� " + result2 + "�̴�.");

	}

	public void method3() {
		// ���׿����� ��ø ���
		// �Է¹��� ������ ���, 0, �������� �Ǻ� �� ���

		Scanner scanner3 = new Scanner(System.in);
		System.out.println("������ �Է��ϼ��� : ");
		int num3 = scanner3.nextInt();

		String result3 = (num3 == 0) ? "0" : (num3 > 0) ? "���" : "����";
		System.out.println(num3 + " ��/�� " + result3 + "�Դϴ�.");

	}

	public void method4() {
		// �� ���� '+', �Ǵ� '-'�� �Է¹޾� �˸��� ��� ��� ����ϱ�.
		// �� '+', '-' �̿��� ������ �Է� �� '�߸� �Է� �ϼ̽��ϴ�." ���

		Scanner scanner4 = new Scanner(System.in);
		System.out.println("ù��° �� : ");
		int numA = scanner4.nextInt();

		System.out.println("�ι�° �� : ");
		int numB = scanner4.nextInt();
		// ��ĳ�� ���ۿ� ����ִ� �����͸� ����ش�.

		scanner4.nextLine();

		// ����ڷ� ���� �Է¹��� ���ڿ��� ù��° ���ڸ� ��ȯ�Ѵ�.
		// ����ڰ� �Է��� �����ڰ� op�� ����ִ�.

		System.out.println("������ �Է� ( + or - ) : ");
		char op = scanner4.nextLine().charAt(0);

		String result4 = (op == '+') ? "" + (numA + numB) : (op == '-') ? "" + (numA - numB) : "�߸� �Է� �ϼ̽��ϴ�.";

		System.out.println(result4);

	}

}
