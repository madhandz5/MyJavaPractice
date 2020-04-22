package com.kh.test01;

public class Thread00 {

	// * - Tread 생성하는 법
	// * - 1. Thread클래스 상속받기
	// * - 2. Runnable 인터페이스 구현하기

	// * - Thread, Runnable 차이
	// * - Runnable 인터페이스는 스래드화 될 수 있는, run() 메서드를 가지고 있다.
	// * - Thread 클래스는 Runnable 인터페이스를 구현하고 있으며,
	// * - Thread를 활성화 하는 start() 메서드를 가지고 있다.
	// * - Thread 클래스는 Thread의 상태를 제어할 수 있는 메서드를 가지고 있다.

	public static void main(String[] args) {

		// * - 메인쓰레드 이름 찍어보기
		// * - 프로세스는 모든 쓰레드가 작업을 끝내면 종료한다.

		System.out.println("현재 실행중인 쓰래드의 이름 부르기 : " + Thread.currentThread().getName());

		MyThread1 m1 = new MyThread1();
		MyThread1 m2 = new MyThread1();

		System.out.println("MyThread1시작");
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
