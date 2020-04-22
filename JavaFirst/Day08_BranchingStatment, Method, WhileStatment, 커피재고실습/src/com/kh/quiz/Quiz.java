package com.kh.quiz;

import java.util.Scanner;

public class Quiz {

	Scanner sc = new Scanner(System.in);

	public void quiz1() {

		// 프로그램이 시작되면 “커피재고를 입력하세요. 종료하려면 0을 입력 하세요 :” 안내창을 출력하고
		// 입고 할 커피재고를 사용자로부터 입력 받으세요.
		// 만약 커피재고를 0으로 입력할 경우 프로그램을 종료하세요.
		//
		// 재고 입고가 잘 이루어 지면 "고객이 몇 잔의 커피를 주문하였습니까?" 라는 안내문을 출력한 뒤
		// 고객이 주문한 커피 잔 수를 사용자로부터 입력 받아,
		// 가게 재고에서 고객이 주문한 커피 수량을 차감 시키세요.
		//
		// 재고가 0이 되면 "커피 재고가 부족합니다"
		// 안내문을 출력한 뒤 프로그램을 종료하세요.
		//
		// 고객이 주문한 커피 수량이 남은 재고보다 많을 경우
		// "주문량 보다 재고가 적습니다. 주문을 다시 받아 주세요."
		// 안내문을 출력한 뒤 프로그램을 종료하세요.
		//
		// 주문이 정상적으로 이루어 지면 "남은 커피 재고는 N 잔 입니다."
		// 형식으로 재고를 출력 해준 뒤 "고객이 몇 잔의 커피를 주문하였습니까?"
		// 안내창으로 돌아가세요.

		// 2단계
		// 주문량보다 재고가 적어서 프로그램이 종료되는 상황을
		// 다시 주문을 받는 코드로 수정하세요

		// 3단계
		// 재고가 0이되어서 "커피재고가 없습니다"를 출력하고, 프로그램이 종료되는 상황을
		// 커피 재고를 다시 입력 받게끔 코드를수정하세요.

		int jaego = 0;
		boolean empty = true;

		outer: do {
			if (empty) {
				System.out.println("커피 재고를 입력하세요. 종료하려면 0을 입력하세요.");
				jaego = sc.nextInt();
				System.out.println("----------------------------------");
				System.out.println("커피 재고 " + jaego + "개 입고 되었습니다.");
				System.out.println("----------------------------------");
				empty = false;

			} else {
				System.out.println("고객이 몇잔의 커피를 주문하였습니까?");
				int order = sc.nextInt();

				if (jaego < order) {
					System.out.println("-------------------------------------");
					System.out.println("주문량 보다 재고가 적습니다.주문을 다시 받아주세요.");
					System.out.println("현재 재고 : " + jaego + " 주문량 : " + order);
					System.out.println("-------------------------------------");
				} else if (jaego >= order) {
					jaego -= order;
					System.out.println("--------" + order + "잔 주문완료-----------");
					System.out.println("현재 재고는 " + jaego + " 입니다.");
					System.out.println("----------------------------");
					if (jaego == 0) {
						System.out.println("재고가 모두 소진되었습니다.");
						System.out.println("----------------------------");
						empty = true;
					}
				}

			}
		} while (!empty);
		System.out.println("프로그램 종료");

	}

	public void quiz1Answer() {
		// 프로그램이 시작되면 “커피재고를 입력하세요. 종료하려면 0을 입력 하세요 :” 안내창을 출력하고
		// 입고 할 커피재고를 사용자로부터 입력 받으세요.
		// 만약 커피재고를 0으로 입력할 경우 프로그램을 종료하세요.
		//
		// 재고 입고가 잘 이루어 지면 "고객이 몇 잔의 커피를 주문하였습니까?" 라는 안내문을 출력한 뒤
		// 고객이 주문한 커피 잔 수를 사용자로부터 입력 받아,
		// 가게 재고에서 고객이 주문한 커피 수량을 차감 시키세요.
		//
		// 재고가 0이 되면 "커피 재고가 부족합니다"
		// 안내문을 출력한 뒤 프로그램을 종료하세요.
		//
		// 고객이 주문한 커피 수량이 남은 재고보다 많을 경우
		// "주문량 보다 재고가 적습니다. 주문을 다시 받아 주세요."
		// 안내문을 출력한 뒤 프로그램을 종료하세요.
		//
		// 주문이 정상적으로 이루어 지면 "남은 커피 재고는 N 잔 입니다."
		// 형식으로 재고를 출력 해준 뒤 "고객이 몇 잔의 커피를 주문하였습니까?"
		// 안내창으로 돌아가세요.
		boolean rgx = false;
		int stock = 0;

		System.out.println("커피 재고를 입력하세요. 종료하려면 0을 입력하세요.");
		stock = sc.nextInt();

		if (stock == 0) {
			System.out.println("재고는 0개 이상 입력해주세요.");
		} else {
			rgx = true;
		}

		while (rgx) {
			System.out.println();
			System.out.println("고객이 몇잔의 커피를 주문하였습니까?");
			int sellCoffee = sc.nextInt();

			// 고객이 주문한 커피 수량보다 재고가 많은 경우
			if (stock >= sellCoffee) {
				// 고객이 주문한 커피 수량과 재고가 같은 경우
				if (stock == sellCoffee) {
					System.out.println("커피" + sellCoffee + "잔 판매하였습니다.");
					System.out.println("커피 재고가 없습니다.");
					stock -= sellCoffee;
					rgx = false;
				} else {
					System.out.println("커피" + sellCoffee + "잔 판매하였습니다.");
					stock -= sellCoffee;
					System.out.println("남은 커피 재고는 " + stock + "입니다.");
					System.out.println("-------------------------------");
				}
			}
			// 고객이 주문한 커피 수량이 재고보다 많은 경우
			else {
				System.out.println("주문량보다 재고가 적습니다.");
				System.out.println("주문을 다시 받아주세요.");
				rgx = false;
			}
		}
		System.out.println("프로그램이 종료 되었습니다.");
	}

