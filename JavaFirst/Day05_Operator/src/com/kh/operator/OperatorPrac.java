package com.kh.operator;

import java.util.Scanner;

public class OperatorPrac {
	Scanner sc = new Scanner(System.in);

	public void optest01() {

		// �ȳ��� ���
		System.out.println("�ֹε�Ϲ�ȣ�� �Է��Ͽ� �ּ���(-�� �����Ͽ�)");
		// �Է¹��� �ֹε�Ϲ�ȣ�� String info ���������� �ʱ�ȭ�ϰ� ������.
		String info = sc.nextLine();

		// �ֹε�Ϲ�ȣ 1��° �ڸ� �Ǻ�
		char first = info.charAt(0);
		// �ֹε�Ϲ�ȣ 8��° �ڸ� �Ǻ�
		char second = info.charAt(7);
		// second ������ info(�Է¹��� �ֹε�Ϲ�ȣ)���� �� �ε��� 7 (8��° �ڸ�) �̹Ƿ�,
		// �� ���� 1�� true �̸� ���ڸ� ��ȯ, false �̸� ���ڸ� ��ȯ��.
		String gender = second == '1' ? "����" : "����";
		// first ������ info(�Է¹��� �ֹε�Ϲ�ȣ) ������ �ε��� 0 (1��° �ڸ�) �̹Ƿ�,
		// �� ���� 0 Ȥ�� 1�� true �� �̼�����, false �� ������ ��ȯ��.
		String isAdult = first == '0' || first == '1' ? "�̼�����" : "����";
		// ����� ���
		System.out.println("����� " + gender + "�̰�, " + isAdult + " �Դϴ�.");
	}

	public void optest02() {

		// ����(����), ����(����), ����(����), ����(����), ���(�Ǽ�) ���� �����ϰ�
		// �� ������ Ű����� �Է¹ް�
		// �հ� (����+����+����) �� ���(�հ�/3.0)�� ����ϰ�,
		// �� ������ ������ ����� ������ �հ� ���� ó����
		// �հ��� ����
		// �� ������ ������ ���� 40�� �̻��̸鼭, ����� 60�� �̻��̸� �հ�, �ƴϸ� ���հ� ó����

		// �� ������ ������ �����϶�� �Ͽ����ϱ�, ��Ű�´�� ����
		int korScore, engScore, mathScore, sum;
		// ����� �Ǽ��� �����϶�� �����Ƿ� ��Ű�´�� ����
		double avr;

		System.out.println("���� ������ �Է����ּ���.");
		korScore = sc.nextInt();
		System.out.println("���� ������ �Է��� �ּ���.");
		engScore = sc.nextInt();
		System.out.println("���� ������ �Է��� �ּ���");
		mathScore = sc.nextInt();

		// �Է¹��� �� ���� ������
		sum = korScore + engScore + mathScore;
		// ������ ���� 3���� ����. avr ������ double �ڷ����̹Ƿ� 3.0 ���� �ؾߵ�.
		avr = sum / 3.0;

		String res = korScore >= 40 && engScore >= 40 && mathScore >= 40 && avr >= 60 ? "�հ�" : "���հ�";
		System.out.println(res + "�Դϴ�.");
	}

	public void optest03() {

		// * ����(����), ����(����), ����(����) ������ �����ϰ�,
		// * �� ������ Ű����� �Է¹��� �� �հ�(����+����+����)�� ���(�հ�/3.0)��
		// * ����ϰ�, �� ������ ��տ� ���� ���� ����� �ο��ض�
		// * ��� :
		// * ��� 90�� �̻� : A
		// * ��� 80�� �̻� : B
		// * ��� 70�� �̻� : C
		// * ��� 60�� �̻� : D
		// * ��� 60�� �̸� : F

		int kor, eng, mat;

		System.out.println("���� ������ �Է��ϼ��� : ");
		kor = sc.nextInt();
		System.out.println("���� ������ �Է��ϼ��� : ");
		eng = sc.nextInt();
		System.out.println("���� ������ �Է��ϼ��� : ");
		mat = sc.nextInt();

		double avg = (kor + eng + mat) / 3.0;

		String res = avg >= 90 ? "A���" : avg >= 80 ? "B���" : avg >= 70 ? "C���" : avg >= 60 ? "D���" : "F���";

		System.out.printf("��� %.2f������ " + res + "�Դϴ�.", avg);
	}

	public void optest04() {

		// * ����(����), ����(����), ����(����) ������ �����ϰ�,
		// * �� ������ Ű����� �Է¹��� �� �հ�(����+����+����)�� ���(�հ�/3.0)��
		// * ����ϰ�, �� ������ ��տ� ���� ���� ����� �ο��ض�
		// * ��� :
		// * ��� 90�� �̻� : A
		// * ��� 80�� �̻� : B
		// * ��� 70�� �̻� : C
		// * ��� 60�� �̻� : D
		// * ��� 60�� �̸� : F

		int kor, eng, mat;

		System.out.println("���� ������ �Է��ϼ��� : ");
		kor = sc.nextInt();
		System.out.println("���� ������ �Է��ϼ��� : ");
		eng = sc.nextInt();
		System.out.println("���� ������ �Է��ϼ��� : ");
		mat = sc.nextInt();

		double avg = (kor + eng + mat) / 3.0;

		if (avg >= 90) {
			System.out.println("A���");
		} else if (avg >= 80) {
			System.out.println("B���");
		} else if (avg >= 70) {
			System.out.println("C���");
		} else if (avg >= 60) {
			System.out.println("D���");
		} else {
			System.out.println("F���");
		}
	}
}
