package com.kh.object.encapsulation;

public class Account {

	private String name; // 이름
	private String phoneNum; // 전화번호
	private String pwd; // 비밀번호
	private int bankCode; // 은행코드
	private int balance; // 잔액

	// 생성자 (클래스로 객체를 생성할 때 필요한 것)
	public Account() {

	}

	// 매개변수가 있는 생성자(클래스로 객체를 생성할 때 필요한 것)
	public Account(String name, String phoneNum, String pwd, int bankCode, int balance) {

		this.name = name;
		this.phoneNum = phoneNum;
		this.pwd = pwd;
		this.bankCode = bankCode;
		this.balance = balance;

	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPhoneNum() {
		return phoneNum;
	}

	public void setPhoneNum(String phoneNum) {
		this.phoneNum = phoneNum;
	}

	public String getPwd() {
		return pwd;
	}

	public void setPwd(String pwd) {
		this.pwd = pwd;
	}

	// 10 : 농협
	// 20 : 우리은행
	// 30 : 기업은행
	public int getBankCode() {
		return bankCode;
	}

	public void setBankCode(int bankCode) {
		if (bankCode == 10 || bankCode == 20 || bankCode == 30) {
			this.bankCode = bankCode;
		} else {
			System.out.println("정확한 은행코드를 입력해주세요");
		}
	}

	public int getBalance() {
		return balance;
	}

	public void setBalance(int balance) {
		this.balance = balance;
	}

	// 입금을 위한 메서드
	public void deposit(int money) {
		if (money > 0) {
			balance += money;
			System.out.println(name + "님의 계좌에" + money + "원이 입금되었습니다.");
		} else {
			System.out.println("잘못된 금액이 입금되었습니다.");
		}
	}

	// 출금을 위한 메서드
	public void withDraw(int money) {
		if (money < balance) {
			balance -= money;
			System.out.println(name + "님의 계좌에서 " + money + "원이 출금되었습니다.");
		} else {
			System.out.println("잔액이 부족합니다.");
		}
	}

	// 잔액 조회하는 메서드
	public void displayBalance() {
		System.out.println(name + "님의 계좌의 잔액은 " + balance + "원 입니다.");
	}

}
