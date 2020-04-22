package com.kh.print;

import java.util.Scanner;

public class PrintEx01 {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.print("이름을 입력해 주세요 : ");
		String name = sc.nextLine();

		System.out.print("나이를 입력해 주세요 : ");
		int age = sc.nextInt();
		sc.nextLine();

		System.out.print("주소를 입력해 주세요 : ");
		String addr = sc.nextLine();

		System.out.print("키를 입력해 주세요 : ");
		double height = sc.nextDouble();

		System.out.print("몸무게를 입력해 주세요 : ");
		double weight = sc.nextDouble();

		System.out.print("성별을 입력해 주세요 : ");
		char gender = sc.next().charAt(0);

		System.out.println("당신의 이름은 : " + name);
		System.out.println("당신의 나이는 : " + age);
		System.out.println("당신의 주소는 : " + addr);
		System.out.println("당신의 키는:  " + (int) height);
		System.out.printf("당신의 몸무게는 : %.1f\n", weight);
		System.out.println("당신의 성별은 : " + gender);
		
	

	}

}
