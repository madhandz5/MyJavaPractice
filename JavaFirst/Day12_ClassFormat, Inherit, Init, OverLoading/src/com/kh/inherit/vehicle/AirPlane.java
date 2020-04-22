package com.kh.inherit.vehicle;

public class AirPlane extends Vehicle {

	private int tire; // 바퀴 개수
	private int wing; // 날개 개수

	public AirPlane() {
		super();
	}

	public AirPlane(String name, double mileage, String kind, int tire, int wing) {
		super(name, mileage, kind);
		this.tire = tire;
		this.wing = wing;
	}

	public int getTire() {
		return tire;
	}

	public void setTire(int tire) {
		this.tire = tire;
	}

	public int getWing() {
		return wing;
	}

	public void setWing(int wing) {
		this.wing = wing;
	}

	@Override
	public String toString() {
		return super.toString() + "AirPlane [tire=" + tire + ", wing=" + wing + "]";
	}

}