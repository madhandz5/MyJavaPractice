package com.kh.model.vo;

public class Movie implements disCountAble {

	private String mName;
	private int mPrice;
	private String mGenre;
	private int mSeat;
	private int mTime;

	public Movie() {

	}

	public Movie(String mName, int mPrice, String mGenre, int mSeat, int mTime) {
		this.mName = mName;
		this.mPrice = mPrice;
		this.mGenre = mGenre;
		this.mSeat = mSeat;
		this.mTime = mTime;
	}

	public String getmName() {
		return mName;
	}

	public void setmName(String mName) {
		this.mName = mName;
	}

	public int getmPrice() {
		return mPrice;
	}

	public void setmPrice(int mPrice) {
		this.mPrice = mPrice;
	}

	public String getmGenre() {
		return mGenre;
	}

	public void setmGenre(String mGenre) {
		this.mGenre = mGenre;
	}

	public int getmSeat() {
		return mSeat;
	}

	public void setmSeat(int mSeat) {
		this.mSeat = mSeat;
	}

	public int getmTime() {
		return mTime;
	}

	public void setmTime(int mTime) {
		this.mTime = mTime;
	}

	@Override
	public String toString() {
		return "��ȭ���� : " + mName + ", Ƽ�ϰ��� = " + mPrice + ", �帣 = " + mGenre + ", �ܿ��¼���= " + mSeat + ", �󿵽��۽ð� ="
				+ mTime + " ";
	}

	@Override
	public void disCount() {

	}

}
