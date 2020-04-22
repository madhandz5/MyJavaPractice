package com.kh.json;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

import com.google.gson.Gson;

public class JsonParsing {

	// * JSON : �����͸� ��� ����� 2������ ������.
	// * Object / Array
	// * Object : {} {} �ȿ� key, value �������� �������ݴϴ�.
	// * key, value ���� property, key�� property name
	// * property name �� String ���θ� ���� �� �ִ�.
	// * �Ľ� ����� Map�� ����.
	// * Array : [] [] �ȿ� ������ �������ش�.

	// * �� : ���ڿ�, ����, Boolean, Object, Array

	public static void main(String[] args) {

		Gson gson = new Gson();
		FileReader fr = null;
		try {
			fr = new FileReader("jsonTest.json");
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}

		// * fromJson : json ������ �ڹٷ� �Ľ����ش�.
		// fromJson (Json, ���ϴ� Ŭ����)
		// Json������ �����͸� ù��° �Ű������� �ѱ��
		// �ι� ° �Ű��������� ������ Ÿ������ ��ȯ���ش�.
		// * toJson : �Ű������� �����͸� �ѱ�� Json�������� �Ľ����ش�.
		// Map<String, Object> target2 = gson.fromJson(fr, Map.class); // deserializes
		// json into target2

		// System.out.println(target2.get("DESCRIPTION"));
		// System.out.println(target2.get("DATA"));
		// System.out.println(((Map<String, Object>)
		// target2.get("DESCRIPTION")).get("AUTHOR"));

		Map<String, Object> testJson = gson.fromJson(fr, Map.class);

		Map<String, Object> res = ((List<Map<String, Object>>) testJson.get("DATA")).get(0);
		// System.out.println(res.get("author"));

		List<Map<String, Object>> toJsonList = (List<Map<String, Object>>) testJson.get("DATA");

		List<Map> jsonListFinal = new ArrayList<Map>();

		for (Map mres : toJsonList) {
			System.out.println("�۰� : " + mres.get("author"));
			System.out.println("å���� : " + mres.get("title"));
			System.out.println("����Ƚ�� : " + mres.get("cnt"));

			Map<String, Object> toJsonMap = new HashMap<String, Object>();
			toJsonMap.put("author", mres.get("author"));
			toJsonMap.put("title", mres.get("title"));
			toJsonMap.put("cnt", mres.get("cnt"));
			jsonListFinal.add(toJsonMap);
		}

		FileWriter fW = null;
		try {
			fW = new FileWriter("final.json");
			String jsonRes = gson.toJson(jsonListFinal);
			fW.write(jsonRes);
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				fW.close();
				fr.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}

		for (String string : res.keySet()) {
			System.out.println(res.get(string));
		}
		// (List<Map<String,Object>>)testJson.get("DATA");
	} 

}