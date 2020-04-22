package bm.model.vo;

import java.io.Serializable;
import java.sql.Date;

public class Book implements Serializable {

	private static final long serialVersionUID = -3791143783671941836L;

	private int bno;
	private int category;
	private String title;
	private String author;
	private Date regDate;
	private String rentYn;
	private int rentCnt;

	public Book() {
	}

	public Book(int bno, int category, String title, String author, Date regDate, String rentYn, int rentCnt) {
		super();
		this.bno = bno;
		this.category = category;
		this.title = title;
		this.author = author;
		this.regDate = regDate;
		this.rentYn = rentYn;
		this.rentCnt = rentCnt;
	}

	public int getBno() {
		return bno;
	}

	public void setBno(int bno) {
		this.bno = bno;
	}

	public int getCategory() {
		return category;
	}

	public void setCategory(int category) {
		this.category = category;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	public Date getRegDate() {
		return regDate;
	}

	public void setRegDate(Date regDate) {
		this.regDate = regDate;
	}

	public String getRentYn() {
		return rentYn;
	}

	public void setRentYn(String rentYn) {
		this.rentYn = rentYn;
	}

	public int getRentCnt() {
		return rentCnt;
	}

	public void setRentCnt(int rentCnt) {
		this.rentCnt = rentCnt;
	}

	@Override
	public String toString() {
		String cateName = "";
		if (category == 1101) {
			cateName = "인문";
		} else if (category == 1102) {
			cateName = "자연과학";
		} else if (category == 1103) {
			cateName = "문학";
		} else if (category == 1104) {
			cateName = "장르문학";
		}

		String rentYn = "";
		if (rentYn.toUpperCase().equals("Y")) {
			rentYn = "대출 중";
		} else {
			rentYn = "대출가능";
		}

		return "====도서정보====\n책 번호 :" + bno + "\n분 류 : " + cateName + "\n제 목 : " + title + "\n작 가 : " + author
				+ "\n등록일 : " + regDate + "\n대출상태 : " + rentYn + "\n대여 횟수 : " + rentCnt;
	}

}
