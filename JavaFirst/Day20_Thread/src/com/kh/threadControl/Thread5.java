package com.kh.threadControl;

public class Thread5 implements Runnable {

	@Override
	public void run() {
		int cnt = 0;
		while (cnt < 10) {
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				System.out.println("���� ��Ȳ �߻� �ߴ�?");
				System.out.println(cnt + "�ʿ� ī��Ʈ ����");
				cnt = 10;
			}
			System.out.println((++cnt) + "��");
		}
		System.out.println("ī��Ʈ �ٿ� ����");

	}
}