package com.kh.map.model.service;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

import com.kh.map.model.vo.Student;

public class MapController {

	// * 1 . MAP : Ű�� ������ �����Ǿ� �ִ�.
	// * Ű�� SET�� ����ϰ� �ߺ� ������ ������� �ʴ´�.
	// * ���� �ߺ������� ����Ѵ�.

	public void mapEx() {
		Map<String, Student> map = new HashMap<>();

		// * 1) MAP �� ������ �߰�
		// * PUT (Object Key, Object Value);
		// * Ű���� ��ġ�� �����Ͱ� ����� �ȴ�.

		map.put("std01", new Student("�����", 100));
		map.put("std02", new Student("����", 100));
		map.put("std02", new Student("�տ���", 90));

		// System.out.println(map);

		// * 2) �ش� Ű�� ���� Map �� ����Ǿ� �ִ��� �˻�
		// * containsKey(key) : Ű�� ����Ǿ� �ִ� �� �˻�
		// * containsValue(��) : ���� ����Ǿ� �ִ��� �˻�

		// System.out.println(map.containsKey("std01"));
		// System.out.println(map.containsKey("std001"));
		// System.out.println(map.containsValue(new Student("�����", 0)));

		// * 3) Ű ���� �̾Ƴ���

		Set<String> set = map.keySet();

		// for (int i = 0; i < map.size(); i++) {
		// System.out.println(map.get(set));
		// }

		// for (String string : set) {
		// System.out.println(map.get(string));
		// }

		// * 4) ���� �̾Ƴ���
		// values() : Map �� ����� ��ü���� Collection Ÿ������ ��ȯ���ش�.

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
		// // * 5) ���� Ű�� �Բ� �̾Ƴ���
		// // entrySet() : Ű�� ����� ���� set���� ��ȯ�Ѵ�.
		// // entry : Map �������̽� ���ο� ����Ǿ��ִ� �������̽�
		//
		// Set<Map.Entry<String, Student>> entry = map.entrySet();
		//
		// for (Map.Entry me : entry) {
		// System.out.println(me);
		// System.out.println("entry.getKey : " + me.getKey());
		// System.out.println("entry.getValue : " + me.getValue());
		// }

		// * 6) ����
		// remove("Ű��")
		// System.out.println(map.remove("std02"));
		// System.out.println(map);

	}
}
