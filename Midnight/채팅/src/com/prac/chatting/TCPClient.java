package com.prac.chatting;

import java.io.IOException;
import java.net.InetSocketAddress;
import java.net.Socket;

public class TCPClient {

	private static final String SERVER_IP = "14.40.81.117";
	private static final int SERVER_PORT = 8221;

	public static void main(String[] args) {

		Socket socket = null;

		// 1. 소켓 객체 생성
		socket = new Socket();

		try {
			// 2. 위에서 생서된 소켓을 서버와 연결 시도
			socket.connect(new InetSocketAddress(SERVER_IP, SERVER_PORT));

		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				socket.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}

	}

}
