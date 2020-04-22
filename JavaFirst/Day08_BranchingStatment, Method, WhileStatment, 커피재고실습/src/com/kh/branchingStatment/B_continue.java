package com.kh.branchingStatment;

public class B_continue {

	// continue : 사용하면 즉시 조건식(while)또는 증감식(for)으로 돌아간다.

	// 1~10까지 정수들의 합계를 출력
	// 단 4의 배수는 빼고 계산
	public void continueTest() {

		int sum = 0;

		for (int i = 1; i < 11; i++) {
			if (i % 4 == 0) {
				continue;
			}
			sum += i;
		}
		System.out.println(sum);
	}
}
