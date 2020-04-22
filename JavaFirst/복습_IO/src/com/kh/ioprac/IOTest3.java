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

		// listFiles : ������ �Ű������� �־��� ��� �Ʒ��� �ִ� ������ ���� ������ ��� �´�.

		for (File file : fi.listFiles()) {
			if (file.isDirectory()) {
				dir_cnt++;
				System.out.println("dir : " + file);
			} else {
				file_cnt++;
				System.out.println("file : " + file);
			}
		}

		System.out.println("������ ���� : " + dir_cnt + " �� ");
		System.out.println("������ ���� : " + file_cnt + " �� ");
	}
}
