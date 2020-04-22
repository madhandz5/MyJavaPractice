package com.kh.inherit;

public class SuperClassProduct {

	public String superMember = "부모클래스의 필드변수";

	public void product() {
		System.out.println("슈퍼클래스 : 상품메서드");
	}

	public void productPrice() {
		System.out.println("슈퍼클래스 : 상품가격메서드");
	}

	public void productStock() {
		System.out.println("슈퍼클래스 : 상품재고 메서드");
	}

}
