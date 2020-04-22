package simpleCollection;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class CollectionTest {

	public static void main(String[] args) {

		// List ���� ���� //

		System.out.println("===Genelic==<String>=====");
		SimpleList<String> sList = new SimpleList<String>();
		sList.add("A");
		sList.add("B");
		sList.add("C");
		sList.add("D");

		for (String i : sList) {
			System.out.println(i);
		}

		System.out.println("=========================");
		List<String> rs = new ArrayList<String>();
		rs.add("��");
		rs.add("��");
		rs.add("��");
		rs.add("��");

		for (String string : rs) {
			System.out.println(string);
		}

		// Iterator Ȱ���ϱ�
		System.out.println("=====Iterator Ȱ��=====");
		Iterator iterator = sList.iterator();
		while (iterator.hasNext()) {
			System.out.println(iterator.next());
		}

		System.out.println("=====Iterator Ȱ��2=====");
		Iterator iterator2 = rs.iterator();
		while (iterator2.hasNext()) {
			System.out.println(iterator2.next());
		}
	}
}
