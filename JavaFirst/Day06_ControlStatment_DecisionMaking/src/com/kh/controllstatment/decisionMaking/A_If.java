package com.kh.controllstatment.decisionMaking;

import java.util.Scanner;

public class A_If {

	// �ܵ� if��
	// if���� ���ǽ��� ��� ���� ��(true)�̸� {} ���� �ڵ带
	// �����ϰ�, ���ǽ��� ������� ����(false)�̸�
	// {}���� �ڵ带 �����ϰ� �Ѿ��.

	// [ǥ����]
	// if(���ǽ�){
	// �����ڵ�
	// }

	Scanner sc = new Scanner(System.in);

	public void testIf() {

		// �����ϳ��� �Է¹��� ��
		// ¦������ Ȧ�� ���� �Ǵ��Ͽ� ����� ����϶�.
		// ¦���̸� "�Է��Ͻ� ���ڴ� ¦�� �Դϴ�."
		// Ȧ���̸� "�Է��Ͻ� ���ڴ� Ȧ�� �Դϴ�."

		System.out.println("���� �ϳ��� �Է��ϼ���.");
		int a = sc.nextInt();

		if (a % 2 == 0) {
			System.out.println("¦���Դϴ�.");
		}
		if (a % 2 != 0) {
			System.out.println("Ȧ���Դϴ�.");
		}

		System.out.println("���α׷�����");

	}
}
