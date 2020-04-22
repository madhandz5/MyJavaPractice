package com.kh.whileStatment;

public class B2_doWhile {

	public void doWhile() {

		// do{}안의 코드를 한번 실행 한 후에
		// 조건을 비교해서 반복 여부를 결정한다.

		int i = 1;
		while (i >= 2 && i < 10) {
			System.out.println("while문 입니다." + i);
		}

		i = 1;

		do {
			System.out.println("do while 문입니다." + i);
			i++;
		} while (i >= 2 && i < 10);

	}

}
