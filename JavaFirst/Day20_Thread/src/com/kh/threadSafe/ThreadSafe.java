package com.kh.threadSafe;

public class ThreadSafe {

	InputDrink iDrink = new InputDrink();

	public void threadTest() {
		Thread t1 = new CoffeeThread();
		Thread t2 = new SoiThread();
		t1.start();
		t2.start();
	}

	class CoffeeThread extends Thread {

		@Override
		public void run() {

			String d = "Ŀ��";
			for (int i = 0; i < 10; i++) {
				System.out.println("\nĿ�� �߰��ߴ�~!");
				System.out.println(Thread.currentThread().getName() + "   " + iDrink.setting(d) + " ���Ŵ�.");
			}
		}
	}

	class SoiThread extends Thread {
		@Override
		public void run() {
			String d = "����";
			for (int i = 0; i < 10; i++) {
				System.out.println("\n���� �߰��ߴ�~!");
				System.out.println(Thread.currentThread().getName() + "   " + iDrink.setting(d) + " ����� �ִ´�.");
			}
		}
	}
}
