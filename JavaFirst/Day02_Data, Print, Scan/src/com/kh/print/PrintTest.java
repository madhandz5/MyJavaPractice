package com.kh.print;

public class PrintTest {
	public static void main(String[] args) {
		System.out.print("안녕하세요?");
		System.out.println("자바 수업입니다.");
		System.out.println("print 함수 입니다.");

		System.out.printf("%5d\n", 1);
		// %d 형식은 정수
		System.out.printf("%.2f\n", 1.1);
		// %f 형식은 실수
		System.out.printf("%c\n", 'A');
		// %c 형식은 문자
		System.out.printf("%s\n", "Hello Java");
		// %s 형식은 문자열
		System.out.printf("%b", true);
		// %b 형식은 논리형

	}

}
