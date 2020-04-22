package com.kh.classFormat;

// * 1. Ŭ����
// * - [����������][�����] class Ŭ����
// * - ���������� : public, default
// * - �����
// * - 1) abstract(��ü������ �Ұ����� �߻� Ŭ����, ������ ��ӿ�)
// * - 2) final (�ڽ� ������ �Ұ����� Ŭ����, ��� �Ұ��� Ŭ����)

public class Car {

	// * 2. ���(�ʵ�)
	// * ��� ����
	// * - ������� �ʱ�ȭ��� ������ �޼���
	// * - Ŭ�������� �޼��� �ܺο� �ش��ϴ� ��
	// * ->�޼��� ��ü�� ����̴�. �޼��� ���δ� �����̴�.
	// * - ����
	// * -1) �޼��� ����
	// * - ����
	// * -1) ���(�ʵ�)����(Ŭ��������, �ν��Ͻ�����), ��������

	// * 3. Ŭ���� ����
	// * - �ʵ庯���� static Ű���带 ���̸� Ŭ���� ������ �ȴ�.
	// * - �ش� Ŭ������ ���� ��� �ν��Ͻ��� �����ϴ� �����̴�.
	// * - Ŭ���� ������ ������ ��� �ش� Ŭ������ ���� ��� �ν��Ͻ��� ������ �ް� �ȴ�.

	private static int maxSpeed;

	// * 4. �ν��Ͻ� ����
	// * - nonStatic �� ������ �ν��Ͻ� ������� �Ѵ�.
	// * - �ν��Ͻ����� ���������� ������ �ִ�.

	private String color;
	private int speed;

	// * 5. static �ʱ�ȭ ��
	// * - Ŭ���� ������ ���� �ʱ�ȭ ���ش�.
	static {
		maxSpeed = 150;
	}

	// * 6. �ʱ�ȭ��
	// * - �ν��Ͻ� ������ �ʱ�ȭ�Ѵ�.
	// * - Ŭ������ �ν��Ͻ�ȭ �Ǵ� ������ �ѹ��� ȣ��Ǿ� ������ ���� �ʱ�ȭ ���ش�.
	// * - �����ں��� ���� ����ȴ�.
	{
		color = "red";
		speed = 0;
	}

	// * 7. �⺻ ������
	// * - �ܺο��� �����ڸ� ȣ���ϸ� Ŭ������ �ν��Ͻ��� heap �������� �ö󰣴�.
	// * - �ʵ� ������ ���� �ʱ�ȭ �ϴ� �뵵�� ����Ѵ�.
	// * - �����ڸ� �ۼ����� ���� ��� jvm�� �ڵ����� ������ش�.
	public Car() {
		super();
		this.color = "red";
	}

	// * 8. �Ű������� �ִ� ������
	// * - �����ڵ� �����ε��� �����ϴ�.

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
			System.out.println("�ӵ� �ö󰩴ϴ�.");
			setSpeed(getSpeed() + 10);
		} else {
			System.out.println("�̹� �ְ� �ӵ��Դϴ�.");
		}
	}

	public void brakePedal() {

		// * 9. ��������
		// * - �޼��� ������ ����� ����
		// * - ���ǹ��̳� �ݺ��� �ȿ� ����� �͵�(�޼��� ����������) ���������̴�.

		int slow = 10;
		if (getSpeed() - slow > 0) {
			System.out.println("�ӵ��� �پ��ϴ�.");
			setSpeed(getSpeed() - 10);
		} else {
			setSpeed(0);
			System.out.println("������ϴ�.");
		}
	}
}
