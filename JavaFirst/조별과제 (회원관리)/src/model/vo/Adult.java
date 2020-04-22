package model.vo;

public class Adult extends Member {

	public Adult() {
		super();
	}

	public Adult(String name, int age, int myMoney, int buyCount, int mileage, int couponCount, int openChance) {
		super(name, age, myMoney, buyCount, mileage, couponCount, openChance);
	}

	@Override
	public void basicCoupon() {
		this.setCouponCount(this.getCouponCount() + 3);
		System.out.println("���� ���� ������ ������ 3�� �߱޵Ǿ����ϴ�.");

	}

	// 1���� 5������ ���ڸ� ���, ���߸� ���� 1���� �߱��� �ݴϴ�.
	@Override
	public void openLuckyBox(int num) {
		int luckeyNum = ((int) (Math.random() * 5) + 1);
		if (luckeyNum == num) {
			System.out.println("�����մϴ�. ������ 1�� ���޵˴ϴ�.");
			this.setCouponCount(this.getCouponCount() + 1);
		} else {
			System.out.println("�ƽ��׿�. ����� ���ڴ�  " + luckeyNum + "�̿��׿�");
		}
	}
}
