package com.kh.controller;

import java.util.Scanner;

import com.kh.model.vo.AdultM;
import com.kh.model.vo.FamilyM;
import com.kh.model.vo.Movie;
import com.kh.model.vo.User;
import com.kh.model.vo.disCountAble;

public class MovieManager {

	private User user = null;
	private Movie[] mArr = new Movie[4];
	{
		mArr[0] = new AdultM("���˿��� ����", 15000, "����", 50, 19, 19);
		mArr[1] = new FamilyM("�ڹ����� ����ִ�", 10000, "����", 30, 11);
		mArr[2] = new AdultM("������", 15000, "�׼�", 50, 19, 19);
		mArr[3] = new FamilyM("�ܿ�ձ�", 10000, "�ִϸ��̼�", 30, 19);
	}

	Scanner scanner = new Scanner(System.in);

	public MovieManager() {

	}

	public void insertMember(User user) {
		this.user = user;
	}

	public User myPage() {
		return user;
	}

	public Movie[] selectAll() {
		for (int i = 0; i < mArr.length; i++) {
			System.out.println((i + 1) + "��  " + mArr[i].toString());
		}

		return mArr;
	}

	public int checkaNum() {
		System.out.println("�����Ͻ� ������ ���ڸ� �Է��ϼ��� : ");
		int adultNum = scanner.nextInt();
		scanner.nextLine();

		return adultNum;
	}

	public int checkkNum() {
		System.out.println("�����Ͻ� ����� ���ڸ� �Է��ϼ��� : ");
		int kidNum = scanner.nextInt();
		scanner.nextLine();
		return kidNum;
	}

