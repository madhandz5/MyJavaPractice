package com.kh.runtimeException.controller;

import java.sql.ResultSet;
import java.util.Scanner;

public class RuntimeErrPrac {

	Scanner scanner = new Scanner(System.in);

	public void classNArray() {

		try {
			// ClassCastException
			Object obj = new int[10];
			// String str = (String) obj;

			// ArrayIndexOutOfBoundsException
			int[] arr = new int[2];

			// NullPointerException
			arr[0] = 1;
			arr[1] = 2;
			// arr[2] = 3;

			String str2 = null;
			// int length = str2.length();
		} catch (ClassCastException cc) {
			System.out.println("ClassCastException");

		} catch (ArrayIndexOutOfBoundsException ae) {
			System.out.println("ArrayIndexOutOfBoundsException");

		} catch (NullPointerException np) {
			System.out.println("NullPointerException");

		} finally {
			System.out.println("������ �� �ɱ�?");
		}
		System.out.println("���⵵ ������ �� �ɱ�?");
	}

	// 1~100������ ������ �ϳ� �߻���Ű����
	// ����ڷκ��� �ϳ��� ���� �Է¹�������.
	// �߻���Ų ������ ����ڷκ��� �Է¹��� ���� ��������.
	// ����ڰ� �Է��� ���� 0�� ��� "0�� �ƴ� ���� �Է��Ͻÿ�" ���â�� ����ϼ���.
	// try-catch-finally ���� ����ϼ���.

	public void arithEx() {

		int randomNum = (int) (Math.random() * 100 + 1);

		System.out.println("���ڸ� �ϳ� �Է��ϼ��� : ");

		int userInput = scanner.nextInt();
		scanner.nextLine();
		int result = 0;

		try {
			result = randomNum / userInput;
			System.out.println(result);
		} catch (ArithmeticException ae) {
			System.out.println("0�� �ƴ� ���� �Է��Ͻÿ�.");
			System.out.println(ae);
		} finally {
			System.out.println("���α׷��� ����˴ϴ�.");
		}
	}
}
