package com.kh.inheritance.model.vo.after;

public class Product {

	private String brand; // 제조사
	private String pCode; // 상품코드
	private String pName; // 상품명
	private int price; // 가격

	public Product() {

	}

	public Product(String brand, String pCode, String pName, int price) {
		super();
		this.brand = brand;
		this.pCode = pCode;
		this.pName = pName;
		this.price = price;
	}

	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	public String getpCode() {
		return pCode;
	}

	public void setpCode(String pCode) {
		this.pCode = pCode;
	}

	public String getpName() {
		return pName;
	}

	public void setpName(String pName) {
		this.pName = pName;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public String information() {

		return "brand = " + brand + ", pCode = " + pCode + ", pName = " + pName + ", price = " + price;
	}
}
