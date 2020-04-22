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
		products[0] = new Product("연필", 200, 3);
		products[1] = new Product("티슈", 300, 3);
		products[2] = new ForAdult("담배", 4500, 20, 3);
		products[3] = new Product("커피", 1000, 3);
		products[4] = new ForAdult("참이슬", 2700, 20, 3);

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
				"이름 : " + mem.getName() + "\n나이 : " + mem.getAge() + "\n현재 잔액 : " + mem.getMyMoney() + "\n총 구매 횟수 : "
						+ mem.getBuyCount() + "\n총 구매 금액 : " + mem.getMileage() + "\n쿠폰 갯수 : " + mem.getCouponCount());
	}

	public void showProduct() {

		for (int i = 0; i < products.length; i++) {
			System.out.println("상품번호 " + (i + 1) + "\n" + products[i].toString());
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
			System.out.println("오늘의 남은 기회 : " + mem.getOpenChance());
			int num = 0;
			if (mem instanceof Student) {
				System.out.println("1부터 3까지의 숫자를 고르세요, 맞추면 쿠폰 1장이 지급됩니다.");
				num = scanner.nextInt();
				scanner.nextLine();
				mem.setOpenChance(mem.getOpenChance() - 1);
				((Student) mem).openLuckyBox(num);

			} else if (mem instanceof Adult) {
				System.out.println("1부터 5까지의 숫자를 고르세요, 맞추면 쿠폰 1장이 지급됩니다.");
				num = scanner.nextInt();
				scanner.nextLine();
				mem.setOpenChance(mem.getOpenChance() - 1);
				((Adult) mem).openLuckyBox(num);
			}
		} else {
			System.out.println("오늘 기회가 모두 소진되었습니다. 내일 다시 도전하세요");
		}
		checkMemberShip();
	}

	public void showBuyList() {
		int totalBuyMoney = 0;
		boolean buy = false;
		for (int i = 0; i < buyList.length; i++) {
			if (buyList[i] != null) {
				System.out.println((i + 1) + "번째 " + buyList[i].getpName());
				totalBuyMoney += buyList[i].getpPrice();
				buy = true;
			} else {
				break;
			}
		}
		if (!buy) {
			System.out.println("아직 구매내역이 없습니다.");
		}
		System.out.println("총 구매 물품 : " + buyListCount + " 개");
		System.out.println("총 구매 금액 : " + totalBuyMoney + "원");
	}

	public void checkMemberShip() {
		if (mem.getCouponCount() > 9) {
			System.out.println("축하합니다. 쿠폰 갯수가 " + mem.getCouponCount() + "개가 되어 VIP회원이 되셨습니다. 더욱 빡씨게 이용해주세요~");
		}
	}
}
