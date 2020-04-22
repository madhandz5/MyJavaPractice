package com.kh.threadControl;

public class Thread4 implements Runnable {

	// * - sleep() : 지정된 시간동안 스레드를 일시정지 시키는 메서드
	// * - static으로 선언되어 있기 때문에 Thread.sleep()으로 호출할 수 있다.
	// * - 일시정지 시키고자 하는 쓰레드 내부에서 사용한다. (run() 메서드 내부에서 사용한다.)

	// * - interrupt() : 호출 시 일시정지 상태를 해제해준다.
	// * - 스레드가 일시정지 상태에 있을 때 interrupt() 메서드를 사용하면
	// * - InterruptException 을 발생시킨다.

	@Override
	public void run() {
		try {
			for (int i = 1; i <= 10; i++) {
				Thread.sleep(1000);
				System.out.println(i + "초");
			}
			System.out.println("카운트 종료");
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
}
