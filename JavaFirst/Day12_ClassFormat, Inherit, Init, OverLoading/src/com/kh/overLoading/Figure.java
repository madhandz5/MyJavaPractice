package com.kh.overLoading;

public class Figure {

	public void area(Rectangle r) {
		System.out.println("사각형");
		System.out.println("가로 = " + r.getWidth());
		System.out.println("세로 = " + r.getHeight());
		System.out.println("사각형의 넓이 = " + r.getWidth() * r.getHeight());
	}

	public void area(Circle c) {
		System.out.println("원");
		System.out.println("반 지름 = " + c.getRadius());
		System.out.println("원의 넓이 =  " + c.getRadius() * c.getRadius() * Math.PI);
	}
}
