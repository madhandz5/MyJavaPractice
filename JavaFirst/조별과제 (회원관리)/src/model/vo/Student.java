package model.vo;

public class Student extends Member {

	public Student() {
		super();
	}

	public Student(String name, int age, int myMoney, int buyCount, int mileage, int couponCount, int openChance) {
		super(name, age, myMoney, buyCount, mileage, couponCount, openChance);
	}

	@Override
	public void basicCoupon() {
		this.setCouponCount(this.getCouponCount() + 5);
		System.out.println("���� ���� ������ ������ 5�� �߱޵Ǿ����ϴ�.");
	}

	@Override
	// 1���� 3������ ���ڸ� ��� ���߸� ������ 1�� ���޵˴ϴ�.
	public void openLuckyBox(int num) {
		int luckeyNum = ((int) (Math.random() * 3) + 1);
		if (luckeyNum == num) {
			System.out.println("�����մϴ�. ������ 1�� ���޵˴ϴ�.");
			this.setCouponCount(this.getCouponCount() + 1);
		} else {
			System.out.println("�ƽ��׿�. ����� ���ڴ�  " + luckeyNum + "�̿��׿�");
		}
	}

}
