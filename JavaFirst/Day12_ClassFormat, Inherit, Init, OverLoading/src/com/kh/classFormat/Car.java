package com.kh.classFormat;

// * 1. 클래스
// * - [접근제한자][예약어] class 클래스
// * - 접근제한자 : public, default
// * - 예약어
// * - 1) abstract(객체생성이 불가능한 추상 클래스, 무조건 상속용)
// * - 2) final (자식 생성이 불가능한 클래스, 상속 불가능 클래스)

public class Car {

	// * 2. 멤버(필드)
	// * 멤버 종류
	// * - 멤버변수 초기화블록 생성자 메서드
	// * - 클래스에서 메서드 외부에 해당하는 것
	// * ->메서드 자체는 멤버이다. 메서드 내부는 지역이다.
	// * - 지역
	// * -1) 메서드 내부
	// * - 변수
	// * -1) 멤버(필드)변수(클래스변수, 인스턴스변수), 지역변수

	// * 3. 클래스 변수
	// * - 필드변수에 static 키워드를 붙이면 클래스 변수가 된다.
	// * - 해당 클래스로 만든 모든 인스턴스가 공유하는 변수이다.
	// * - 클래스 변수를 변경할 경우 해당 클래스로 만든 모든 인스턴스가 영향을 받게 된다.

	private static int maxSpeed;

	// * 4. 인스턴스 변수
	// * - nonStatic 인 변수를 인스턴스 변수라고 한다.
	// * - 인스턴스마다 독립적으로 가지고 있다.

	private String color;
	private int speed;

	// * 5. static 초기화 블럭
	// * - 클래스 변수의 값을 초기화 해준다.
	static {
		maxSpeed = 150;
	}

	// * 6. 초기화블럭
	// * - 인스턴스 변수를 초기화한다.
	// * - 클래스가 인스턴스화 되는 순간에 한번만 호출되어 변수의 값을 초기화 해준다.
	// * - 생성자보다 빨리 실행된다.
	{
		color = "red";
		speed = 0;
	}

	// * 7. 기본 생성자
	// * - 외부에서 생성자를 호출하면 클래스의 인스턴스가 heap 영역으로 올라간다.
	// * - 필드 변수의 값을 초기화 하는 용도로 사용한다.
	// * - 생성자를 작성하지 않을 경우 jvm이 자동으로 만들어준다.
	public Car() {
		super();
		this.color = "red";
	}

	// * 8. 매개변수가 있는 생성자
	// * - 생성자도 오버로딩이 가능하다.

	public Car(String color, int speed) {
		super();
		this.color = color;
		this.speed = speed;
	}

	public static int getMaxSpeed() {
		return maxSpeed;
	}

	public static void setMaxSpeed(int maxSpeed) {
		Car.maxSpeed = maxSpeed;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public int getSpeed() {
		return speed;
	}

	public void setSpeed(int speed) {
		this.speed = speed;
	}

	public void accelPedal() {

		if (getSpeed() < Car.maxSpeed - 10) {
			System.out.println("속도 올라갑니다.");
			setSpeed(getSpeed() + 10);
		} else {
			System.out.println("이미 최고 속도입니다.");
		}
	}

	public void brakePedal() {

		// * 9. 지역변수
		// * - 메서드 내에서 선언된 변수
		// * - 조건문이나 반복문 안에 선언된 것도(메서드 내부임으로) 지역변수이다.

		int slow = 10;
		if (getSpeed() - slow > 0) {
			System.out.println("속도가 줄어듭니다.");
			setSpeed(getSpeed() - 10);
		} else {
			setSpeed(0);
			System.out.println("멈췄습니다.");
		}
	}
}
