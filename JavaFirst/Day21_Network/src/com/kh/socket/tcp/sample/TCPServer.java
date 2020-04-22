package com.kh.socket.tcp.sample;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;

public class TCPServer {
	// * 1. TCP (Transmission Control Protocol)
	// * - ������ ���� ����Ǿ� Ŭ���̾�Ʈ�� ��û�� ��ٸ���.
	// * - ����, Ŭ���̾�Ʈ�� ���α׷��� ���� �����Ѵ�.

	// * Socket
	// * - ���μ������� ����� ����Ѵ�.
	// * - InputStream, OutputStream�� ������ �ִ�.

	// * ServerSocket
	// * - ��Ʈ�� ����Ǿ �ܺ� ��û�� ��ٸ��ٰ�, ��û�� ������ Socket�� �����Ͽ�,
	// * - ������ ���ϰ� Ŭ���̾�Ʈ�� ���ϰ� ����� �̷�� ������ ���ش�.
	// * - �� ��Ʈ�� �ϳ��� ServerSocket�� ������ �� �ִ�.

	public void serverStart() {
		// 1. ������ ��Ʈ��ȣ ����
		int port = 8080;
		try {
			// 2. ������ ���� ��ü ����
			ServerSocket server = new ServerSocket(port);

			// 3. Ŭ���̾�Ʈ �ʿ��� ���� ��û�� ���� ��ٸ�
			// 4. ���� ��û�� ���� ��û ���� �� �ش� Ŭ���̾�Ʈ�� ���� ���� ��ü ����
			Socket client = server.accept();
			String clientIp = client.getInetAddress().getHostAddress();

			// 5. ����� Ŭ���̾�Ʈ�� ����� ��Ʈ�� ����
			InputStream input = client.getInputStream();
			OutputStream output = client.getOutputStream();

			// 6. ���� ��Ʈ���� ���� ���� ����
			// * - �������� : Reader / Writer ���
			// * - �ӵ���� : BufferedReader / BufferedWriter
			InputStreamReader isr = new InputStreamReader(input);
			BufferedReader br = new BufferedReader(isr);

			// 7. ��Ʈ�������� �а� ����
			// * - �޽��� ������ ���ؼ� PrintWriter
			PrintWriter pw = new PrintWriter(output);
			String message = br.readLine();
			System.out.println(clientIp + "�� ���� �޼��� : " + message);

			pw.println("������");
			pw.flush();

			// 8. ��� ����
			pw.close();
			br.close();
			server.close();

		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
