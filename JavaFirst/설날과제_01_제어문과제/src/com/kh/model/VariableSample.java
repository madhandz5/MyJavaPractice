package com.kh.model;

import java.util.Scanner;

public class VariableSample {

	public void myProfile() {
		String name = "오창영";
		int age = 35;
		char gender = '남';
		String job = "개발자";
		String addr = "서울";

		System.out.println("=====내 신상정보변수에 담아 출력하기=====");
		System.out.println("이름 : " + name);
		System.out.println("나이 : " + age);
		System.out.println("성별 : " + gender);
		System.out.println("직업 : " + job);
		System.out.println("주소 : " + addr);

	}

	Scanner scanner = new Scanner(System.in);

	public void empInformation() {
		System.out.println("이름 : ");
		String name = scanner.nextLine();
		System.out.println("나이 : ");
		int age = scanner.nextInt();
		scanner.nextLine();
		System.out.println("성별 : ");
		char gender = scanner.next().charAt(0);
		scanner.nextLine();
		System.out.println("주소 : ");
		String addr = scanner.nextLine();
		System.out.println("=====사원정보를 키보드로 입력받아 출력하기=====");
		System.out.println("이름 : " + name);
		System.out.println("나이 : " + age);
		System.out.println("성별 : " + gender);
		System.out.println("주소 : " + addr);

	}

	String defStr;
	byte defByte;
	short defShort;
	int defInt;
	long defLong;
	char defChar;
	float defFloat;
	double defDouble;
	boolean defBool;

	public void defaultValue() {
		System.out.println("=====기본 자료형 변수의 초기값 확인하기=====");
		System.out.println("String 의 초기값 : " + defStr);
		System.out.println("byte 의 초기값 : " + defByte);
		System.out.println("short 의 초기값 : " + defShort);
		System.out.println("int 의 초기값 : " + defInt);
		System.out.println("long 의 초기값 : " + defLong);
		System.out.println("char 의 초기값 : " + defChar);
		System.out.println("float 의 초기값 : " + defFloat);
		System.out.println("double 의 초기값 : " + defDouble);
		System.out.println("boolean 의 초기값 : " + defBool);
	}
}
