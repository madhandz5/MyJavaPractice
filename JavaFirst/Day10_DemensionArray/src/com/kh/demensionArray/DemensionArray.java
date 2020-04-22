package com.kh.demensionArray;

public class DemensionArray {

	public void testDemensionArray() {

		// 2차원 배열 선언
		int[][] arr;

		// 가능하나 권장하지 않음

		int[] arr1[];
		int arr2[][];

		arr2 = new int[4][5];

		// 2차원 배열의 할당 : new 연산자를 통해서 heap영역 공간 생성
		arr = new int[3][4];

		// 가변 배열(각 행마다 다른 열의 개수를 가지고 싶을 때)
		arr1 = new int[2][];

		arr1[0] = new int[3];
		arr1[1] = new int[2];

		arr1[0][0] = 1;
		arr1[0][1] = 2;
		arr1[0][2] = 3;
		arr1[1][0] = 4;
		arr1[1][1] = 5;

		// 타입정보와 주소값 출력

		System.out.println(arr1);
		System.out.println(arr1[0]);
		System.out.println(arr1[1]);
		System.out.println(arr1[1]);
		System.out.println(arr1[0][0]);

		int num = 1;
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {

				arr[i][j] = num++;
			}
		}

		// arr[3][4] 2차원 배열 출력
		System.out.println("-----------------------");
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				System.out.print(arr[i][j]);
			}
			System.out.println();
		}

		int num2 = 1;
		for (int i = 0; i < arr2.length; i++) {
			// 얕은 복사 개념
			int[] innerArr = arr2[i];
			for (int j = 0; j < innerArr.length; j++) {
				innerArr[j] = num2++;
			}
		}

		// arr2[4][5] 2차원 배열 출력
		System.out.println("-------arr2의 출력결과 입니다.-----------");
		for (int i = 0; i < arr2.length; i++) {
			for (int j = 0; j < arr2[i].length; j++) {
				System.out.print(arr2[i][j]);
			}
			System.out.println();
		}
	}
}
