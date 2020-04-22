package com.kh.jdbc.practice;

import java.io.Serializable;

public class Item implements Serializable {

	private static final long serialVersionUID = 8529854220521783814L;
	private String item;
	private String type;
	private int price;
	private int stock;

	public Item() {

	}

	public Item(String item, String type, int price, int stock) {
		this.item = item;
		this.type = type;
		this.price = price;
		this.stock = stock;
	}

	public String getItem() {
		return item;
	}

	public void setItem(String item) {
		this.item = item;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public int getStock() {
		return stock;
	}

	public void setStock(int stock) {
		this.stock = stock;
	}

	@Override
	public String toString() {
		return "Item [item=" + item + ", type=" + type + ", price=" + price + ", stock=" + stock + "]";
	}

}
