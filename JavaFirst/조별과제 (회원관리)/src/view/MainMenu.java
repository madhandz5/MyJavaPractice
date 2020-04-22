package view;

import java.util.Scanner;

import controller.Manager;
import model.vo.Adult;
import model.vo.Student;

public class MainMenu {

	Scanner scanner = new Scanner(System.in);
	Manager mm = new Manager();

	public void mainMenu() {
		System.out.println("이름을 입력하세요 : ");
		String name = scanner.nextLine();
		System.out.println("나이를 입력하세요 : ");
		int age = scanner.nextInt();

		if (age < 20) {
			mm.insertMember(new Student(name, age, 15000, 0, 0, 0, 5));

		} else {
			mm.insertMember(new Adult(name, age, 50000, 0, 0, 0, 3));
		}
		mm.welcomeMessage();
		boolean cont = true;
		do {
			System.out.println("-----메뉴------");
			System.out.println("1. 마이페이지");
			System.out.println("2. 상품 구매");
			System.out.println("3. 행운의 게임 하기");
			System.out.println("5. 구매 내역보기");
			System.out.println("9. 종료");
			System.out.println("-------------");
			System.out.println("메뉴 선택  : ");
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
		System.out.println("안녕히가세요");

	}

	public void showMember() {
		mm.showMember();
	}

	public void buyProduct() {
		mm.showProduct();
		System.out.println("몇번 상품을 구매 하시겠습니까?");
		int input = scanner.nextInt();
		scanner.nextLine();
		char result = mm.buyProduct(input - 1);
		if (result == 'n') {
			System.out.println("성인만 구매가 가능한 상품입니다.");
		} else if (result == 'y') {
			System.out.println("상품이 정상적으로 구매되었습니다.\n쿠폰이 1장 적립되었습니다.");
		} else if (result == 's') {
			System.out.println("죄송합니다. 해당 상품의 재고가 없습니다.");
		} else {
			System.out.println("잔액이 부족합니다.");
		}
	}

	public void openLuckyBox() {
		mm.openLuckyBox();
	}

	public void showBuyList() {
		mm.showBuyList();
	}

}
