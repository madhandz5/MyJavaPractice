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
	// * - Ű(key)�� ��(value)���� �����Ǿ� ������, Ű�� ���� ��� ��ü�̴�.
	// * - Ű�� �ߺ��� ������� �ʰ� ( setó��), ���� �ߺ������� �����ϴ�.(listó��)
	// * - Ű�� �ߺ��Ǵ� ��쿡, ������ Ű�� �ش��ϴ� ���� �����.
	// * - ���� Ŭ������ hashMap, LinkedHashMap, Properties ���

	public void mapEx() {

		Map map = new HashMap();

		// * 1) �ʿ� ������ �߰�
		map.put("std01", new Student("������", 80));
		map.put("std02", new Student("�տ���", 70));
		map.put("std03", new Student("���¿�", 90));
		map.put("std04", new Student("���¿�", 90));

		System.out.println(map);
		// * 2) Ű �� �ߺ� ��, value ���� ��
		map.put("std04", new Student("������", 100));
		System.out.println(map);

		// * 3) MAP�� ����� ������ ���� Ȯ��
		System.out.println("����� ������ �� : " + map.size());

		// * 4) Map�� ����ִ� �� ������
		System.out.println("key = std04 �� value �� ?" + map.get("std04"));

		// * 5) �ش� Ű�� Map �� ����Ǿ� �ִ��� Ȯ��
		// * - containsKey(Object key)
		System.out.println("key == std04 : " + map.containsKey("std04"));

		// * 6) �ش� ���� Map�� ����Ǿ� �ִ��� Ȯ��

		System.out.println(("value == ������, 100 : " + map.containsValue(new Student("������", 100))));

		// * 7-1) map���� ���� �ϰ������� ������
		// Set set = map.keySet();
		Iterator iterator = map.keySet().iterator();
		while (iterator.hasNext()) {
			String key = (String) iterator.next();
			System.out.println(map.get(key));

		}
		// * 7-2) values()
		// * - map.values() ������ Collection Ÿ������ ��ȯ
		System.out.println("=====================");
		ArrayList al = new ArrayList<>(map.values());
		for (int i = 0; i < al.size(); i++) {
			System.out.println(al.get(i));
		}

		// * 8) map.entrySet()
		// * - Map �� ���� �������̽��� Entry ���
		// * - Entry : Ű�� ���� �� ������ ���� �� Ű = �� ����
		Set entrySet = map.entrySet();
		Iterator iterator2 = entrySet.iterator();
		while (iterator2.hasNext()) {
			Map.Entry<String, Object> entry = (Entry<String, Object>) iterator2.next();
			System.out.println(entry);

		}
	}

}
