package com.kh.model.vo;

public class AdultM extends Movie {

	private int accessAge;

	public AdultM() {
		super();
		// TODO Auto-generated constructor stub
	}

	public AdultM(String mName, int mPrice, String mGenre, int mSeat, int mTime, int accessAge) {
		super(mName, mPrice, mGenre, mSeat, mTime);
		this.accessAge = accessAge;
		// TODO Auto-generated constructor stub
	}

	public int getAccessAge() {
		return accessAge;
	}

	public void setAccessAge(int accessAge) {
		this.accessAge = accessAge;
	}

	@Override
	public String toString() {
		return super.toString() + accessAge + "세 미만 관람불가";
	}

	public void checkTheater() {

	}

}
