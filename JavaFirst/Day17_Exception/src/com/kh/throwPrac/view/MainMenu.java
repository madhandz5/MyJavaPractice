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
				System.out.println("아이디를 입력하세요");
				String id = scanner.nextLine();
				System.out.println("비밀번호를 입력하세요");
				String pw = scanner.nextLine();
				bt.login(id, pw);
				System.out.println(bt.userInfo().getName() + "님 환영합니다.");
				System.out.println("현재 잔액은 " + bt.userInfo().getBalance() + "입니다.");
				sessionFlag = false;

				while (true) {
					System.out.println("어떤 업무를 수행하시겠습니까?");
					System.out.println("1. 입금");
					System.out.println("2. 출금");
					System.out.println("3. 송금");
					System.out.println("4. 로그아웃");
					System.out.println("9. 프로그램 종료");

					System.out.println("-------------------");
					System.out.println("어떤메뉴를 실행할가요 ? ");
					int input = scanner.nextInt();
					scanner.nextLine();

					switch (input) {
					case 1:
						System.out.println("얼마를 입금하시겠습니까?");
						int saveMoney = scanner.nextInt();
						scanner.nextLine();
						bt.save(saveMoney);
						break;
					case 2:
						System.out.println("얼마를 출금하시겠습니까?");
						int withMoney = scanner.nextInt();
						scanner.nextLine();
						bt.withDraw(withMoney);
						break;
					case 3:
						System.out.println("송금하실 계좌번호를 입력하세요 :");
						int transAcNum = scanner.nextInt();
						scanner.nextLine();
						System.out.println("송금하실 금액을 입력해주세요 : ");
						int transMoney = scanner.nextInt();
						scanner.nextLine();
						bt.transfer(transMoney, transAcNum);
						break;
					case 4:
						sessionFlag = true;
						System.out.println("로그아웃 되었습니다.");
						break;
					case 9:
						System.out.println("프로그램 종료");
						return;
					}
				}
			}
		} catch (MyException e) {
			String msg = e.getMessage();

			switch (msg)

			{
			case "f01":
				System.out.println("아이디나 비밀번호가 틀렸습니다.");
				break;
			case "f02":
				System.out.println("잔액이 부족합니다.");
				break;
			case "f03":
				System.out.println("계좌번호가 존재하지 않습니다.");
				break;
			default:
				System.out.println("알수없는 에러가 발생햇습니다. 시스템 담당자에게 문의하세요.");
			}
		}
	}
}
