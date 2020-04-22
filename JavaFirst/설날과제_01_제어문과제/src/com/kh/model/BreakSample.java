package com.kh.model;

public class BreakSample {

	public void sumBreak() {
		System.out.println("====1~100까지 정수들의 합계 출력하기 (break문 사용)====");
		int sum = 0;
		int num = 0;
		while (true) {
			sum += num;
			num++;
			if (num > 100) {
				break;
			}
		}
		System.out.println("1~100까지 정수들의 합 : " + sum);

	}

	public void guguDanBreak() {
		System.out.println("====구구단 1단~9단까지 출력하되, *5 계산에서 반복문 빠지기(break 이름 사용)====");

		for (int i = 1; i < 10; i++) {
			System.out.println("=======" + i + "단 ======");
			for (int j = 1; j < 10; j++) {
				if (j > 5) {
					break;
				}
				System.out.println(i + " X " + j + " = " + (i * j));
			}
		}
	}
}
