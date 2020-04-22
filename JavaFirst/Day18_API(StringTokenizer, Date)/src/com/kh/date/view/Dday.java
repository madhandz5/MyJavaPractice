package com.kh.date.view;

import java.util.Scanner;

import com.kh.date.model.DatePrac;

public class Dday {

	DatePrac datePrac = new DatePrac();

	public void mainMenu() {

		Scanner scanner = new Scanner(System.in);
		System.out.println("날짜를 입력해주세요 .");
		System.out.println("연도 : ");
		int year = scanner.nextInt();
		System.out.println("월 : ");
		int month = scanner.nextInt();
		System.out.println("일 : ");
		int day = scanner.nextInt();

		System.out.println(datePrac.dDay(year, month, day) + "일 남았습니다.");

	}

}
