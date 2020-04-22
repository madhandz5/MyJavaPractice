package com.kh.controllstatment.decisionMaking;

import java.util.Scanner;

public class C_IfElseIf {

	Scanner sc = new Scanner(System.in);

	public void testIfElseIf() {

		// if else if �� ���� ������ �� �� �ִ� �����̴�.
		// [ǥ����]
		// if (���ǽ�) {
		// ���� �ڵ�1
		// }
		// else if (���ǽ�) {
		// ���� �ڵ�2
		// } else {
		// �����ڵ�3
		// }
		// ������ �ϳ� �Է¹޾Ƽ� ����� ������ ������ ����� ����Ͻÿ�.
		// �����, 90�� �̻��� A���
		// 90�� �̸�, 80�� �̻��� B���
		// 80�� �̸� 70�� �̻��� C���
		// 70�� �̸� 60�� �̻��� D���
		// 60�� �̸��� F���

		System.out.println("������ �Է��ϼ���");
		int score = sc.nextInt();
		String grade;

		if (score >= 90) {
			grade = "A";
		} else if (score >= 80) {
			grade = "B";
		} else if (score >= 70) {
			grade = "C";
		} else if (score >= 60) {
			grade = "D";
		} else {
			grade = "F";
		}
		System.out.println(grade);
	}

	public void testIfElseIf2() {

		// ���� ��������
		// �� ��޺� ������ �߰� ���� �̻��� �� (ex 95��)
		// ��޿� "+" ��� ���ڸ� �߰��Ͽ� ����ϼ���.
		// �� ) 95�� �̻��� ����� A+�� ��µǰ� ��.

		System.out.println("������ �Է��ϼ���");
		int score = sc.nextInt();
		String grade;

		if (score >= 90) {
			if (score >= 95) {
				grade = "A+";
			} else {
				grade = "A";
			}
		} else if (score >= 80) {
			if (score >= 85) {
				grade = "B+";
			} else {
				grade = "B";
			}
		} else if (score >= 70) {
			if (score >= 75) {
				grade = "C+";
			} else {
				grade = "C";
			}
		} else if (score >= 60) {
			if (score >= 65) {
				grade = "D+";
			} else {
				grade = "D";
			}
		} else {
			grade = "F";
		}
		System.out.println(grade);
	}

	public void test() {
		// ����, ����, ���� ������ ���� �Է¹ް� ��� 50�� �̻�,
		// �� ���� 35�� �̻��� �� "�հ��Դϴ�."�� ����ϰ�
		// ����� 50�� �̸��� ��� "������� �̴޷� ���հ��Դϴ�."��
		// ����ϸ�, ����� 50�� �̻������� ����(35���̸�)�� ������ ������
		// (�ش� ����) �������� ���հ� �Դϴ�." �� ����ϼ���.

		System.out.println("���� ������ �Է��ϼ���.");
		int kor = sc.nextInt();

		System.out.println("���� ������ �Է��ϼ���.");
		int eng = sc.nextInt();

		System.out.println("���� ������ �Է��ϼ���");
		int mat = sc.nextInt();

		double avg = (kor + eng + mat) / 3.0;

		if (avg >= 50) {
			if (kor >= 35 && eng >= 35 && mat >= 35) {
				System.out.println("���" + avg + "�հ��Դϴ�.");
			} else if (kor >= 35 && eng >= 35) {
				System.out.println("���" + avg + "�������� ���а��� �������� ���հ��Դϴ�.");
			} else if (kor >= 35 && mat >= 35) {
				System.out.println("���" + avg + "�������� ������� �������� ���հ��Դϴ�.");
			} else if (eng >= 35 && mat >= 35) {
				System.out.println("���" + avg + "�������� ������� �������� ���հ��Դϴ�.");
			} else if (eng >= 35) {
				System.out.println("����, ���� ���� �������� ���հ��Դϴ�.");
			} else if (kor >= 35) {
				System.out.println("����, ���� ���� �������� ���հ��Դϴ�.");
			} else if (mat >= 35) {
				System.out.println("����, ���� ���� �������� ���հ��Դϴ�.");
			}
			// else {
			// System.out.println("���" + avg + "�������� 2���� �̻� �����̶� ���հ��Դϴ�.");
			// }
		} else {
			System.out.println("��� " + avg + "������ ���հ��Դϴ�.");
		}
	}

	public void testAnswer() {
		// ����, ����, ���� ������ ���� �Է¹ް� ��� 50�� �̻�,
		// �� ���� 35�� �̻��� �� "�հ��Դϴ�."�� ����ϰ�
		// ����� 50�� �̸��� ��� "������� �̴޷� ���հ��Դϴ�."��
		// ����ϸ�, ����� 50�� �̻������� ����(35���̸�)�� ������ ������
		// (�ش� ����) �������� ���հ� �Դϴ�." �� ����ϼ���.

		System.out.println("���� ������ �Է��ϼ���.");
		int kor = sc.nextInt();

		System.out.println("���� ������ �Է��ϼ���.");
		int eng = sc.nextInt();

		System.out.println("���� ������ �Է��ϼ���");
		int mat = sc.nextInt();

		String res = "";
		double avg = (kor + eng + mat) / 3.0;

		if (avg >= 50) {
			if (kor < 35 || eng < 35 || mat < 35) {
				if (kor < 35) {
					res = "����";
				}
				if (eng < 35) {
					res = "����";
				}
				if (mat < 35) {
					res = "����";
				}
				if (kor < 35 && eng < 35) {
					res = "����, ����";
				}
				if (eng < 35 && mat < 35) {
					res = "����, ����";
				}
				if (kor < 35 && mat < 35) {
					res = "����, ����";
				}

				System.out.println(res + "�������� ���հ��Դϴ�.");
			} else {
				System.out.println("�հ��Դϴ�.");
			}
		} else {
			System.out.println("������� �̴޷� ���հ��Դϴ�.");
		}
	}
}