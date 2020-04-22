package com.kh.inheritance.model.vo.after;

public class SmartPhone extends Computer {

	private String mobileAgency; // Ελ½Ε»η

	public SmartPhone() {

	}

	public SmartPhone(String brand, String pCode, String pName, int price, String cpu, int hdd, int ram, String os,
			String mobileAgency) {
		super(brand, pCode, pName, price, cpu, hdd, ram, os);
		this.mobileAgency = mobileAgency;
	}

	public String getMobileAgency() {
		return mobileAgency;
	}

	public void setMobileAgency(String mobileAgency) {
		this.mobileAgency = mobileAgency;
	}

	@Override
	public String information() {
		return super.information() + ", mobileAgency : " + mobileAgency;
	}
}
