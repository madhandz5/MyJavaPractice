package com.kh.properties;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Iterator;
import java.util.Properties;
import java.util.Set;

public class Run {
	public static void main(String[] args) {

		// * 1. properties
		// * - Hashtable�� ��ӹް� �ִ�.
		// * - key �� value�� ��� String �� Mapó�� ����� �� �ִ�.
		// * - ���׸� �ʿ� ����.
		// * - ���� ������� �����Ѵ�.

		Properties prop = new Properties();
		prop.setProperty("Date", "20200122");
		prop.setProperty("Day", "Wed");
		prop.setProperty("Time", "17:06");
		prop.setProperty("Time", "18:06");

		System.out.println(prop);

		Set st = prop.keySet();
		Iterator iterator = st.iterator();
		while (iterator.hasNext()) {
			String key = (String) iterator.next();
			System.out.println(key);
			System.out.println(prop.get(key));
		}

		System.out.println("========properties ���� �� �ҷ����� ============");
		try {
			// * 1) �Ϲ����� ����
			prop.store(new FileOutputStream("prop.properties"), "Comment");

			// * 2) XML : Extensible Markup Language
			// * - Markup Language : �����͸� �����ϰ� �����ϱ� ���� ����ȭ �� ���
			// * - Ȯ�� ������ Markup Language : xml�� ������ �±װ� ����.
			prop.storeToXML(new FileOutputStream("prop.xml"), "Comment");
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}

	}
}
