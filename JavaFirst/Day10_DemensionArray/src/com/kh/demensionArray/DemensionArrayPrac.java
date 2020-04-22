package com.kh.demensionArray;

import java.util.Arrays;
import java.util.Scanner;

public class DemensionArrayPrac {

	Scanner scanner = new Scanner(System.in);

	// ����ڿ��� �������� �ϳ� �Է¹޾�
	// �� ���� ũ��� ���� ��� ���� ������ 2���� �迭�� ����
	// 2���� �迭�� ���ڸ� 1���� ���������� �Է��ϵ�
	// �� �ε����� ¦���� ���� ���ʿ��� ����������
	// �� �ε����� Ȧ�� �϶��� �����ʿ��� �������� �Էµǵ��� �Ͻÿ�.
	// ex)����� �Է� �� 3
	// 1 2 3
	// 6 5 4
	// 7 8 9

	public void test() {

		System.out.println("������ �ϳ� �Է��ϼ���.");
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
