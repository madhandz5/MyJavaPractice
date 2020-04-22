package com.kh.controllstatment.decisionMaking;

import java.util.Scanner;

public class E_Practice {

	Scanner sc = new Scanner(System.in);

	public void ifQuiz() {
		// ȸ����� (Dia / Gold / Silver / Bronze)�� �Է¹��� ����
		// ��޿� ���� ������ �߱��� �ִ� ���α׷��� �ۼ��Ͻÿ�.
		// Dia : ���̾����� / 50% �������� / ��ȭƼ�� 2�� ���� / 20% ��������
		// Gold : 50% �������� / ��ȭƼ�� 2�� ���� / 20% ��������
		// Silver : 20% �������� / ��ȭƼ�� 2�� ����
		// Bronze : 20% ��������

		// �����߱��� "00�����߱�" �̶�� ����� ��� �߱޵Ǿ��ٰ� ����.
		// if���� Ȱ���ؼ� �ۼ��ؾ� �մϴ�.

		System.out.println("ȸ������� �Է����ּ���. (Dia/Gold/Silver/Bronze)");
		String mg = sc.nextLine();

		if (mg.equals("dia")) {
			System.out.println("���̾�����");
			System.out.println("50%��������");
			System.out.println("��ȭƼ�� 2�� ����");
			System.out.println("20%��������");
		} else if (mg.equals("gold")) {
			System.out.println("50%��������");
			System.out.println("��ȭƼ�� 2�� ����");
			System.out.println("20%��������");
		} else if (mg.equals("silver")) {
			System.out.println("��ȭƼ�� 2�� ����");
			System.out.println("20%��������");
		} else if (mg.equals("bronze")) {
			System.out.println("20%��������");
		} else {
			System.out.println("���  �ҹ��ڷ� �Է����ּ���.");
		}
	}

	public void caseQuiz() {

		// ȸ����� (Dia / Gold / Silver / Bronze)�� �Է¹��� ����
		// ��޿� ���� ������ �߱��� �ִ� ���α׷��� �ۼ��Ͻÿ�.
		// Dia : ���̾����� / 50% �������� / ��ȭƼ�� 2�� ���� / 20% ��������
		// Gold : 50% �������� / ��ȭƼ�� 2�� ���� / 20% ��������
		// Silver : 20% �������� / ��ȭƼ�� 2�� ����
		// Bronze : 20% ��������

		// �����߱��� "00�����߱�" �̶�� ����� ��� �߱޵Ǿ��ٰ� ����.
		// switch case���� Ȱ���ؼ� �ۼ��ؾ� �մϴ�.

		System.out.println("ȸ������� �Է����ּ���. (dia/gold/silver/bronze)");
		String mg = sc.nextLine();

		switch (mg) {
		case "dia":
			System.out.println("���̾�����");
		case "gold":
			System.out.println("50% ��������");
		case "silver":
			System.out.println("��ȭƼ�� 2�� ����");
		case "bronze":
			System.out.println("20%��������");
			break;
		default:
			System.out.println("��� �ҹ��ڷ� �Է����ּ���");
			break;
		}

	}

	public void switchQuiz2() {
		// 1~12������ �Է¹޾�, �ش��ϴ� ���� ������ ��¥�� ����ϼ���.
		// default���� �����ϰ� ��¹� 4���� �ۼ��� �� �ֽ��ϴ�.
		System.out.println("1������ 12������ �� ���� �����Ͽ� �Է����ּ���.");
		int month = sc.nextInt();
		String mDay = "";
		switch (month) {
		case 1:
		case 3:
		case 5:
		case 7:
		case 8:
		case 12:
			mDay = "31";
			break;
		case 2:
			mDay = "28";
			break;
		case 4:
		case 6:
		case 9:
		case 11:
			mDay = "30";
			break;

		default:
			System.out.println("�߸��Է��ϼ̽��ϴ�.");
			break;
		}
		if (month <= 12) {
			System.out.println(month + "�� �� ������ ��¥�� " + mDay + "�� �Դϴ�.");
		}
	}

