package com.kh.overLoading;

public class OverLoading {

	// * 1. �����ε�
	// * - �̸��� ���� �޼��带 ������ ����� ��.
	// * - -> �ϳ��� �̸��� ���� �޼��带 �����ߴ�.
	// * - ����
	// * - 1) �Ű������� �޶�� �Ѵ�.
	// * - 2) �Ű������� Ÿ��(�ڷ���)�Ǵ� ���� �Ǵ� ������ �޶�� �Ѵ�.
	// * - ����������, �����, ��ȯ���� ������ ��ġ�� �ʴ´�.

	public void olTest() {

	}

	public void olTest(int a) {
		// �Ű� ������ �־ ����.
	}

	/*
	 * public void olTest(int b) { �������� ����� ����. }
	 */

	public void olTest(int a, int b) {
		// �Ű������� ������ �޶����� ����
	}

	public void olTest(int a, String b) {
		// �Ű������� ������ �޶����� ����
	}

	public void olTest(String b, int a) {
		// �Ű������� ������ �޶����� ����
	}

	static String olTest(int a, int b, String c) {
		// ����
		return c;
	}
}