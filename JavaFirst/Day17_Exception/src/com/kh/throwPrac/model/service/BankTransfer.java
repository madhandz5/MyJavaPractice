package com.kh.throwPrac.model.service;

import com.kh.myException.MyException;

public class BankTransfer {

	private Account[] accounts = new Account[] { new Account("a1", "12345", 123456, "ȫ�浿", 10000000),
			new Account("a2", "54321", 654321, "�Ӳ���", 100000) };

	private Account userAccount = new Account();

	// throws : �޼��� �ȿ��� �߻��� ���ܸ� �� �޼��带 ȣ���� �޼��忡�� ������.
	// throw : �Ϻη� ������ �߻���ų�� ����Ѵ�.
	// throw new (Exception �̸�)
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
		System.out.println(money + "���� ���� �ԱݵǾ�, ���� �ܾ��� " + userAccount.getBalance() + "�� �Դϴ�.");
	}

	public void withDraw(int money) throws MyException {
		if (userAccount.getBalance() >= money) {
			userAccount.setBalance(userAccount.getBalance() - money);
			System.out.println(money + "���� ���� ��ݵǾ�, ���� �ܾ��� " + userAccount.getBalance() + "�� �Դϴ�.");
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
			System.out.println(name + "�Կ��� " + money + "���� ���� ��ü�Ǿ����ϴ�.");
			System.out.println(money + "���� ���� ��ü�Ǿ�, " + userAccount.getName() + "���� ���� �ܾ��� " + userAccount.getBalance()
					+ "�� �Դϴ�.");
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
