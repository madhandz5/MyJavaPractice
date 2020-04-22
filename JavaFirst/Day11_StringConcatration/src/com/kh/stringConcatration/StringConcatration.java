package com.kh.stringConcatration;

import java.util.Scanner;

public class StringConcatration {

	Scanner scanner = new Scanner(System.in);
	String str = "KH Academy";

	public void stringConcat() {

		// ==
		// 동일성비교
		// 샅은 주소를 바라보고 있는지에 따라 true / false 반환.
		String test1 = "ABC";
		String test2 = "ABC";
		System.out.println("test1 : " + System.identityHashCode(test1));
		System.out.println("test2 : " + System.identityHashCode(test2));
		System.out.println("스트링상수풀에 있는 String객체를 둘다 바라보고 있다." + (test1 == test2));

		String test3 = new String("ABC");
		System.out.println("test3 : " + System.identityHashCode(test3));
		System.out.println("heap영역에 올라간 String과 상수풀에 있는 String 비교 : " + (test1 == test3));

		// equals 메서드
		// 동등비교
		// 안에 들어있는 값이 같은지만 확인해서 true / false 반환.
		// 주소는 상관 없다.
		// java.lang.String.equals 메서드를 활용해서
		// test1 과 test3을 비교하는 코드를 작성하세요.

		System.out.println("Equals메서드로 test1, test3 비교 : " + test1.equals(test3));
		System.out.println("ABC를 입력하세요 : ");
		String test4 = scanner.nextLine();
		System.out.println("test4 : " + System.identityHashCode(test4));
		System.out.println(test1 == test4);

	}

	// * 1.String
	// * - 문자열 값을 수정할 수 없는 immutable이다.
	// * - 문자열 값을 수정하는 작업에 적합하지 않다.
	// * - 문자열을 수정하면 새로운 주소값을 반환해준다.

	public void stringConcatMethod() {
		str = str.concat(" Java Class");
		System.out.println(str);
	}

	// 문자값을 수정할 수 있다.(mutable 하다)
	// 기본 16문자 크기의 buffer를 사용한다. 크기를 조정할 수 있다.
	// -> 내부적으로 크기가 16인 char[] 을 생성해 놓는다.
	// 쓰레드 동기화를 지원하지 않는다.

	public void stringBuilderConcat() {

		String A = "A";
		System.out.println(System.identityHashCode(A));
		A += "B";
		System.out.println(System.identityHashCode(A));

		StringBuilder sBuilder = new StringBuilder();
		System.out.println("변경 전 : " + System.identityHashCode(sBuilder));
		sBuilder.append(str).append(" 자바 클래스");
		System.out.println("변경 후 : " + System.identityHashCode(sBuilder));
		System.out.println(sBuilder);

	}
	// 문자값을 수정할 수 있다.(mutable)하다
	// 기본 16문자 크기의 buffer를 사용한다. 크기를 조정할 수 있다.
	// -> 내부적으로 크기가 16인 char[]를 생성한다.
	// 쓰레드 동기화를 지원한다.

	public void stringBufferConcat() {

		StringBuffer sBuffer = new StringBuffer();

		System.out.println("변경 전 : " + System.identityHashCode(sBuffer));
		sBuffer.append(str).append(" Java Class");
		System.out.println("변경 후 : " + System.identityHashCode(sBuffer));
		System.out.println(sBuffer);

	}

}
