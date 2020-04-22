package com.kh.ioprac;

import java.io.File;
import java.io.IOException;

public class IOTest {

	public static void main(String[] args) {
		// * 1. File Class : 경로 설정 및 파일 생성
		// * - 1) createNewFile() : File객체의 생성자 매개변수로 받은 경로와 파일명을 사용해서 파일을 만들어 준다.
		// * - 2) mkdirs() : File 객체의 생성자 매개변수로 받은 경로의 폴더를 만들어 준다.

		// * -- (1). 경로 안넣고 파일 만들기
		File file = new File("test.txt");

		try {
			file.createNewFile();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		String root = "C:\\test\\";

		// * -- (2). 경로 넣어서 파일 만들기
		file = new File(root, "test.txt");
		File file1 = new File(root);

		// 경로 존재 확인 메서드
		if (!file1.exists()) {
			file1.mkdirs();
		}
		try {
			file.createNewFile();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		File file2 = new File(root, "AA");
		file2.mkdirs();
		file2 = new File(root, "AA.txt");
		try {
			file2.createNewFile();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}
}
