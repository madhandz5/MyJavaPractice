package com.kh.operator;

public class StringOperator {

	public void stringOper() {
		int time = 10;
		int time2 = 20;
/*
		System.out.println(time + time2 + "번 열차가 운행됩니다.");
		System.out.println("열차가" + time + time2 + "분에 도착할 예정입니다.");
		System.out.println("열차 도착 시간까지 " + time + time2);
		System.out.println("열차 도착 시간까지 " + (time + time2));
*/
		String res = "열차";
		res += "출발합니다";
		System.out.println(res);
	}

}
