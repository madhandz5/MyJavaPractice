package com.kh.threadControl;

public class Thread5 implements Runnable {

	@Override
	public void run() {
		int cnt = 0;
		while (cnt < 10) {
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				System.out.println("예외 상황 발생 했니?");
				System.out.println(cnt + "초에 카운트 종료");
				cnt = 10;
			}
			System.out.println((++cnt) + "초");
		}
		System.out.println("카운트 다운 종료");

	}
}