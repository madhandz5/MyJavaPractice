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

	// * JSON : 데이터를 담는 방식이 2가지로 나뉜다.
	// * Object / Array
	// * Object : {} {} 안에 key, value 형식으로 나열해줍니다.
	// * key, value 쌍을 property, key는 property name
	// * property name 은 String 으로만 담을 수 있다.
	// * 파싱 결과가 Map에 담긴다.
	// * Array : [] [] 안에 값들을 나열해준다.

	// * 값 : 문자열, 숫자, Boolean, Object, Array

	public static void main(String[] args) {

		Gson gson = new Gson();
		FileReader fr = null;
		try {
			fr = new FileReader("jsonTest.json");
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}

		// * fromJson : json 형식을 자바로 파싱해준다.
		// fromJson (Json, 원하는 클래스)
		// Json형식의 데이터를 첫번째 매개변수로 넘기면
		// 두번 째 매개변수에서 지정한 타입으로 반환해준다.
		// * toJson : 매개변수로 데이터를 넘기면 Json형식으로 파싱해준다.
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
			System.out.println("작가 : " + mres.get("author"));
			System.out.println("책제목 : " + mres.get("title"));
			System.out.println("대출횟수 : " + mres.get("cnt"));

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