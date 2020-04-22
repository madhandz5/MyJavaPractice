package com.kh.test;

public class ExceptionTestMain {

	public static void main(String[] args) {
		Object[] sarr = new String[4];

		sarr[0] = new String("123");
		sarr[1] = new String().valueOf(new Integer(456));
		sarr[2] = (Object) new String();
		sarr[3] = String.valueOf(789);

		for (Object obj : sarr) {
			System.out.println(obj);
		}

	}

}
