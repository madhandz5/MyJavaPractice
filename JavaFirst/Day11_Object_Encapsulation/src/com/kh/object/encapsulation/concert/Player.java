package com.kh.object.encapsulation.concert;

public class Player {

	public void play() {

		// prepare();
		start();
		playing();
		end();
	}

	// public void prepare() {
	// System.out.println("연주 준비합니다.");
	// }

	private void start() {
		System.out.println("연주 시작합니다.");
	}

	private void playing() {
		System.out.println("연주 중입니다.");
	}

	private void end() {
		System.out.println("연주 종료합니다.");
	}

}
