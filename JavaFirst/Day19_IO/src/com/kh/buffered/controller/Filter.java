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

	// writer�� reader�� 2����Ʈ ������ �����͸� �ְ� �޴� ���ڸ� ���� ����� Ŭ���� ���ٸ�,
	// DataInpu, DataOutput�� �⺻�����͸� ���� ����� Ŭ�����̴�.
	// ������ �ڷ��� ���� ó���ϴ� ����� �߰����ش�.
	public void data() {

		try (DataOutputStream dOut = new DataOutputStream(new FileOutputStream("member.txt"));
				DataInputStream dIn = new DataInputStream(new FileInputStream("member.txt"))) {

			dOut.writeUTF("ȫ�浿");
			dOut.writeChar('��');
			dOut.writeInt(32);

			dOut.writeUTF("������");
			dOut.writeChar('��');
			dOut.writeInt(21);

			while (dIn.available() != 0) {
				System.out.println(dIn.readUTF() + "," + dIn.readChar() + "," + dIn.readInt());
			}

		} catch (Exception e) {
			System.out.println("���� ������");
		}

	}

}
