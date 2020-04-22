package com.kh.scan;

import java.util.Scanner;

public class MyScanner {
	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		System.out.println("int를 입력해 주세요 : ");
		int iNum = scanner.nextInt();

		System.out.println("float를 입력해 주세요: ");
		float fNum = scanner.nextFloat();

		System.out.println("double을 입력해 주세요: ");
		double dNum = scanner.nextDouble();

		System.out.println("char를 입력해 주세요: ");
		char ch = scanner.next().charAt(0);
		scanner.nextLine();

		System.out.println("하고싶은 말을 입력해 주세요");
		String str = scanner.nextLine();

		System.out.println("입력한 값은 " + iNum + "입니다.");
		System.out.println("입력한 float값은" + fNum + "입니다.");
		System.out.println("입력한 double값은 " + dNum + "입니다.");
		System.out.println("입력한 char은 " + ch + "입니다.");
		System.out.println("입력한 String은 " + str + "입니다.");

	}
}
