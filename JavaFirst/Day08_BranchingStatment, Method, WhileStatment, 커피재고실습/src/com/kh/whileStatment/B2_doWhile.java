package com.kh.whileStatment;

public class B2_doWhile {

	public void doWhile() {

		// do{}���� �ڵ带 �ѹ� ���� �� �Ŀ�
		// ������ ���ؼ� �ݺ� ���θ� �����Ѵ�.

		int i = 1;
		while (i >= 2 && i < 10) {
			System.out.println("while�� �Դϴ�." + i);
		}

		i = 1;

		do {
			System.out.println("do while ���Դϴ�." + i);
			i++;
		} while (i >= 2 && i < 10);

	}

}
