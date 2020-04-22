package com.kh.ioprac;

import java.io.File;
import java.io.IOException;

public class IOTest {

	public static void main(String[] args) {
		// * 1. File Class : ��� ���� �� ���� ����
		// * - 1) createNewFile() : File��ü�� ������ �Ű������� ���� ��ο� ���ϸ��� ����ؼ� ������ ����� �ش�.
		// * - 2) mkdirs() : File ��ü�� ������ �Ű������� ���� ����� ������ ����� �ش�.

		// * -- (1). ��� �ȳְ� ���� �����
		File file = new File("test.txt");

		try {
			file.createNewFile();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		String root = "C:\\test\\";

		// * -- (2). ��� �־ ���� �����
		file = new File(root, "test.txt");
		File file1 = new File(root);

		// ��� ���� Ȯ�� �޼���
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
