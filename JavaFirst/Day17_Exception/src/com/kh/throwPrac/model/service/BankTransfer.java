package com.kh.throwPrac.model.service;

import com.kh.myException.MyException;

public class BankTransfer {

	private Account[] accounts = new Account[] { new Account("a1", "12345", 123456, "홍길동", 10000000),
			new Account("a2", "54321", 654321, "임꺽정", 100000) };

	private Account userAccount = new Account();

	// throws : 메서드 안에서 발생한 예외를 이 메서드를 호출한 메서드에게 던진다.
	// throw : 일부러 에러를 발생시킬때 사용한다.
	// throw new (Exception 이름)
	// ex) throw new MyException("f01");

	public Account login(String id, String pw) throws MyException {

		boolean err = true;
		for (int i = 0; i < accounts.length; i++) {
			if (accounts[i].getId().equals(id) && accounts[i].getPw().equals(pw)) {
				userAccount = accounts[i];
				err = false;
			}
		}
		if (err) {
			throw new MyException("f01");
		}
		return userAccount;
	}

	public Account userInfo() {
		return userAccount;
	}

	public void save(int money) {
		userAccount.setBalance(userAccount.getBalance() + money);
		System.out.println(money + "원이 정상 입금되어, 현재 잔액은 " + userAccount.getBalance() + "원 입니다.");
	}

	public void withDraw(int money) throws MyException {
		if (userAccount.getBalance() >= money) {
			userAccount.setBalance(userAccount.getBalance() - money);
			System.out.println(money + "원이 정상 출금되어, 현재 잔액은 " + userAccount.getBalance() + "원 입니다.");
		} else {
			throw new MyException("f02");
		}

	}

	public void transfer(int money, int accountNum) throws MyException {
		send(money);
		receive(accountNum, money);
		String name = "";
		for (int i = 0; i < accounts.length; i++) {
			if (accounts[i].getAccountNum() == accountNum) {
				name = accounts[i].getName();
			}
		}
		if (!name.isEmpty()) {
			System.out.println(name + "님에게 " + money + "원이 정상 이체되었습니다.");
			System.out.println(money + "원이 정상 이체되어, " + userAccount.getName() + "님의 현재 잔액은 " + userAccount.getBalance()
					+ "원 입니다.");
		}
	}

	private void send(int sendMoney) throws MyException {
		if (userAccount.getBalance() >= sendMoney) {
			userAccount.setBalance(userAccount.getBalance() - sendMoney);
		} else {
			throw new MyException("f02");
		}
	}

	private void receive(int accountNum, int receiveMoney) throws MyException {
		boolean err = true;
		for (int i = 0; i < accounts.length; i++) {
			if (accounts[i].getAccountNum() == accountNum) {
				accounts[i].setBalance(accounts[i].getBalance() + receiveMoney);
				err = false;
			}
		}
		if (err) {
			throw new MyException("f03");
		}
	}

	public void rollBack(int sendMoney) {

	}

}
