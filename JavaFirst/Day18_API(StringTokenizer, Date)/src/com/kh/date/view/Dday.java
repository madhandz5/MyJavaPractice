package com.kh.date.view;

import java.util.Scanner;

import com.kh.date.model.DatePrac;

public class Dday {

	DatePrac datePrac = new DatePrac();

	public void mainMenu() {

		Scanner scanner = new Scanner(System.in);
		System.out.println("��¥�� �Է����ּ��� .");
		System.out.println("���� : ");
		int year = scanner.nextInt();
		System.out.println("�� : ");
		int month = scanner.nextInt();
		System.out.println("�� : ");
		int day = scanner.nextInt();

		System.out.println(datePrac.dDay(year, month, day) + "�� ���ҽ��ϴ�.");

	}

}
