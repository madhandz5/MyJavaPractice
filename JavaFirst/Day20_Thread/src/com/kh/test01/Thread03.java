package com.kh.test01;

// ������ �̸� ����
// ������ �����층

class MyThread03 extends Thread {
	public MyThread03(String name) {
		super(name);
	}

	@Override
	public void run() {
		for (int i = 0; i < 100; i++) {
			System.out.println(this.getName() + " = " + i);
		}
		System.out.println(this.getName() + " = " + "��");
	}
}

public class Thread03 {

	public static void main(String[] args) {

		MyThread03 m1 = new MyThread03("�߿�");
		MyThread03 m2 = new MyThread03("�۸�");

		// * - Java�� Thread Scheduling ���
		// * - 1) �켱���� (Priority) ���
		// * - 2) ��ȯ�Ҵ� ������� ������.
		// * - ��ȯ�Ҵ� ����� cpu�� �˾Ƽ� ������ �Ҵ��ϴ� ����̴�.

		// * - �켱���� ���� setPriority(int)
		// * - �Ű������� �� �� �ִ� ���� 1 ~ 10 ������ ���̴�.
		// * - default �� 5 �̴�.
		// * - ���ڰ� ���� ���� �켱������ ����.

		m1.setPriority(10);
		m2.setPriority(1);
		m1.start();
		m2.start();

	}

}
