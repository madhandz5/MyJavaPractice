package com.kh.threadControl;

public class Thread4 implements Runnable {

	// * - sleep() : ������ �ð����� �����带 �Ͻ����� ��Ű�� �޼���
	// * - static���� ����Ǿ� �ֱ� ������ Thread.sleep()���� ȣ���� �� �ִ�.
	// * - �Ͻ����� ��Ű���� �ϴ� ������ ���ο��� ����Ѵ�. (run() �޼��� ���ο��� ����Ѵ�.)

	// * - interrupt() : ȣ�� �� �Ͻ����� ���¸� �������ش�.
	// * - �����尡 �Ͻ����� ���¿� ���� �� interrupt() �޼��带 ����ϸ�
	// * - InterruptException �� �߻���Ų��.

	@Override
	public void run() {
		try {
			for (int i = 1; i <= 10; i++) {
				Thread.sleep(1000);
				System.out.println(i + "��");
			}
			System.out.println("ī��Ʈ ����");
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
}
