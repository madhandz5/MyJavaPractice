package com.kh.map.model.service;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

import com.kh.map.model.vo.Student;

public class MapController {

	// * 1 . MAP : 키와 값으로 구성되어 있다.
	// * 키는 SET과 비슷하게 중복 저장을 허용하지 않는다.
	// * 값은 중복저장을 허용한다.

	public void mapEx() {
		Map<String, Student> map = new HashMap<>();

		// * 1) MAP 에 데이터 추가
		// * PUT (Object Key, Object Value);
		// * 키값이 겹치면 데이터가 덮어쓰기 된다.

		map.put("std01", new Student("김고은", 100));
		map.put("std02", new Student("공유", 100));
		map.put("std02", new Student("손예진", 90));

		// System.out.println(map);

		// * 2) 해당 키와 값이 Map 에 저장되어 있는지 검사
		// * containsKey(key) : 키가 저장되어 있는 지 검사
		// * containsValue(값) : 값이 저장되어 있는지 검사

		// System.out.println(map.containsKey("std01"));
		// System.out.println(map.containsKey("std001"));
		// System.out.println(map.containsValue(new Student("김고은", 0)));

		// * 3) 키 값만 뽑아내기

		Set<String> set = map.keySet();

		// for (int i = 0; i < map.size(); i++) {
		// System.out.println(map.get(set));
		// }

		// for (String string : set) {
		// System.out.println(map.get(string));
		// }

		// * 4) 값만 뽑아내기
		// values() : Map 에 저장된 객체들을 Collection 타입으로 반환해준다.

		List<Student> valueList = new ArrayList<>(map.values());

		Set<Student> valueSet = new HashSet<>(map.values());

		// for (Student student : valueSet) {
		// System.out.println(student);
		// }
		//
		// for (Student students : valueList) {
		// System.out.println(students);
		// }
		//
		// // * 5) 값과 키를 함께 뽑아내기
		// // entrySet() : 키와 밸류의 값을 set으로 반환한다.
		// // entry : Map 인터페이스 내부에 선언되어있는 인터페이스
		//
		// Set<Map.Entry<String, Student>> entry = map.entrySet();
		//
		// for (Map.Entry me : entry) {
		// System.out.println(me);
		// System.out.println("entry.getKey : " + me.getKey());
		// System.out.println("entry.getValue : " + me.getValue());
		// }

		// * 6) 삭제
		// remove("키값")
		// System.out.println(map.remove("std02"));
		// System.out.println(map);

	}
}
