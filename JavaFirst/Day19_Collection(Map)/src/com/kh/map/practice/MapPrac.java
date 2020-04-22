package com.kh.map.practice;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MapPrac {

	public void mapPrac() {
		Map<String, Object> memberData = new HashMap<String, Object>();
		memberData.put("이름", "하명도");
		memberData.put("직업", "강사");
		memberData.put("성별", "남");
		memberData.put("취미", "잠자기");

		Map<String, Object> memberData2 = new HashMap<String, Object>();
		memberData2.put("이름", "홍길동");
		memberData2.put("직업", "의적");
		memberData2.put("성별", "남");
		memberData2.put("취미", "도둑질");
		memberData2.put("특징", "정의로움");

		Map<String, Object> memberData3 = new HashMap<String, Object>();
		memberData3.put("이름", "토끼");
		memberData3.put("직업", "노숙");
		memberData3.put("성별", "암컷");
		memberData3.put("취미", "당근먹기");
		memberData3.put("특징", "영리함");
		memberData3.put("장점", "귀여움");

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
