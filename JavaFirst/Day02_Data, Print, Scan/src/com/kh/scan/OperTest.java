package com.kh.scan;

import java.util.Scanner;

public class OperTest {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("a값을 입력하세요");
		int a = sc.nextInt();
		System.out.println("b값을 입력하세요");
		int b = sc.nextInt();
		System.out.println("c값을 입력하세요");
		int c = sc.nextInt();

		a++;
		b = (--a) + b;
		c = (a++) + (--b);

		System.out.println("a는 : " + a);
		System.out.println("b는 : " + b);
		System.out.println("c는 : " + c);

		boolean flag = true;

		System.out.println(!!!!flag);

	}

}
