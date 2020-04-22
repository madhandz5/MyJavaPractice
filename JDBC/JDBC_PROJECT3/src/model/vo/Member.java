package model.vo;

import java.io.Serializable;
import java.sql.Date;

// * MVC 디자인 패턴 M은 Model을 의미한다.
// * Model 은 vo, dao, service로 나뉜다.
// * VO는 DB의 테이블에서 조회해온 한 행(ROW)의 값들을 저장할 목적의 객체이다.

// * domain odject (do) == value object (vo) == data transfer object (dto) == entity == bean

// * VO가 되기 위한 조건
// * 1. 직렬화 할 것 (직렬화 ID 반드시 구분해야 한다.)
// * 2. 캡슐화 할 것 (getter, setter가 반드시 존재해야 한다.)
// * 3. 기본 생성자는 필수

public class Member implements Serializable {

	// 직렬화 ID 필수

	private static final long serialVersionUID = 8441785096411945784L;

	private String userId;
	private String userPwd;
	private String userName;
	private String gender; // DB 의 Char 도 자바에서는 String
	private int age;
	private String phone;
	private String eMail;
	private String etc;
	private Date enroll_date; // DB 의 DATE 자료형 자바의 java.sql.date 타입과 매칭
	private Date lastModified;

	public Member() {
	}

	public Member(String userId, String userPwd, String userName, String gender, int age, String phone, String eMail,
			String etc, Date enroll_date, Date lastModified) {
		super();
		this.userId = userId;
		this.userPwd = userPwd;
		this.userName = userName;
		this.gender = gender;
		this.age = age;
		this.phone = phone;
		this.eMail = eMail;
		this.etc = etc;
		this.enroll_date = enroll_date;
		this.lastModified = lastModified;
	}

	public String getUserId() {
		return userId;
	}

	public void setUserId(String userId) {
		this.userId = userId;
	}

	public String getUserPwd() {
		return userPwd;
	}

	public void setUserPwd(String userPwd) {
		this.userPwd = userPwd;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String geteMail() {
		return eMail;
	}

	public void seteMail(String eMail) {
		this.eMail = eMail;
	}

	public String getEtc() {
		return etc;
	}

	public void setEtc(String etc) {
		this.etc = etc;
	}

	public Date getEnroll_date() {
		return enroll_date;
	}

	public void setEnroll_date(Date enroll_date) {
		this.enroll_date = enroll_date;
	}

	public Date getLastModified() {
		return lastModified;
	}

	public void setLastModified(Date lastModified) {
		this.lastModified = lastModified;
	}

	@Override
	public String toString() {
		return "Member [userId=" + userId + ", userPwd=" + userPwd + ", userName=" + userName + ", gender=" + gender
				+ ", age=" + age + ", phone=" + phone + ", eMail=" + eMail + ", etc=" + etc + ", enroll_date="
				+ enroll_date + ", lastModified=" + lastModified + "]";
	}

}
