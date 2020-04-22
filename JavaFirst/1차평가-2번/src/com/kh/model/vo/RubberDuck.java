package com.kh.model.vo;

public class RubberDuck extends Duck {

	public static final String PLACE = "석촌호수";

	private int weight;

	public RubberDuck() {
		super();
		// TODO Auto-generated constructor stub
	}

	public RubberDuck(String name, String kinds, int weight) {
		super(name, kinds);
		this.weight = weight;
		// TODO Auto-generated constructor stub
	}

	@Override
	public void quack() {
		System.out.println(super.toString() + "몸무게는 " + weight + "kg 입니다. 하지만 전 말을 하지 못해요.");
	}

}
