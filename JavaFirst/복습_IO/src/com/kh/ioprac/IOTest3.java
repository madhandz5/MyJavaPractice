package com.kh.ioprac;

import java.io.File;

public class IOTest3 {

	public static void main(String[] args) {

		File file = new File("c:\\");
		printFileInfo(file);

	}

	public static void printFileInfo(File fi) {
		int file_cnt = 0;
		int dir_cnt = 0;

		// listFiles : 생성자 매개변수로 넣어준 경로 아래에 있는 폴더와 파일 정보를 들고 온다.

		for (File file : fi.listFiles()) {
			if (file.isDirectory()) {
				dir_cnt++;
				System.out.println("dir : " + file);
			} else {
				file_cnt++;
				System.out.println("file : " + file);
			}
		}

		System.out.println("폴더의 갯수 : " + dir_cnt + " 개 ");
		System.out.println("파일의 갯수 : " + file_cnt + " 개 ");
	}
}
