package com.prac.chatting;

import java.awt.BorderLayout;
import java.awt.Button;
import java.awt.Color;
import java.awt.Frame;
import java.awt.Panel;
import java.awt.TextArea;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.net.Socket;
import java.nio.charset.StandardCharsets;

public class ChatWindow {

	private String nickName;
	private Frame frame;
	private Button button;
	private TextField textField;
	private Panel panel;
	private TextArea textArea;

	private Socket socket;

	public ChatWindow(String nickName, Socket socket) {
		this.nickName = nickName;
		this.socket = socket;
		panel = new Panel();
		button = new Button("����");
		textField = new TextField();
		frame = new Frame(nickName);
		textArea = new TextArea(30, 90);

		new ChatClientThread(socket).start();

	}

	public void draw() {

		// TextField
		textField.setColumns(80);
		textField.addKeyListener(new KeyAdapter() {
			public void keyReleased(KeyEvent k) {
				char keyCode = k.getKeyChar();
				if (keyCode == KeyEvent.VK_ENTER) {
					sendMsg();
				}
			}
		});

		// Panel

		panel.setBackground(Color.GRAY);
		panel.add(textField);
		panel.add(button);

		// TextArea
		textArea.setEditable(false);

		// Button
		button.setBackground(Color.DARK_GRAY);
		button.setForeground(Color.blue);
		button.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				sendMsg();
			}
		});

		// Frame
		frame.add(BorderLayout.SOUTH, panel);
		frame.add(BorderLayout.CENTER, textArea);

		frame.addWindowListener(new WindowAdapter() {
			public void windowClosing(WindowEvent e) {
				PrintWriter printWriter;
				try {
					printWriter = new PrintWriter(
							new OutputStreamWriter(socket.getOutputStream(), StandardCharsets.UTF_8));
					String msg = "quit\r\n";
					printWriter.println(msg);
					System.exit(0);

				} catch (IOException msg) {
					msg.printStackTrace();
				}
			}
		});

		frame.setVisible(true);
		frame.pack();
	}

	private void sendMsg() {
		PrintWriter printWriter = null;
		try {

			printWriter = new PrintWriter(new OutputStreamWriter(socket.getOutputStream(), StandardCharsets.UTF_8),
					true);
			String msg = textField.getText();
			String data = "msg:" + msg + "\r\n";
			printWriter.println(data);

			textField.setText("");
			textField.requestFocus();

		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	private class ChatClientThread extends Thread {
		Socket socket = null;

		ChatClientThread(Socket socket) {
			this.socket = socket;
		}

		public void run() {
			try {
				BufferedReader bufferedReader = new BufferedReader(
						new InputStreamReader(socket.getInputStream(), StandardCharsets.UTF_8));

				while (true) {
					String mString = bufferedReader.readLine();
					textArea.append(mString);
					textArea.append("\n");
				}

			} catch (IOException e) {
				e.printStackTrace();
			}
		}

	}

}
