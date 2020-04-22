package com.kh.run;

import java.util.Scanner;

import com.kh.controller.FileController;

public class Run {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		FileController fc = new FileController();

		while (true) {
			System.out.println("****** My Note ******");
			System.out.println("1. ��Ʈ ���� �����");
			System.out.println("2. ��Ʈ ����");
			System.out.println("3. ��Ʈ ��� �����ϱ�");
			System.out.println("4. ������");
			System.out.println("======================");
			System.out.println("��ȣ�� �Է��ϼ��� : ");
			try {
				int input = sc.nextInt();
				sc.nextLine();

				switch (input) {
				case 1:
					fc.fileSave();
					break;
				case 2:
					fc.fileOpen();
					break;
				case 3:
					fc.fileEdit();
					break;
				case 4:
					System.out.println("���α׷��� �����մϴ�.");
					System.exit(0);
					break;
				default:
					System.out.println("�߸� �Է��ϼ̽��ϴ�.");
					break;
				}
			} catch (Exception e) {
				System.out.println("���ڸ� �Է��� �ּ���.");
				sc = new Scanner(System.in);
			}
		}
	}
}
