package com.kh.prac;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileTest {

	public void fileTest() {
		try {
			FileInputStream fis = new FileInputStream("C:\\Users\\user2\\Desktop\\아이콘.jpg");
			FileOutputStream fos = new FileOutputStream("아이콘.jpg");
			int check = 0;
			while ((check = fis.read()) != -1) {
				fos.write(check);
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
