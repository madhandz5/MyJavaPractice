package com.kh.model.vo;

public abstract class Duck {

	private String name;
	private String kinds;

	public Duck() {

	}

	public Duck(String name, String kinds) {
		this.name = name;
		this.kinds = kinds;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getKinds() {
		return kinds;
	}

	public void setKinds(String kinds) {
		this.kinds = kinds;
	}

	@Override
	public String toString() {
		return "���� " + kinds + "�̰�, �̸���" + name + "�Դϴ�.";
	}

	public abstract void quack();

}
