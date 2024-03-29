package com.kh.inheritanceQuiz.vo;

public class Airline {

	private String country;
	private int mileage;
	private int airfare;

	public Airline() {

	}

	public Airline(String country, int mileage, int airfare) {
		this.country = country;
		this.mileage = mileage;
		this.airfare = airfare;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	public int getMileage() {
		return mileage;
	}

	public void setMileage(int mileage) {
		this.mileage = mileage;
	}

	public int getAirfare() {
		return airfare;
	}

	public void setAirfare(int airfare) {
		this.airfare = airfare;
	}
}
