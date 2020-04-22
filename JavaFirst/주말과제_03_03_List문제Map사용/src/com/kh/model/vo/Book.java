package com.kh.model.vo;

public class Book implements Comparable<Book> {
	private String bNo;
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

	public String getbNo() {
		return bNo;
	}

	public void setbNo(String bNo) {
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
		if (category == 1) {
			return "인문 [도서 번호 : " + bNo + ", 제목 : " + title + ", 작가 : " + author + "]";
		} else if (category == 2) {
			return "자연과학 [도서 번호 : " + bNo + ", 제목 : " + title + ", 작가 : " + author + "]";
		} else if (category == 3) {
			return "의료 [도서 번호 : " + bNo + ", 제목 : " + title + ", 작가 : " + author + "]";
		} else {
			return "기타 [도서 번호 : " + bNo + ", 제목 : " + title + ", 작가 : " + author + "]";
		}
	}

	@Override
	public int compareTo(Book o) {
		return title.compareTo(o.getTitle());
	}

}
