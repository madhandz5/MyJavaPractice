package com.kh.model;

import java.util.Scanner;

public class WhileSample {

	Scanner scanner = new Scanner(System.in);

	public void printUniCode() {
		System.out.println("===���� �ϳ� �Է¹޾�, �� ������ �����ڵ� ��¹ݺ�('0' �ԷµǸ� �ݺ� ����)===");
		char ch = '!';
		while (!(ch == '0')) {
			System.out.println("���� �ϳ� �Է� : ");
			ch = scanner.next().charAt(0);
			System.out.format("0x%04X%n", (int) ch);
		}
		System.out.println("����");

	}

	public void sum1To100() {
		System.out.println("===1~100���� �������� �հ� ����ϱ� (while������ �ۼ�)===");
		int sum = 0;
		int a = 0;
		while (a < 101) {
			sum += a;
			a++;
		}
		System.out.println("1~100���� �������� �հ� (while������ �ۼ��� ): " + sum);
	}

	public void numberGame() {
		System.out.println("===1~100������ ������ ������ �߻�����, ���� �˾� ���߱�===");
		int randomNum = (int) (Math.random() * 100 + 1);
		int a = 0;
		while (!(randomNum == a)) {
			System.out.println("���ڸ� ���� ���ƿ�. 1~100");
			a = scanner.nextInt();
			scanner.nextLine();
		}
		System.out.println("Ż�� ����.");

	}

	public void countCharacter() {
		System.out.println("===���ڿ��� �Է¹޾�, ���� ���� �˾Ƴ��� ����ϱ�===");
		System.out.println("���ڿ��� �Է��ϼ��� : ");
		String str = scanner.nextLine();
		char[] strArr = str.toCharArray();
		int count = 0;
		while (count < strArr.length) {
			count++;
		}
		System.out.println("�Է���  \"" + str + "\" �� ���� �� : " + count);
	}

	public void countInChar() {
		System.out.println("===���ڿ����� ���� �ϳ��� �Է¹޾�, ���ڿ��� ���ڰ� �� �� �ִ��� Ȯ���ϱ�===");
		System.out.println("���ڿ��� �Է��ϼ��� : ");
		String str = scanner.nextLine();
		System.out.println("���ڸ� �Է��ϼ��� : ");
		char ch = scanner.next().charAt(0);
		scanner.nextLine();
		char[] strArr = str.toCharArray();
		int length = 0;
		int count = 0;
		while (length < strArr.length) {
			if (strArr[length] == ch) {
				count++;
			}
			length++;
		}
		System.out.println("�Է��� \"" + str + "\" ���ڿ��� �Է��� \'" + ch + "\' ������ ������ " + count + "��");
	}

}
