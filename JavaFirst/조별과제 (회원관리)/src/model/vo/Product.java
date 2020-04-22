package model.vo;

public class Product {

	private String pName;
	private int pPrice;
	private int stock;

	public Product() {

	}

	public Product(String pName, int pPrice, int stock) {
		this.pName = pName;
		this.pPrice = pPrice;
		this.stock = stock;
	}

	public String getpName() {
		return pName;
	}

	public void setpName(String pName) {
		this.pName = pName;
	}

	public int getpPrice() {
		return pPrice;
	}

	public void setpPrice(int pPrice) {
		this.pPrice = pPrice;
	}

	public int getStock() {
		return stock;
	}

	public void setStock(int stock) {
		this.stock = stock;
	}

	@Override
	public String toString() {
		return "상품이름 = " + pName + ", 상품 가격 = " + pPrice + ", 재고 : " + stock;
	}

}
