package com.kh.training.view;

import java.util.Scanner;

import com.kh.training.controller.TrainingManager;

public class MainMenu {
	Scanner sc = new Scanner(System.in);

	public MainMenu() {

	}

	public void mainMenu() {
		System.out.println("�Ʒû��� ����Դϱ�?");
		TrainingManager tManager = new TrainingManager(sc.nextInt());
		while (true) {
			System.out.println("======= �޴� =======");
			System.out.println("1. �Ʒû� �߰�");
			System.out.println("2. �Ʒû� ��ü ��ȸ");
			System.out.println("3. �Ʒû� �̸����� �˻�");
			System.out.println("9. ���α׷� ����");
			System.out.println("==================");
			System.out.println("���ϴ� �޴��� �����ϼ��� : ");
			int input = sc.nextInt();
			switch (input) {
			case 1:
				tManager.insertTrainees();
				break;
			case 2:
				tManager.printTrainees();
				break;
			case 3:
				tManager.searchTrainees();
				break;
			case 9:
				break;
			default:
				System.out.println("�߸��Է��ϼ̽��ϴ�. �ٽ� �Է����ּ���.");
				break;
			}
			if (input == 9) {
				break;
			}
		}
		System.out.println("���α׷� ����");
	}
}
