package com.kh.socket.prac01.sample;

import java.io.BufferedInputStream;
import java.io.EOFException;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.net.Socket;

public class TCPClientObject {

	public void sendMessage() {

		// 1. ������ IP�ּҿ� ������ ���� ��Ʈ��ȣ�� �Ű������� �Ͽ�
		// Ŭ���̾�Ʈ�� ���� ��ü ����

		int port = 8080;
		String ipAddr = "192.168.10.33";
		try {
			Socket socket = new Socket(ipAddr, port);
			if (socket != null) {

				// 2. �������� ����� ��Ʈ�� ����
				// 3. ���� ��Ʈ���� ���� ���� ����
				BufferedInputStream bs = new BufferedInputStream(socket.getInputStream());
				ObjectOutputStream objOut = new ObjectOutputStream(socket.getOutputStream());

				// 4. ��Ʈ���� ���� �а� ����
				ObjectInputStream objIn = new ObjectInputStream(new FileInputStream("books.dat"));
				try {
					while (true) {
						Object obj = objIn.readObject();
						objOut.writeObject(obj);
					}

				} catch (EOFException e) {
					objOut.writeObject(null);
					objOut.flush();

					int check = 0;
					String returnMessage = "";
					while ((check = bs.read()) != -1) {
						returnMessage += (char) check;
					}

					if (returnMessage.equals("exit")) {
						System.out.println("�� �ݽ��ϴ�!");
						objOut.close();
						bs.close();
						socket.close();
					}
				}
			}
		} catch (IOException e) {

		} catch (ClassNotFoundException e) {

		}

	}
}
