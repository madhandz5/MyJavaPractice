package com.kh.object.model.service;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.kh.object.model.vo.Phone;
import com.kh.object.model.vo.Student;
import com.kh.object.model.vo.Teacher;

public class ObjectPrac2 {

	public void objectPrac2() {

		List<Phone> ph = new ArrayList<Phone>();
		ph.add(new Phone("삼성", 70));
		ph.add(new Phone("LG", 65));
		ph.add(new Phone("화웨이", 40));
		List<Student> st = new ArrayList<Student>();
		st.add(new Student("서호영", 18, 'M', ph.get(0)));
		st.add(new Student("김지민", 18, 'W', ph.get(1)));
		st.add(new Student("이상엽", 18, 'M', ph.get(2)));

		List<Teacher> tc = new ArrayList<Teacher>();
		tc.add(new Teacher("U", "하명도"));

		Map<String, Object> commandMap = new HashMap<String, Object>();

		commandMap.put("phoneData", ph);
		commandMap.put("students", st);
		commandMap.put("teacher", tc);

		// try with resource 문
		// 자동으로 close 처리를 해준다.
		// .dat 확장자는 데이터 파일이라는 의미를 지닌다.
		try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("student.dat"));
				ObjectInputStream ois = new ObjectInputStream(new FileInputStream("student.dat"))) {

			try {
				oos.writeObject(commandMap);
				try {
					Map res = (Map) ois.readObject();

					System.out.println("학생 객체를 꺼내서 보고싶다~!");

					List<Student> studentData = (List<Student>) res.get("students");
					for (Student s : studentData) {
						System.out.println(s);
					}
				} catch (ClassNotFoundException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}

			} catch (FileNotFoundException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			} catch (IOException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
