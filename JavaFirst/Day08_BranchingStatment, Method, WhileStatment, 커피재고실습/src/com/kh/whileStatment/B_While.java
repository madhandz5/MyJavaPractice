package com.kh.whileStatment;

import java.util.Scanner;

public class B_While {

	Scanner sc = new Scanner(System.in);

	// while 문은 조건식만 존재하는 반복문이다.
	// (초기식과 증감식이 존재하지 않는다.)

	public void testWhile() {
		int i = 0;
		while (i < 5) {
			System.out.println("while문 돌고있음");
			i++;
		}
	}

	public void testWhile2() {

		int dan = 2;
		while (dan < 10) {
			int su = 1;
			while (su < 10) {
				System.out.println(dan + " X " + su + "=" + (dan * su));
				su++;
			}
			dan++;
		}
	}
	// 비밀번호는 123456
	// 사용자가 비밀번호를 맞게 입력하면 로그인 성공 문구를 출력하세요.
	// 비밀번호를 틀리게 입력하면 몇 회 잘못 입력하였는지 알려주는 문구를 작성하세요.
	// 비밀번호를 5회 틀리면
	// "비밀번호를 5회 잘못 입력하여 10분간 로그인 할 수 없습니다."
	// 문구를 출력하세요.

	// 사용자가 자료형을 입력하면 해당 자료형의 크기와 최소값, 최대값을 반환해주세

	public void whileQuiz() {

		String pw = "123456";
		String input = "";
		int tryCount = 1;

		while (!(pw.equals(input)) && tryCount < 6) {

			System.out.println("비밀번호 입력");
			input = sc.nextLine();

			if (pw.equals(input)) {
				System.out.println("로그인 성공");
			} else {
				System.out.println("비밀번호" + tryCount + "회 오류");
				tryCount++;
			}
		}
		if (tryCount == 6) {
			System.out.println("비밀번호를 5회 이상 잘못입력하였습니다. 10분간 로그인불가");
		}
	}

	public void whileQuiz2() {

		boolean rgx = true;

		while (rgx) {

			System.out.println("알고싶은 자료형을 입력하세요.");
			System.out.println("boolean / char /byte/short/int/long/float/double/종료:exit");

			String data = sc.nextLine();
			int size = 0;
			double max = 0;
			double min = 0;

			switch (data) {
			case "boolean":
				size = 1;
				max = 1;
				min = 0;
				break;
			case "char":
				size = Character.SIZE;
				max = Character.MAX_VALUE;
				min = Character.MIN_VALUE;
				break;
			case "int":
				size = Integer.SIZE;
				max = Integer.MAX_VALUE;
				min = Integer.MIN_VALUE;
				break;

			case "byte":
				size = Byte.SIZE;
				max = Byte.MAX_VALUE;
				min = Byte.MIN_VALUE;
				break;
			case "short":
				size = Short.SIZE;
				max = Short.MAX_VALUE;
				min = Short.MIN_VALUE;
				break;
			case "long":
				size = Long.SIZE;
				max = Long.MAX_VALUE;
				min = Long.MIN_VALUE;
				break;
			case "float":
				size = Float.SIZE;
				max = Float.MAX_VALUE;
				min = Float.MIN_VALUE;
				break;
			case "double":
				size = Double.SIZE;
				max = Double.MAX_VALUE;
				min = Double.MIN_VALUE;
				break;

			case "exit":
				rgx = false;
				break;
			default:
				System.out.println("잘못 입력하였습니다.");
				System.out.println("프로그램이 종료되었습니다.");
				break;
			}
			if (size != 0) {
				System.out.println(data + "-Size: " + size + "///" + "Max: " + max + "///" + "Min: " + min);
			}
		}
	}
}