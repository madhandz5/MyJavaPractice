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

		// 1. 서버의 IP주소와 서버가 정한 포트번호를 매개변수로 하여
		// 클라이언트용 소켓 객체 생성

		int port = 8080;
		String ipAddr = "192.168.10.33";
		try {
			Socket socket = new Socket(ipAddr, port);
			if (socket != null) {

				// 2. 서버와의 입출력 스트림 오픈
				// 3. 보조 스트림을 통한 성능 개선
				BufferedInputStream bs = new BufferedInputStream(socket.getInputStream());
				ObjectOutputStream objOut = new ObjectOutputStream(socket.getOutputStream());

				// 4. 스트림을 통한 읽고 쓰기
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
						System.out.println("문 닫습니다!");
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
