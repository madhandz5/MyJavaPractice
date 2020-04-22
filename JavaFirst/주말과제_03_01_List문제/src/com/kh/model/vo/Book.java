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

		// �ʵ� �� ���ڿ� ��ģ �� ���� category �з� ���� ��� >> 1 : �ι� / 2 : �ڿ����� 3 : �Ƿ� / 4 : ��Ÿ
		String res = "";
		if (category == 1) {
			res = "�ι� [������ȣ = " + bNo + ", ���� = " + title + ", ���� = " + author + "]";
		} else if (category == 2) {
			res = "�ڿ����� [������ȣ = " + bNo + ", ���� = " + title + ", ���� = " + author + "]";
		} else if (category == 3) {
			res = "�Ƿ� [������ȣ = " + bNo + ", ���� = " + title + ", ���� = " + author + "]";
		} else if (category == 4) {
			res = "��Ÿ [������ȣ = " + bNo + ", ���� = " + title + ", ���� = " + author + "]";
		}
		return res;
	}

}
