package com.kh.object.encapsulation;

public class Account {

	private String name; // �̸�
	private String phoneNum; // ��ȭ��ȣ
	private String pwd; // ��й�ȣ
	private int bankCode; // �����ڵ�
	private int balance; // �ܾ�

	// ������ (Ŭ������ ��ü�� ������ �� �ʿ��� ��)
	public Account() {

	}

	// �Ű������� �ִ� ������(Ŭ������ ��ü�� ������ �� �ʿ��� ��)
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

	// 10 : ����
	// 20 : �츮����
	// 30 : �������
	public int getBankCode() {
		return bankCode;
	}

	public void setBankCode(int bankCode) {
		if (bankCode == 10 || bankCode == 20 || bankCode == 30) {
			this.bankCode = bankCode;
		} else {
			System.out.println("��Ȯ�� �����ڵ带 �Է����ּ���");
		}
	}

	public int getBalance() {
		return balance;
	}

	public void setBalance(int balance) {
		this.balance = balance;
	}

	// �Ա��� ���� �޼���
	public void deposit(int money) {
		if (money > 0) {
			balance += money;
			System.out.println(name + "���� ���¿�" + money + "���� �ԱݵǾ����ϴ�.");
		} else {
			System.out.println("�߸��� �ݾ��� �ԱݵǾ����ϴ�.");
		}
	}

	// ����� ���� �޼���
	public void withDraw(int money) {
		if (money < balance) {
			balance -= money;
			System.out.println(name + "���� ���¿��� " + money + "���� ��ݵǾ����ϴ�.");
		} else {
			System.out.println("�ܾ��� �����մϴ�.");
		}
	}

	// �ܾ� ��ȸ�ϴ� �޼���
	public void displayBalance() {
		System.out.println(name + "���� ������ �ܾ��� " + balance + "�� �Դϴ�.");
	}

}
