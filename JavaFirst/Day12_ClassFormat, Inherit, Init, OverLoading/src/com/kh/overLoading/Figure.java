package com.kh.overLoading;

public class Figure {

	public void area(Rectangle r) {
		System.out.println("�簢��");
		System.out.println("���� = " + r.getWidth());
		System.out.println("���� = " + r.getHeight());
		System.out.println("�簢���� ���� = " + r.getWidth() * r.getHeight());
	}

	public void area(Circle c) {
		System.out.println("��");
		System.out.println("�� ���� = " + c.getRadius());
		System.out.println("���� ���� =  " + c.getRadius() * c.getRadius() * Math.PI);
	}
}
