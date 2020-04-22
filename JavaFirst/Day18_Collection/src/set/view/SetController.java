package set.view;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

import set.model.vo.Student;

public class SetController {

	// * 1. Set 의 특징
	// * - 저장되는 값의 순서를 유지하지 않고, 중복을 허용하지 않는다.
	// * - null도 하나만 들어갈 수 있다.
	// * - 순서가 없음으로 List와 다르게 index로 접근이 불가능하고 get() 메서드도 없다.
	// * - 구현 클래스 : HashSet, LinkedHashSet, TreeSet

	public void hashSetEx() {

		// * 1) HashSet
		// * - Set인터페이스를 구현한 대표적인 컬렉션
		// * - Hasing을 이용해서 구현되었기 때문에 빠른 접근속도를 가짐
		// * - 기본 생성자로 만들 경우, 기본 용량이 16,
		// * - 지정한 용량의 75%가 찰 때마다(load factor : 0.75) 전체 용량을 두배 증가시킨다.

		Set<Student> set = new HashSet<>();
		set.add(new Student("김태희", 99));
		set.add(new Student("손예진", 85));
		set.add(new Student("김희선", 70));
		set.add(new Student("김태희", 99));
		System.out.println(set);

		System.out.println("===Iterator===");
		Iterator<Student> iterator = set.iterator();
		while (iterator.hasNext()) {
			System.out.println(iterator.next());
		}
		System.out.println("===For each===");
		for (Student student : set) {
			System.out.println(student);
		}

		System.out.println("===Set -> ArrayList 변환 후 출력 ===");
		List setList = new ArrayList(set);
		for (int i = 0; i < setList.size(); i++) {
			System.out.println(setList.get(i));
		}

		setList.add(new Student("김태희", 99));
		set = new HashSet(setList);

		System.out.println("===Set -> ArrayList===");
		for (Student student : set) {
			System.out.println(student);
		}

	}

}
