package com.kh.date.model;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

public class DateSample {

	// * 1. Date
	// * - DateŬ������ �ڹ� �ʱ⿡ ��������� �ϼ����� ����.
	// * - �ٱ������� ���⿡ �������� �ʴ�.
	// * - ���ؽð��� 1970�� 1�� 1�� 0�� 0�� 0���̴�.
	// * - Date�� �⵵, +1900, ���� +1�� ���������� ����� �Ѵ�.

	public void date() {

		Date today = new Date(); // ���� �ð�
		System.out.println(today);

		SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd E����");
		System.out.println(simpleDateFormat.format(today));

		// �ð��� ���� ���ϴ� �� �̾ƺ���

		System.out.println("DateŬ���� ���� : " + (today.getYear() + 1900));
		System.out.println("DateŬ���� �� : " + (today.getMonth() + 1));
		System.out.println("DateŬ���� �� : " + today.getDate());
		System.out.println("DateŬ���� �� : " + today.getHours());
		System.out.println("DateŬ���� ��: " + today.getMinutes());
		System.out.println("DateŬ���� �� : " + today.getSeconds());
		System.out.println("DateŬ���� ���� : " + today.getDay());
	}

	public void calendarSample() {
		System.out.println("=====Calander=====");

		// * 2. Calendar
		// * - ���� +1�� ���ָ� �ȴ�. (�⵵�� �����Է� ex) 19��� ������ �׳� 19�⵵�� �ν�
		// * - field number ������ ����
		// * - �߻�Ŭ���� -> getInstance

		Calendar calendar = Calendar.getInstance();
		if (calendar instanceof GregorianCalendar) {
			System.out.println("Calendar Ŭ������ �ν��Ͻ��� GregorianCalendar�� �ν��Ͻ� �Դϴ�.");

		}
		System.out.println(calendar.getTime());
		System.out.println("Calendar �� : " + calendar.get(calendar.YEAR));
		System.out.println("Calendar �� : " + calendar.get(calendar.MONTH));
		System.out.println("Calendar �� : " + calendar.get(calendar.DAY_OF_MONTH));
		System.out.println("Calendar �� : " + calendar.get(calendar.HOUR));
		System.out.println("Calendar �� : " + calendar.get(calendar.MINUTE));
		System.out.println("Calendar �� : " + calendar.get(calendar.SECOND));
		System.out.println("Calendar ���� : " + calendar.get(calendar.DAY_OF_WEEK));

		System.out.println("=============Calendar 2============");

		Calendar calendar2 = Calendar.getInstance();
		Date today = new Date();
		calendar2.setTime(today);
		System.out.println(calendar2.getTime());
		System.out.println("calendar2 �� : " + calendar2.get(calendar2.YEAR));
		System.out.println("calendar2 �� : " + calendar2.get(calendar2.MONTH));
		System.out.println("calendar2 �� : " + calendar2.get(calendar2.DAY_OF_MONTH));
		System.out.println("calendar2 �� : " + calendar2.get(calendar2.HOUR));
		System.out.println("calendar2 �� : " + calendar2.get(calendar2.MINUTE));
		System.out.println("calendar2 �� : " + calendar2.get(calendar2.SECOND));
		System.out.println("calendar2 ���� : " + calendar2.get(calendar2.DAY_OF_WEEK));

	}

	public void gregorianSample() {

		System.out.println("------------Gregorian-------------");

		GregorianCalendar gc = (GregorianCalendar) Calendar.getInstance();
		Date today = new Date();
		gc.setTime(today);
		System.out.println(gc.getTime());
		System.out.println("gc �� : " + gc.get(gc.YEAR));
		System.out.println("gc �� : " + gc.get(gc.MONTH));
		System.out.println("gc �� : " + gc.get(gc.DAY_OF_MONTH));
		System.out.println("gc �� : " + gc.get(gc.HOUR));
		System.out.println("gc �� : " + gc.get(gc.MINUTE));
		System.out.println("gc �� : " + gc.get(gc.SECOND));
		System.out.println("gc ���� : " + gc.get(gc.DAY_OF_WEEK));

	}

}
