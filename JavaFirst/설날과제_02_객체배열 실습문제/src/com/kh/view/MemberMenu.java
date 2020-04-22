package com.kh.view;

import java.util.Scanner;

import com.kh.controller.MemberController;
import com.kh.model.vo.Member;

public class MemberMenu {

	MemberController mc = new MemberController();
	Scanner sc = new Scanner(System.in);

	public void mainMenu() {
		while (true) {
			System.out.println("====== ȸ�� ���� �޴� ======");
			System.out.println("1. �ű� ȸ�� ���");
			System.out.println("2. ȸ�� ���� �˻�");
			System.out.println("3. ȸ�� ���� ����");
			System.out.println("4. ȸ�� ���� ����");
			System.out.println("5. ȸ�� ���� ���");
			System.out.println("6. ȸ�� ���� ����");
			System.out.println("9. ���α׷� ����");
			System.out.println("========================");
			System.out.println("��ȣ �Է� : ");
			int input = sc.nextInt();
			sc.nextLine();
			switch (input) {
			case 1:
				insertMember();
				break;
			case 2:
				searchMember();
				break;
			case 3:
				updateMember();
				break;
			case 4:
				deleteMember();
				break;
			case 5:
				printAllMember();
				break;
			case 6:
				sortMember();
				break;
			case 9:
				System.out.println("���α׷��� �����մϴ�.");
				System.exit(0);
				break;
			default:
				break;
			}
		}
	}

	public void insertMember() {
		if (mc.getMemberCount() == mc.SIZE) {
			System.out.println("�ִ� ȸ������ �����Ͽ����ϴ�.");
			return;
		}
		System.out.println("���̵�: ");
		String userId = sc.nextLine();
		if (mc.checkId(userId) != null) {
			System.out.println("������ ���̵� �����մϴ�. ȸ����� ����");
			return;
		}
		System.out.println("��й�ȣ : ");
		String pw = sc.nextLine();
		System.out.println("�̸� : ");
		String name = sc.nextLine();
		System.out.println("���� : ");
		int age = sc.nextInt();
		sc.nextLine();
		System.out.println("���� : ");
		char gender = sc.next().charAt(0);
		sc.nextLine();
		System.out.println("�̸��� : ");
		String eMail = sc.nextLine();

		mc.insertMember(new Member(userId, pw, name, age, gender, eMail));
		System.out.println("���������� ȸ������� �Ϸ�Ǿ����ϴ�.");
	}

	public void searchMember() {
		Member searchMember = null;
		System.out.println("====== ȸ�� ���� �˻� ======");
		System.out.println("1. ���̵�� �˻��ϱ�");
		System.out.println("2. �̸����� �˻��ϱ�");
		System.out.println("3. �̸��Ϸ� �˻��ϱ�");
		System.out.println("9. ���� �޴���");
		System.out.println("========================");
		System.out.println("�޴� ���� : ");
		int menu = sc.nextInt();
		sc.nextLine();
		switch (menu) {
		case 1:
			System.out.println("���̵� �˻� : ");
			String userId = sc.nextLine();
			searchMember = mc.searchMember(menu, userId);
			if (searchMember != null) {
				System.out.println(searchMember.information());
			} else {
				System.out.println("�˻��� ����� �����ϴ�.");
				break;
			}
			break;
		case 2:
			System.out.println("�̸� �˻� : ");
			String name = sc.nextLine();
			searchMember = mc.searchMember(menu, name);
			if (searchMember != null) {
				System.out.println(searchMember.information());
			} else {
				System.out.println("�˻��� ����� �����ϴ�.");
				break;
			}
			break;
		case 3:
			System.out.println("�̸��� �˻� : ");
			String eMail = sc.nextLine();
			searchMember = mc.searchMember(menu, eMail);
			if (searchMember != null) {
				System.out.println(searchMember.information());
			} else {
				System.out.println("�˻��� ����� �����ϴ�.");
				break;
			}
			break;
		case 9:
			System.out.println("�����޴��� ���ư��ϴ�.");
			mainMenu();
			return;
		default:
			break;
		}
	}

