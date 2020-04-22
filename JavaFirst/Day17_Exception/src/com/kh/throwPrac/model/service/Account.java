package com.kh.throwPrac.model.service;

public class Account {

	private String id;
	private String pw;
	private int accountNum;
	private String name;
	private int balance;

	public Account() {

	}

	public Account(String id, String pw, int accountNum, String name, int balance) {
		this.id = id;
		this.pw = pw;
		this.accountNum = accountNum;
		this.name = name;
		this.balance = balance;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getPw() {
		return pw;
	}

	public void setPw(String pw) {
		this.pw = pw;
	}

	public int getAccountNum() {
		return accountNum;
	}

	public void setAccountNum(int accountNum) {
		this.accountNum = accountNum;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getBalance() {
		return balance;
	}

	public void setBalance(int balance) {
		this.balance = balance;
	}

	@Override
	public String toString() {
		return "Account [id=" + id + ", pw=" + pw + ", accountNum=" + accountNum + ", name=" + name + ", balance="
				+ balance + "]";
	}

}
