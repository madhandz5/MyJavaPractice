package com.kh.dml.orderby.model.service;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

import com.kh.dml.orderby.model.vo.Student;

public class OrderBy {

	List<Student> sList = new ArrayList<>();

	public void orderBy() {

		sList.add(new Student("C", "UClass", 95));
		sList.add(new Student("B", "BClass", 75));
		sList.add(new Student("B", "AClass", 100));
		sList.add(new Student("A", "CClass", 80));
		sList.add(new Student("A", "BClass", 70));
		sList.add(new Student("B", "BClass", 90));
		sList.add(new Student("A", "BClass", 100));

		sList.sort(new Comparator<Student>() {
			@Override
			public int compare(Student o1, Student o2) {
				if (o1.getName().equals(o2.getName())) {
					return -(o1.getScore() - o2.getScore());
				}
				return o1.getName().compareTo(o2.getName());
			}
		});

		for (Student student : sList) {
			System.out.println(student);
		}
	}
}
