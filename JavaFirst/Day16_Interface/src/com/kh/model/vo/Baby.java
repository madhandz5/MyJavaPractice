package com.kh.model.vo;

public class Baby extends Family {

	private String birth; // ����
	private int happyPoint; // �ູ����

	public Baby() {
		super();
	}

	public Baby(String name, double weight, int health, String birth, int happyPoint) {
		super(name, weight, health);
		this.birth = birth;
		this.happyPoint = happyPoint;
	}

	public String getBirth() {
		return birth;
	}

	public void setBirth(String birth) {
		this.birth = birth;
	}

	public int getHappyPoint() {
		return happyPoint;
	}

	public void setHappyPoint(int happyPoint) {
		this.happyPoint = happyPoint;
	}

	@Override
	public String toString() {
		return super.toString() + "Baby [birth=" + birth + ", happyPoint=" + happyPoint + "]";
	}

	@Override
	public void eat() {
		// �Ʊ�� ���� ������ �����԰� +1
		// �ǰ����� + 10
		setWeight(getWeight() + 1);
		setHealth(getHealth() + 10);
	}

	@Override
	public void sleep() {
		// �Ʊ�� ���� �ڸ� ������ -2
		// �ǰ����� +8
		setWeight(getWeight() - 2);
		setHealth(getHealth() + 8);
	}

	public void smile(Father father) {
		System.out.println("�ƱⰡ �����ϴ�. �ƹ����� �ǰ��� + 20");
		father.setHealth(father.getHealth() + 20);
	}
}
