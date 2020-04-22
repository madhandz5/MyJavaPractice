package com.kh.data;

public class TestCasting {
	public static void main(String[] args) {
		long longVal = 100l;
		int intVal = (int) longVal;
		System.out.println(intVal);

		double dValue = 123.5;
		int iValue = (int) dValue;
		System.out.println("dValue : " + dValue + ", iValue : " + iValue);

		System.out.println((int) Math.round(dValue));

	}

}
