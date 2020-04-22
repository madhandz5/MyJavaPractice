package com.kh.object.model.vo;

import java.io.Serializable;

public class Phone implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -8993551721646103056L;
	private String maker;
	private int price;

	public Phone() {

	}

	public Phone(String maker, int price) {
		this.maker = maker;
		this.price = price;
	}

	public String getMaker() {
		return maker;
	}

	public void setMaker(String maker) {
		this.maker = maker;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	@Override
	public String toString() {
		return "Phone [maker=" + maker + ", price=" + price + "]";
	}

}
