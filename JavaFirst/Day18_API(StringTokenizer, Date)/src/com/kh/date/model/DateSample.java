package com.kh.date.model;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

public class DateSample {

	// * 1. Date
	// * - Date클래스는 자바 초기에 만들어져서 완성도가 낮다.
	// * - 다국적으로 쓰기에 적합하지 않다.
	// * - 기준시간이 1970년 1월 1일 0시 0분 0초이다.
	// * - Date는 년도, +1900, 월은 +1을 내부적으로 해줘야 한다.

	public void date() {

		Date today = new Date(); // 현재 시간
		System.out.println(today);

		SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd E요일");
		System.out.println(simpleDateFormat.format(today));

		// 시간에 대해 원하는 것 뽑아보기

		System.out.println("Date클래스 연도 : " + (today.getYear() + 1900));
		System.out.println("Date클래스 월 : " + (today.getMonth() + 1));
		System.out.println("Date클래스 일 : " + today.getDate());
		System.out.println("Date클래스 시 : " + today.getHours());
		System.out.println("Date클래스 분: " + today.getMinutes());
		System.out.println("Date클래스 초 : " + today.getSeconds());
		System.out.println("Date클래스 요일 : " + today.getDay());
	}

	public void calendarSample() {
		System.out.println("=====Calander=====");

		// * 2. Calendar
		// * - 월만 +1을 해주면 된다. (년도는 직접입력 ex) 19라고 적으면 그냥 19년도로 인식
		// * - field number 개념이 도입
		// * - 추상클래스 -> getInstance

		Calendar calendar = Calendar.getInstance();
		if (calendar instanceof GregorianCalendar) {
			System.out.println("Calendar 클래스의 인스턴스는 GregorianCalendar의 인스턴스 입니다.");

		}
		System.out.println(calendar.getTime());
		System.out.println("Calendar 년 : " + calendar.get(calendar.YEAR));
		System.out.println("Calendar 월 : " + calendar.get(calendar.MONTH));
		System.out.println("Calendar 일 : " + calendar.get(calendar.DAY_OF_MONTH));
		System.out.println("Calendar 시 : " + calendar.get(calendar.HOUR));
		System.out.println("Calendar 분 : " + calendar.get(calendar.MINUTE));
		System.out.println("Calendar 초 : " + calendar.get(calendar.SECOND));
		System.out.println("Calendar 요일 : " + calendar.get(calendar.DAY_OF_WEEK));

		System.out.println("=============Calendar 2============");

		Calendar calendar2 = Calendar.getInstance();
		Date today = new Date();
		calendar2.setTime(today);
		System.out.println(calendar2.getTime());
		System.out.println("calendar2 년 : " + calendar2.get(calendar2.YEAR));
		System.out.println("calendar2 월 : " + calendar2.get(calendar2.MONTH));
		System.out.println("calendar2 일 : " + calendar2.get(calendar2.DAY_OF_MONTH));
		System.out.println("calendar2 시 : " + calendar2.get(calendar2.HOUR));
		System.out.println("calendar2 분 : " + calendar2.get(calendar2.MINUTE));
		System.out.println("calendar2 초 : " + calendar2.get(calendar2.SECOND));
		System.out.println("calendar2 요일 : " + calendar2.get(calendar2.DAY_OF_WEEK));

	}

	public void gregorianSample() {

		System.out.println("------------Gregorian-------------");

		GregorianCalendar gc = (GregorianCalendar) Calendar.getInstance();
		Date today = new Date();
		gc.setTime(today);
		System.out.println(gc.getTime());
		System.out.println("gc 년 : " + gc.get(gc.YEAR));
		System.out.println("gc 월 : " + gc.get(gc.MONTH));
		System.out.println("gc 일 : " + gc.get(gc.DAY_OF_MONTH));
		System.out.println("gc 시 : " + gc.get(gc.HOUR));
		System.out.println("gc 분 : " + gc.get(gc.MINUTE));
		System.out.println("gc 초 : " + gc.get(gc.SECOND));
		System.out.println("gc 요일 : " + gc.get(gc.DAY_OF_WEEK));

	}

}
