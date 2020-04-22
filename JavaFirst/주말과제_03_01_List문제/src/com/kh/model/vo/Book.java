package com.kh.model.vo;

public class Book {

	private int bNo;
	private int category;
	private String title;
	private String author;

	public Book() {

	}

	public Book(int category, String title, String author) {
		this.category = category;
		this.title = title;
		this.author = author;
	}

	public int getbNo() {
		return bNo;
	}

	public void setbNo(int bNo) {
		this.bNo = bNo;
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

	@Override
	public String toString() {

		// 필드 값 문자열 합친 후 리턴 category 분류 별로 출력 >> 1 : 인문 / 2 : 자연과학 3 : 의료 / 4 : 기타
		String res = "";
		if (category == 1) {
			res = "인문 [도서번호 = " + bNo + ", 제목 = " + title + ", 저자 = " + author + "]";
		} else if (category == 2) {
			res = "자연과학 [도서번호 = " + bNo + ", 제목 = " + title + ", 저자 = " + author + "]";
		} else if (category == 3) {
			res = "의료 [도서번호 = " + bNo + ", 제목 = " + title + ", 저자 = " + author + "]";
		} else if (category == 4) {
			res = "기타 [도서번호 = " + bNo + ", 제목 = " + title + ", 저자 = " + author + "]";
		}
		return res;
	}

}
