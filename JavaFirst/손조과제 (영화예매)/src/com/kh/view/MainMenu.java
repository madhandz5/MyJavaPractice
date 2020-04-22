package com.kh.view;

import java.util.Scanner;

import com.kh.controller.MovieManager;
import com.kh.model.vo.User;

public class MainMenu {
	Scanner scanner = new Scanner(System.in);
	MovieManager mm = new MovieManager();

	public MainMenu() {

		{
			System.out.println("====== KH��ȭ���� ���� ���� ȯ���մϴ�. ======");
			System.out.println();
			System.out.println("�ڿ�ȭ���� 30% �������á�");
			System.out.println("1. ��ȭ �����ϰ� ������� ������ �������");
			System.out.println("2. ��ȭ�� 11�� ���� ���ۿ�ȭ�� ���");
			System.out.println("3. ���������� �����ϰ� ��� ���");
			System.out.println("�Բ� �����ϴ� ��ΰ� ���ε� ������ ���� �޽��ϴ�.");
			System.out.println("==================================");
			System.out.println();
		}
	}

	public void mainMenu() {
		System.out.println("�̸��� �Է��Ͻÿ� : ");
		String name = scanner.nextLine();
		System.out.println("���̸� �Է��Ͻÿ� : ");
		int age = scanner.nextInt();
		scanner.nextLine();
		System.out.println("���� 4�ڸ��� �Է��ϼ��� : ");
		int birth = scanner.nextInt();
		scanner.nextLine();
		System.out.println("������ ��� ������ ������ �Է� �� �ּ��� : ");
		int couponCount = scanner.nextInt();
		scanner.nextLine();

		mm.insertMember(new User(name, age, birth, couponCount));

		System.out.println("�Է��Ͻ� ������ ȸ������� �Ϸ�Ǿ����ϴ�.");

		while (true) {

			System.out.println("======�޴�======");
			System.out.println("1. ����������");
			System.out.println("2. ��ȭ ��ü ��ȸ");
			System.out.println("3. ��ȭ �����ϱ�");
			System.out.println("9. ���α׷� �����ϱ�");
			System.out.println("===============");
			System.out.println("���Ͻô� �޴��� ��ȣ�� �Է��ϼ��� : ");

			int input = scanner.nextInt();
			scanner.nextLine();

			switch (input) {
			case 1:
				// MovieManager�� myPage() ȣ��
				System.out.println(mm.myPage());
				break;
			case 2:
				// MovieManager�� selectAll() ȣ��
				mm.selectAll();
				break;
			case 3:
				// MovieManager�� selectAll()�� reservation() ȣ��
				mm.selectAll();
				reservation();
				break;
			case 9:
				// return ó��
				System.out.println("���α׷� ����");
				break;
			}
		}
	}

	public void reservation() {
		System.out.println("���� �� ��ȭ ��ȣ�� �����ϼ���  : ");
		int input = scanner.nextInt();
		scanner.nextLine();

		int mIndex = mm.reservation(input - 1);

		if (mIndex == 0) {
		} else if (mIndex == 1) {
			System.out.println("�Ƶ��� �Բ� ������ �Ұ����մϴ�.");
		} else if (mIndex == 2) {
			System.out.println("������������ ���� ������ �Ұ����մϴ�.");
		} else if (mIndex == 3) {
		}
	}
}
