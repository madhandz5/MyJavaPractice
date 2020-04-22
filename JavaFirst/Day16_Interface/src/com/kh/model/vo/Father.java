package com.kh.model.vo;

public class Father extends Family implements Playable, Playable4 {

	private Baby baby = new Baby("ȫ�浿", 1.0, 10, "20200113", 10);

	public Father() {
	}

	public Father(String name, double weight, int health) {
		super(name, weight, health);
	}

	@Override
	public void eat() {
		// �ƺ��� ���� ������ ������ + 2
		// �ǰ��� + 5
		System.out.println("�ƺ��� ���� �ڸ� ������ +2");

		setWeight(getWeight() + 2);
		System.out.println("�ƺ��� ���� �ڸ� �ǰ���  +5");

		setHealth(getHealth() + 5);
	}

	@Override
	public void sleep() {
		// �ƺ��� ���� �ڸ� ������ -3
		// �ƺ��� ���� �ڸ� �ǰ��� + 10
		System.out.println("�ƺ��� ���� �ڸ� ������ -3");
		setWeight(getWeight() - 3);
		System.out.println("�ƺ��� ���� �ڸ� �ǰ��� + 10");
		setHealth(getHealth() + 10);
	}

	@Override
	public String toString() {
		return super.toString() + "Father [baby=" + baby + "]";
	}

	@Override
	public void play() {
		System.out.println("�ƺ��� ����ָ� �Ʊ��� �ູ���� + 10");
		baby.setHappyPoint(baby.getHappyPoint() + 10);
		setHealth(getHealth() - 5);
		int num = (int) (Math.random() * 4) + 1;
		if (num < 4) {
			baby.smile(this);
		}
	}

	@Override
	public void play2() {

	}

	@Override
	public void play3() {

	}

	@Override
	public void play4() {
	}

}
