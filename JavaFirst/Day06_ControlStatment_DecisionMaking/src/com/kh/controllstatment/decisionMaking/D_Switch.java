package com.kh.controllstatment.decisionMaking;

import java.util.Scanner;

public class D_Switch {

	// ������ ���� case���� ã�� ����� �����ϴ� ���ǹ��̴�.
	// (������ �ƴ϶� ��Ȯ�� ���̾�� �Ѵ�. i < 10 (x), i == 10 (o)
	// �ش� ���� ���� ��� default���� �����Ѵ�(if���� else�� ����)
	// case�� ��ɹ� ���̿��� (;)�� ����Ѵ�.
	// break�� ������ ������ �ʰ� ���� case�� default�� �����Ѵ�.

	// [ǥ����]
	// switch(����){
	// case 1 : ���๮; break; // �������� 1�ϰ�� ���⸸ ����
	// case 2 : ���๮2; break; // �������� 2�ϰ�� ���⸸ ����
	// default : ���๮3; break; // 1�� 2�� �ƴϸ� ���� ����

	Scanner sc = new Scanner(System.in);

	public void testSwitch1() {

		// ������ �ϳ� �Է¹��� �� �Է¹��� ���ڰ� ¦������ Ȧ�� ���� �Ǻ�

		System.out.println("������ �ϳ� �Է��ϼ���.");
		int num = sc.nextInt();
		int isEven = num % 2;

		switch (isEven) {
		case 0:
			System.out.println("�Է��Ͻ� ������ ¦���Դϴ�.");
			break;
		default:
			System.out.println("�Է��Ͻ� ������ Ȧ���Դϴ�.");
			break;
		}

	}

	// Switch �� �ȿ� if�� �ۼ�
	public void testSwitch2() {

		// �ϳ��� ������ �Է¹��� ��
		// �ش� ������ 0���� ¦������ Ȧ������ ����ϴ�
		// switch���� �ۼ��Ͻÿ�.

		System.out.println("���� �ϳ��� �Է��ϼ���");
		int num = sc.nextInt();

		switch (num % 2) {
		case 0:
			if (num != 0) {
				System.out.println("¦���Դϴ�.");
			} else {
				System.out.println("�Է��Ͻ� ������ 0�Դϴ�.");
			}
			break;
		default:
			System.out.println("Ȧ���Դϴ�.");
			break;
		}
	}

	public void testSwitch3() {

		// �ϳ��� ������ �Է¹��� ��
		// �ش� ������ 0���� ¦������ Ȧ������ ����ϴ�
		// switch���� �ۼ��Ͻÿ�.

		System.out.println("���� �ϳ��� �Է��ϼ���");
		int num = sc.nextInt();

		switch (num % 2) {
		case 0:
			switch (num) {
			case 0:
				System.out.println("�Է��Ͻ� ������ 0�Դϴ�.");
				break;
			default:
				System.out.println("�Է��Ͻ� ������ ¦���Դϴ�.");
				break;
			}
			break;
		default:
			System.out.println("�Է��Ͻ� ������ Ȧ���Դϴ�.");
			break;
		}
	}

	public void testSwitch4() {
		// break�� �����غ���
		// Fall Through
		// Ȱ���� ���� ������ �������� ��������.
		// ���࿡ ����Ѵٸ� �ּ��� �ʼ��� �޾���� �Ѵ�.

		// �ϳ��� ������ �Է¹��� ��
		// �ش� ������ 0���� ¦������ Ȧ������ ����ϴ�
		// switch���� �ۼ��Ͻÿ�.

		System.out.println("���� �ϳ��� �Է��ϼ���");
		int num = sc.nextInt();

		switch (num % 2) {
		case 0:
			switch (num) {
			case 0:
				System.out.println("�Է��Ͻ� ������ 0�Դϴ�.");
				// break;
			default:
				System.out.println("�Է��Ͻ� ������ ¦���Դϴ�.");
				// break;
			}
			// break;
		default:
			System.out.println("�Է��Ͻ� ������ Ȧ���Դϴ�.");
			// break;
		}
	}


}
