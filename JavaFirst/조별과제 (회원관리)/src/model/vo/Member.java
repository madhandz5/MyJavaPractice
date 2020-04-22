package model.vo;

public abstract class Member implements Luckeyable {

	// �̸�
	private String name;
	// ����
	private int age;
	// �� ��
	private int myMoney;
	// �� ���� Ƚ��
	private int buyCount;
	// �� ���� �ݾ�
	private int mileage;
	// ���� ����
	private int couponCount;
	// �����ڽ� ���� ��ȸ
	private int openChance;

	public Member() {

	}

	public Member(String name, int age, int myMoney, int buyCount, int mileage, int couponCount, int openChance) {
		this.name = name;
		this.age = age;
		this.myMoney = myMoney;
		this.buyCount = buyCount;
		this.mileage = mileage;
		this.couponCount = couponCount;
		this.openChance = openChance;
	}

	public int getOpenChance() {
		return openChance;
	}

	public void setOpenChance(int openChance) {
		this.openChance = openChance;
	}

	public int getMyMoney() {
		return myMoney;
	}

	public void setMyMoney(int myMoney) {
		this.myMoney = myMoney;
	}

	public int getCouponCount() {
		return couponCount;
	}

	public void setCouponCount(int couponCount) {
		this.couponCount = couponCount;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public int getBuyCount() {
		return buyCount;
	}

	public void setBuyCount(int buyCount) {
		this.buyCount = buyCount;
	}

	public int getMileage() {
		return mileage;
	}

	public void setMileage(int mileage) {
		this.mileage = mileage;
	}

	public abstract void basicCoupon();
}
