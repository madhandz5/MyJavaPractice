package com.kh.model.vo;

public class Baby extends Family {

	private String birth; // 생일
	private int happyPoint; // 행복지수

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
		// 아기는 밥을 먹으면 몸무게가 +1
		// 건강도는 + 10
		setWeight(getWeight() + 1);
		setHealth(getHealth() + 10);
	}

	@Override
	public void sleep() {
		// 아기는 잠을 자면 몸무게 -2
		// 건강도는 +8
		setWeight(getWeight() - 2);
		setHealth(getHealth() + 8);
	}

	public void smile(Father father) {
		System.out.println("아기가 웃습니다. 아버지의 건강도 + 20");
		father.setHealth(father.getHealth() + 20);
	}
}
