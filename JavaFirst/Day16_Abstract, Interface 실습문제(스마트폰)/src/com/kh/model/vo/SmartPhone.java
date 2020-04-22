package com.kh.model.vo;

public abstract class SmartPhone implements CellPhone, TouchDisplay {

	private String model;

	public SmartPhone() {

	}

	public SmartPhone(String model) {
		this.model = model;
	}

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}
	
	

	
	public abstract void printMaker();

}
