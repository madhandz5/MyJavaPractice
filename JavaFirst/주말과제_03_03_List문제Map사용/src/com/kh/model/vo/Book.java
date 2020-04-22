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
			return "�ι� [���� ��ȣ : " + bNo + ", ���� : " + title + ", �۰� : " + author + "]";
		} else if (category == 2) {
			return "�ڿ����� [���� ��ȣ : " + bNo + ", ���� : " + title + ", �۰� : " + author + "]";
		} else if (category == 3) {
			return "�Ƿ� [���� ��ȣ : " + bNo + ", ���� : " + title + ", �۰� : " + author + "]";
		} else {
			return "��Ÿ [���� ��ȣ : " + bNo + ", ���� : " + title + ", �۰� : " + author + "]";
		}
	}

	@Override
	public int compareTo(Book o) {
		return title.compareTo(o.getTitle());
	}

}
