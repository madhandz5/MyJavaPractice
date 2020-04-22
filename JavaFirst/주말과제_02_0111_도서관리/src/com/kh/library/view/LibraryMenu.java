package com.kh.library.view;

import java.util.Scanner;

import com.kh.library.controller.LibraryManager;
import com.kh.library.model.vo.Book;
import com.kh.library.model.vo.Member;

public class LibraryMenu {

	LibraryManager lm = new LibraryManager();
	Scanner sc = new Scanner(System.in);

	public LibraryMenu() {
		System.out.println("�̸��� �Է��ϼ��� : ");
		String name = sc.nextLine();
		System.out.println("���̸� �Է��ϼ��� : ");
		int age = sc.nextInt();
		sc.nextLine();
		System.out.println("������ �Է��ϼ���(M/F)  : ");
		char gender = sc.nextLine().charAt(0);
		lm.insertMember(new Member(name, age, gender, 0));
	}

	public void mainMenu() {
		boolean cont = true;
		do {
			System.out.println("====== �޴� ======");
			System.out.println("1. ����������");
			System.out.println("2. ���� ��ü ��ȸ");
			System.out.println("3. ���� �˻�");
			System.out.println("4. ���� �뿩�ϱ�");
			System.out.println("9. ���α׷� �����ϱ�");
			System.out.println("================");
			System.out.println("���Ͻô� ��ȣ�� �Է��ϼ��� : ");
			int input = sc.nextInt();
			sc.nextLine();
			switch (input) {
			case 1:
				System.out.println(lm.myPage());
				lm.rentList();
				break;
			case 2:
				selectAll();
				break;
			case 3:
				searchBook();
				break;
			case 4:
				rentBook();
				break;
			case 9:
				cont = false;
				break;
			default:
				System.out.println("�߸��Է��ϼ̽��ϴ�. �ٽ� �Է����ּ���.");
				break;
			}
		} while (cont);
		System.out.println("���α׷� ����");
	}

	public void selectAll() {
		Book[] bList = lm.selectAll();

		System.out.println("=====================���� ���=====================");
		for (int i = 0; i < bList.length; i++) {
			System.out.println((i + 1) + "�� ���� : " + bList[i].toString());
		}
		System.out.println("================================================");
	}

	// �� �ڵ�

	// public void searchBook() {
	// System.out.println("�˻��Ͻ� å ������ �Է��� �ּ��� : ");
	// String search = sc.nextLine();
	// Book[] searchList = lm.searchBook(search);
	// for (int i = 0; i < searchList.length; i++) {
	// System.out.println((i + 1) + "��° - " + searchList[i].getTitle());
	// }
	// }

	public void searchBook() {

		System.out.println("�˻��Ͻ� å ������ �Է��� �ּ��� : ");
		String search = sc.nextLine();
		Book[] searchList = lm.searchBook(search);

		for (int i = 0; i < searchList.length; i++) {
			try {
				System.out.println(i + "��° - " + searchList[i].getTitle());

			} catch (NullPointerException e) {
			} finally {
				System.out.println("������ ����");
			}
		}
	}

	public void rentBook() {
		selectAll();
		System.out.println("��� ������ �뿩�ұ��? : ");
		int index = lm.rentBook(sc.nextInt() - 1);
		sc.nextLine();
		if (index == 0) {
			System.out.println("���������� �뿩 �Ǿ����ϴ�.");
		} else if (index == 1) {
			System.out.println("������������ �뿩 �Ұ����Դϴ�.");
		} else if (index == 2) {
			System.out.println("���������� �뿩�Ǿ����ϴ�. �丮�п� ������ �߱޵Ǿ����ϴ�.");
			System.out.println("�������������� Ȯ���ϼ���");
		}
	}
}
