package com.kh.method;

public class MethodTest {

	public void methodTest() {
		// static 메서드 실행해보기
		Static.staticMethod();
		Return.staticMethod();
	}

	public void methodTest1() {
		// AccessModifier amf = new AccessModifier();

		// AccessModifier 클래스의 publicMethod 호출해보기
		// amf.publicMethod();
		// AccessModifier 클래스의 protecedMethod 호출해보기
		// amf.protectedMethod();
		// AccessModifier 클래스의 defaultMethod 호출해보기
		// amf.defaultMethod();
		// AccessModifier 클래스의 privateMethod 호출해보기

		Return rt = new Return();
		// return 클래스의 sub메서드를 호출한다음 매개변수에 원하는 값을 넣고
		// 메서드가 돌려주는 값을 알맞은 변수에 담아 결과값 출력해보기.
		System.out.println(rt.sub(10, 20));
		// return 클래스의 div메서드를 호출한다음 매개변수에 원하는 값을 넣고
		// 메서드가 돌려주는 값을 알맞은 변수에 담아 결과값 출력해보기.
		System.out.println(rt.div(20, 10));
		// return 클래스의 capital메서드를 호출한다음 매개변수에 원하는 값을 넣고
		// 메서드가 돌려주는 값을 알맞은 변수에 담아 결과값 출력해보기.
		System.out.println(rt.capital('a'));
	}

	public void staticTest() {
		System.out.println("Byte의 최소값은" + Byte.MIN_VALUE + "입니다.");
		Static.name = "오주혁";
		System.out.println("저의 이름은 " + Static.name + "입니다.");
	}

	public void staticTest1() {
		System.out.println("Short의 최소값은" + Short.MIN_VALUE + "입니다.");
		System.out.println("저의 이름은 " + Static.name + "입니다.");
	}

	public void staticTest2() {
		System.out.println("Int의 최소값은" + Integer.MIN_VALUE + "입니다.");
		System.out.println("저의 이름은 " + Static.name + "입니다.");
	}

}
