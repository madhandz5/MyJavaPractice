package com.kh.inherit.vehicle;

public class Ship extends Vehicle {

	private int propellor; // 프로펠러 개수

	public Ship() {
		super();
	}

	public Ship(String name, double mileage, String kind, int propellor) {
		super(name, mileage, kind);
		this.propellor = propellor;
	}

	public int getPropellor() {
		return propellor;
	}

	public void setPropellor(int propellor) {
		this.propellor = propellor;
	}

	@Override
	public String toString() {
		return super.toString() + "Ship [propellor=" + propellor + "]";
	}

}
