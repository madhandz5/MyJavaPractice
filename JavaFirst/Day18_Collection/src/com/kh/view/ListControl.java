package com.kh.view;

import java.util.List;
import java.util.ArrayList;
import java.util.LinkedList;

import com.kh.model.vo.Music;

public class ListControl {

	public void doList() {

		// * 1. ArrayList
		// * - 크기 지정 가능, 지정하지 않으면 기본이 10
		// * -

		List list = new LinkedList();
		list.add(new Music("백지영", "다시는 사랑하지"));
		list.add(new Music("이승철", "희야"));
		list.add(new Music("소녀시대", "GEE"));
		list.add("끝");

		for (int i = 0; i < list.size(); i++) {
			System.out.println(list.get(i));
		}

		// System.out.println(list);

		// * 1. Add
		// * - 리스트의 끝에 값 추가

		// * 2. Size
		// * - 리스트에 들어간 데이터의 갯수

		// * 3. get(int idx)
		// * - 리스트에서 해당 인덱스에 존재하는 객체 반환

		// * 4. add(int index, Object e)
		// * - 인덱스를 지정하여 해당 인덱스에 e를 추가
		System.out.println("------add(int index, Object e)-------");
		list.add(1, new Music("백예린", "square"));
		System.out.println(list.size());
		for (int i = 0; i < list.size(); i++) {
			System.out.println(list.get(i));
		}

		// * 5. set(int index, Object e)
		// * - 리스트의 해당 인덱스의 객체의 데이터 초기화
		System.out.println("------set(int index, Object e)-------");

		list.set(1, new Music("아이유", "Blueming"));
		System.out.println(list.size());
		for (int i = 0; i < list.size(); i++) {
			System.out.println(list.get(i));
		}

		// * 6. remove(int index)
		// * - 리스트의 해당 인덱스 존재하는 객체 삭제
		System.out.println("------remove(int index)-------");
		list.remove(1);
		System.out.println(list.size());
		for (int i = 0; i < list.size(); i++) {
			System.out.println(list.get(i));
		}

		// * 7. contains(Object o)
		// * - o를 포함하고 있는지 Boolean 값 반환
		System.out.println("------contains(Object o)-------");
		System.out.println(list.contains(new Music("백지영", "다시는 사랑하지")));

		// * 8. indexOf(Object o)
		// * - 리스트의 해당 객체의 인덱스 번호 반환
		System.out.println("------indexOf(Object o)-------");
		System.out.println(list.indexOf(new Music("백지영", "다시는 사랑하지")));

		// * 9. subList(int index1, int index2)
		// * - 리스트 index1부터 index2 전까지 리스트로 추출하여 반환
		System.out.println("------subList(int index1, int index2)-------");
		List sub = list.subList(0, 2);
		System.out.println(sub.size());
		for (int i = 0; i < sub.size(); i++) {
			System.out.println(sub.get(i));
		}

		// * 10. isEmpty()
		// * - 리스트가 안에 값이 있는지 Boolean 값 반환
		System.out.println("------isEmpty()-------");

		System.out.println(list.isEmpty());

		// * 11. clear()
		// * - 리스트 안의 모든 값을 삭제
		System.out.println("------clear()-------");
		list.clear();
		System.out.println(list.isEmpty());

	}

	public void doList2() {

		// * 1. 제네릭
		// * - 장점
		// * 1) 명시한 한가지 타입의 객체만 저장하도록 설정함으로써 저장시 다른 타입이 저장되지 못하도록 한다. 안정성이 높다.
		// * 2) 컬렉션에 저장된 객체를 꺼내어서 사용할 때 객체의 종류에 따라 타입을 확인하고 형 변환하는 절차를 없앨 수 있다.

		List<Music> list = new ArrayList<>(1);
		list.add(new Music("백지영", "다시는 사랑하지"));
		list.add(new Music("이승철", "희야"));
		list.add(new Music("소녀시대", "GEE"));
		// list.add("끝"); // 제네릭 <> 으로 Music Type만 입력받도록 강제 해놨으므로 컴파일 에러 남
		for (Music music : list) {
			System.out.println(music);
		}
	}
}
