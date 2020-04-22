package com.kh.inherit.vehicle;

public class Vehicle {
	private String name; // �̸�
	private double mileage; // ����
	private String kind; // ����

	public Vehicle() {

	}

	public Vehicle(String name, double mileage, String kind) {
		super();
		this.name = name;
		this.mileage = mileage;
		this.kind = kind;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getMileage() {
		return mileage;
	}

	public void setMileage(double mileage) {
		this.mileage = mileage;
	}

	public String getKind() {
		return kind;
	}

	public void setKind(String kind) {
		this.kind = kind;
	}

	@Override
	public String toString() {
		return "Vehicle [name=" + name + ", mileage=" + mileage + ", kind=" + kind + "]";
	}

}
