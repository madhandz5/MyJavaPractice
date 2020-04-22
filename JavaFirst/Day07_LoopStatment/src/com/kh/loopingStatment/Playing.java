package com.kh.loopingStatment;

import java.util.Scanner;

public class Playing {

	Scanner sc = new Scanner(System.in);

	// for 문을 가지고 노는 다양한 방법
	// for문은 for(초기식; 조건식; 증감식) 으로 작성된다.
	// 만약 () 안에 아무것도 작성하지 않으면 어떻게 될까?

	public void playing0() {

		for (;;) {
			System.out.println("이런 for 문도 있지롱");
		}
	}

	// for 문에 조건식만 넣어보자
	// 조건식이 true이면 반복문을 계속하고, false이면 for문을 탈출한다.
	// 사용자로부터 문자를 하나 입력받아 그 문자가 'S'이면 for 문을 탈출한다.
	public void playing1() {

		char key = 'a';
		for (; !(key == 'S');) {
			System.out.println("반복문을 탈출하게 해줄 문자는 S다 . 입력 : ");
			key = sc.next().charAt(0);
		}
		System.out.println("반복문을 탈출했다.");
	}

	// for문을 5번만 작동하게 만들어보자.
	public void playing2() {
		int i = 0;
		for (; i < 5;) {
			System.out.println("이런 for문도 있지롱 : " + ((int) i + 1) + "번째");
			i++;
		}
	}

	public void playing3() {

		char key = 'a';
		for (System.out.println("초기식"); key != 'S'; System.out.println("증감식")) {

			System.out.println("반복문을 멈출 문자는 S다. 문자 입력 : ");
			key = sc.next().charAt(0);
			System.out.println("반복문의 마지막 코드를 만났다.");

		}
		System.out.println("반복문을 멈추는데 성공했다.");
	}

}
