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

		System.out.println("파일에 저장할 내용을 입력하시오(\"exit\"를 입력하면 내용 입력 끝) : ");
		try {
			String type = sc.nextLine();
			while (!type.equals("exit")) {
				sb.append(type);
				sb.append('\n');
				type = sc.nextLine();
			}
			System.out.println("저장하시겠습니까?(y/n)");
			char input = sc.next().charAt(0);
			sc.nextLine();
			if (input == 'y' || input == 'Y') {
				System.out.println("저장할 파일명을 입력하세요 : ");
				String fileName = sc.nextLine();
				bw = new BufferedWriter(new FileWriter(fileName + ".txt"));
				bw.write(sb.toString().toCharArray());
				bw.flush();
				System.out.println(fileName + ".txt 파일에 성공적으로 저장하였습니다.");
				try {
					bw.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			} else {
				System.out.println("저장되지 않고, 메뉴로 돌아갑니다.");
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	public void fileOpen() {
		System.out.println("불러올 파일명을 입력하세요 : ");
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
		System.out.println("수정할 파일명을 입력하세요 : ");
		String fileName = sc.nextLine();
		try {
			br = new BufferedReader(new FileReader(fileName + ".txt"));
			String str = null;
			while ((str = br.readLine()) != null) {
				System.out.println(str);
			}
			System.out.println("파일에 추가할 내용을 입력하시오 (\"exit\"를 입력하면 내용 입력 끝) : ");

			String type = sc.nextLine();
			while (!type.equals("exit")) {
				sb.append(type);
				sb.append('\n');
				type = sc.nextLine();
			}
			String body = sb.toString();
			System.out.println("변경된 내용을 파일에 추가하시겠습니까? (y/n)");
			char input = sc.next().charAt(0);
			sc.nextLine();
			if (input == 'y' || input == 'Y') {
				bw = new BufferedWriter(new FileWriter(fileName + ".txt", true));
				bw.write(body.toCharArray());
				bw.flush();
				System.out.println(fileName + ".txt 파일의 내용이 변경되었습니다.");
				try {
					br.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			} else {
				System.out.println("저장되지 않고, 메뉴로 돌아갑니다.");
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}

	}

}
