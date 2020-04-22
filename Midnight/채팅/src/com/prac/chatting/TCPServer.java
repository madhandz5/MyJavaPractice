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
			// 1. ���� ���� ��ü�� ����.
			serverSocket = new ServerSocket();

			// 2. ������ Host Port �� Binding

			String localHostAdress = InetAddress.getLocalHost().getHostAddress();
			serverSocket.bind(new InetSocketAddress(localHostAdress, serverPort));
			System.out.println("[������ ���ε� �Ǿ����ϴ�]" + localHostAdress + "," + serverPort);

			// 3. ���� ��û�� ���������� ��ٸ���.
			// ���� ��û�� ������ �������� ���� STATUS : BLOCK
			// TCP 3-way Handshake

			Socket socket = serverSocket.accept();

			 // 4. ������ �����ϸ� ���� �޽��� ���
			 InetSocketAddress requestSocketAdress = (InetSocketAddress)
			 socket.getRemoteSocketAddress();
			 String requestHost = requestSocketAdress.getAddress().getHostAddress();
			 int requestPort = requestSocketAdress.getPort();
			
			 System.out.println("[����Ǿ����ϴ�.] ������ ���� �ּҴ� : " + requestHost + "������ ��Ʈ��ȣ�� : "
			 + requestPort);

		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				serverSocket.close();
				System.out.println("��������");
			} catch (IOException e) {
				e.printStackTrace();
			}
		}

	}
}
