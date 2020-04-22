package com.kh.model;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Random;
import java.util.Scanner;

public class NonStaticMethodSample {

	public void testScanner() {
		System.out.println("1. Scanner Ŭ���� ��� : �ڷ��� �������� �� �Է¹޾� ����ϱ�");
		Scanner scanner = new Scanner(System.in);
		System.out.println("byte �Է� (" + Byte.MIN_VALUE + "~" + Byte.MAX_VALUE + ") : ");
		byte inByte = scanner.nextByte();
		System.out.println("short �Է�(" + Short.MIN_VALUE + "~" + Short.MAX_VALUE + ") : ");
		short inShort = scanner.nextShort();
		System.out.println("int �Է�(" + Integer.MIN_VALUE + "~" + Integer.MAX_VALUE + ") : ");
		int inInt = scanner.nextInt();
		System.out.println("long �Է�(" + Long.MIN_VALUE + "~" + Long.MAX_VALUE + ") : ");
		long inLong = scanner.nextLong();
		System.out.println("char �Է� : ");
		char inChar = scanner.next().charAt(0);
		System.out.println("float �Է�(" + Float.MIN_VALUE + "~" + Float.MAX_VALUE + ") : ");
		float inFloat = scanner.nextFloat();
		System.out.println("double �Է�(" + Double.MIN_VALUE + "~" + Double.MAX_VALUE + ") : ");
		double inDouble = scanner.nextDouble();

		System.out.println("�Է��� Byte : " + inByte);
		System.out.println("�Է��� Short : " + inShort);
		System.out.println("�Է��� Int : " + inInt);
		System.out.println("�Է��� Long : " + inLong);
		System.out.println("�Է��� Char : " + inChar);
		System.out.println("�Է��� Float : " + inFloat);
		System.out.println("�Է��� Double : " + inDouble);
	}

	public void testDate() {
		System.out.println("===Date Ŭ���� ��� : ���� ��¥, ���� �ð� ���� ����ϱ�===");
		Date date = new Date();
		String dateStr = date.toString();
		System.out.println(dateStr);
		System.out.println("==========���� ����===========");
		SimpleDateFormat simpleDateFormat = new SimpleDateFormat("��¥ : yyyy-MM-dd-E���� / �ð� : hh:mm:ss");
		System.out.println(simpleDateFormat.format(date));
	}

	public void testRandom() {
		System.out.println("===Random Ŭ���� ��� : ������ �Ǽ��� ���� ���� ����ϱ�===");
		int randomInt = new Random().nextInt();
		double randomDouble = new Random().nextDouble();

		System.out.println("�߻��� ���� ���� : " + randomInt);
		System.out.println("�߻��� �Ǽ� ���� : " + randomDouble);

	}

}
