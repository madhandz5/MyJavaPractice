package com.kh.array;

import java.util.Arrays;

public class ArrayPrac {

	// [���� 1.]
	// java.lang.Math Ŭ������ random() �޼��带 ����� ������.
	// java api ����ϱ�

	public int[] lottoNumbers() {

		int[] lottoNums = new int[6];
		for (int i = 0; i < lottoNums.length; i++) {

			// ���⿡�� ����ؼ�
			// Math random()�޼����� ������� 10�� ������ּ���.
			lottoNums[i] = (int) (Math.random() * 45) + 1;

			for (int j = 0; j < i; j++) {
				if (lottoNums[i] == lottoNums[j]) {
					i--;
					break;
				}
			}
		}
		ArrayUtil arrayUtil = new ArrayUtil();
		arrayUtil.sort(lottoNums);
		// Arrays.sort(lottoNums);
		return lottoNums;

	}

	public void prac2() {

		// [����2]
		// - ���� ����:
		// 1. ũ�Ⱑ 10�� int[] ����, �Ҵ���
		// 2. 1~100������ ������ ������ �߻�����, �迭������ �����.
		// �迭[�ε���] = (int)(Math.random()*100)+1;
		// 3. ��ϵ� 10���� �� �� ���� ū ���� ���� �������� �˾Ƴ���
		// 4. ���Ȯ��

		int[] nums = new int[10];

		for (int i = 0; i < nums.length; i++) {
			nums[i] = (int) (Math.random() * 100) + 1;
		}

		int max = nums[0]; // �ִ밪
		int min = nums[0]; // �ּҰ�

		for (int i = 0; i < nums.length; i++) {
			if (max < nums[i]) {
				// max�� ������ array[i]�� ũ�� max = array[i]
				max = nums[i];
			}
			if (min > nums[i]) {
				// min�� ������ array[i]�� ������ min = array[i]
				min = nums[i];
			}
		}
		System.out.println(Arrays.toString(nums));

		System.out.println("�ּҰ� : " + min + "  �ִ밪 : " + max);
	}

	public void test2() {

		String data = "abcdefgh";
		// ���ڿ� data���� cde�� ������ ������ּ���.
		// java.lang.String Ŭ������ substring �޼��带 Ȱ���Ͻø� �˴ϴ�.

		System.out.println(data.substring(2, 5));

		String number = "123456";
		// number�� int������ ��ȯ���ּ���.
		// java.lang.Integer Ŭ������ parseInt �޼���

		System.out.println("���ڿ� number �� : " + number);
		System.out.println("������ number �� : " + Integer.parseInt(number));
		System.out.println("�Ľ��� ���ڸ� 2�� ���������ϴ�. : " + Integer.parseInt(number) / 2);
	}

	public void test3() {

		// ũ�Ⱑ 10�� int[] �� 3�� �����ϼ���.
		// �� int[]�� 1~95 ������ ������ �ʱ�ȭ�ϼ���.
		// 3���� int[]�� �� �ִ� ���ڵ� �߿��� 7��° 8��° 9��°�� ���� ���� ����ϼ���.

		int[] iArr = new int[10];
		int[] iArr2 = new int[10];
		int[] iArr3 = new int[10];

		for (int i = 0; i < 10; i++) {
			iArr[i] = (int) (Math.random() * 95) + 1;
			iArr2[i] = (int) (Math.random() * 95) + 1;
			iArr3[i] = (int) (Math.random() * 95) + 1;
		}

		ArrayUtil arrayUtil = new ArrayUtil();

		System.out.println(Arrays.toString(
				arrayUtil.subArr(arrayUtil.sort(arrayUtil.addAll(iArr3, arrayUtil.addAll(iArr, iArr2))), 6, 9)));
	}
}
