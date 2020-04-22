package com.kh.model.vo;

public class Father extends Family implements Playable, Playable4 {

	private Baby baby = new Baby("홍길동", 1.0, 10, "20200113", 10);

	public Father() {
	}

	public Father(String name, double weight, int health) {
		super(name, weight, health);
	}

	@Override
	public void eat() {
		// 아빠는 밥을 먹으면 몸무게 + 2
		// 건강도 + 5
		System.out.println("아빠는 잠을 자면 몸무게 +2");

		setWeight(getWeight() + 2);
		System.out.println("아빠는 잠을 자면 건강도  +5");

		setHealth(getHealth() + 5);
	}

	@Override
	public void sleep() {
		// 아빠는 잠을 자면 몸무게 -3
		// 아빠는 잠을 자면 건강도 + 10
		System.out.println("아빠는 잠을 자면 몸무게 -3");
		setWeight(getWeight() - 3);
		System.out.println("아빠는 잠을 자면 건강도 + 10");
		setHealth(getHealth() + 10);
	}

	@Override
	public String toString() {
		return super.toString() + "Father [baby=" + baby + "]";
	}

	@Override
	public void play() {
		System.out.println("아빠가 놀아주면 아기의 행복지수 + 10");
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
