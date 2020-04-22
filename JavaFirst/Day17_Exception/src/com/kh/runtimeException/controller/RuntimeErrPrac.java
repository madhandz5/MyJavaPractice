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
			System.out.println("실행이 잘 될까?");
		}
		System.out.println("여기도 실행이 잘 될까?");
	}

	// 1~100사이의 난수를 하나 발생시키세요
	// 사용자로부터 하나의 수를 입력받으세요.
	// 발생시킨 난수를 사용자로부터 입력받은 수로 나누세요.
	// 사용자가 입력한 수가 0일 경우 "0이 아닌 값을 입력하시오" 경고창을 출력하세요.
	// try-catch-finally 문을 사용하세요.

	public void arithEx() {

		int randomNum = (int) (Math.random() * 100 + 1);

		System.out.println("숫자를 하나 입력하세요 : ");

		int userInput = scanner.nextInt();
		scanner.nextLine();
		int result = 0;

		try {
			result = randomNum / userInput;
			System.out.println(result);
		} catch (ArithmeticException ae) {
			System.out.println("0이 아닌 값을 입력하시오.");
			System.out.println(ae);
		} finally {
			System.out.println("프로그램이 종료됩니다.");
		}
	}
}