	public void switchQuiz3() {

		// ���� ����� ����ڷ� ���� �Է¹޾�
		// ������ ���Ǻ��� ����ϴ� �ڵ带 �ۼ��Ͻÿ�
		// 12,1,2 : �ܿ�
		// (����� -15�� ������ ��� ���� �溸)
		// (����� -12�� ������ ��� ���� ���Ǻ�)

		// 3,4,5 : ��
		// 6,7,8 : ����
		// (����� 35�� �̻��� ��� �����溸)
		// (����� 33�� �̻��� ��� �������Ǻ�)

		// 9,10,11 : ����

		int month;
		double temp;
		String season = "";
		String warn = "";

		System.out.println("������� �Է��ϼ���");
		while (true) {
			try {
				month = sc.nextInt();
				if (month >= 1 && month <= 12)
					break;
				else {
					System.out.println("�߸� �Է��ϼ̽��ϴ�. 1~12�� ���� �Է����ּ���.");
				}
			} catch (Exception e) {
				System.out.println("�߸� �Է��ϼ̽��ϴ�. 1~12�� ���� �Է����ּ���.");
				sc = new Scanner(System.in);
			}
		}
		System.out.println("����� �Է��ϼ���");
		while (true) {
			try {
				temp = sc.nextDouble();
				break;
			} catch (Exception e) {
				System.out.println("�߸� �Է��ϼ̽��ϴ�. �Ǽ� ���� �Է��� �� �ֽ��ϴ�. �ٽ� �Է����ּ���.");
				sc = new Scanner(System.in);
			}
		}
		switch (month) {
		case 12:
		case 1:
		case 2:
			season = "�ܿ�";
			if (temp <= -15) {
				warn = "���� �溸";
			} else if (temp <= -12) {
				warn = " ���� ���Ǻ�";
			}
			break;
		case 3:
		case 4:
		case 5:
			season = "��";
			break;
		case 6:
		case 7:
		case 8:
			season = "����";
			if (temp >= 35) {
				warn = "���� �溸";
			} else if (temp >= 33) {
				warn = "���� ���Ǻ�";
			}
			break;
		case 9:
		case 10:
		case 11:
			season = "����";
			break;
		}

		System.out.println("�Է��Ͻ� " + month + "���� " + season + " �̰�,");
		if (warn.isEmpty()) {
			System.out.println("���� ����� " + temp + "'c �Դϴ�.");
		} else {
			System.out.println("���� ����� " + temp + "'c�� " + warn + "�� �߷����Դϴ�.");
		}
	}

	public void switchQuiz4() {
		// �ΰ��� ������ �Է¹ް�, ���� Ȥ�� ���ڿ��� �����ȣ (+,-,*,/,%)�� �Է¹޾�
		// ������ �������� ����Ͻÿ�
		// ������ ��� 0 �̻��� ���� �������� ����ϼ���.

		// ��, 0���� ���� ��� "0���� ���� �� �����ϴ�"�� ����ϰ� ��� ���� 0���� ó���ϸ�,
		// �����ȣ�� ���� ���ڸ� �Է��ϸ� "�Է��Ͻ� ������ �����ϴ�. ���α׷��������մϴ�." ��
		// ��� �� ���α׷��� �����Ͻÿ�

		System.out.println("ù�� ° ������ �Է��ϼ���");
		int numA = sc.nextInt();
		System.out.println("�ι� ° ������ �Է��ϼ���");
		int numB = sc.nextInt();
		sc.nextLine();
		System.out.println("���� ��ȣ�� �Է��ϼ���.(+,-,*,/,%)");
		char c = sc.next().charAt(0);
		int result = 0;
		switch (c) {
		case '+':
			result = numA + numB;
			break;
		case '-':
			if (numA > numB) {
				result = numA - numB;
			} else {
				result = numB - numA;
			}
			break;

		case '*':
			result = numA * numB;
			break;
		case '/':
			if (numB != 0) {
				result = numA / numB;
			} else {
				System.out.println("0���δ� ���� �� �����ϴ�.");
			}
			break;
		case '%':
			if (numB != 0) {
				result = numA % numB;
				break;
			} else {
				System.out.println("0���δ� ���� �� �����ϴ�.");
			}
		default:
			System.out.println("�߸� �Է��Ͽ����ϴ�.");
			break;
		}
		System.out.println(result);
	}
}