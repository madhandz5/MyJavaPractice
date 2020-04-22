package com.kh.properties.model;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;
import java.util.Set;

public class ProController {

	// * 1. Properties
	// key 와 value 가 모두 String 인 맵이다.
	// setProperty : 입력 시
	// getProperty : 출력 시
	// store() / storeToXML() : 파일로 저장
	// load() / loadFromXML() : 파일에서 데이터 불러오기

	public void prop01() {
		Properties prop = new Properties();

		prop.setProperty("Date", "2020-02-14");
		prop.setProperty("Day", "Friday");
		prop.setProperty("Time", "18:14");
		prop.setProperty("Time", "14:18");

		System.out.println(prop);

		System.out.println("----------키 값으로 출력하기--------");
		System.out.println(prop.getProperty("Date"));

		System.out.println("-----------일괄출력--------------");
		Set<String> st = prop.stringPropertyNames();

		for (String k : st) {
			System.out.println(prop.getProperty(k));
		}
	}

	// XML 파일로 데이터를 출력할 수 있다.
	// 확장 가능한 마크업 언어
	// 마크업 언어 : 데이터를 전달하기 위해서 디자인된 언어
	public void prop02() {

		Properties prop = new Properties();
		prop.setProperty("Date", "2020-02-14");
		prop.setProperty("Day", "Fri");
		prop.setProperty("Time", "19:06");

		// 파일 저장하기
		// store() / storeToXML()

		try {
			prop.store(new FileOutputStream("prop.properties"), "cmt");
			prop.storeToXML(new FileOutputStream("prop.xml"), "cmt");
		} catch (IOException e) {
			e.printStackTrace();
		}

		// 파일 불러오기
		// load() / loadFromXML()

		Properties readProp = new Properties();
		try {
			readProp.load(new FileInputStream("prop.properties"));
			System.out.println("----------키로 값 가져오기----------");
			System.out.println(readProp.getProperty("Date"));

			System.out.println("---------일괄 출력해보기------------");

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
