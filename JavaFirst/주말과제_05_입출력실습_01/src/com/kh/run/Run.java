package com.kh.run;

import java.util.Scanner;

import com.kh.controller.FileController;

public class Run {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		FileController fc = new FileController();

		while (true) {
			System.out.println("****** My Note ******");
			System.out.println("1. 노트 새로 만들기");
			System.out.println("2. 노트 열기");
			System.out.println("3. 노트 열어서 수정하기");
			System.out.println("4. 끝내기");
			System.out.println("======================");
			System.out.println("번호를 입력하세요 : ");
			try {
				int input = sc.nextInt();
				sc.nextLine();

				switch (input) {
				case 1:
					fc.fileSave();
					break;
				case 2:
					fc.fileOpen();
					break;
				case 3:
					fc.fileEdit();
					break;
				case 4:
					System.out.println("프로그램을 종료합니다.");
					System.exit(0);
					break;
				default:
					System.out.println("잘못 입력하셨습니다.");
					break;
				}
			} catch (Exception e) {
				System.out.println("숫자만 입력해 주세요.");
				sc = new Scanner(System.in);
			}
		}
	}
}
