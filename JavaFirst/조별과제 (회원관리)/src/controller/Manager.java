package controller;

import java.util.Scanner;

import model.vo.Adult;
import model.vo.ForAdult;
import model.vo.Member;
import model.vo.Product;
import model.vo.Student;

public class Manager {
	Scanner scanner = new Scanner(System.in);
	private Member mem = null;
	private Product[] products = new Product[5];
	private Product[] buyList = new Product[100];
	private int buyListCount = 0;

	{
		products[0] = new Product("����", 200, 3);
		products[1] = new Product("Ƽ��", 300, 3);
		products[2] = new ForAdult("���", 4500, 20, 3);
		products[3] = new Product("Ŀ��", 1000, 3);
		products[4] = new ForAdult("���̽�", 2700, 20, 3);

	}

	public void insertMember(Member mem) {
		this.mem = mem;
	}

	public void welcomeMessage() {
		if (mem instanceof Student) {
			((Student) mem).basicCoupon();

		} else if (mem instanceof Adult) {
			((Adult) mem).basicCoupon();
		}
	}

	public void showMember() {
		System.out.println(
				"�̸� : " + mem.getName() + "\n���� : " + mem.getAge() + "\n���� �ܾ� : " + mem.getMyMoney() + "\n�� ���� Ƚ�� : "
						+ mem.getBuyCount() + "\n�� ���� �ݾ� : " + mem.getMileage() + "\n���� ���� : " + mem.getCouponCount());
	}

	public void showProduct() {

		for (int i = 0; i < products.length; i++) {
			System.out.println("��ǰ��ȣ " + (i + 1) + "\n" + products[i].toString());
		}
	}

	public char buyProduct(int index) {
		char result = 'n';

		if (products[index] instanceof ForAdult && mem.getAge() < ((ForAdult) products[index]).getAccessAge()) {
			result = 'n';
		} else if (mem.getMyMoney() > products[index].getpPrice()) {
			mem.setBuyCount(mem.getBuyCount() + 1);
			mem.setCouponCount(mem.getCouponCount() + 1);
			mem.setMyMoney(mem.getMyMoney() - products[index].getpPrice());
			mem.setMileage(mem.getMileage() + products[index].getpPrice());
			products[index].setStock(products[index].getStock() - 1);
			buyList[buyListCount] = new Product(products[index].getpName(), products[index].getpPrice(),
					products[index].getStock());
			buyListCount++;
			result = 'y';
		} else if (products[index].getStock() < 1) {
			result = 's';
		} else {
			result = 'm';
		}
		checkMemberShip();
		return result;
	}

	public void openLuckyBox() {
		if (mem.getOpenChance() > 0) {
			System.out.println("������ ���� ��ȸ : " + mem.getOpenChance());
			int num = 0;
			if (mem instanceof Student) {
				System.out.println("1���� 3������ ���ڸ� ������, ���߸� ���� 1���� ���޵˴ϴ�.");
				num = scanner.nextInt();
				scanner.nextLine();
				mem.setOpenChance(mem.getOpenChance() - 1);
				((Student) mem).openLuckyBox(num);

			} else if (mem instanceof Adult) {
				System.out.println("1���� 5������ ���ڸ� ������, ���߸� ���� 1���� ���޵˴ϴ�.");
				num = scanner.nextInt();
				scanner.nextLine();
				mem.setOpenChance(mem.getOpenChance() - 1);
				((Adult) mem).openLuckyBox(num);
			}
		} else {
			System.out.println("���� ��ȸ�� ��� �����Ǿ����ϴ�. ���� �ٽ� �����ϼ���");
		}
		checkMemberShip();
	}

	public void showBuyList() {
		int totalBuyMoney = 0;
		boolean buy = false;
		for (int i = 0; i < buyList.length; i++) {
			if (buyList[i] != null) {
				System.out.println((i + 1) + "��° " + buyList[i].getpName());
				totalBuyMoney += buyList[i].getpPrice();
				buy = true;
			} else {
				break;
			}
		}
		if (!buy) {
			System.out.println("���� ���ų����� �����ϴ�.");
		}
		System.out.println("�� ���� ��ǰ : " + buyListCount + " ��");
		System.out.println("�� ���� �ݾ� : " + totalBuyMoney + "��");
	}

	public void checkMemberShip() {
		if (mem.getCouponCount() > 9) {
			System.out.println("�����մϴ�. ���� ������ " + mem.getCouponCount() + "���� �Ǿ� VIPȸ���� �Ǽ̽��ϴ�. ���� ������ �̿����ּ���~");
		}
	}
}
