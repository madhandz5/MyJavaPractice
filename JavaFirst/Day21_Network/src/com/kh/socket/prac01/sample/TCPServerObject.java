package com.kh.socket.prac01.sample;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;

public class TCPServerObject {

	public void serverStart() {

		// 1. ������ ��Ʈ��ȣ�� ����.
		int port = 8080;
		ServerSocket serverSocket = null;
		try {
			// 2. ServerSocket �����.
			serverSocket = new ServerSocket(port);
			// 3. Client �ʿ��� ��û�� ���� ��ٸ�.
			// 4. ���� ��ó�� ���� ��û ���� �� �ش� Ŭ���̾�Ʈ�� ���� ���� ��ü ����
			Socket client = serverSocket.accept();
			String clientIp = client.getInetAddress().getHostAddress();
			System.out.println(clientIp + "�� ������ �Ǿ����ϴ�.");

			// 5. ���� �� Ŭ���̾�Ʈ �� ����� ��Ʈ�� ����
			ObjectInputStream ois = new ObjectInputStream(client.getInputStream());
			OutputStream output = client.getOutputStream();

			Object res = ois.readObject();
			System.out.println(res);

			// 6. ���� ��Ʈ���� ����ؼ� ���� ����
			// 7. ��Ʈ�� ���� �а� ���� �ϼ�
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
