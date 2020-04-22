package com.kh.operator;

import java.util.Scanner;

public class Triple {

	// 3항 연산자
	// 조건식 ? 식1 : 식2

	public void method1() {

		// 입력 받은 정수가 홀수인지 짝수인지 판별 후 출력

		Scanner scanner1 = new Scanner(System.in);

		System.out.println("정수를 입력하세요 : ");
		int num = scanner1.nextInt();

		String result = (num % 2 == 0) ? "짝수" : "홀수";

		System.out.println(num + " 은/는 " + result + "이다.");

	}

	public void method2() {
		// 입력받은 정수가 양수인지 아닌지 판별 후 출력
		// 출력 : "num 은 양수 / 음수 입니다."
		Scanner scanner2 = new Scanner(System.in);

		System.out.println("정수를 입력하세요 : ");
		int num2 = scanner2.nextInt();

		String result2 = (num2 >= 0) ? "양수" : "음수";

		System.out.println(num2 + " 은/는 " + result2 + "이다.");

	}

	public void method3() {
		// 삼항연산자 중첩 사용
		// 입력받은 정수가 양수, 0, 음수인지 판별 후 출력

		Scanner scanner3 = new Scanner(System.in);
		System.out.println("정수를 입력하세요 : ");
		int num3 = scanner3.nextInt();

		String result3 = (num3 == 0) ? "0" : (num3 > 0) ? "양수" : "음수";
		System.out.println(num3 + " 은/는 " + result3 + "입니다.");

	}

	public void method4() {
		// 두 수와 '+', 또는 '-'를 입력받아 알맞은 계산 결과 출력하기.
		// 단 '+', '-' 이외의 연산자 입력 시 '잘못 입력 하셨습니다." 출력

		Scanner scanner4 = new Scanner(System.in);
		System.out.println("첫번째 수 : ");
		int numA = scanner4.nextInt();

		System.out.println("두번째 수 : ");
		int numB = scanner4.nextInt();
		// 스캐너 버퍼에 담겨있는 데이터를 비워준다.

		scanner4.nextLine();

		// 사용자로 부터 입력받은 문자열의 첫번째 문자를 반환한다.
		// 사용자가 입력한 연산자가 op에 담겨있다.

		System.out.println("연산자 입력 ( + or - ) : ");
		char op = scanner4.nextLine().charAt(0);

		String result4 = (op == '+') ? "" + (numA + numB) : (op == '-') ? "" + (numA - numB) : "잘못 입력 하셨습니다.";

		System.out.println(result4);

	}

}
