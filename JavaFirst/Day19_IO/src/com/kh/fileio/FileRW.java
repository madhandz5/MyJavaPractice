package com.kh.fileio;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class FileRW {

	public void fInOut() {
		// * - 자바의 문자는 2바이트 이다.(char)
		// * - Stream. 의 경우 데이터를 1바이트씩 주고 받기 때문에,
		// * - 문자를 다루는 상황에서 영어가 아니라면 문제가 발생할 확률이 높다.
		FileWriter wr = null;
		FileReader rd = null;
		// * 1)OutputStream : 출력스트림, 자바 프로그램 ---> 데이터 목적지
		try {
			wr = new FileWriter("test.txt");
			String str = "아이오 너무 쉽다.";
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