	public void updateMember() {
		System.out.println("====== ȸ�� ���� �˻� ======");
		System.out.println("1. ��й�ȣ ����");
		System.out.println("2. �̸� ����");
		System.out.println("3. �̸��� ����");
		System.out.println("9. ���� �޴���");
		System.out.println("========================");
		System.out.println("�޴� ���� : ");
		int menu = sc.nextInt();
		sc.nextLine();
		System.out.println("������ ���̵� : ");
		String userId = sc.nextLine();
		Member m = mc.checkId(userId);

		switch (menu) {
		case 1:
			if (m == null) {
				System.out.println("������ ȸ���� �������� �ʽ��ϴ�.");
			} else {
				System.out.println("������ ��й�ȣ : ");
				String update = sc.nextLine();
				mc.updateMember(m, menu, update);
			}
			break;
		case 2:
			if (m == null) {
				System.out.println("������ ȸ���� �������� �ʽ��ϴ�.");
			} else {
				System.out.println("������ �̸� : ");
				String update = sc.nextLine();
				mc.updateMember(m, menu, update);
			}
			break;
		case 3:
			if (m == null) {
				System.out.println("������ ȸ���� �������� �ʽ��ϴ�.");
			} else {
				System.out.println("������ �̸��� : ");
				String update = sc.nextLine();
				mc.updateMember(m, menu, update);
			}
			break;
		case 9:
			System.out.println("�����޴��� ���ư��ϴ�.");
			mainMenu();
			return;
		default:
			System.out.println("�߸� �Է��߽��ϴ�. ���� �޴��� ���ư��ϴ�.");
			mainMenu();
			return;
		}

	}

	public void deleteMember() {
		System.out.println("������ ȸ�� ���̵� : ");
		String userId = sc.nextLine();
		Member mem = mc.checkId(userId);
		if (mem == null) {
			System.out.println("������ ȸ���� �������� �ʽ��ϴ�.");
		} else {
			mem.information();
			System.out.println("���� �����Ͻðڽ��ϱ�? (y/n) :");
			int select = sc.next().charAt(0);
			sc.nextLine();
			if (select == 'y' || select == 'Y') {
				mc.deleteMember(userId);
				System.out.println("ȸ�� ������ �����Ǿ����ϴ�.");
			} else {
				System.out.println("�޴��� ���ư��ϴ�.");
				mainMenu();
				return;
			}

		}

	}

	public void printAllMember() {
		Member[] mem = mc.getMem();
		for (int i = 0; i < mem.length; i++) {
			if (mem[i] != null) {
				System.out.println(mem[i].information());
			} else {
				break;
			}
		}
	}

	public void sortMember() {
		Member[] sortMem = null;
		while (true) {
			System.out.println("====== ȸ�� ���� ���� ======");
			System.out.println("1. ���̵� �������� ����");
			System.out.println("2. ���̵� �������� ����");
			System.out.println("3. ���� �������� ����");
			System.out.println("4. ���� �������� ����");
			System.out.println("5. ���� �������� ����(������)");
			System.out.println("9. ���� �޴���");
			System.out.println("========================");
			System.out.println("�޴� ���� : ");
			int menu = sc.nextInt();
			sc.nextLine();

			switch (menu) {
			case 1:
				sortMem = mc.sortIdAsc();
				break;
			case 2:
				sortMem = mc.sortIdDesc();
				break;
			case 3:
				sortMem = mc.sortAgeAsc();
				break;
			case 4:
				sortMem = mc.sortAgeDesc();
				break;
			case 5:
				sortMem = mc.sortGenderDesc();
				break;
			case 9:
				System.out.println("�����޴��� ���ư��ϴ�.");
				mainMenu();
				return;
			default:
				System.out.println("�߸� �Է��Ͽ����ϴ�. �ٽ� �Է��� �ּ���.");
				break;
			}
			for (int i = 0; i < mc.getMemberCount(); i++) {
				if (sortMem != null) {
					System.out.println(sortMem[i].information());
				}
			}
		}
	}
}
