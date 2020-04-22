package com.prac.chatting;

import java.io.IOException;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.net.InetSocketAddress;
import java.net.Socket;
import java.nio.charset.StandardCharsets;
import java.util.Scanner;

public class ChatClient {

	private static final String HOST_IP = "192.168.55.4";
	private static final int HOST_PORT = 8765;

	public static void main(String[] args) {
		String nickName = null;
		Scanner scanner = new Scanner(System.in);

		while (true) {
			System.out.println("닉네임을 입력하세요 ");
			nickName = scanner.nextLine();

			if (nickName.isEmpty() == false) {
				break;
			}
			System.out.println("닉네임은 꼭 입력해야 합니다.");
		}

		scanner.close();
		
		Socket socket = new Socket();

		try {
			socket.connect(new InetSocketAddress(HOST_IP, HOST_PORT));
			System.out.println("채팅 프로그램이 실행되었습니다. 작업표시줄을 확인하세요.");
			new ChatWindow(nickName, socket).draw();

			PrintWriter pWriter = new PrintWriter(new OutputStreamWriter(socket.getOutputStream(), StandardCharsets.UTF_8), 
					true);

			String data = "hello:" + nickName + "\r\n";
			pWriter.println(data);

		} catch (IOException e) {
			e.printStackTrace();
		}

	}

}
