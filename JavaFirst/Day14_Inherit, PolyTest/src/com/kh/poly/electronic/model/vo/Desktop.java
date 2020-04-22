package com.kh.poly.electronic.model.vo;

public class Desktop extends Electronic {

	private String graphic;

	public Desktop() {
		super();
	}

	public Desktop(String brand, String name, int price, String graphic) {
		super(brand, name, price);
		this.graphic = graphic;
	}

	public String getGraphic() {
		return graphic;
	}

	public void setGraphic(String graphic) {
		this.graphic = graphic;
	}

	@Override
	public String toString() {
		return "Desktop [graphic=" + graphic + "]";
	}

}
