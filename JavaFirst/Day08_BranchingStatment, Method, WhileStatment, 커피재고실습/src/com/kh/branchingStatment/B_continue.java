package com.kh.branchingStatment;

public class B_continue {

	// continue : ����ϸ� ��� ���ǽ�(while)�Ǵ� ������(for)���� ���ư���.

	// 1~10���� �������� �հ踦 ���
	// �� 4�� ����� ���� ���
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
