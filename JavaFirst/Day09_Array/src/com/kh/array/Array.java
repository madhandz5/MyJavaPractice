package com.kh.array;

import java.util.Arrays;
import java.util.Scanner;

public class Array {

	Scanner scanner = new Scanner(System.in);

	public void array1() {
		// 배열
		// 자료형이 같은 변수방이 여러개 필요한 경우
		// int n1, int n2, int n3, int n4, int n5, int n6,
		// 이럴때 배열을 사용하면 편리함.
		// int[] ar = new int[6];

		// 1. 배열 선언 : 배열공간의 시작주소 저장용 레퍼런스 (참조형) 변수 만들기
		// 자료형[] 배열명(변수명);

		int[] ar;

		// 2. 배열 할당 : new 연산자로 힙 메모리 영역에 배열공간을 할당하기
		// 발생한 주소를 준비한 배열 레퍼런스에 기록함.

		ar = new int[10];

		System.out.println("ar length : " + ar.length);

		for (int i = 0; i < ar.length; i++) {
			System.out.println(i + " : " + ar[i]);
		}
	}

	public void array2() {
		// 배열의 크기는 정수변수로도 지정해 줄 수 있다.
		int index = 10;
		int[] iArr = new int[index];

		// 예> 사용자로부터 배열의 크기를 입력받아 적용함.

		int userIndex = scanner.nextInt();
		int[] iArr2 = new int[userIndex];

		for (int i = 0; i < iArr2.length; i++) {
			System.out.println(i + " : " + iArr2[i]);
		}

	}

	public void array3() {
		// 배열 선언과 동시에 할당 가능
		String[] sAr = new String[5];

		// 좋아하는 음싯 5개 넣고 for문으로 배열안에 있는 전체 값들 출력하기.

		sAr[0] = "치킨";
		sAr[1] = "피자";
		sAr[2] = "삼각김밥";
		sAr[3] = "만두";
		sAr[4] = "짬뽕";

		for (int i = 0; i < sAr.length; i++) {
			System.out.println(sAr[i]);
		}
	}

	public void array4() {

		// 배열 선언과 동시에 할당과 동시에 초기화

		int[] iArr = new int[] { 5, 4, 3, 2, 1 };
		// int[] iArr2 = {1,2,3,4,5};
		iArr[3] = 100;

		System.out.println(iArr[3]);
	}

	public void array5() {

		int[] iArr = new int[] { 1, 2 };

		int temp = iArr[0];
		iArr[0] = iArr[1];
		iArr[1] = temp;

		for (int i = 0; i < iArr.length; i++) {
			System.out.println(iArr[i]);
		}
	}

	public void array6() {

		int[] nums = { 5, 3, 4, 1, 2 };
		int b = 0;

		for (int i = 0; i < nums.length; i++) {
			for (int j = 0; j < nums.length - i - 1; j++) {
				if (nums[j] > nums[j + 1]) {
					b = nums[j];
					nums[j] = nums[j + 1];
					nums[j + 1] = b;
				}
			}
		}
		for (int i = 0; i < nums.length; i++) {
			System.out.println(nums[i]);
		}
		System.out.println("총 회전수 : " + b);
	}

	public void array6Answer() {

		int[] iArr = new int[] { 5, 3, 4, 1, 2 };
		// 앞의 인덱스가 뒤의 인덱스보다 클 경우 자리 교환
		// 아닐 경우 그대로 있음

		for (int i = 0; i < iArr.length - 1; i++) {
			for (int j = 0; j < iArr.length - i - 1; j++) {
				if (iArr[j] > iArr[j + 1]) {
					int temp = iArr[j];
					iArr[j] = iArr[j + 1];
					iArr[j + 1] = temp;
				}
			}
		}
		System.out.println(iArr);
		System.out.println(Arrays.toString(iArr));
	}
}
