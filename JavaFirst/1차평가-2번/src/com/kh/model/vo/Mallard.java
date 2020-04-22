package com.kh.model.vo;

public class Mallard extends Duck {

	private String location;
	private String color;

	public Mallard() {
		super();
	}

	public Mallard(String name, String kinds, String location, String color) {
		super(name, kinds);
		this.location = location;
		this.color = color;
		// TODO Auto-generated constructor stub
	}

	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	@Override
	public String toString() {
		return "Mallard [location=" + location + ", color=" + color + "]";
	}

	@Override
	public void quack() {
		System.out.println(super.toString() + "주 서식지는 " + location + "이며, 색상은 " + color + "입니다.");

	}

}
