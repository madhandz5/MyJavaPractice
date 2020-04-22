package com.kh.test01;

public class Thread00 {

	// * - Tread �����ϴ� ��
	// * - 1. ThreadŬ���� ��ӹޱ�
	// * - 2. Runnable �������̽� �����ϱ�

	// * - Thread, Runnable ����
	// * - Runnable �������̽��� ������ȭ �� �� �ִ�, run() �޼��带 ������ �ִ�.
	// * - Thread Ŭ������ Runnable �������̽��� �����ϰ� ������,
	// * - Thread�� Ȱ��ȭ �ϴ� start() �޼��带 ������ �ִ�.
	// * - Thread Ŭ������ Thread�� ���¸� ������ �� �ִ� �޼��带 ������ �ִ�.

	public static void main(String[] args) {

		// * - ���ξ����� �̸� ����
		// * - ���μ����� ��� �����尡 �۾��� ������ �����Ѵ�.

		System.out.println("���� �������� �������� �̸� �θ��� : " + Thread.currentThread().getName());

		MyThread1 m1 = new MyThread1();
		MyThread1 m2 = new MyThread1();

		System.out.println("MyThread1����");
		m1.start();
		m2.start();

		System.out.println("main stop---------------------------");

	}

}

class MyThread1 extends Thread {

	public void run() {
		for (int i = 0; i < 50000000; i++) {
			System.out.println("i = " + i);

		}

	}

}
