package bm.model.vo;

import java.io.Serializable;
import java.sql.Date;

public class Member implements Serializable {

	private static final long serialVersionUID = 1138943010939317274L;
	private String mId;
	private String mPwd;
	private int mGrade;
	private String phone;
	private Date rentAble_Date;

	public Member() {
	}

	public Member(String mId, String mPwd, int mGrade, String phone, Date rentAble_Date) {
		this.mId = mId;
		this.mPwd = mPwd;
		this.mGrade = mGrade;
		this.phone = phone;
		this.rentAble_Date = rentAble_Date;

	}

	public String getmId() {
		return mId;
	}

	public void setmId(String mId) {
		this.mId = mId;
	}

	public String getmPwd() {
		return mPwd;
	}

	public void setmPwd(String mPwd) {
		this.mPwd = mPwd;
	}

	public int getmGrade() {
		return mGrade;
	}

	public void setmGrade(int mGrade) {
		this.mGrade = mGrade;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public Date getRentAble_Date() {
		return rentAble_Date;
	}

	public void setRentAble_Date(Date rentAble_Date) {
		this.rentAble_Date = rentAble_Date;
	}

	@Override
	public String toString() {
		String gradeName = "";
		if (mGrade == 1001) {
			gradeName = "일반회원";
		} else if (mGrade == 1002) {
			gradeName = "성실회원";
		} else if (mGrade == 1003) {
			gradeName = "우수회원";
		} else if (mGrade == 1004) {
			gradeName = "VIP";
		}

		return "======회원정보====== \nID : " + mId + "\n비밀번호 : " + mPwd + "\n회원등급 : " + gradeName + "\n전화번호 : " + phone
				+ "\n대여 가능일 : " + rentAble_Date;
	}

}
