package com.kh.model;

public class ContinueSample {

	public void sumJumpThree() {
		System.out.println("===1~100������ ���� �� 3�� ����� �� �������� �հ� ����ϱ�===");
		int sum = 0;
		for (int i = 1; i < 101; i++) {
			if (i % 3 == 0) {
				continue;
			}
			sum += i;
		}
		System.out.println("1~100���� ���� �� 3�� ����� �� ������ �հ� : " + sum);

	}

	public void rowColJump() {
		System.out.println("===3�� 5���� �࿭�� ����ϵ�, 1�� 3������ 1�� 5������ �����ϰ� ����ϱ�===");
		for (int i = 1; i < 4; i++) {
			for (int j = 1; j < 6; j++) {
				if (i == 1 && j > 2 && j < 6) {
					System.out.print(" ");
					continue;
				}
				System.out.print(j);
			}
			System.out.println();
		}
	}
}
