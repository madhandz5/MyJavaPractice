package com.kh.inheritance.view;

import com.kh.inheritance.model.vo.before.Desktop;
import com.kh.inheritance.model.vo.before.SmartPhone;
import com.kh.inheritance.model.vo.before.Tv;

public class BeforeTest {

	public void beforeTest() {

		Desktop desktop = new Desktop("�Ｚ", "s-01", "��Ʈ��", 200000, "intel", 5000, 8, "windows10", true);

		SmartPhone smartPhone = new SmartPhone("���", "a-04", "���̻�", 1300000, "�㺥ġ", 1024, 4, "iOS", "KT");

		Tv tv = new Tv("LG", "1-11", "LGƼ��", 3500000, 46);

		System.out.println(desktop.information());
		System.out.println(smartPhone.information());
		System.out.println(tv.information());

		// * ����ũž, ����Ʈ��, �ڷ����� ��ü�� ����� ���� �� �� �ִ�.
		// * �� ������ Ŭ�������� �������� �ʵ�� �޼��尡 ����
		// * �̷��� �ߺ��� �θ�Ŭ������ �����Ͽ� �ߺ� �ڵ���� ������ �� �ְ�,
		// * ������ ���������� �� ���� ���� ������ �ʿ���� �θ�Ŭ������ �����ϸ�
		// * ��ü������ �ݿ��� �ȴ�.

		// * Desktop, SmartPhone, Tv�� ���ÿ� ������ �ִ� �ʵ�
		// * ������, ��ǰ��ȣ, ��ǰ��, ���� -> Product
		// * Desktop, SmartPhone�� ���ÿ� ������ �ִ� �ʵ�
		// * cpu, hdd, ram, �ü�� -> Computer
	}
}
