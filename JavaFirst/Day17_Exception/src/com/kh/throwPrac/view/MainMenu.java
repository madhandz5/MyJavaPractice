package com.kh.throwPrac.view;

import java.util.Scanner;

import com.kh.myException.MyException;
import com.kh.throwPrac.model.service.BankTransfer;

public class MainMenu {

	Scanner scanner = new Scanner(System.in);

	private BankTransfer bt = new BankTransfer();
	private boolean sessionFlag = true;

	public void bankFunction() {

		try {
			while (sessionFlag) {
				System.out.println("���̵� �Է��ϼ���");
				String id = scanner.nextLine();
				System.out.println("��й�ȣ�� �Է��ϼ���");
				String pw = scanner.nextLine();
				bt.login(id, pw);
				System.out.println(bt.userInfo().getName() + "�� ȯ���մϴ�.");
				System.out.println("���� �ܾ��� " + bt.userInfo().getBalance() + "�Դϴ�.");
				sessionFlag = false;

				while (true) {
					System.out.println("� ������ �����Ͻðڽ��ϱ�?");
					System.out.println("1. �Ա�");
					System.out.println("2. ���");
					System.out.println("3. �۱�");
					System.out.println("4. �α׾ƿ�");
					System.out.println("9. ���α׷� ����");

					System.out.println("-------------------");
					System.out.println("��޴��� �����Ұ��� ? ");
					int input = scanner.nextInt();
					scanner.nextLine();

					switch (input) {
					case 1:
						System.out.println("�󸶸� �Ա��Ͻðڽ��ϱ�?");
						int saveMoney = scanner.nextInt();
						scanner.nextLine();
						bt.save(saveMoney);
						break;
					case 2:
						System.out.println("�󸶸� ����Ͻðڽ��ϱ�?");
						int withMoney = scanner.nextInt();
						scanner.nextLine();
						bt.withDraw(withMoney);
						break;
					case 3:
						System.out.println("�۱��Ͻ� ���¹�ȣ�� �Է��ϼ��� :");
						int transAcNum = scanner.nextInt();
						scanner.nextLine();
						System.out.println("�۱��Ͻ� �ݾ��� �Է����ּ��� : ");
						int transMoney = scanner.nextInt();
						scanner.nextLine();
						bt.transfer(transMoney, transAcNum);
						break;
					case 4:
						sessionFlag = true;
						System.out.println("�α׾ƿ� �Ǿ����ϴ�.");
						break;
					case 9:
						System.out.println("���α׷� ����");
						return;
					}
				}
			}
		} catch (MyException e) {
			String msg = e.getMessage();

			switch (msg)

			{
			case "f01":
				System.out.println("���̵� ��й�ȣ�� Ʋ�Ƚ��ϴ�.");
				break;
			case "f02":
				System.out.println("�ܾ��� �����մϴ�.");
				break;
			case "f03":
				System.out.println("���¹�ȣ�� �������� �ʽ��ϴ�.");
				break;
			default:
				System.out.println("�˼����� ������ �߻��޽��ϴ�. �ý��� ����ڿ��� �����ϼ���.");
			}
		}
	}
}
