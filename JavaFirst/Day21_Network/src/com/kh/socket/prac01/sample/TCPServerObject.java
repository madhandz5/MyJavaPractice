package com.kh.socket.prac01.sample;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;

public class TCPServerObject {

	public void serverStart() {

		// 1. 서버의 포트번호를 정함.
		int port = 8080;
		ServerSocket serverSocket = null;
		try {
			// 2. ServerSocket 만들기.
			serverSocket = new ServerSocket(port);
			// 3. Client 쪽에서 요청이 오길 기다림.
			// 4. 접속 요처이 오면 요청 수락 후 해당 클라이언트에 대한 소켓 객체 생성
			Socket client = serverSocket.accept();
			String clientIp = client.getInetAddress().getHostAddress();
			System.out.println(clientIp + "와 연결이 되었습니다.");

			// 5. 연결 된 클라이언트 와 입출력 스트림 생성
			ObjectInputStream ois = new ObjectInputStream(client.getInputStream());
			OutputStream output = client.getOutputStream();

			Object res = ois.readObject();
			System.out.println(res);

			// 6. 보조 스트림을 사용해서 성능 개선
			// 7. 스트림 통한 읽고 쓰기 완성
			PrintWriter pw = new PrintWriter(output);
			pw.print("exit");
			pw.flush();

			pw.close();
			ois.close();
			serverSocket.close();

		} catch (IOException e) {
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
	}
}
