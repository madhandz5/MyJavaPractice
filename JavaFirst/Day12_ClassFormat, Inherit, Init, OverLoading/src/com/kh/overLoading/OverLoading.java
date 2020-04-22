package com.kh.overLoading;

public class OverLoading {

	// * 1. 오버로딩
	// * - 이름이 같은 메서드를 여러개 만드는 것.
	// * - -> 하나의 이름에 여러 메서드를 과적했다.
	// * - 조건
	// * - 1) 매개변수가 달라야 한다.
	// * - 2) 매개변수의 타입(자료형)또는 개수 또는 순서가 달라야 한다.
	// * - 접근제한자, 예약어, 반환형은 영향을 미치지 않는다.

	public void olTest() {

	}

	public void olTest(int a) {
		// 매개 변수가 있어서 성립.
	}

	/*
	 * public void olTest(int b) { 변수명은 상관이 없다. }
	 */

	public void olTest(int a, int b) {
		// 매개변수의 갯수가 달라져서 성립
	}

	public void olTest(int a, String b) {
		// 매개변수의 종류가 달라져서 성립
	}

	public void olTest(String b, int a) {
		// 매개변수의 순서가 달라져서 성립
	}

	static String olTest(int a, int b, String c) {
		// 성립
		return c;
	}
}