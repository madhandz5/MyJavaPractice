package com.kh.model;

import java.util.Scanner;

public class WhileSample {

	Scanner scanner = new Scanner(System.in);

	public void printUniCode() {
		System.out.println("===문자 하나 입력받아, 그 문자의 유니코드 출력반복('0' 입력되면 반복 종료)===");
		char ch = '!';
		while (!(ch == '0')) {
			System.out.println("문자 하나 입력 : ");
			ch = scanner.next().charAt(0);
			System.out.format("0x%04X%n", (int) ch);
		}
		System.out.println("종료");

	}

	public void sum1To100() {
		System.out.println("===1~100까지 정수들의 합계 출력하기 (while문으로 작성)===");
		int sum = 0;
		int a = 0;
		while (a < 101) {
			sum += a;
			a++;
		}
		System.out.println("1~100까지 정수들의 합계 (while문으로 작성됨 ): " + sum);
	}

	public void numberGame() {
		System.out.println("===1~100사이의 임의의 정수를 발생시켜, 숫자 알아 맞추기===");
		int randomNum = (int) (Math.random() * 100 + 1);
		int a = 0;
		while (!(randomNum == a)) {
			System.out.println("숫자를 맞춰 보아요. 1~100");
			a = scanner.nextInt();
			scanner.nextLine();
		}
		System.out.println("탈출 축하.");

	}

	public void countCharacter() {
		System.out.println("===문자열을 입력받아, 글자 갯수 알아내어 출력하기===");
		System.out.println("문자열을 입력하세요 : ");
		String str = scanner.nextLine();
		char[] strArr = str.toCharArray();
		int count = 0;
		while (count < strArr.length) {
			count++;
		}
		System.out.println("입력한  \"" + str + "\" 의 글자 수 : " + count);
	}

	public void countInChar() {
		System.out.println("===문자열값과 문자 하나를 입력받아, 문자열에 문자가 몇 개 있는지 확인하기===");
		System.out.println("문자열을 입력하세요 : ");
		String str = scanner.nextLine();
		System.out.println("문자를 입력하세요 : ");
		char ch = scanner.next().charAt(0);
		scanner.nextLine();
		char[] strArr = str.toCharArray();
		int length = 0;
		int count = 0;
		while (length < strArr.length) {
			if (strArr[length] == ch) {
				count++;
			}
			length++;
		}
		System.out.println("입력한 \"" + str + "\" 문자열에 입력한 \'" + ch + "\' 문자의 갯수는 " + count + "개");
	}

}
