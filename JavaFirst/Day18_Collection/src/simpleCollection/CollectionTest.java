package simpleCollection;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class CollectionTest {

	public static void main(String[] args) {

		// List 간단 구현 //

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
		rs.add("가");
		rs.add("나");
		rs.add("다");
		rs.add("라");

		for (String string : rs) {
			System.out.println(string);
		}

		// Iterator 활용하기
		System.out.println("=====Iterator 활용=====");
		Iterator iterator = sList.iterator();
		while (iterator.hasNext()) {
			System.out.println(iterator.next());
		}

		System.out.println("=====Iterator 활용2=====");
		Iterator iterator2 = rs.iterator();
		while (iterator2.hasNext()) {
			System.out.println(iterator2.next());
		}
	}
}
