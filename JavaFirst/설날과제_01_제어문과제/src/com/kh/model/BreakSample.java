package com.kh.model;

public class BreakSample {

	public void sumBreak() {
		System.out.println("====1~100���� �������� �հ� ����ϱ� (break�� ���)====");
		int sum = 0;
		int num = 0;
		while (true) {
			sum += num;
			num++;
			if (num > 100) {
				break;
			}
		}
		System.out.println("1~100���� �������� �� : " + sum);

	}

	public void guguDanBreak() {
		System.out.println("====������ 1��~9�ܱ��� ����ϵ�, *5 ��꿡�� �ݺ��� ������(break �̸� ���)====");

		for (int i = 1; i < 10; i++) {
			System.out.println("=======" + i + "�� ======");
			for (int j = 1; j < 10; j++) {
				if (j > 5) {
					break;
				}
				System.out.println(i + " X " + j + " = " + (i * j));
			}
		}
	}
}
