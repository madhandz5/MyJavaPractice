package com.kh.test01;

public class Thread04 {

	// * - Thread ����
	// * - ����(Running) : ����ǰ� �ִ� ����

	// * - ������ (Runnable) : �����̶� ����� �� ������, �����층�� ���� �ʾƼ� ��ٸ��� �ִ� ����

	// * - �Ͻ����� : �����带 ������ �� ���� ����
	// * - 1) WAITING : wait(), join()
	// * - 2) TIMED_WAITING : sleep(millisecond)
	// * - 3) BLOCKED : ����ϰ��� �ϴ� ��ü�� LOCK�� Ǯ�������� ����ϴ� ����
	// * - ���� : run �޼��带 ��� �����ϰ� ������ ����

	// * - Thread�� �����ϴ� �޼���
	// * - 1) ���� ��� ����
	// * - start() : ������ ���·� ����� �ش�. ���� �����층�� ���� ������·� �Ѿ��.
	// * - Thread.yield() : �����߿� �ٸ� �����忡�� �纸�ϰ� ������ ���°� �ȴ�.
	// * - ObjectŬ������ notify() : wait() ������ �����带 ������� �ٲ��ش�.
	// * - ThreadŬ������ interrupt() : sleep()�̳� join()�� ���� �Ͻ����� ������ �����带 ������ ���·� �����.

	// * - 2) �Ͻ� ���� ����
	// * - ThreadŬ������ sleep(millisecond) : ������ �ð����� �����尡 �۵��� �����.
	// * - Thread Ŭ������ join() : ������ �����尡 ����Ǵµ��� �ٸ� �����带 �����.
	// * - Object Ŭ������ wait() : notify() ����ñ��� �����带 �����·� �д�.

	public static void main(String[] args) {

		MyThread03 m1 = new MyThread03("�߿�");
		MyThread03 m2 = new MyThread03("�۸�");

		m1.start();
		try {
			m1.join();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		m2.start();
	}
}
