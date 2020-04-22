package com.kh.model;

public class ContinueSample {

	public void sumJumpThree() {
		System.out.println("===1~100까지의 정수 중 3의 배수를 뺀 정수들의 합계 출력하기===");
		int sum = 0;
		for (int i = 1; i < 101; i++) {
			if (i % 3 == 0) {
				continue;
			}
			sum += i;
		}
		System.out.println("1~100까지 정수 중 3의 배수를 뺀 정수의 합계 : " + sum);

	}

	public void rowColJump() {
		System.out.println("===3행 5열의 행열값 출력하되, 1행 3열부터 1행 5열까지 생략하고 출력하기===");
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
