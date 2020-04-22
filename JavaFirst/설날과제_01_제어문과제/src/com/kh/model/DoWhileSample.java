package com.kh.model;

import java.util.Scanner;

public class DoWhileSample {
	Scanner scanner = new Scanner(System.in);

	public void addDashToken() {

		System.out.println("===���ڿ��� �Է¹޾�, ���� ���̿� '-' �����־� ����ϱ�===");
		System.out.println("���ڿ��� �Է��ϼ��� : ");
		String str = scanner.nextLine();
		int arrIndex = 0;
		String[] strArr = str.split("");
		int newArrIndexSize = (strArr.length * 2) - 1;
		String[] newStrArr = new String[newArrIndexSize];
		int newArrIndex = 0;
		do {
			if (newArrIndex % 2 == 0) {
				newStrArr[newArrIndex] = strArr[arrIndex];
				arrIndex++;
				newArrIndex++;
			} else {
				newStrArr[newArrIndex] = "-";
				newArrIndex++;
			}

		} while (!(newArrIndex == newArrIndexSize));
		for (int i = 0; i < newArrIndexSize; i++) {
			System.out.print(newStrArr[i]);
		}
		System.out.println();

	}

	// �̰� �Ǵٸ� ���� �ѹ� �����غ�.
	public void addDashToken2() {
		System.out.println("===���ڿ��� �Է¹޾�, ���� ���̿� '-' �����־� ����ϱ�===");
		System.out.println("���ڿ��� �Է��ϼ��� : ");
		String str = scanner.nextLine();
		int index = 0;
		do {
			System.out.print(str.charAt(index++));
			if (index != str.length()) {
				System.out.print("-");
			}
		} while (index < str.length());
		System.out.println();
	}

	public void burgerKingMenu() {
		System.out.println("====����ŷ �޴� �ֹ� �׽�Ʈ====");
		boolean cont = true;
		do {
			System.out.println("�޴��� �����ϼ��� : ");
			System.out.println("1. ���ۼ�Ʈ");
			System.out.println("2. �����ִϾƮ");
			System.out.println("3. �ݶ�");
			System.out.println("9. ������");
			System.out.println("===============");
			System.out.println("��ȣ�� �����ϼ��� : ");
			int input = scanner.nextInt();
			scanner.nextLine();
			switch (input) {
			case 1:
				System.out.println("���ۼ�Ʈ �ֹ� �Ϸ�");
				break;
			case 2:
				System.out.println("�����ִϾƮ �ֹ� �Ϸ�");
				break;
			case 3:
				System.out.println("�ݶ� �ֹ� �Ϸ�");
				break;
			case 9:
				System.out.println("�ȳ��� ������.");
				cont = false;
				break;
			default:
				System.out.println("�߸��Է��߽��ϴ�.");
				break;
			}
		} while (cont);
		System.out.println("���α׷� ����");
	}

	public void isStringAlphabet() {
		System.out.println("===���ڿ� �Է¹޾�, \"��� ���� �����ڴ�\" \"������ �ƴϴ�.\"����ϱ�===");
		System.out.println("���ڿ��� �Է� �ϼ��� : ");
		String str = scanner.nextLine();
		char[] strArr = str.toCharArray();
		int check = 0;
		int length = 0;
		do {
			if (strArr[length] > 64 && strArr[length] < 91) {
				check += 0;
			} else if (strArr[length] > 96 && strArr[length] < 123) {
				check += 0;
			} else {
				check++;
			}
			length++;
		} while (!(length == strArr.length));
		if (check == 0) {
			System.out.println("��� ����(��������) �����ڴ�");
		} else {
			System.out.println("��� ���� ������ �ƴϴ�.");
		}
	}

}
