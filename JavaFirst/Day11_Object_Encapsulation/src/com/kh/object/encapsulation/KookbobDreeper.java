package com.kh.object.encapsulation;

public class KookbobDreeper {

	// * 1. �߻�ȭ
	// * - ���α׷����� �ʿ��� �������� ��� �� �Ӽ����� �����ϰ�
	// * - ���ʿ��� �͵��� �����ϴ� ����
	// * - �����ϰ��� �ϴ� ���α׷��� � ���α׷��̰�, � ������ ������ �������
	// * - �� �����ؾ� �Ѵ�. ����� ���� �ְ�, �Ӽ��� �ִ�.

	// * 2. ĸ��ȭ
	// * - Ŭ���� ������ �������(�ʵ�) �� Ŭ���� �ۿ��� �������� ���ϰ� �ϴ�
	// * - ��������� private�� �����ϴ� ���� ��Ģ�̴�.
	// * - ��� ������ ���� �츮�� ���� �ǹ̸� ����� ���� getter / setter �޼���� �����Ѵ�.

	private String foodName;
	private int foodPrice;
	private final static int KOOKBOBPRICE = 5000;

	public KookbobDreeper() {

	}

	// �����ڵ� �����ε��� �����ϴ�.
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
		System.out.println("��" + foodName + "?" + foodName + "??" + "\n �� ���ְ�" + foodName + "���� �ٿ��� �߲��� ����" + kookBobCnt
				+ "�׸�, ����� �԰���");

	}

}