	public void quiz1Answer2() {
		// 2단계
		// 주문량보다 재고가 적어서 프로그램이 종료되는 상황을
		// 다시 주문을 받는 코드로 수정하세요

		boolean rgx = false;
		int stock = 0;

		System.out.println("커피 재고를 입력하세요. 종료하려면 0을 입력하세요.");
		stock = sc.nextInt();

		if (stock == 0) {
			System.out.println("재고는 0개 이상 입력해주세요.");
		} else {
			rgx = true;
		}

		while (rgx) {
			System.out.println();
			System.out.println("고객이 몇잔의 커피를 주문하였습니까?");
			int sellCoffee = sc.nextInt();

			// 고객이 주문한 커피 수량보다 재고가 많은 경우
			if (stock >= sellCoffee) {
				// 고객이 주문한 커피 수량과 재고가 같은 경우
				if (stock == sellCoffee) {
					System.out.println("커피" + sellCoffee + "잔 판매하였습니다.");
					System.out.println("커피 재고가 없습니다.");
					stock -= sellCoffee;
					rgx = false;
				} else {
					System.out.println("커피" + sellCoffee + "잔 판매하였습니다.");
					stock -= sellCoffee;
					System.out.println("남은 커피 재고는 " + stock + "입니다.");
					System.out.println("-------------------------------");
				}
			}
			// 고객이 주문한 커피 수량이 재고보다 많은 경우
			else {
				System.out.println("주문량보다 재고가 적습니다.");
				System.out.println("주문을 다시 받아주세요.");
			}
		}
		System.out.println("프로그램이 종료 되었습니다.");
	}

	public void quiz1Answer3() {
		// 3단계
		// 재고가 0이되어서 "커피재고가 없습니다"를 출력하고, 프로그램이 종료되는 상황을
		// 커피 재고를 다시 입력 받게끔 코드를수정하세요.

		boolean rgx = false;
		boolean stockRgx = true;
		int stock = 0;

		do {

			if (stockRgx) {

				System.out.println("커피재고를 입력하세요. 종료하려면 0을 입력하세요");
				System.out.print("커피재고 : ");
				stock = sc.nextInt();

				if (stock > 0) {
					rgx = true;
					stockRgx = false;
					System.out.println("커피판매를 시작합니다.");
					System.out.println("------------------------------");
				} else {
					System.out.println("프로그램을 종료합니다.");
					break;
				}
			}

			if (rgx) {
				System.out.println();
				System.out.print("고객이 몇 잔의 커피를 주문하였습니까 ? :");
				int sellcoffee = sc.nextInt();

				if (stock >= sellcoffee) {

					if (stock - sellcoffee > 0) {

						stock -= sellcoffee;
						System.out.println("커피" + sellcoffee + "잔 판매하였습니다.");
						System.out.println("남은 커피 재고는 " + stock + "입니다.");
						System.out.println("------------------------------");

					} else {
						stock -= sellcoffee;
						System.out.println("커피" + sellcoffee + "잔 판매하였습니다.");
						System.out.println("커피재고가 없습니다.\n");
						// rgx = false;
						stockRgx = true;
					}

				} else {

					System.out.println("주문량 보다 재고가 적습니다.");
					System.out.println("주문을 다시 받아 주세요.");
					System.out.println("------------------------------");
					continue;
				}
			}

			// 프로그램 실행 순서와 다르게
			// 아래에서 재고를 입력 받는 것이 좋은 코드인지 생각해보기.

			/*
			 * if(!rgx) {
			 * 
			 * System.out.println("커피재고를 입력하세요. 종료하려면 0을 입력하세요");
			 * System.out.print("커피재고 : "); stock = sc.nextInt();
			 * 
			 * if(stock > 0) { rgx = true; System.out.println("커피판매를 시작합니다.");
			 * System.out.println("------------------------------"); }else {
			 * System.out.println("프로그램을 종료합니다."); } }
			 */

		} while (rgx);
	}

}
