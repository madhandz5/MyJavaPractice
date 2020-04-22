package com.kh.object.encapsulation;

public class KookbobDreeper {

	// * 1. 추상화
	// * - 프로그램에서 필요한 공통적인 기능 및 속성들을 추출하고
	// * - 불필요한 것들을 제거하는 과정
	// * - 구현하고자 하는 프로그램이 어떤 프로그램이고, 어떤 목적을 가지고 만드는지
	// * - 잘 생각해야 한다. 기능이 먼저 있고, 속성이 있다.

	// * 2. 캡슐화
	// * - 클래스 내부의 멤버변수(필드) 에 클래스 밖에서 접근하지 못하게 하는
	// * - 멤버변수에 private를 선언하는 것이 원칙이다.
	// * - 멤버 변수의 값이 우리가 정한 의미를 벗어나는 것을 getter / setter 메서드로 제어한다.

	private String foodName;
	private int foodPrice;
	private final static int KOOKBOBPRICE = 5000;

	public KookbobDreeper() {

	}

	// 생성자도 오버로딩이 가능하다.
	public KookbobDreeper(String foodName, int foodPrice) {

		this.foodName = foodName;
		this.foodPrice = foodPrice;
	}

	public String getFoodName() {
		return foodName;
	}

	public void setFoodName(String foodName) {
		this.foodName = foodName;
	}

	public int getFoodPrice() {
		return foodPrice;
	}

	public void setFoodPrice(int foodPrice) {
		this.foodPrice = foodPrice;
	}

	public void dreep() {
		int kookBobCnt = foodPrice / KOOKBOBPRICE;
		if (kookBobCnt == 0) {
			kookBobCnt = 1;
		}
		System.out.println("뭐" + foodName + "?" + foodName + "??" + "\n 그 돈주고" + foodName + "먹을 바에야 뜨끈한 국밥" + kookBobCnt
				+ "그릇, 든든히 먹고말지");

	}

}
