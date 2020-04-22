package set.view;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

import set.model.vo.Student;

public class SetController {

	// * 1. Set �� Ư¡
	// * - ����Ǵ� ���� ������ �������� �ʰ�, �ߺ��� ������� �ʴ´�.
	// * - null�� �ϳ��� �� �� �ִ�.
	// * - ������ �������� List�� �ٸ��� index�� ������ �Ұ����ϰ� get() �޼��嵵 ����.
	// * - ���� Ŭ���� : HashSet, LinkedHashSet, TreeSet

	public void hashSetEx() {

		// * 1) HashSet
		// * - Set�������̽��� ������ ��ǥ���� �÷���
		// * - Hasing�� �̿��ؼ� �����Ǿ��� ������ ���� ���ټӵ��� ����
		// * - �⺻ �����ڷ� ���� ���, �⺻ �뷮�� 16,
		// * - ������ �뷮�� 75%�� �� ������(load factor : 0.75) ��ü �뷮�� �ι� ������Ų��.

		Set<Student> set = new HashSet<>();
		set.add(new Student("������", 99));
		set.add(new Student("�տ���", 85));
		set.add(new Student("����", 70));
		set.add(new Student("������", 99));
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

		System.out.println("===Set -> ArrayList ��ȯ �� ��� ===");
		List setList = new ArrayList(set);
		for (int i = 0; i < setList.size(); i++) {
			System.out.println(setList.get(i));
		}

		setList.add(new Student("������", 99));
		set = new HashSet(setList);

		System.out.println("===Set -> ArrayList===");
		for (Student student : set) {
			System.out.println(student);
		}

	}

}
