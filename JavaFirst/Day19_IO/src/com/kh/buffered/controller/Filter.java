package com.kh.buffered.controller;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class Filter {

	// * - BufferedInputStream
	// * - BufferedOutputStream

	public void buf() {

		BufferedInputStream bis = null;
		BufferedOutputStream bos = null;
		FileOutputStream fos = null;
		// 8192 byte as a default.
		try {
			bis = new BufferedInputStream(System.in);
			fos = new FileOutputStream("buffTest.txt");
			bos = new BufferedOutputStream(fos, 4);
			int check = 0;
			while (bis.available() != 2) {
				check = bis.read();
				bos.write(check);
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

	// writer와 reader가 2바이트 단위로 데이터를 주고 받는 문자를 위한 입출력 클래스 였다면,
	// DataInpu, DataOutput은 기본데이터를 위한 입출력 클래스이다.
	// 데이터 자료형 별로 처리하는 기능을 추가해준다.
	public void data() {

		try (DataOutputStream dOut = new DataOutputStream(new FileOutputStream("member.txt"));
				DataInputStream dIn = new DataInputStream(new FileInputStream("member.txt"))) {

			dOut.writeUTF("홍길동");
			dOut.writeChar('남');
			dOut.writeInt(32);

			dOut.writeUTF("유관순");
			dOut.writeChar('여');
			dOut.writeInt(21);

			while (dIn.available() != 0) {
				System.out.println(dIn.readUTF() + "," + dIn.readChar() + "," + dIn.readInt());
			}

		} catch (Exception e) {
			System.out.println("예외 났지롱");
		}

	}

}
