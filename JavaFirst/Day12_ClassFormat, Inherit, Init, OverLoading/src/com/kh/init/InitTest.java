package com.kh.init;

public class InitTest {

	public void method1() {
		System.out.println("InitBlock.method1() 실행");
		System.out.println("프로그램 실행");
		System.out.println("=======================");

		System.out.println("Init.staticVar : " + Init.staticVar);
		System.out.println("=====Init 인스턴스 생성 시점=====");
		// Init ibvo = new Init();

	}

}
