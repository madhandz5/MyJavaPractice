package com.prac.chatting;

import java.io.IOException;
import java.io.PrintWriter;
import java.net.InetAddress;
import java.net.InetSocketAddress;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.ArrayList;
import java.util.List;

public class ChatServer {

	public static final int HOST_PORT = 8765;

	public static void main(String[] args) {

		ServerSocket serverSocket = null;
		List<PrintWriter> writerList = new ArrayList<PrintWriter>();

		try {

			serverSocket = new ServerSocket();

			String hostAdress = InetAddress.getLocalHost().getHostAddress();

			serverSocket.bind(new InetSocketAddress(hostAdress, HOST_PORT));
			System.out.println("기다리는중..." + hostAdress + "," + HOST_PORT);

			while (true) {
				Socket socket = serverSocket.accept();
				new ChatServerThread(socket, writerList).start();
			}

		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				if (serverSocket != null && !serverSocket.isClosed()) {
					serverSocket.close();
				}
			} catch (IOException e) {
				e.printStackTrace();
			}
		}

	}

}
