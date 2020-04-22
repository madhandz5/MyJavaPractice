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

			String d = "커피";
			for (int i = 0; i < 10; i++) {
				System.out.println("\n커피 발견했다~!");
				System.out.println(Thread.currentThread().getName() + "   " + iDrink.setting(d) + " 마신다.");
			}
		}
	}

	class SoiThread extends Thread {
		@Override
		public void run() {
			String d = "간장";
			for (int i = 0; i < 10; i++) {
				System.out.println("\n간장 발견했다~!");
				System.out.println(Thread.currentThread().getName() + "   " + iDrink.setting(d) + " 냉장고에 넣는다.");
			}
		}
	}
}
