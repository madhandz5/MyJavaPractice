package com.kh.abstractClass.poly.model.vo;

public class Child2 extends Parent {

	private int z;

	public Child2() {

	}

	public Child2(int x, int y, int z) {
		super(x, y);
		this.z = z;
	}

	@Override
	public String info() {
		return "�ι�° �ڽ��Դϴ�.";
	}
}
