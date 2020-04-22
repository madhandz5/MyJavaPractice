package com.kh.demensionArray;

public class DemensionArray {

	public void testDemensionArray() {

		// 2���� �迭 ����
		int[][] arr;

		// �����ϳ� �������� ����

		int[] arr1[];
		int arr2[][];

		arr2 = new int[4][5];

		// 2���� �迭�� �Ҵ� : new �����ڸ� ���ؼ� heap���� ���� ����
		arr = new int[3][4];

		// ���� �迭(�� �ึ�� �ٸ� ���� ������ ������ ���� ��)
		arr1 = new int[2][];

		arr1[0] = new int[3];
		arr1[1] = new int[2];

		arr1[0][0] = 1;
		arr1[0][1] = 2;
		arr1[0][2] = 3;
		arr1[1][0] = 4;
		arr1[1][1] = 5;

		// Ÿ�������� �ּҰ� ���

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

		// arr[3][4] 2���� �迭 ���
		System.out.println("-----------------------");
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				System.out.print(arr[i][j]);
			}
			System.out.println();
		}

		int num2 = 1;
		for (int i = 0; i < arr2.length; i++) {
			// ���� ���� ����
			int[] innerArr = arr2[i];
			for (int j = 0; j < innerArr.length; j++) {
				innerArr[j] = num2++;
			}
		}

		// arr2[4][5] 2���� �迭 ���
		System.out.println("-------arr2�� ��°�� �Դϴ�.-----------");
		for (int i = 0; i < arr2.length; i++) {
			for (int j = 0; j < arr2[i].length; j++) {
				System.out.print(arr2[i][j]);
			}
			System.out.println();
		}
	}
}
