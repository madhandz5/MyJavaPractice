package com.kh.properties.model;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;
import java.util.Set;

public class ProController {

	// * 1. Properties
	// key �� value �� ��� String �� ���̴�.
	// setProperty : �Է� ��
	// getProperty : ��� ��
	// store() / storeToXML() : ���Ϸ� ����
	// load() / loadFromXML() : ���Ͽ��� ������ �ҷ�����

	public void prop01() {
		Properties prop = new Properties();

		prop.setProperty("Date", "2020-02-14");
		prop.setProperty("Day", "Friday");
		prop.setProperty("Time", "18:14");
		prop.setProperty("Time", "14:18");

		System.out.println(prop);

		System.out.println("----------Ű ������ ����ϱ�--------");
		System.out.println(prop.getProperty("Date"));

		System.out.println("-----------�ϰ����--------------");
		Set<String> st = prop.stringPropertyNames();

		for (String k : st) {
			System.out.println(prop.getProperty(k));
		}
	}

	// XML ���Ϸ� �����͸� ����� �� �ִ�.
	// Ȯ�� ������ ��ũ�� ���
	// ��ũ�� ��� : �����͸� �����ϱ� ���ؼ� �����ε� ���
	public void prop02() {

		Properties prop = new Properties();
		prop.setProperty("Date", "2020-02-14");
		prop.setProperty("Day", "Fri");
		prop.setProperty("Time", "19:06");

		// ���� �����ϱ�
		// store() / storeToXML()

		try {
			prop.store(new FileOutputStream("prop.properties"), "cmt");
			prop.storeToXML(new FileOutputStream("prop.xml"), "cmt");
		} catch (IOException e) {
			e.printStackTrace();
		}

		// ���� �ҷ�����
		// load() / loadFromXML()

		Properties readProp = new Properties();
		try {
			readProp.load(new FileInputStream("prop.properties"));
			System.out.println("----------Ű�� �� ��������----------");
			System.out.println(readProp.getProperty("Date"));

			System.out.println("---------�ϰ� ����غ���------------");

			Set<String> strings = readProp.stringPropertyNames();

			for (String key : strings) {

				System.out.println(readProp.getProperty(key));

			}
			readProp.loadFromXML(new FileInputStream("prop.xml"));
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
