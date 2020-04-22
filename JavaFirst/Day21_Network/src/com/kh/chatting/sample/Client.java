package com.kh.chatting.sample;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.IOException;
import java.net.InetSocketAddress;
import java.net.Socket;
import java.net.UnknownHostException;
import java.util.Scanner;

public class Client {
	Socket sock;
	String host;
	int port;
	Scanner sc = new Scanner(System.in);

	public void connect() throws UnknownHostException, IOException {
		host = "192.168.10.33";
		port = 8080;
		sock = new Socket();
		sock.connect(new InetSocketAddress(host, port));
	}

	public void read() {
		Thread thread = new Thread(new Runnable() {
			@Override
			public void run() {
				BufferedInputStream bis = null;
				try {
					while (true) {
						bis = new BufferedInputStream(sock.getInputStream());
						byte[] b = new byte[256];
						int data = bis.read(b);
						if (data != 0) {
							System.out.println("\n");
							System.out.println(new String(b));
						}
					}
				} catch (IOException e) {
					System.out.println("client read exception!");
					e.printStackTrace();
					try {
						bis.close();
						sock.close();
					} catch (IOException e1) {
						e1.printStackTrace();
					}
				}
			}
		});
		thread.start();
	}

	public void chatStart() {
		BufferedOutputStream bos = null;
		while (true) {
			System.out.print("ют╥б : ");
			String msg = sc.nextLine();
			try {
				bos = new BufferedOutputStream(sock.getOutputStream());
				bos.write(msg.getBytes("MS949"));
				bos.flush();
			} catch (IOException e) {
				System.out.println("client write exception!");
				try {
					bos.close();
					sock.close();
					break;
				} catch (IOException e1) {
					e1.printStackTrace();
				}
				e.printStackTrace();
			}
		}
	}

	public static void main(String[] args) {
		Client client = new Client();
		try {
			client.connect();
		} catch (IOException e) {
			e.printStackTrace();
			System.out.println("connect exception");
		}
		client.read();
		client.chatStart();
	}
}
