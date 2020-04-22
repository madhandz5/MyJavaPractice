package com.kh.demensionArray;

import java.util.Arrays;
import java.util.Scanner;

public class DemensionArrayPrac {

	Scanner scanner = new Scanner(System.in);

	// 사용자에게 정수값을 하나 입력받아
	// 그 값의 크기와 같은 행과 열을 가지는 2차원 배열을 생성
	// 2차원 배열에 숫자를 1부터 순차적으로 입력하되
	// 행 인덱스가 짝수일 때는 왼쪽에서 오른쪽으로
	// 행 인덱스가 홀수 일때는 오른쪽에서 왼쪽으로 입력되도록 하시오.
	// ex)사용자 입력 값 3
	// 1 2 3
	// 6 5 4
	// 7 8 9

	public void test() {

		System.out.println("정수를 하나 입력하세요.");
		int user = scanner.nextInt();

		int[][] arr = new int[user][user];

		int num = 1;
		for (int i = 0; i < arr.length; i++) {
			if (i % 2 == 0) {
				for (int j = 0; j < arr.length; j++) {
					arr[i][j] = num;
					num++;
				}
			} else {
				for (int j = user - 1; j >= 0; j--) {
					arr[i][j] = num;
					num++;
				}
			}
		}
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr.length; j++) {
				System.out.print("0" + arr[i][j] + " ");
			}

		}
		System.out.println();
	}

	public void testAnswer() {

		int idx = scanner.nextInt();
		int[][] iDarray = new int[idx][idx];
		int num = 1;
		int num2 = 1;

		for (int i = 0; i < iDarray.length; i++) {
			num2 = iDarray.length * (i + 1);
			for (int j = 0; j < iDarray[i].length; j++) {

				if (i % 2 == 0) {
					iDarray[i][j] = num;
				} else {
					iDarray[i][j] = num2;
				}
				num++;
				num2--;
			}
		}
		for (int i = 0; i < iDarray.length; i++) {
			for (int j = 0; j < iDarray[i].length; j++) {
				System.out.print(" " + iDarray[i][j]);
			}
			System.out.println("");
		}
	}
}
