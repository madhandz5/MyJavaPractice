package com.kh.object.encapsulation.concert;

public class Player {

	public void play() {

		// prepare();
		start();
		playing();
		end();
	}

	// public void prepare() {
	// System.out.println("���� �غ��մϴ�.");
	// }

	private void start() {
		System.out.println("���� �����մϴ�.");
	}

	private void playing() {
		System.out.println("���� ���Դϴ�.");
	}

	private void end() {
		System.out.println("���� �����մϴ�.");
	}

}
