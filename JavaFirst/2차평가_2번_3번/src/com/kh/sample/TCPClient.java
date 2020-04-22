package com.kh.sample;

import java.io.BufferedInputStream;
import java.io.EOFException;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.net.Socket;

public class TCPClient {

	public void fileUpload() {

		int port = 3000;
		String serverIp = "192.168.20.34";
		try {
			Socket socket = new Socket(serverIp, port);
			if (socket != null) {

				BufferedInputStream bs = new BufferedInputStream(socket.getInputStream());
				ObjectOutputStream objOut = new ObjectOutputStream(socket.getOutputStream());

				ObjectInputStream objIn = new ObjectInputStream(new FileInputStream("books.dat"));

				try {
					while (true) {
						Object obj = objIn.readObject();
						objOut.writeObject(obj);
					}

				} catch (EOFException e) {
					objOut.writeObject(null);
					objOut.flush();

					int check = 0;
					String returnMessage = "";
					while ((check = bs.read()) != -1) {
						returnMessage += (char) check;
					}

					if (returnMessage.equals("exit")) {
						objOut.close();
						bs.close();
						socket.close();
					}
				}
			}
		} catch (IOException e) {

		} catch (ClassNotFoundException e) {

		}

	}

}
