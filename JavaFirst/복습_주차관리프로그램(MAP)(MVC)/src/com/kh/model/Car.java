package com.kh.model;

public class Car {

	private int carNum;
	private int carType;
	private String owner;

	public Car() {
	}

	public Car(int carNum, int carType, String owner) {
		this.carNum = carNum;
		this.carType = carType;
		this.owner = owner;
	}

	public int getCarNum() {
		return carNum;
	}

	public void setCarNum(int carNum) {
		this.carNum = carNum;
	}

	public int getCarType() {
		return carType;
	}

	public void setCarType(int carType) {
		this.carType = carType;
	}

	public String getOwner() {
		return owner;
	}

	public void setOwner(String owner) {
		this.owner = owner;
	}

	@Override
	public String toString() {

		String carTypeName = "";
		if (carType == 1) {
			carTypeName = "����";
		} else if (carType == 2) {
			carTypeName = "����";
		} else if (carType == 3) {
			carTypeName = "SUV";
		} else if (carType == 4) {
			carTypeName = "Ʈ��";
		}

		return "�������� \n---------\n���� ��ȣ = " + carNum + "\n���� ���� = " + carTypeName + "\n���� �̸� = " + owner;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + carNum;
		result = prime * result + carType;
		result = prime * result + ((owner == null) ? 0 : owner.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Car other = (Car) obj;
		if (carNum != other.carNum)
			return false;
		if (carType != other.carType)
			return false;
		if (owner == null) {
			if (other.owner != null)
				return false;
		} else if (!owner.equals(other.owner))
			return false;
		return true;
	}

}
