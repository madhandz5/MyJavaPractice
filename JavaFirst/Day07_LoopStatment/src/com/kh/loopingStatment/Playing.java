package com.kh.loopingStatment;

import java.util.Scanner;

public class Playing {

	Scanner sc = new Scanner(System.in);

	// for ���� ������ ��� �پ��� ���
	// for���� for(�ʱ��; ���ǽ�; ������) ���� �ۼ��ȴ�.
	// ���� () �ȿ� �ƹ��͵� �ۼ����� ������ ��� �ɱ�?

	public void playing0() {

		for (;;) {
			System.out.println("�̷� for ���� ������");
		}
	}

	// for ���� ���ǽĸ� �־��
	// ���ǽ��� true�̸� �ݺ����� ����ϰ�, false�̸� for���� Ż���Ѵ�.
	// ����ڷκ��� ���ڸ� �ϳ� �Է¹޾� �� ���ڰ� 'S'�̸� for ���� Ż���Ѵ�.
	public void playing1() {

		char key = 'a';
		for (; !(key == 'S');) {
			System.out.println("�ݺ����� Ż���ϰ� ���� ���ڴ� S�� . �Է� : ");
			key = sc.next().charAt(0);
		}
		System.out.println("�ݺ����� Ż���ߴ�.");
	}

	// for���� 5���� �۵��ϰ� ������.
	public void playing2() {
		int i = 0;
		for (; i < 5;) {
			System.out.println("�̷� for���� ������ : " + ((int) i + 1) + "��°");
			i++;
		}
	}

	public void playing3() {

		char key = 'a';
		for (System.out.println("�ʱ��"); key != 'S'; System.out.println("������")) {

			System.out.println("�ݺ����� ���� ���ڴ� S��. ���� �Է� : ");
			key = sc.next().charAt(0);
			System.out.println("�ݺ����� ������ �ڵ带 ������.");

		}
		System.out.println("�ݺ����� ���ߴµ� �����ߴ�.");
	}

}
