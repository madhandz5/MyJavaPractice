package com.kh.scan;

import java.util.Scanner;

public class OperTest {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("a���� �Է��ϼ���");
		int a = sc.nextInt();
		System.out.println("b���� �Է��ϼ���");
		int b = sc.nextInt();
		System.out.println("c���� �Է��ϼ���");
		int c = sc.nextInt();

		a++;
		b = (--a) + b;
		c = (a++) + (--b);

		System.out.println("a�� : " + a);
		System.out.println("b�� : " + b);
		System.out.println("c�� : " + c);

		boolean flag = true;

		System.out.println(!!!!flag);

	}

}
