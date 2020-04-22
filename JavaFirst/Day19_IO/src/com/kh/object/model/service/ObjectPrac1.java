package com.kh.object.model.service;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

import com.kh.object.model.vo.Phone;
import com.kh.object.model.vo.Student;
import com.kh.object.model.vo.Teacher;

public class ObjectPrac1 {

	// writeObject() : ��ü�� ���Ͽ� ����
	// readObject() : ��ü�� ���Ͽ��� �о����
	// readObject�� ObjectŸ������ �����ϱ� ������, ĳ������ �ʿ��ϴ�.
	// ��ü�� Stream�� ����ؼ� �ܺ��ڿ��� �ְ�ޱ� ���ؼ���
	// ��ü�� Byte������ �����ϴ� ����ȭ ������ ���ľ� �Ѵ�.
	// serializable �������̽��� Ŭ������ �����ϸ�, �ش� Ŭ������ ����ȭ ������ Ŭ������ �ȴ�.

	public void objectPrac1() {

		Phone[] ph = { new Phone("�Ｚ", 70), new Phone("LG", 65), new Phone("ȭ����", 40) };

		Student[] st = { new Student("�л�1", 18, 'M', ph[0]), new Student("�л�2", 18, 'W', ph[1]),
				new Student("�л�3", 18, 'M', ph[2]) };

		Teacher tc = new Teacher("U", "�ϸ�");

		// try with resource ��
		// �ڵ����� close ó���� ���ش�.
		// .dat Ȯ���ڴ� ������ �����̶�� �ǹ̸� ���Ѵ�.
		try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("student.dat"));
				ObjectInputStream ois = new ObjectInputStream(new FileInputStream("student.dat"))) {

			for (int i = 0; i < ph.length; i++) {
				oos.writeObject(ph[i]);
			}
			for (int i = 0; i < st.length; i++) {
				oos.writeObject(st[i]);
			}
			oos.writeObject(tc);

			// System.out.println((Student) ois.readObject());

			// ���Ϸκ��� �Է�
			for (int i = 0; i < ph.length; i++) {
				System.out.println(ois.readObject());
			}
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
