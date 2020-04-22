package com.prac.chatting;

import java.io.IOException;
import java.net.InetAddress;
import java.net.InetSocketAddress;
import java.net.ServerSocket;
import java.net.Socket;

public class TCPServer {

	public static void main(String[] args) {

		ServerSocket serverSocket = null;
		int serverPort = 8765;

		try {
			// 1. 서버 소켓 객체를 생성.
			serverSocket = new ServerSocket();

			// 2. 소켓을 Host Port 와 Binding

			String localHostAdress = InetAddress.getLocalHost().getHostAddress();
			serverSocket.bind(new InetSocketAddress(localHostAdress, serverPort));
			System.out.println("[서버가 바인딩 되었습니다]" + localHostAdress + "," + serverPort);

			// 3. 연결 요청이 있을때까지 기다린다.
			// 연결 요청이 들어오기 전까지는 서버 STATUS : BLOCK
			// TCP 3-way Handshake

			Socket socket = serverSocket.accept();

			 // 4. 연결이 성공하면 성공 메시지 출력
			 InetSocketAddress requestSocketAdress = (InetSocketAddress)
			 socket.getRemoteSocketAddress();
			 String requestHost = requestSocketAdress.getAddress().getHostAddress();
			 int requestPort = requestSocketAdress.getPort();
			
			 System.out.println("[연결되었습니다.] 접속한 소켓 주소는 : " + requestHost + "접속한 포트번호는 : "
			 + requestPort);

		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				serverSocket.close();
				System.out.println("닫혔어유");
			} catch (IOException e) {
				e.printStackTrace();
			}
		}

	}
}
