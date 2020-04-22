package com.kh.loopingStatment;

import java.util.Scanner;

public class A2_forDouble {

	Scanner sc = new Scanner(System.in);

	// 2중 for문 작성해보기
	public void testForDouble() {
		System.out.println("출력 할 줄수 : ");
		int row = sc.nextInt();

		for (int i = 1; i <= row; i++) {
			for (int j = 1; j <= 5; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
	// 2중 for문으로 구구단 출력해보기

	public void testForDouble2() {

		for (int i = 2; i < 10; i++) {
			System.out.println("======= " + i + "단 =======");
			for (int j = 1; j < 10; j++) {
				System.out.println(i + " X " + j + " = " + (i * j));
			}
		}
	}

	public void testForDouble3() {

		// 다운로드 받을 프로그램 갯수를 입력하세요.

		// n번째 프로그램 다운로드 받습니다.
		// 0% 진행중...
		// 20% 진행중...
		// 40% 진행중...
		// 60% 진행중...
		// 80% 진행중...
		// 100% 진행중...
		// n번째 프로그램 다운로드 완료되었습니다.
		// ------------------------------
		// 모든프로그램 다운로드 완료

		System.out.println("몇개의 프로그램을 다운로드 받을까요");
		int many = sc.nextInt();

		for (int i = 1; i < many + 1; i++) {
			System.out.println(i + "번째 프로그램을 다운로드 받습니다.");
			for (int j = 0; j <= 100; j += 20) {
				System.out.println(j + "% 진행중...");

			}
			System.out.println(i + "번째 프로그램 다운로드 완료되었습니다.");
			System.out.println("---------------------------------");
		}
		System.out.println("모든 프로그램 다운로드 완료되었습니다.");
	}

	public void testForDouble4() {

		// 줄 수 :
		// 칸 수 :

		int horizontal = 0;
		int vertical = 0;

		System.out.println("몇줄?");
		horizontal = sc.nextInt();
		System.out.println("몇칸?");
		vertical = sc.nextInt();

		for (int i = 1; i <= horizontal; i++) {
			for (int j = 1; j <= vertical; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}

	public void testForDouble5() {

		// 줄 수 :
		// 칸 수 :
		// 대각선으로 1,2,3,4,5,6,7 출력

		int horizontal = 0;
		int vertical = 0;

		System.out.println("몇줄?");
		horizontal = sc.nextInt();
		System.out.println("몇칸?");
		vertical = sc.nextInt();

		for (int i = 1; i <= horizontal; i++) {
			for (int j = 1; j <= vertical; j++) {
				if (i == j) {
					System.out.print(i);
				} else {
					System.out.print("*");
				}
			}
			System.out.println();
		}
	}

	public void drawDiamond() {

		System.out.println("몇줄?");
		int num = sc.nextInt();
		for (int i = 0; i < num; i++) {
			for (int j = 0; j < num; j++) {
				if (i <= num / 2) {
					if (i + j <= num / 2 - 1)
						System.out.print(" ");
					else if (j - i >= num / 2 + 1)
						System.out.print(" ");
					else
						System.out.print("*");
				} else if (i > num / 2) {
					if (i - j >= num / 2 + 1)
						System.out.print(" ");
					else if (i + j >= num / 2 * 3 + 1)
						System.out.print(" ");
					else
						System.out.print("*");
				}
			}
			System.out.println();
		}
	}

}
