package com.kh.model;

import java.util.Scanner;

public class IfSample {

	Scanner scanner = new Scanner(System.in);

	public void maxNumber() {
		System.out.println("===�� ���� ������ �Է¹޾�, �� ���� ū �� ����ϱ�===");
		System.out.println("ù�� ° ������ �Է��ϼ��� : ");
		int a = scanner.nextInt();
		scanner.nextLine();
		System.out.println("�ι� ° ������ �Է��ϼ��� : ");
		int b = scanner.nextInt();
		scanner.nextLine();
		if (a > b) {
			System.out.println("ū ���� : " + a);
		} else if (b > a) {
			System.out.println("ū ���� : " + b);
		} else {
			System.out.println("�� ������ �����ϴ�.");
		}
	}

	public void minNumber() {
		System.out.println("===�� ���� ������ �Է¹޾�, �� ���� ���� �� ����ϱ�===");
		System.out.println("ù�� ° ������ �Է��ϼ��� : ");
		int a = scanner.nextInt();
		scanner.nextLine();
		System.out.println("�ι� ° ������ �Է��ϼ��� : ");
		int b = scanner.nextInt();
		scanner.nextLine();
		if (a > b) {
			System.out.println("���� ����  : " + b);
		} else if (b > a) {
			System.out.println("���� ���� : " + a);
		} else {
			System.out.println("�� ������ �����ϴ�.");
		}
	}

	public void threeMaxMin() {
		System.out.println("===�� ���� ������ �Է¹޾�, �� ���� ���� ū ���� ���� ���� �� ����ϱ�===");
		System.out.println("ù�� ° ������ �Է��ϼ��� : ");
		int a = scanner.nextInt();
		scanner.nextLine();
		System.out.println("�ι� ° ������ �Է��ϼ��� : ");
		int b = scanner.nextInt();
		scanner.nextLine();
		System.out.println("���� ° ������ �Է��ϼ��� : ");
		int c = scanner.nextInt();
		scanner.nextLine();
		if (a > b && a > c) {
			System.out.println("�� ������ ���� ū ���� : " + a);
		} else if (b > a && b > c) {
			System.out.println("�� ������ ���� ū ���� : " + b);
		} else if (c > a && c > b) {
			System.out.println("�� ������ ���� ū ���� : " + c);
		} else {
			System.out.println("�� ������ �����ϴ�.");
		}
	}

	public void checkEven() {
		System.out.println("===�� ���� ������ �Է¹޾�, ¦������ Ȧ������ ����ϱ�===");
		int a = scanner.nextInt();
		scanner.nextLine();
		if (a % 2 == 0) {
			System.out.println("�Է��Ͻ� ���� ¦���Դϴ�.");
		} else {
			System.out.println("�Է��Ͻ� ���� Ȧ�� �Դϴ�.");
		}

	}

	public void isPassFail() {
		System.out.println("===��,��,�� �� ������ ������ �Է¹޾�, �հ�/���հ� Ȯ���ϱ�===");
		int kor = scanner.nextInt();
		scanner.nextLine();
		int eng = scanner.nextInt();
		scanner.nextLine();
		int mat = scanner.nextInt();
		scanner.nextLine();
		int sum = kor + eng + mat;
		double avg = sum / 3;
		System.out.println("���� ���� : " + kor);
		System.out.println("���� ���� : " + eng);
		System.out.println("���� ���� : " + mat);
		System.out.println("���� �� : " + sum);
		System.out.println("���� ��� : " + avg);
		if (avg > 59) {
			if (kor > 59 && eng > 59 && mat > 59) {
				System.out.println("�հ��Դϴ�.");
			} else if (kor > 59 && eng > 59) {
				System.out.println("���� ���� ����, ���հ� �Դϴ�.");
			} else if (eng > 59 && mat > 59) {
				System.out.println("���� ���� ����, ���հ��Դϴ�.");
			} else if (kor > 59 && mat > 59) {
				System.out.println("���� ���� ����, ���հ��Դϴ�.");
			} else {
				System.out.println("�ΰ��� �̻� ����, ���հ��Դϴ�.");
			}
		} else {
			System.out.println("������� �̴� ���հ� �Դϴ�.");
		}
	}

	public void scoreGrade() {
		System.out.println("====������ �Է¹޾�, ���� Ȯ���ϱ�====");
		System.out.println("������ �Է��ϼ��� : ");
		int score = scanner.nextInt();
		scanner.nextLine();
		if (score > 89) {
			if (score > 94) {
				System.out.println("A+");
			}
			System.out.println("A");
		} else if (score > 79) {
			if (score > 84) {
				System.out.println("B+");
			}
			System.out.println("B");
		} else if (score > 69) {
			if (score > 74) {
				System.out.println("C+");
			}
			System.out.println("C");
		} else if (score > 59) {
			if (score > 64) {
				System.out.println("D+");
			}
			System.out.println("D");
		} else {
			System.out.println("F");
		}
	}

	public void checkPlusMinusZero() {
		System.out.println("===�� ���� ������ �Է¹޾�, ������� 0���� �������� Ȯ���ϱ�===");
		System.out.println("������ �Է��ϼ��� : ");
		int a = scanner.nextInt();
		scanner.nextLine();
		if (a > 0) {
			System.out.println("����Դϴ�.");
		} else if (a < 0) {
			System.out.println("�����Դϴ�.");
		} else {
			System.out.println("0�Դϴ�.");
		}
	}

	public void whatCharacter() {
		System.out.println("===���� �ϳ��� �Է¹޾�, ���� �빮������ �ҹ�������, ���ڹ������� ��Ÿ�������� Ȯ���ϱ�===");
		char ch = scanner.next().charAt(0);
		scanner.nextLine();
		if (ch > 64 && ch < 91) {
			System.out.println("���� �빮�� �Դϴ�.");
		} else if (ch > 96 && ch < 123) {
			System.out.println("���� �ҹ��� �Դϴ�.");
		} else if (ch > 47 && ch < 58) {
			System.out.println("���� ���� �Դϴ�.");
		} else {
			System.out.println("��Ÿ�����Դϴ�.");
		}
	}

}
