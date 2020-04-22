package com.kh.branchingStatment;

import java.awt.Label;
import java.util.Scanner;

public class A_break {

	Scanner sc = new Scanner(System.in);

	// break : 반복문 안에서 즉시 반복문을 탈출한다.

	public void breakTest() {

		// 문자열 'end'를 입력받으면 반복문을 탈출하는 do-while문을 작성하시오.

		do {
			System.out.println("문자열 입력 : ");
			String str = sc.next();
			if (str.equals("end")) {
				break;
			}
			System.out.println("반복문을 탈출한 문자열은 end 입니다.");
		} while (true);
		System.out.println("탈출");
	}

	// Label 을 이용해서 반복문 빠져나오기
	public void jumpBreak() {
		outer: while (true) {
			System.out.println("반복문을 빠져나가려면 exit를 입력하세요.");
			String check = sc.nextLine();

			switch (check) {
			case "exit":
				break outer;
			default:
				System.out.println("반복문을 탈출하지 못했습니다.");
			}
		}
		System.out.println("탈출");
	}
}
