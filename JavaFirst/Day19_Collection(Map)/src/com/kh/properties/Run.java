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
		// * - Hashtable을 상속받고 있다.
		// * - key 와 value가 모두 String 인 Map처럼 사용할 수 있다.
		// * - 제네릭 필요 없다.
		// * - 파일 입출력을 지원한다.

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

		System.out.println("========properties 저장 및 불러오기 ============");
		try {
			// * 1) 일반파일 저장
			prop.store(new FileOutputStream("prop.properties"), "Comment");

			// * 2) XML : Extensible Markup Language
			// * - Markup Language : 데이터를 저장하고 전달하기 위해 구조화 된 언어
			// * - 확장 가능한 Markup Language : xml은 정해진 태그가 없다.
			prop.storeToXML(new FileOutputStream("prop.xml"), "Comment");
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}

	}
}
