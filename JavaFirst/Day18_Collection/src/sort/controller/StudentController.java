package sort.controller;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

import sort.model.vo.Student;

public class StudentController {

	public void testSort() {

		ArrayList<Student> sList = new ArrayList<>();

		sList.add(new Student("¹Ú¿µÈñ", 80));
		sList.add(new Student("±è¿µÈñ", 100));
		sList.add(new Student("ÇÑ¿µÈñ", 90));

		for (Student student : sList) {
			System.out.println(student);
		}

		System.out.println("============sort : Point =============");

		Collections.sort(sList);
		for (int i = 0; i < sList.size(); i++) {
			System.out.println(sList.get(i));
		}

		System.out.println("============sort : Name  =============");
		// sList.sort(new AscName());
		//
		// for (int i = 0; i < sList.size(); i++) {
		// System.out.println(sList.get(i));
		// }

		sList.sort(new Comparator<Student>() {

			@Override
			public int compare(Student o1, Student o2) {
				return o1.getName().compareTo(o2.getName());
			}
		});

		for (int i = 0; i < sList.size(); i++) {
			System.out.println(sList.get(i));
		}

	}
}
