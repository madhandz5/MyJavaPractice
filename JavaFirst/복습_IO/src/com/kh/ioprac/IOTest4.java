package com.kh.ioprac;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class IOTest4 {

	public static void main(String[] args) {
		fileSyst();

	}

	public static void fileSyst() {

		BufferedInputStream bis = null;
		BufferedOutputStream bos = null;

		int res = 0;
		try {
			bis = new BufferedInputStream(new FileInputStream("C:\\Users\\user2\\OneDrive\\aa.jpg"));
			bos = new BufferedOutputStream(new FileOutputStream("aa.jpg"));
			while ((res = bis.read()) != -1) {
				bos.write(res);
			}
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				bis.close();
				bos.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}

	}

}
