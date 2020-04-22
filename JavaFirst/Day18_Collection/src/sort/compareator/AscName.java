package sort.compareator;

import java.util.Comparator;

import sort.model.vo.Student;

public class AscName implements Comparator<Student> {

	@Override
	public int compare(Student o1, Student o2) {
		return o1.getName().compareTo(o2.getName());
	}

}
