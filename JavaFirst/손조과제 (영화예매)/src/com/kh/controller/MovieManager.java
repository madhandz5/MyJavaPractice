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
		mArr[0] = new AdultM("범죄와의 전쟁", 15000, "범죄", 50, 19, 19);
		mArr[1] = new FamilyM("박물관이 살아있다", 10000, "가족", 30, 11);
		mArr[2] = new AdultM("아저씨", 15000, "액션", 50, 19, 19);
		mArr[3] = new FamilyM("겨울왕국", 10000, "애니매이션", 30, 19);
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
			System.out.println((i + 1) + "번  " + mArr[i].toString());
		}

		return mArr;
	}

	public int checkaNum() {
		System.out.println("관람하실 성인의 숫자를 입력하세요 : ");
		int adultNum = scanner.nextInt();
		scanner.nextLine();

		return adultNum;
	}

	public int checkkNum() {
		System.out.println("관람하실 어린이의 숫자를 입력하세요 : ");
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
				result = 1; // 아동과 함께 X
			} else if (((AdultM) mArr[index]).getAccessAge() > user.getAge()) {
				result = 2; // 나이제한 으로 X
			} else if (mArr[index].getmTime() < 12) {
				result = 3; // 조조할인 금액으로 예매
				adultTotalPrice = mArr[index].getmPrice() * adultCount;
				kidTotalPrice = mArr[index].getmPrice() * kidCount;
				adultDiscountPrice = (int) (mArr[index].getmPrice() * disCountAble.disCountAblePer) * adultCount;
				kidDiscountPrice = (int) (mArr[index].getmPrice() * disCountAble.disCountAblePer) * kidCount;
				mArr[index].setmSeat(mArr[index].getmSeat() - (kidCount + adultCount));
				System.out.println((int) ((1 - disCountAble.disCountAblePer) * 100) + "% 할인된 금액으로  예매 되었습니다.");
				System.out.println(
						"성인 " + adultCount + "명 " + adultTotalPrice + "원에서 조조 할인되어, " + adultDiscountPrice + "원 입니다.");
				System.out
						.println(mArr[index].getmName() + "의 상영시간은 " + mArr[index].getmTime() + "시 입니다. 늦지 않게 입장해주세요!");
				System.out.println(mArr[index].getmName() + "의 잔여 좌석은 " + mArr[index].getmSeat());
			} else if (user.getCouponCount() > 0) {
				result = 3;
				user.setCouponCount(user.getCouponCount() - 1);
				adultTotalPrice = mArr[index].getmPrice() * adultCount;
				kidTotalPrice = mArr[index].getmPrice() * kidCount;
				adultDiscountPrice = (int) (mArr[index].getmPrice() * disCountAble.disCountAblePer) * adultCount;
				kidDiscountPrice = (int) (mArr[index].getmPrice() * disCountAble.disCountAblePer) * kidCount;
				mArr[index].setmSeat(mArr[index].getmSeat() - (kidCount + adultCount));
				System.out.println((int) ((1 - disCountAble.disCountAblePer) * 100) + "% 할인된 금액으로  예매 되었습니다.");
				System.out.println(
						"성인 " + adultCount + "명 " + adultTotalPrice + "원에서 쿠폰 할인되어, " + adultDiscountPrice + "원 입니다.");
				System.out.println("쿠폰이 1장 소진되어 잔여 쿠폰은 " + user.getCouponCount() + "장 입니다.");
				System.out
						.println(mArr[index].getmName() + "의 상영시간은 " + mArr[index].getmTime() + "시 입니다. 늦지 않게 입장해주세요!");
				System.out.println(mArr[index].getmName() + "의 잔여 좌석은 " + mArr[index].getmSeat());
			} else if (user.getBirth() == disCountAble.today) {
				result = 3; // 할인된 금액으로 예매
				adultTotalPrice = mArr[index].getmPrice() * adultCount;
				kidTotalPrice = mArr[index].getmPrice() * kidCount;
				adultDiscountPrice = (int) (mArr[index].getmPrice() * disCountAble.disCountAblePer) * adultCount;
				kidDiscountPrice = (int) (mArr[index].getmPrice() * disCountAble.disCountAblePer) * kidCount;
				mArr[index].setmSeat(mArr[index].getmSeat() - (kidCount + adultCount));
				System.out.println((int) ((1 - disCountAble.disCountAblePer) * 100) + "% 할인된 금액으로  예매 되었습니다.");
				System.out.println(
						"성인 " + adultCount + "명 " + adultTotalPrice + "원에서 생일 할인되어, " + adultDiscountPrice + "원 입니다.");
				System.out
						.println(mArr[index].getmName() + "의 상영시간은 " + mArr[index].getmTime() + "시 입니다. 늦지 않게 입장해주세요!");
				System.out.println(mArr[index].getmName() + "의 잔여 좌석은 " + mArr[index].getmSeat());
			} else {
				adultTotalPrice = mArr[index].getmPrice() * adultCount;
				kidTotalPrice = mArr[index].getmPrice() * kidCount;
				mArr[index].setmSeat(mArr[index].getmSeat() - (kidCount + adultCount));
				result = 0; // 보통 예매
				System.out.println("성인 " + adultCount + "명 " + adultTotalPrice + "원 결제 되었습니다.");
				System.out
						.println(mArr[index].getmName() + "의 상영시간은 " + mArr[index].getmTime() + "시 입니다. 늦지 않게 입장해주세요!");
				System.out.println(mArr[index].getmName() + "의 잔여 좌석은 " + mArr[index].getmSeat());
			}

		} else {
			if (mArr[index].getmTime() < 12) {
				result = 3; // 할인된 금액으로 예매
				adultTotalPrice = mArr[index].getmPrice() * adultCount;
				kidTotalPrice = mArr[index].getmPrice() * kidCount;
				adultDiscountPrice = (int) (mArr[index].getmPrice() * disCountAble.disCountAblePer) * adultCount;
				kidDiscountPrice = (int) (mArr[index].getmPrice() * disCountAble.disCountAblePer) * kidCount;
				mArr[index].setmSeat(mArr[index].getmSeat() - (kidCount + adultCount));
				System.out.println((int) ((1 - disCountAble.disCountAblePer) * 100) + "% 할인된 금액으로  예매 되었습니다.");
				if (adultCount > 0) {
					System.out.println("성인 " + adultCount + "명 " + adultTotalPrice + "원에서 조조할인되어, " + adultDiscountPrice
							+ "원 입니다.");
				}
				if (kidCount > 0) {
					System.out.println(
							"어린이 " + kidCount + "명 " + kidTotalPrice + "원에서 조조할인되어, " + kidDiscountPrice + "원 입니다.");
				}
				System.out
						.println(mArr[index].getmName() + "의 상영시간은 " + mArr[index].getmTime() + "시 입니다. 늦지 않게 입장해주세요!");
				System.out.println(mArr[index].getmName() + "의 잔여 좌석은 " + mArr[index].getmSeat());
			} else if (user.getCouponCount() > 0) {
				result = 3;
				
				adultTotalPrice = mArr[index].getmPrice() * adultCount;
				kidTotalPrice = mArr[index].getmPrice() * kidCount;
				adultDiscountPrice = (int) (mArr[index].getmPrice() * disCountAble.disCountAblePer) * adultCount;
				kidDiscountPrice = (int) (mArr[index].getmPrice() * disCountAble.disCountAblePer) * kidCount;
				mArr[index].setmSeat(mArr[index].getmSeat() - (kidCount + adultCount));
				System.out.println((int) ((1 - disCountAble.disCountAblePer) * 100) + "% 할인된 금액으로  예매 되었습니다.");
				if (adultCount > 0) {
					System.out.println("성인 " + adultCount + "명 " + adultTotalPrice + "원에서 쿠폰 할인되어, "
							+ adultDiscountPrice + "원 입니다.");
				}
				if (kidCount > 0) {
					System.out.println(
							"어린이 " + kidCount + "명 " + kidTotalPrice + "원에서 쿠폰 할인되어, " + kidDiscountPrice + "원 입니다.");
				}
				System.out.println("쿠폰이 1장 소진되어 잔여 쿠폰은 " + user.getCouponCount() + "장 입니다.");
				user.setCouponCount(user.getCouponCount() - 1);
				System.out
						.println(mArr[index].getmName() + "의 상영시간은 " + mArr[index].getmTime() + "시 입니다. 늦지 않게 입장해주세요!");
				System.out.println(mArr[index].getmName() + "의 잔여 좌석은 " + mArr[index].getmSeat());
			} else if (user.getBirth() == disCountAble.today) {
				result = 3; // 할인된 금액으로 예매
				adultTotalPrice = mArr[index].getmPrice() * adultCount;
				kidTotalPrice = mArr[index].getmPrice() * kidCount;
				adultDiscountPrice = (int) (mArr[index].getmPrice() * disCountAble.disCountAblePer) * adultCount;
				kidDiscountPrice = (int) (mArr[index].getmPrice() * disCountAble.disCountAblePer) * kidCount;
				mArr[index].setmSeat(mArr[index].getmSeat() - (kidCount + adultCount));
				System.out.println((int) ((1 - disCountAble.disCountAblePer) * 100) + "% 할인된 금액으로  예매 되었습니다.");
				if (adultCount > 0) {
					System.out.println("성인 " + adultCount + "명 " + adultTotalPrice + "원에서 생일 할인되어, "
							+ adultDiscountPrice + "원 입니다.");
				}
				if (kidCount > 0) {
					System.out.println(
							"어린이 " + kidCount + "명 " + kidTotalPrice + "원에서 생일 할인되어, " + kidDiscountPrice + "원 입니다.");
				}
				System.out
						.println(mArr[index].getmName() + "의 상영시간은 " + mArr[index].getmTime() + "시 입니다. 늦지 않게 입장해주세요!");
				System.out.println(mArr[index].getmName() + "의 잔여 좌석은 " + mArr[index].getmSeat());
			} else {
				adultTotalPrice = mArr[index].getmPrice() * adultCount;
				kidTotalPrice = mArr[index].getmPrice() * kidCount;
				mArr[index].setmSeat(mArr[index].getmSeat() - (kidCount + adultCount));
				result = 0; // 보통 예매
				if (adultCount > 0) {
					System.out.println("성인 " + adultCount + "명 " + adultTotalPrice + "원 결제 되었습니다.");
				}
				if (kidCount > 0) {
					System.out.println("어린이 " + kidCount + "명 " + kidTotalPrice + "원 결제 되었습니다.");
				}
				System.out
						.println(mArr[index].getmName() + "의 상영시간은 " + mArr[index].getmTime() + "시 입니다. 늦지 않게 입장해주세요!");
				System.out.println(mArr[index].getmName() + "의 잔여 좌석은 " + mArr[index].getmSeat());
			}
		}
		return result;
	}

	public void checkSeat() {
		for (int i = 0; i < mArr.length; i++) {
			System.out.println((i + 1) + "번 영화의 남은 좌석 : " + mArr[i].getmSeat());
		}
	}

}
