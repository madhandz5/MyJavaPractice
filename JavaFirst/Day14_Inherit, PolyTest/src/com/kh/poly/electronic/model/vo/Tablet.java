package com.kh.poly.electronic.model.vo;

public class Tablet extends Electronic {

	private boolean penFlag;

	public Tablet() {
		super();
	}

	public Tablet(String brand, String name, int price, boolean penFlag) {
		super(brand, name, price);
		this.penFlag = penFlag;
	}

	public boolean isPenFlag() {
		return penFlag;
	}

	public void setPenFlag(boolean penFlag) {
		this.penFlag = penFlag;
	}

	@Override
	public String toString() {
		return "Tablet [penFlag=" + penFlag + "]";
	}

}
