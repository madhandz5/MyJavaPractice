package com.kh.ioprac;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class IOTest2 {

	public static void main(String[] args) {
		File fi = new File("test.txt");

		myOutput(fi);
		myInPut(fi);

	}

	// FileWriter , FileReader
	private static void myOutput(File fi) {

		FileWriter fw;
		try {
			fw = new FileWriter(fi);
			fw.write("연습중입니다.\n");
			fw.append("abc\n");
			fw.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	private static void myInPut(File fi) {
		try {
			FileReader fr = new FileReader(fi);
			int ch;
			while ((ch = fr.read()) != -1) {

				System.out.print((char) ch);

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
