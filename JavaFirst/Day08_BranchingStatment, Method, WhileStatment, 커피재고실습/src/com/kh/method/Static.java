package com.kh.method;

public class Static {

	// 접근제한자 [예약어] 반환형 메서드명(매개변수)
	// 예약어 static, abstract
	// static : 메서드나 변수 앞에 static을 붙여주면 프로그램이 실해되자마자 바로 static 영역에 해당 메서드나 변수가 올라간다.
	// static 영역에 올라간 데이터들은 프로그램이 종료될 때까지 내려오지 않는다.
	// 이미 메모리에 올라가 있기 때문에 객체를 생성하는 과정이 필요하지 않다.
	// 다른 클래스에 같은 이름의 static 메서드가 있을 수 있기 때문에 앞에 클래스명을 붙여서 구분해준다.

	int i = 10;
	static String name = "오창영";

	public static void staticMethod() {

		System.out.println("Static 클래스 안의 static 메서드 입니다.");

	}
}
