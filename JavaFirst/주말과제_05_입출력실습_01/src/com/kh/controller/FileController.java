package com.kh.controller;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.lang.reflect.Method;
import java.util.Scanner;

public class FileController {

	Scanner sc = new Scanner(System.in);
	BufferedWriter bw = null;
	StringBuilder sb = new StringBuilder();
	BufferedReader br = null;

	public FileController() {

	}

	public void fileSave() {

		System.out.println("���Ͽ� ������ ������ �Է��Ͻÿ�(\"exit\"�� �Է��ϸ� ���� �Է� ��) : ");
		try {
			String type = sc.nextLine();
			while (!type.equals("exit")) {
				sb.append(type);
				sb.append('\n');
				type = sc.nextLine();
			}
			System.out.println("�����Ͻðڽ��ϱ�?(y/n)");
			char input = sc.next().charAt(0);
			sc.nextLine();
			if (input == 'y' || input == 'Y') {
				System.out.println("������ ���ϸ��� �Է��ϼ��� : ");
				String fileName = sc.nextLine();
				bw = new BufferedWriter(new FileWriter(fileName + ".txt"));
				bw.write(sb.toString().toCharArray());
				bw.flush();
				System.out.println(fileName + ".txt ���Ͽ� ���������� �����Ͽ����ϴ�.");
				try {
					bw.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			} else {
				System.out.println("������� �ʰ�, �޴��� ���ư��ϴ�.");
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	public void fileOpen() {
		System.out.println("�ҷ��� ���ϸ��� �Է��ϼ��� : ");
		String fileName = sc.nextLine();
		try {
			br = new BufferedReader(new FileReader(fileName + ".txt"));
			int check = 0;
			while ((check = br.read()) != -1) {
				System.out.print((char) check);
			}
			System.out.println();
		} catch (FileNotFoundException e) {
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				br.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}

	public void fileEdit() {
		System.out.println("������ ���ϸ��� �Է��ϼ��� : ");
		String fileName = sc.nextLine();
		try {
			br = new BufferedReader(new FileReader(fileName + ".txt"));
			String str = null;
			while ((str = br.readLine()) != null) {
				System.out.println(str);
			}
			System.out.println("���Ͽ� �߰��� ������ �Է��Ͻÿ� (\"exit\"�� �Է��ϸ� ���� �Է� ��) : ");

			String type = sc.nextLine();
			while (!type.equals("exit")) {
				sb.append(type);
				sb.append('\n');
				type = sc.nextLine();
			}
			String body = sb.toString();
			System.out.println("����� ������ ���Ͽ� �߰��Ͻðڽ��ϱ�? (y/n)");
			char input = sc.next().charAt(0);
			sc.nextLine();
			if (input == 'y' || input == 'Y') {
				bw = new BufferedWriter(new FileWriter(fileName + ".txt", true));
				bw.write(body.toCharArray());
				bw.flush();
				System.out.println(fileName + ".txt ������ ������ ����Ǿ����ϴ�.");
				try {
					br.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			} else {
				System.out.println("������� �ʰ�, �޴��� ���ư��ϴ�.");
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}

	}

}
