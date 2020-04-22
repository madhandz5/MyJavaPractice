package com.kh.inheritance.model.vo.after;

public class Computer extends Product {

	private String cpu; // cpu
	private int hdd; // hdd
	private int ram; // ram
	private String os; // 운영체제

	public Computer() {

	}

	public Computer(String brand, String pCode, String pName, int price, String cpu, int hdd, int ram, String os) {
		super(brand, pCode, pName, price);
		this.cpu = cpu;
		this.hdd = hdd;
		this.ram = ram;
		this.os = os;
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

	@Override
	public String information() {
		return super.information() + ", cpu = " + cpu + ", hdd = " + hdd + ", ram = " + ram + ", Os = " + os;
	}

}
