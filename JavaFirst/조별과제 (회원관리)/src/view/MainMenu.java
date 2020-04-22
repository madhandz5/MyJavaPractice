package view;

import java.util.Scanner;

import controller.Manager;
import model.vo.Adult;
import model.vo.Student;

public class MainMenu {

	Scanner scanner = new Scanner(System.in);
	Manager mm = new Manager();

	public void mainMenu() {
		System.out.println("�̸��� �Է��ϼ��� : ");
		String name = scanner.nextLine();
		System.out.println("���̸� �Է��ϼ��� : ");
		int age = scanner.nextInt();

		if (age < 20) {
			mm.insertMember(new Student(name, age, 15000, 0, 0, 0, 5));

		} else {
			mm.insertMember(new Adult(name, age, 50000, 0, 0, 0, 3));
		}
		mm.welcomeMessage();
		boolean cont = true;
		do {
			System.out.println("-----�޴�------");
			System.out.println("1. ����������");
			System.out.println("2. ��ǰ ����");
			System.out.println("3. ����� ���� �ϱ�");
			System.out.println("5. ���� ��������");
			System.out.println("9. ����");
			System.out.println("-------------");
			System.out.println("�޴� ����  : ");
			int select = scanner.nextInt();
			scanner.nextLine();
			switch (select) {
			case 1:
				showMember();
				break;
			case 2:
				buyProduct();
				break;
			case 3:
				openLuckyBox();
				break;
			case 5:
				showBuyList();
				break;
			case 9:
				cont = false;
				break;
			}
		} while (cont);
		System.out.println("�ȳ���������");

	}

	public void showMember() {
		mm.showMember();
	}

	public void buyProduct() {
		mm.showProduct();
		System.out.println("��� ��ǰ�� ���� �Ͻðڽ��ϱ�?");
		int input = scanner.nextInt();
		scanner.nextLine();
		char result = mm.buyProduct(input - 1);
		if (result == 'n') {
			System.out.println("���θ� ���Ű� ������ ��ǰ�Դϴ�.");
		} else if (result == 'y') {
			System.out.println("��ǰ�� ���������� ���ŵǾ����ϴ�.\n������ 1�� �����Ǿ����ϴ�.");
		} else if (result == 's') {
			System.out.println("�˼��մϴ�. �ش� ��ǰ�� ��� �����ϴ�.");
		} else {
			System.out.println("�ܾ��� �����մϴ�.");
		}
	}

	public void openLuckyBox() {
		mm.openLuckyBox();
	}

	public void showBuyList() {
		mm.showBuyList();
	}

}
