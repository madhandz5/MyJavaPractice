package com.kh.model;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Random;
import java.util.Scanner;

public class NonStaticMethodSample {

	public void testScanner() {
		System.out.println("1. Scanner 클래스 사용 : 자료형 종류별로 값 입력받아 출력하기");
		Scanner scanner = new Scanner(System.in);
		System.out.println("byte 입력 (" + Byte.MIN_VALUE + "~" + Byte.MAX_VALUE + ") : ");
		byte inByte = scanner.nextByte();
		System.out.println("short 입력(" + Short.MIN_VALUE + "~" + Short.MAX_VALUE + ") : ");
		short inShort = scanner.nextShort();
		System.out.println("int 입력(" + Integer.MIN_VALUE + "~" + Integer.MAX_VALUE + ") : ");
		int inInt = scanner.nextInt();
		System.out.println("long 입력(" + Long.MIN_VALUE + "~" + Long.MAX_VALUE + ") : ");
		long inLong = scanner.nextLong();
		System.out.println("char 입력 : ");
		char inChar = scanner.next().charAt(0);
		System.out.println("float 입력(" + Float.MIN_VALUE + "~" + Float.MAX_VALUE + ") : ");
		float inFloat = scanner.nextFloat();
		System.out.println("double 입력(" + Double.MIN_VALUE + "~" + Double.MAX_VALUE + ") : ");
		double inDouble = scanner.nextDouble();

		System.out.println("입력한 Byte : " + inByte);
		System.out.println("입력한 Short : " + inShort);
		System.out.println("입력한 Int : " + inInt);
		System.out.println("입력한 Long : " + inLong);
		System.out.println("입력한 Char : " + inChar);
		System.out.println("입력한 Float : " + inFloat);
		System.out.println("입력한 Double : " + inDouble);
	}

	public void testDate() {
		System.out.println("===Date 클래스 사용 : 오늘 날짜, 현재 시간 정보 출력하기===");
		Date date = new Date();
		String dateStr = date.toString();
		System.out.println(dateStr);
		System.out.println("==========포맷 변경===========");
		SimpleDateFormat simpleDateFormat = new SimpleDateFormat("날짜 : yyyy-MM-dd-E요일 / 시간 : hh:mm:ss");
		System.out.println(simpleDateFormat.format(date));
	}

	public void testRandom() {
		System.out.println("===Random 클래스 사용 : 정수와 실수에 대한 난수 출력하기===");
		int randomInt = new Random().nextInt();
		double randomDouble = new Random().nextDouble();

		System.out.println("발생한 정수 난수 : " + randomInt);
		System.out.println("발생한 실수 난수 : " + randomDouble);

	}

}
