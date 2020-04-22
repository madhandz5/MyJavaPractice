package com.kh.fileio;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class FileRW {

	public void fInOut() {
		// * - �ڹ��� ���ڴ� 2����Ʈ �̴�.(char)
		// * - Stream. �� ��� �����͸� 1����Ʈ�� �ְ� �ޱ� ������,
		// * - ���ڸ� �ٷ�� ��Ȳ���� ��� �ƴ϶�� ������ �߻��� Ȯ���� ����.
		FileWriter wr = null;
		FileReader rd = null;
		// * 1)OutputStream : ��½�Ʈ��, �ڹ� ���α׷� ---> ������ ������
		try {
			wr = new FileWriter("test.txt");
			String str = "���̿� �ʹ� ����.";
			wr.write(str.toCharArray());
			wr.flush();

			rd = new FileReader("test.txt");
			int check = 0;
			// System.out.println(check);
			System.out.print((char) check);
			while ((check = rd.read()) != -1) {
				System.out.print((char) check);
			}
			
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				wr.close();
				rd.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}
}
