package com.kh.date.model;

import java.util.GregorianCalendar;

public class DatePrac {

	public long dDay(int year, int month, int day) {

		long res = 0L;

		GregorianCalendar before = new GregorianCalendar();
		GregorianCalendar after = new GregorianCalendar();
		after.set(year, month - 1, day);
		long between = after.getTimeInMillis() - before.getTimeInMillis();

		res = between / 1000; // ��
		res = res / 60; // ��
		res = res / 60; // �ð�
		res = res / 24; // ��

		return res;

	}

}
