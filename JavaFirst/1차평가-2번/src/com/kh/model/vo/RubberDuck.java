package com.kh.model.vo;

public class RubberDuck extends Duck {

	public static final String PLACE = "����ȣ��";

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
		System.out.println(super.toString() + "�����Դ� " + weight + "kg �Դϴ�. ������ �� ���� ���� ���ؿ�.");
	}

}
