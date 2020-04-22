package com.kh.model;

import java.util.Scanner;

public class ForSample {

	Scanner scanner = new Scanner(System.in);

	public void sum1To10() {
		System.out.println("===1~10까지 정수들의 합계 구하기===");
		int sum = 0;
		for (int i = 1; i < 11; i++) {
			sum += i;
		}
		System.out.println("1~10까지 정수의 합계 : " + sum);
	}

	public void sumEven1To100() {
		System.out.println("===1~100사이의 짝수들의 합계 구하기===");
		int sum = 0;
		for (int i = 1; i < 101; i++) {
			if (i % 2 == 0) {
				sum += i;
			}
		}
		System.out.println("1~100까지 짝수들의 합계 : " + sum);

	}

	public void oneGugudan() {
		System.out.println("===정수 하나 입력받아, 그 수의 구구단 출력하기===");
		System.out.println("정수 하나를 입력하세요 : ");
		int gugu = scanner.nextInt();
		scanner.nextLine();

		System.out.println(gugu + "단 구구단을 출력합니다.");
		for (int i = 1; i < 10; i++) {
			System.out.println("" + gugu + " X " + i + " = " + (gugu * i));
		}
	}

	public void sumMinToMax() {
		System.out.println("===두 개의 정수를 입력받아, 두 수중 작은 값에서 큰 값까지의 합계 구하기===");
		System.out.println("첫번 째 정수를 입력하세요 : ");
		int a = scanner.nextInt();
		scanner.nextLine();
		System.out.println("두번 째 정수를 입력하세요 : ");
		int b = scanner.nextInt();
		scanner.nextLine();
		int sum = 0;
		if (a > b) {
			for (int i = a; i < b + 1; i++) {
				sum += i;
			}
			System.out.println("" + a + "부터 " + b + " 까지 합계는 " + sum + " 입니다.");
		} else {
			for (int i = b; i < a + 1; i++) {
				sum += i;
			}
			System.out.println("" + b + "부터 " + a + " 까지 합계는 " + sum + " 입니다.");
		}
	}

	public void printStar() {
		System.out.println("===줄수와 칸수 입력받아, 입력된 줄수/칸수만큼 별표 문자 출력하기===");
		System.out.println("몇 줄을 그릴까요 : ");
		int vert = scanner.nextInt();
		scanner.nextLine();
		System.out.println("몇 칸을 그릴까요 : ");
		int hori = scanner.nextInt();
		scanner.nextLine();
		for (int i = 0; i < vert; i++) {
			for (int j = 0; j < hori; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}

	public void printNumberStar() {
		System.out.println("===7줄에 7칸에 별표 문자 출력하되, 각 줄에 줄 번호와 같은 칸에 숫자 출력하기===");

		for (int i = 1; i < 8; i++) {
			for (int j = 1; j < 8; j++) {
				if (i == j) {
					System.out.print(i);
				} else {
					System.out.print("*");
				}
			}
			System.out.println();
		}
	}

	public void printTriangleStar() {
		System.out.println("====줄 수를 입력받아, 삼각형 모양으로 별표 문자 출력하기(양수 : 직각삼각형, 음수 : 역삼각형)====");
		System.out.println("몇줄을 그릴까요?");
		int row = scanner.nextInt();
		scanner.nextLine();
		if (row > 0) {
			for (int i = 0; i < row; i++) {
				for (int j = 0; j < i + 1; j++) {
					System.out.print("*");
				}
				System.out.println();
			}
		} else {
			for (int i = 0; i < Math.abs(row); i++) {
				for (int j = i; j < Math.abs(row); j++) {
					System.out.print("*");
				}
				System.out.println();
			}
		}

	}

	public void guguDan() {
		System.out.println("====구구단 2단부터 9단까지 출력하기====");

		for (int i = 2; i < 10; i++) {
			System.out.println("=====" + i + " 단 =====");
			for (int j = 1; j < 10; j++) {
				System.out.println("" + i + " X " + j + " = " + (i * j));
			}
		}
	}
}
