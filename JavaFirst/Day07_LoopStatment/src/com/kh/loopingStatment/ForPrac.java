package com.kh.loopingStatment;

import java.util.Scanner;

public class ForPrac {

	Scanner sc = new Scanner(System.in);

	public void forQuiz() {

		// 정수를 하나 입력받아 그 수가 1~9일때만 그 수의 구구단을 출력하게 하고,
		// 1~9가 아니면 "반드시 1~9 사이의 양수를 입력하여야 합니다." 출력

		System.out.println("정수를 하나 입력하세요.");

		int numA = sc.nextInt();

		if (numA >= 1 && numA <= 9) {
			for (int i = 1; i < 10; i++) {
				System.out.println(numA + " X " + i + " = " + (numA * i));
			}
		} else {
			System.out.println("반드시 1~9사이의 양수를 입력하여야 합니다.");
		}
	}

	public void forQuiz2() {

		// 두 수를 입력받아서 작은 수 부터 큰 수 사이 수들의 합을 구하라.
		// 단 같은 수가 입력될 경우 1~10까지의 수를 더하시오.

		int sum = 0;

		System.out.println("첫번째 정수를 입력하세요.");
		int numA = sc.nextInt();
		System.out.println("두번째 정수를 입력하세요.");
		int numB = sc.nextInt();

		if (numA == numB) {
			for (int i = 1; i <= 10; i++)
				sum += i;
		} else if (numA > numB) {
			for (int i = numB; numB < numA; i++)
				sum += i;
		} else if (numA < numB) {
			for (int i = numA; numA < numB; i++)
				sum += i;
		} else {
			System.out.println("잘못입력하셨습니다.");
		}

		System.out.println(sum);
	}

	public void forQuiz3() {

		// 두 수를 입력받아서 작은 수 부터 큰 수 사이 수들의 합을 구하라.
		// 단 같은 수가 입력될 경우 1~10까지의 수를 더하시오.

		System.out.println("첫번째 정수를 입력하세요.");
		int numA = sc.nextInt();
		System.out.println("두번째 정수를 입력하세요.");
		int numB = sc.nextInt();

		int sum = 0;
		int max = 0;
		int min = 0;

		if (numA < numB) {
			max = numB;
			min = numA;
		} else {
			if (numA != numB) {
				max = numA;
				min = numB;
			} else {
				min = 1;
				max = 10;
			}
		}
		for (int i = min; i <= max; i++) {
			sum += i;
		}
		System.out.println(sum);
	}

	public void forQuiz4() {

		// 두 수를 입력받아서 작은 수 부터 큰 수 사이 수들의 합을 구하라.
		// 단 같은 수가 입력될 경우 1~10까지의 수를 더하시오.

		System.out.println("첫번째 정수를 입력하세요.");
		int numA = sc.nextInt();
		System.out.println("두번째 정수를 입력하세요.");
		int numB = sc.nextInt();

		int sum = 0;
		int max = 0;
		int min = 0;

		max = numA > numB ? numA : numB == numB ? 10 : numB;
		min = numA < numB ? numA : numA == numB ? 1 : numB;

		for (int i = min; i <= max; i++) {
			sum += i;
		}
		System.out.println(sum);

	}
}
