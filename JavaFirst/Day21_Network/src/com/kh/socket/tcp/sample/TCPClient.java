package com.kh.socket.tcp.sample;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;
import java.net.UnknownHostException;

public class TCPClient {

	public void clientStart() {

		// * - 서버의 IP주소 : 여러분들 컴퓨터의 IP 주소
		int port = 8080;
		String serverIp = "192.168.10.33";

		try {
			// 1. 서버의 IP주소와 서버가 정한 포트번호를 매개변수로 하여 클라이언트용 소켓 객체 생성
			Socket server = new Socket(serverIp, port);
			// * - 만약에 연결에 실패 할 경우 null을 반환해준다.

			if (server != null) {
				// 2. 서버와의 입출력 스트림 오픈
				// 3. 보조 스트림을 통해 성능 개선
				BufferedReader br = new BufferedReader(new InputStreamReader(server.getInputStream()));
				PrintWriter pw = new PrintWriter(server.getOutputStream());
				// 4. 스트림을 통해 읽고 쓰기
				// 쓰기
				pw.println("개 뚱춰");
				pw.flush();

				// 읽기
				System.out.println(br.readLine());

				// 5. 통신 종료
				pw.close();
				br.close();
				server.close();
			}
		} catch (UnknownHostException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
