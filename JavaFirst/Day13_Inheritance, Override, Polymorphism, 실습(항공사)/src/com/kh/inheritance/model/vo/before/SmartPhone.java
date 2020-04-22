package com.kh.inheritance.model.vo.before;

public class SmartPhone {

	private String brand; // ������
	private String pCode; // ��ǰ�ڵ�
	private String pName; // ��ǰ��
	private int price; // ����

	private String cpu; // cpu
	private int hdd; // hdd
	private int ram; // ram
	private String os; // �ü��

	private String mobileAgency; // ��Ż�

	public SmartPhone(String brand, String pCode, String pName, int price, String cpu, int hdd, int ram, String os,
			String mobileAgency) {
		super();
		this.brand = brand;
		this.pCode = pCode;
		this.pName = pName;
		this.price = price;
		this.cpu = cpu;
		this.hdd = hdd;
		this.ram = ram;
		this.os = os;
		this.mobileAgency = mobileAgency;
	}

	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	public String getpCode() {
		return pCode;
	}

	public void setpCode(String pCode) {
		this.pCode = pCode;
	}

	public String getpName() {
		return pName;
	}

	public void setpName(String pName) {
		this.pName = pName;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public String getCpu() {
		return cpu;
	}

	public void setCpu(String cpu) {
		this.cpu = cpu;
	}

	public int getHdd() {
		return hdd;
	}

	public void setHdd(int hdd) {
		this.hdd = hdd;
	}

	public int getRam() {
		return ram;
	}

	public void setRam(int ram) {
		this.ram = ram;
	}

	public String getOs() {
		return os;
	}

	public void setOs(String os) {
		this.os = os;
	}

	public String getMobileAgency() {
		return mobileAgency;
	}

	public void setMobileAgency(String mobileAgency) {
		this.mobileAgency = mobileAgency;
	}

	public String information() {

		return "Smartphone [brand = " + brand + ", pCode = " + pCode + ", pName = " + pName + ", price = " + price
				+ ", cpu = " + cpu + ", hdd = " + hdd + ", ram = " + ram + ", os = " + os + ", mobileAgency = "
				+ mobileAgency + "]";

	}

}
