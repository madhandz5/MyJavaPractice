package com.kh.loopingStatment;

import java.util.Scanner;

public class ForPrac {

	Scanner sc = new Scanner(System.in);

	public void forQuiz() {

		// ������ �ϳ� �Է¹޾� �� ���� 1~9�϶��� �� ���� �������� ����ϰ� �ϰ�,
		// 1~9�� �ƴϸ� "�ݵ�� 1~9 ������ ����� �Է��Ͽ��� �մϴ�." ���

		System.out.println("������ �ϳ� �Է��ϼ���.");

		int numA = sc.nextInt();

		if (numA >= 1 && numA <= 9) {
			for (int i = 1; i < 10; i++) {
				System.out.println(numA + " X " + i + " = " + (numA * i));
			}
		} else {
			System.out.println("�ݵ�� 1~9������ ����� �Է��Ͽ��� �մϴ�.");
		}
	}

	public void forQuiz2() {

		// �� ���� �Է¹޾Ƽ� ���� �� ���� ū �� ���� ������ ���� ���϶�.
		// �� ���� ���� �Էµ� ��� 1~10������ ���� ���Ͻÿ�.

		int sum = 0;

		System.out.println("ù��° ������ �Է��ϼ���.");
		int numA = sc.nextInt();
		System.out.println("�ι�° ������ �Է��ϼ���.");
		int numB = sc.nextInt();

		if (numA == numB) {
			for (int i = 1; i <= 10; i++)
				sum += i;
		} else if (numA > numB) {
			for (int i = numB; numB < numA; i++)
				sum += i;
		} else if (numA < numB) {
			for (int i = numA; numA < numB; i++)
				sum += i;
		} else {
			System.out.println("�߸��Է��ϼ̽��ϴ�.");
		}

		System.out.println(sum);
	}

	public void forQuiz3() {

		// �� ���� �Է¹޾Ƽ� ���� �� ���� ū �� ���� ������ ���� ���϶�.
		// �� ���� ���� �Էµ� ��� 1~10������ ���� ���Ͻÿ�.

		System.out.println("ù��° ������ �Է��ϼ���.");
		int numA = sc.nextInt();
		System.out.println("�ι�° ������ �Է��ϼ���.");
		int numB = sc.nextInt();

		int sum = 0;
		int max = 0;
		int min = 0;

		if (numA < numB) {
			max = numB;
			min = numA;
		} else {
			if (numA != numB) {
				max = numA;
				min = numB;
			} else {
				min = 1;
				max = 10;
			}
		}
		for (int i = min; i <= max; i++) {
			sum += i;
		}
		System.out.println(sum);
	}

	public void forQuiz4() {

		// �� ���� �Է¹޾Ƽ� ���� �� ���� ū �� ���� ������ ���� ���϶�.
		// �� ���� ���� �Էµ� ��� 1~10������ ���� ���Ͻÿ�.

		System.out.println("ù��° ������ �Է��ϼ���.");
		int numA = sc.nextInt();
		System.out.println("�ι�° ������ �Է��ϼ���.");
		int numB = sc.nextInt();

		int sum = 0;
		int max = 0;
		int min = 0;

		max = numA > numB ? numA : numB == numB ? 10 : numB;
		min = numA < numB ? numA : numA == numB ? 1 : numB;

		for (int i = min; i <= max; i++) {
			sum += i;
		}
		System.out.println(sum);

	}
}
