package com.kh.scan;

import java.util.Scanner;

public class ScannerEx01 {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("이름을 입력 해 주세요.");
		String name = sc.nextLine();

		System.out.println("나이를 입력 하세요.");
		int age = sc.nextInt();
		sc.nextLine();

		System.out.println("성별을 선택하세요.");
		System.out.println("[1] : 남자");
		System.out.println("[2] : 여자");
		int sex = sc.nextInt();
		sc.nextLine();

		System.out.println("주소를 입력하세요.");
		String adress = sc.nextLine();

		System.out.println("이름 : " + name);
		if (sex == 1) {
			System.out.println("성별 : 남자");
		} else if (sex == 2) {
			System.out.println("성별 : 여자");
		} else {
			System.out.println("잘못된 값을 입력하였습니다.");
		}
		System.out.println("나이 : " + age);
		System.out.println("주소 : " + adress);

	}

}
