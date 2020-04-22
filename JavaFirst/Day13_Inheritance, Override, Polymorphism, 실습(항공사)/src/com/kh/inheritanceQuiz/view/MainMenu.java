package com.kh.inheritanceQuiz.view;

import java.util.Scanner;

import com.kh.inheritanceQuiz.controller.TourController;

public class MainMenu {

	Scanner sc = new Scanner(System.in);
	TourController tc = new TourController();

	// �ʱ�ȭ ���
	{
		System.out.println("*****�����ȵǴ� ���� / ������ ������� ���ϴ� KH�װ��翡 ���� ���� ȯ���մϴ�*****");
	}

	public MainMenu() {

	}

	public void mainMenu() {
		System.out.println("���� ���� �ݾ� : " + tc.bringMyMoney());
		System.out.println("���� ���� ���ϸ��� : " + tc.bringMyMile());

		while (true) {
			tc.drawMenu();
			System.out.println("������ ��ȣ�� �����ϼ��� : ");
			int num = sc.nextInt();
			if (tc.isAble(tc.bringMyMoney(), num - 1))
				tc.buyTicket(num - 1);
			else {
				System.out.println("���� ���� �ݾ��� �����մϴ�.");
				break;
			}
			System.out.println("Ƽ���� �� �ܾ��� : " + tc.bringMyMoney());
			System.out.println("Ƽ���� �� ���ϸ����� : " + tc.bringMyMile());
			System.out.println("===============================");
		}
		System.out.println("===���α׷� ����===");
	}
}
