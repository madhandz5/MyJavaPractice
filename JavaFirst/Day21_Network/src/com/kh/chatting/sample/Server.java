package com.kh.chatting.sample;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.ArrayList;
import java.util.List;

public class Server {
	ServerSocket serSock;
	List<Socket> sockList;

	public Server() throws IOException {
		serSock = new ServerSocket(8080);
		sockList = new ArrayList<>();
	}

	public void allClientWrite(Socket sock, String msg) {
		BufferedOutputStream bos = null;
		try {
			String info = "[" + sock.getRemoteSocketAddress() + "] : ";
			for (int i = 0; i < sockList.size(); i++) {
				bos = new BufferedOutputStream(sockList.get(i).getOutputStream());
				System.out.println("send to " + sockList.get(i).toString() + ":" + msg);
				String inFoMsg = info + msg;
				bos.write(inFoMsg.getBytes("MS949"));
				bos.flush();
			}

		} catch (IOException e) {

			try {
				bos.close();
				sock.close();
				removeSock(sock);
			} catch (IOException e1) {
				e1.printStackTrace();
			}
			System.out.println("server write exception!");
			e.printStackTrace();
		}

	}

	public void stop(Thread thread) {
		thread.interrupt();
	}

	public void removeSock(Socket sock) {
		System.out.println("socket is close");
		System.out.println("====================================");
		System.out.println("泅犁 立加: " + sockList.size());
		for (int i = 0; i < sockList.size(); i++) {
			if (sockList.get(i) == sock) {
				try {
					sockList.get(i).close();
					sockList.remove(i);
					break;
				} catch (IOException e1) {
					e1.printStackTrace();
				}
			}
		}

		for (int i = 0; i < sockList.size(); i++) {
			System.out.println(sockList.get(i).toString());
		}
		System.out.println("====================================\n\n");
	}

	public void read(Socket sock) {
		Thread thread = null;
		thread = new Thread(new Runnable() {
			@Override
			public void run() {
				BufferedInputStream bis = null;
				boolean flag = true;
				try {
					while (flag) {
						bis = new BufferedInputStream(sock.getInputStream());
						byte b[] = new byte[256];
						int data = bis.read(b);
						if (data != 0) {
							String msg = new String(b);
							System.out.println("[" + sock.getLocalAddress() + "] : " + msg);
							allClientWrite(sock, msg);
						}
					}
				} catch (IOException e) {
					try {
						sock.close();
						removeSock(sock);
					} catch (IOException e2) {
						e2.printStackTrace();
					}
				}
			}
		});
		thread.start();
	}

	public void startServer() {
		System.out.println("Server Start!");
		Thread thread = new Thread(new Runnable() {
			@Override
			public void run() {

				try {

					while (true) {
						Socket sock = null;
						sock = serSock.accept();
						sockList.add(sock);
						System.out.println("====================================");
						System.out.println("泅犁 立加: " + sockList.size());
						for (int i = 0; i < sockList.size(); i++) {
							System.out.println(sockList.get(i).toString());
						}
						System.out.println("====================================\n\n");
						read(sock);
					}
				} catch (IOException e) {
					e.printStackTrace();
					System.out.println("socket accept excpetion");
					return;
				}
			}
		});
		thread.start();
	}

	public static void main(String[] args) {
		try {
			new Server().startServer();
		} catch (IOException e) {
			e.printStackTrace();
			System.out.println("server start exception");
		}
	}
}
