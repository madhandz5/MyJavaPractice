package com.kh.map.practice;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MapPrac {

	public void mapPrac() {
		Map<String, Object> memberData = new HashMap<String, Object>();
		memberData.put("�̸�", "�ϸ�");
		memberData.put("����", "����");
		memberData.put("����", "��");
		memberData.put("���", "���ڱ�");

		Map<String, Object> memberData2 = new HashMap<String, Object>();
		memberData2.put("�̸�", "ȫ�浿");
		memberData2.put("����", "����");
		memberData2.put("����", "��");
		memberData2.put("���", "������");
		memberData2.put("Ư¡", "���Ƿο�");

		Map<String, Object> memberData3 = new HashMap<String, Object>();
		memberData3.put("�̸�", "�䳢");
		memberData3.put("����", "���");
		memberData3.put("����", "����");
		memberData3.put("���", "��ٸԱ�");
		memberData3.put("Ư¡", "������");
		memberData3.put("����", "�Ϳ���");

		List<Map<String, Object>> members = new ArrayList<Map<String, Object>>();
		members.add(memberData);
		members.add(memberData2);
		members.add(memberData3);
		for (int i = 0; i < members.size(); i++) {
			System.out.println(members.get(i));
		}
		Map<String, Object> allMap = new HashMap<String, Object>();
		allMap.put("memberDatas", members);
	}
}
