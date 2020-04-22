package com.kh.view;

import java.util.List;
import java.util.ArrayList;
import java.util.LinkedList;

import com.kh.model.vo.Music;

public class ListControl {

	public void doList() {

		// * 1. ArrayList
		// * - ũ�� ���� ����, �������� ������ �⺻�� 10
		// * -

		List list = new LinkedList();
		list.add(new Music("������", "�ٽô� �������"));
		list.add(new Music("�̽�ö", "���"));
		list.add(new Music("�ҳ�ô�", "GEE"));
		list.add("��");

		for (int i = 0; i < list.size(); i++) {
			System.out.println(list.get(i));
		}

		// System.out.println(list);

		// * 1. Add
		// * - ����Ʈ�� ���� �� �߰�

		// * 2. Size
		// * - ����Ʈ�� �� �������� ����

		// * 3. get(int idx)
		// * - ����Ʈ���� �ش� �ε����� �����ϴ� ��ü ��ȯ

		// * 4. add(int index, Object e)
		// * - �ε����� �����Ͽ� �ش� �ε����� e�� �߰�
		System.out.println("------add(int index, Object e)-------");
		list.add(1, new Music("�鿹��", "square"));
		System.out.println(list.size());
		for (int i = 0; i < list.size(); i++) {
			System.out.println(list.get(i));
		}

		// * 5. set(int index, Object e)
		// * - ����Ʈ�� �ش� �ε����� ��ü�� ������ �ʱ�ȭ
		System.out.println("------set(int index, Object e)-------");

		list.set(1, new Music("������", "Blueming"));
		System.out.println(list.size());
		for (int i = 0; i < list.size(); i++) {
			System.out.println(list.get(i));
		}

		// * 6. remove(int index)
		// * - ����Ʈ�� �ش� �ε��� �����ϴ� ��ü ����
		System.out.println("------remove(int index)-------");
		list.remove(1);
		System.out.println(list.size());
		for (int i = 0; i < list.size(); i++) {
			System.out.println(list.get(i));
		}

		// * 7. contains(Object o)
		// * - o�� �����ϰ� �ִ��� Boolean �� ��ȯ
		System.out.println("------contains(Object o)-------");
		System.out.println(list.contains(new Music("������", "�ٽô� �������")));

		// * 8. indexOf(Object o)
		// * - ����Ʈ�� �ش� ��ü�� �ε��� ��ȣ ��ȯ
		System.out.println("------indexOf(Object o)-------");
		System.out.println(list.indexOf(new Music("������", "�ٽô� �������")));

		// * 9. subList(int index1, int index2)
		// * - ����Ʈ index1���� index2 ������ ����Ʈ�� �����Ͽ� ��ȯ
		System.out.println("------subList(int index1, int index2)-------");
		List sub = list.subList(0, 2);
		System.out.println(sub.size());
		for (int i = 0; i < sub.size(); i++) {
			System.out.println(sub.get(i));
		}

		// * 10. isEmpty()
		// * - ����Ʈ�� �ȿ� ���� �ִ��� Boolean �� ��ȯ
		System.out.println("------isEmpty()-------");

		System.out.println(list.isEmpty());

		// * 11. clear()
		// * - ����Ʈ ���� ��� ���� ����
		System.out.println("------clear()-------");
		list.clear();
		System.out.println(list.isEmpty());

	}

	public void doList2() {

		// * 1. ���׸�
		// * - ����
		// * 1) ����� �Ѱ��� Ÿ���� ��ü�� �����ϵ��� ���������ν� ����� �ٸ� Ÿ���� ������� ���ϵ��� �Ѵ�. �������� ����.
		// * 2) �÷��ǿ� ����� ��ü�� ����� ����� �� ��ü�� ������ ���� Ÿ���� Ȯ���ϰ� �� ��ȯ�ϴ� ������ ���� �� �ִ�.

		List<Music> list = new ArrayList<>(1);
		list.add(new Music("������", "�ٽô� �������"));
		list.add(new Music("�̽�ö", "���"));
		list.add(new Music("�ҳ�ô�", "GEE"));
		// list.add("��"); // ���׸� <> ���� Music Type�� �Է¹޵��� ���� �س����Ƿ� ������ ���� ��
		for (Music music : list) {
			System.out.println(music);
		}
	}
}
