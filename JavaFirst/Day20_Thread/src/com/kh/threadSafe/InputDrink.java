package com.kh.threadSafe;

public class InputDrink {

	static String drinks = "";

	public synchronized String setting(String drink) {
		this.drinks = drink;
		System.out.println("InputDrink : " + "������  " + drink + " ä���.");
		return drinks;
	}

}
