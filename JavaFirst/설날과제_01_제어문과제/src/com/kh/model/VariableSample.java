package com.kh.model;

import java.util.Scanner;

public class VariableSample {

	public void myProfile() {
		String name = "��â��";
		int age = 35;
		char gender = '��';
		String job = "������";
		String addr = "����";

		System.out.println("=====�� �Ż����������� ��� ����ϱ�=====");
		System.out.println("�̸� : " + name);
		System.out.println("���� : " + age);
		System.out.println("���� : " + gender);
		System.out.println("���� : " + job);
		System.out.println("�ּ� : " + addr);

	}

	Scanner scanner = new Scanner(System.in);

	public void empInformation() {
		System.out.println("�̸� : ");
		String name = scanner.nextLine();
		System.out.println("���� : ");
		int age = scanner.nextInt();
		scanner.nextLine();
		System.out.println("���� : ");
		char gender = scanner.next().charAt(0);
		scanner.nextLine();
		System.out.println("�ּ� : ");
		String addr = scanner.nextLine();
		System.out.println("=====��������� Ű����� �Է¹޾� ����ϱ�=====");
		System.out.println("�̸� : " + name);
		System.out.println("���� : " + age);
		System.out.println("���� : " + gender);
		System.out.println("�ּ� : " + addr);

	}

	String defStr;
	byte defByte;
	short defShort;
	int defInt;
	long defLong;
	char defChar;
	float defFloat;
	double defDouble;
	boolean defBool;

	public void defaultValue() {
		System.out.println("=====�⺻ �ڷ��� ������ �ʱⰪ Ȯ���ϱ�=====");
		System.out.println("String �� �ʱⰪ : " + defStr);
		System.out.println("byte �� �ʱⰪ : " + defByte);
		System.out.println("short �� �ʱⰪ : " + defShort);
		System.out.println("int �� �ʱⰪ : " + defInt);
		System.out.println("long �� �ʱⰪ : " + defLong);
		System.out.println("char �� �ʱⰪ : " + defChar);
		System.out.println("float �� �ʱⰪ : " + defFloat);
		System.out.println("double �� �ʱⰪ : " + defDouble);
		System.out.println("boolean �� �ʱⰪ : " + defBool);
	}
}
