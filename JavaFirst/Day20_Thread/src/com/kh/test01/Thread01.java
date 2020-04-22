package com.kh.test01;

// Runnable �������̽��� ������ȭ �� �� �ִ� �޼��带 �����ϴ� run() �޼ҵ带 ������ �ִ�.

class MyThread implements Runnable {

	@Override
	public void run() {
		for (int i = 0; i < 10; i++) {
			System.out.println(Thread.currentThread().getName() + ": i = " + i);
		}
	}

}

public class Thread01 {
	public static void main(String[] args) {
		Thread m01 = new Thread(new MyThread());
		Thread m02 = new Thread(new MyDaemonThread());

		m02.setDaemon(true);
		m01.start();
		m02.start();

		System.out.println(m01.getState() + " : " + m01.isDaemon());
		System.out.println(m02.getState() + " : " + m02.isDaemon());

		System.out.println("main-----------------------------------");
	}
}

class MyDaemonThread implements Runnable {
	@Override
	public void run() {
		for (int i = 0; i < 10000; i++) {
			System.out.println(Thread.currentThread().getName() + ": i = " + i);
		}
	}
}
