package com.kh.threadControl;

import java.util.Scanner;

public class InterruptSample {

	public void sleepInterrupt() {

		Thread5 thread5 = new Thread5();
		Thread thread = new Thread(thread5);
		thread.start();

		Scanner scanner = new Scanner(System.in);
		System.out.println("�ƹ� ���̳� �Է��ϼ��� : ");
		String input = scanner.nextLine();
		System.out.println("�Է��� �� : " + input);

		// * - Thread5�� �������� �����忡 ���ͷ�Ʈ�� ȣ��
		// * - Thread5�� �Ͻ����� ����(�� sleep()) ������ ��, ���ͷ�Ʈ �޼��带 ����ϸ� ���ܰ� �߻��ϰ� �ȴ�.
		thread.interrupt();

	}

}
