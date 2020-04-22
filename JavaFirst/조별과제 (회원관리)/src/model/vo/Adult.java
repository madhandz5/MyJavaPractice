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
		System.out.println("가입 축하 선물로 쿠폰이 3장 발급되었습니다.");

	}

	// 1부터 5까지의 숫자를 골라, 맞추면 쿠폰 1장을 발급해 줍니다.
	@Override
	public void openLuckyBox(int num) {
		int luckeyNum = ((int) (Math.random() * 5) + 1);
		if (luckeyNum == num) {
			System.out.println("축하합니다. 쿠폰이 1장 지급됩니다.");
			this.setCouponCount(this.getCouponCount() + 1);
		} else {
			System.out.println("아쉽네요. 행운의 숫자는  " + luckeyNum + "이였네요");
		}
	}
}