	public int reservation(int index) {
		int result = 0;

		int kidCount = checkkNum();
		int adultCount = checkaNum();
		int adultTotalPrice = 0;
		int kidTotalPrice = 0;
		int adultDiscountPrice = 0;
		int kidDiscountPrice = 0;

		if (mArr[index] instanceof AdultM) {
			if (kidCount > 0) {
				result = 1; // �Ƶ��� �Բ� X
			} else if (((AdultM) mArr[index]).getAccessAge() > user.getAge()) {
				result = 2; // �������� ���� X
			} else if (mArr[index].getmTime() < 12) {
				result = 3; // �������� �ݾ����� ����
				adultTotalPrice = mArr[index].getmPrice() * adultCount;
				kidTotalPrice = mArr[index].getmPrice() * kidCount;
				adultDiscountPrice = (int) (mArr[index].getmPrice() * disCountAble.disCountAblePer) * adultCount;
				kidDiscountPrice = (int) (mArr[index].getmPrice() * disCountAble.disCountAblePer) * kidCount;
				mArr[index].setmSeat(mArr[index].getmSeat() - (kidCount + adultCount));
				System.out.println((int) ((1 - disCountAble.disCountAblePer) * 100) + "% ���ε� �ݾ�����  ���� �Ǿ����ϴ�.");
				System.out.println(
						"���� " + adultCount + "�� " + adultTotalPrice + "������ ���� ���εǾ�, " + adultDiscountPrice + "�� �Դϴ�.");
				System.out
						.println(mArr[index].getmName() + "�� �󿵽ð��� " + mArr[index].getmTime() + "�� �Դϴ�. ���� �ʰ� �������ּ���!");
				System.out.println(mArr[index].getmName() + "�� �ܿ� �¼��� " + mArr[index].getmSeat());
			} else if (user.getCouponCount() > 0) {
				result = 3;
				user.setCouponCount(user.getCouponCount() - 1);
				adultTotalPrice = mArr[index].getmPrice() * adultCount;
				kidTotalPrice = mArr[index].getmPrice() * kidCount;
				adultDiscountPrice = (int) (mArr[index].getmPrice() * disCountAble.disCountAblePer) * adultCount;
				kidDiscountPrice = (int) (mArr[index].getmPrice() * disCountAble.disCountAblePer) * kidCount;
				mArr[index].setmSeat(mArr[index].getmSeat() - (kidCount + adultCount));
				System.out.println((int) ((1 - disCountAble.disCountAblePer) * 100) + "% ���ε� �ݾ�����  ���� �Ǿ����ϴ�.");
				System.out.println(
						"���� " + adultCount + "�� " + adultTotalPrice + "������ ���� ���εǾ�, " + adultDiscountPrice + "�� �Դϴ�.");
				System.out.println("������ 1�� �����Ǿ� �ܿ� ������ " + user.getCouponCount() + "�� �Դϴ�.");
				System.out
						.println(mArr[index].getmName() + "�� �󿵽ð��� " + mArr[index].getmTime() + "�� �Դϴ�. ���� �ʰ� �������ּ���!");
				System.out.println(mArr[index].getmName() + "�� �ܿ� �¼��� " + mArr[index].getmSeat());
			} else if (user.getBirth() == disCountAble.today) {
				result = 3; // ���ε� �ݾ����� ����
				adultTotalPrice = mArr[index].getmPrice() * adultCount;
				kidTotalPrice = mArr[index].getmPrice() * kidCount;
				adultDiscountPrice = (int) (mArr[index].getmPrice() * disCountAble.disCountAblePer) * adultCount;
				kidDiscountPrice = (int) (mArr[index].getmPrice() * disCountAble.disCountAblePer) * kidCount;
				mArr[index].setmSeat(mArr[index].getmSeat() - (kidCount + adultCount));
				System.out.println((int) ((1 - disCountAble.disCountAblePer) * 100) + "% ���ε� �ݾ�����  ���� �Ǿ����ϴ�.");
				System.out.println(
						"���� " + adultCount + "�� " + adultTotalPrice + "������ ���� ���εǾ�, " + adultDiscountPrice + "�� �Դϴ�.");
				System.out
						.println(mArr[index].getmName() + "�� �󿵽ð��� " + mArr[index].getmTime() + "�� �Դϴ�. ���� �ʰ� �������ּ���!");
				System.out.println(mArr[index].getmName() + "�� �ܿ� �¼��� " + mArr[index].getmSeat());
			} else {
				adultTotalPrice = mArr[index].getmPrice() * adultCount;
				kidTotalPrice = mArr[index].getmPrice() * kidCount;
				mArr[index].setmSeat(mArr[index].getmSeat() - (kidCount + adultCount));
				result = 0; // ���� ����
				System.out.println("���� " + adultCount + "�� " + adultTotalPrice + "�� ���� �Ǿ����ϴ�.");
				System.out
						.println(mArr[index].getmName() + "�� �󿵽ð��� " + mArr[index].getmTime() + "�� �Դϴ�. ���� �ʰ� �������ּ���!");
				System.out.println(mArr[index].getmName() + "�� �ܿ� �¼��� " + mArr[index].getmSeat());
			}

		} else {
			if (mArr[index].getmTime() < 12) {
				result = 3; // ���ε� �ݾ����� ����
				adultTotalPrice = mArr[index].getmPrice() * adultCount;
				kidTotalPrice = mArr[index].getmPrice() * kidCount;
				adultDiscountPrice = (int) (mArr[index].getmPrice() * disCountAble.disCountAblePer) * adultCount;
				kidDiscountPrice = (int) (mArr[index].getmPrice() * disCountAble.disCountAblePer) * kidCount;
				mArr[index].setmSeat(mArr[index].getmSeat() - (kidCount + adultCount));
				System.out.println((int) ((1 - disCountAble.disCountAblePer) * 100) + "% ���ε� �ݾ�����  ���� �Ǿ����ϴ�.");
				if (adultCount > 0) {
					System.out.println("���� " + adultCount + "�� " + adultTotalPrice + "������ �������εǾ�, " + adultDiscountPrice
							+ "�� �Դϴ�.");
				}
				if (kidCount > 0) {
					System.out.println(
							"��� " + kidCount + "�� " + kidTotalPrice + "������ �������εǾ�, " + kidDiscountPrice + "�� �Դϴ�.");
				}
				System.out
						.println(mArr[index].getmName() + "�� �󿵽ð��� " + mArr[index].getmTime() + "�� �Դϴ�. ���� �ʰ� �������ּ���!");
				System.out.println(mArr[index].getmName() + "�� �ܿ� �¼��� " + mArr[index].getmSeat());
			} else if (user.getCouponCount() > 0) {
				result = 3;
				
				adultTotalPrice = mArr[index].getmPrice() * adultCount;
				kidTotalPrice = mArr[index].getmPrice() * kidCount;
				adultDiscountPrice = (int) (mArr[index].getmPrice() * disCountAble.disCountAblePer) * adultCount;
				kidDiscountPrice = (int) (mArr[index].getmPrice() * disCountAble.disCountAblePer) * kidCount;
				mArr[index].setmSeat(mArr[index].getmSeat() - (kidCount + adultCount));
				System.out.println((int) ((1 - disCountAble.disCountAblePer) * 100) + "% ���ε� �ݾ�����  ���� �Ǿ����ϴ�.");
				if (adultCount > 0) {
					System.out.println("���� " + adultCount + "�� " + adultTotalPrice + "������ ���� ���εǾ�, "
							+ adultDiscountPrice + "�� �Դϴ�.");
				}
				if (kidCount > 0) {
					System.out.println(
							"��� " + kidCount + "�� " + kidTotalPrice + "������ ���� ���εǾ�, " + kidDiscountPrice + "�� �Դϴ�.");
				}
				System.out.println("������ 1�� �����Ǿ� �ܿ� ������ " + user.getCouponCount() + "�� �Դϴ�.");
				user.setCouponCount(user.getCouponCount() - 1);
				System.out
						.println(mArr[index].getmName() + "�� �󿵽ð��� " + mArr[index].getmTime() + "�� �Դϴ�. ���� �ʰ� �������ּ���!");
				System.out.println(mArr[index].getmName() + "�� �ܿ� �¼��� " + mArr[index].getmSeat());
			} else if (user.getBirth() == disCountAble.today) {
				result = 3; // ���ε� �ݾ����� ����
				adultTotalPrice = mArr[index].getmPrice() * adultCount;
				kidTotalPrice = mArr[index].getmPrice() * kidCount;
				adultDiscountPrice = (int) (mArr[index].getmPrice() * disCountAble.disCountAblePer) * adultCount;
				kidDiscountPrice = (int) (mArr[index].getmPrice() * disCountAble.disCountAblePer) * kidCount;
				mArr[index].setmSeat(mArr[index].getmSeat() - (kidCount + adultCount));
				System.out.println((int) ((1 - disCountAble.disCountAblePer) * 100) + "% ���ε� �ݾ�����  ���� �Ǿ����ϴ�.");
				if (adultCount > 0) {
					System.out.println("���� " + adultCount + "�� " + adultTotalPrice + "������ ���� ���εǾ�, "
							+ adultDiscountPrice + "�� �Դϴ�.");
				}
				if (kidCount > 0) {
					System.out.println(
							"��� " + kidCount + "�� " + kidTotalPrice + "������ ���� ���εǾ�, " + kidDiscountPrice + "�� �Դϴ�.");
				}
				System.out
						.println(mArr[index].getmName() + "�� �󿵽ð��� " + mArr[index].getmTime() + "�� �Դϴ�. ���� �ʰ� �������ּ���!");
				System.out.println(mArr[index].getmName() + "�� �ܿ� �¼��� " + mArr[index].getmSeat());
			} else {
				adultTotalPrice = mArr[index].getmPrice() * adultCount;
				kidTotalPrice = mArr[index].getmPrice() * kidCount;
				mArr[index].setmSeat(mArr[index].getmSeat() - (kidCount + adultCount));
				result = 0; // ���� ����
				if (adultCount > 0) {
					System.out.println("���� " + adultCount + "�� " + adultTotalPrice + "�� ���� �Ǿ����ϴ�.");
				}
				if (kidCount > 0) {
					System.out.println("��� " + kidCount + "�� " + kidTotalPrice + "�� ���� �Ǿ����ϴ�.");
				}
				System.out
						.println(mArr[index].getmName() + "�� �󿵽ð��� " + mArr[index].getmTime() + "�� �Դϴ�. ���� �ʰ� �������ּ���!");
				System.out.println(mArr[index].getmName() + "�� �ܿ� �¼��� " + mArr[index].getmSeat());
			}
		}
		return result;
	}

	public void checkSeat() {
		for (int i = 0; i < mArr.length; i++) {
			System.out.println((i + 1) + "�� ��ȭ�� ���� �¼� : " + mArr[i].getmSeat());
		}
	}

}
