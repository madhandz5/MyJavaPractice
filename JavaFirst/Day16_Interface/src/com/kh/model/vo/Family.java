package com.kh.model.vo;

public abstract class Family {

	private String name; // �̸�
	private double weight; // ����
	private int health; // �ǰ���

	public Family() {

	}

	public Family(String name, double weight, int health) {
		this.name = name;
		this.weight = weight;
		this.health = health;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getWeight() {
		return weight;
	}

	public void setWeight(double weight) {
		this.weight = weight;
	}

	public int getHealth() {
		return health;
	}

	public void setHealth(int health) {
		this.health = health;
	}

	@Override
	public String toString() {
		return "Family [name=" + name + ", weight=" + weight + ", health=" + health + "]";
	}

	// �Ļ�� ���� �Ҷ� �ǰ����� �����԰� �޶���

	public abstract void eat();

	public abstract void sleep();

}
