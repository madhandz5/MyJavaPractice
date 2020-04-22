package com.kh.inherit.vehicle;

public class Car extends Vehicle {

	private int tire; // ¹ÙÄû °³¼ö

	public Car() {
		super();
	}

	public Car(String name, double mileage, String kind, int tire) {
		super(name, mileage, kind);
		this.tire = tire;
	}

	public int getTire() {
		return tire;
	}

	public void setTire(int tire) {
		this.tire = tire;
	}

	@Override
	public String toString() {
		return super.toString() + "Car [tire=" + tire + "]";
	}

}
