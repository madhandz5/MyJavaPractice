package com.kh.array;

import java.util.Arrays;
import java.util.Scanner;

public class Array {

	Scanner scanner = new Scanner(System.in);

	public void array1() {
		// �迭
		// �ڷ����� ���� �������� ������ �ʿ��� ���
		// int n1, int n2, int n3, int n4, int n5, int n6,
		// �̷��� �迭�� ����ϸ� ����.
		// int[] ar = new int[6];

		// 1. �迭 ���� : �迭������ �����ּ� ����� ���۷��� (������) ���� �����
		// �ڷ���[] �迭��(������);

		int[] ar;

		// 2. �迭 �Ҵ� : new �����ڷ� �� �޸� ������ �迭������ �Ҵ��ϱ�
		// �߻��� �ּҸ� �غ��� �迭 ���۷����� �����.

		ar = new int[10];

		System.out.println("ar length : " + ar.length);

		for (int i = 0; i < ar.length; i++) {
			System.out.println(i + " : " + ar[i]);
		}
	}

	public void array2() {
		// �迭�� ũ��� ���������ε� ������ �� �� �ִ�.
		int index = 10;
		int[] iArr = new int[index];

		// ��> ����ڷκ��� �迭�� ũ�⸦ �Է¹޾� ������.

		int userIndex = scanner.nextInt();
		int[] iArr2 = new int[userIndex];

		for (int i = 0; i < iArr2.length; i++) {
			System.out.println(i + " : " + iArr2[i]);
		}

	}

	public void array3() {
		// �迭 ����� ���ÿ� �Ҵ� ����
		String[] sAr = new String[5];

		// �����ϴ� ���� 5�� �ְ� for������ �迭�ȿ� �ִ� ��ü ���� ����ϱ�.

		sAr[0] = "ġŲ";
		sAr[1] = "����";
		sAr[2] = "�ﰢ���";
		sAr[3] = "����";
		sAr[4] = "«��";

		for (int i = 0; i < sAr.length; i++) {
			System.out.println(sAr[i]);
		}
	}

	public void array4() {

		// �迭 ����� ���ÿ� �Ҵ�� ���ÿ� �ʱ�ȭ

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
		System.out.println("�� ȸ���� : " + b);
	}

	public void array6Answer() {

		int[] iArr = new int[] { 5, 3, 4, 1, 2 };
		// ���� �ε����� ���� �ε������� Ŭ ��� �ڸ� ��ȯ
		// �ƴ� ��� �״�� ����

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
