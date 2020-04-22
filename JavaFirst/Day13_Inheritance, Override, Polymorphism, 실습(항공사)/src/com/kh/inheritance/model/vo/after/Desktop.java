package com.kh.inheritance.model.vo.after;

public class Desktop extends Computer {

	private boolean allInOne;

	public Desktop() {

	}

	public Desktop(String brand, String pCode, String pName, int price, String cpu, int hdd, int ram, String os,
			boolean allInOne) {
		super(brand, pCode, pName, price, cpu, hdd, ram, os);
		this.allInOne = allInOne;
	}

	public boolean isAllInOne() {
		return allInOne;
	}

	public void setAllInOne(boolean allInOne) {
		this.allInOne = allInOne;
	}

	@Override
	public String information() {
		return super.information() + ", allInOne : " + allInOne;
	}
}
