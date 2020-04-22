package com.kh.model.vo;

import java.io.Serializable;
import java.text.SimpleDateFormat;
import java.util.Calendar;

public class Book implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -7434724601946805078L;

	private String title;
	private String author;
	private int price;
	private Calendar dates;
	private double disCount;

	public Book() {

	}

	public Book(String title, String author, int price, Calendar dates, double disCount) {
		this.title = title;
		this.author = author;
		this.price = price;
		this.dates = dates;
		this.disCount = disCount;
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

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public Calendar getDates() {
		return dates;
	}

	public void setDates(Calendar dates) {
		this.dates = dates;
	}

	public double getDisCount() {
		return disCount;
	}

	public void setDisCount(double disCount) {
		this.disCount = disCount;
	}

	@Override
	public String toString() {
		SimpleDateFormat format = new SimpleDateFormat("yyyy년 M월 d일");
		return title + "  " + author + "  " + price + "  " + format.format(dates.getTime()) + " 출간  " + disCount;
	}

}
