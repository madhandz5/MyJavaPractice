package com.kh.map.practice;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.Map.Entry;

import com.kh.map.model.vo.Student;

public class MapControl {

	// * 1. Map
	// * - 키(key)와 값(value)으로 구성되어 있으며, 키와 값은 모두 객체이다.
	// * - 키는 중복을 허용하지 않고 ( set처럼), 값은 중복저장이 가능하다.(list처럼)
	// * - 키는 중복되는 경우에, 기존의 키에 해당하는 값을 덮어쓴다.
	// * - 구현 클래스는 hashMap, LinkedHashMap, Properties 등등

	public void mapEx() {

		Map map = new HashMap();

		// * 1) 맵에 데이터 추가
		map.put("std01", new Student("강동원", 80));
		map.put("std02", new Student("손예진", 70));
		map.put("std03", new Student("조승우", 90));
		map.put("std04", new Student("조승우", 90));

		System.out.println(map);
		// * 2) 키 값 중복 시, value 덮어 씀
		map.put("std04", new Student("김태희", 100));
		System.out.println(map);

		// * 3) MAP에 저장된 데이터 개수 확인
		System.out.println("저장된 데이터 수 : " + map.size());

		// * 4) Map에 들어있는 값 꺼내기
		System.out.println("key = std04 인 value 는 ?" + map.get("std04"));

		// * 5) 해당 키가 Map 에 저장되어 있는지 확인
		// * - containsKey(Object key)
		System.out.println("key == std04 : " + map.containsKey("std04"));

		// * 6) 해당 값이 Map에 저장되어 있는지 확인

		System.out.println(("value == 김태희, 100 : " + map.containsValue(new Student("김태희", 100))));

		// * 7-1) map에서 값을 일괄적으로 꺼내기
		// Set set = map.keySet();
		Iterator iterator = map.keySet().iterator();
		while (iterator.hasNext()) {
			String key = (String) iterator.next();
			System.out.println(map.get(key));

		}
		// * 7-2) values()
		// * - map.values() 값들을 Collection 타입으로 반환
		System.out.println("=====================");
		ArrayList al = new ArrayList<>(map.values());
		for (int i = 0; i < al.size(); i++) {
			System.out.println(al.get(i));
		}

		// * 8) map.entrySet()
		// * - Map 의 내부 인터페이스인 Entry 사용
		// * - Entry : 키와 값을 한 쌍으로 묶은 것 키 = 값 형태
		Set entrySet = map.entrySet();
		Iterator iterator2 = entrySet.iterator();
		while (iterator2.hasNext()) {
			Map.Entry<String, Object> entry = (Entry<String, Object>) iterator2.next();
			System.out.println(entry);

		}
	}

}
