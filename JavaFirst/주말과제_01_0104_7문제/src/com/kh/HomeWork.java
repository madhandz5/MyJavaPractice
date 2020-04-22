package com.kh;


import java.util.Scanner;

public class HomeWork {

	Scanner scanner = new Scanner(System.in);

	public void calculator() {

		// * 과제 1
		// * 1. 정수 두 개와 연산문자 하나를 키보드로 입력받음
		// * 2. 두 정수값은 int 변수에 저장
		// * 3. 연산문자는 char 변수에 저장
		// * 4. switch 문 사용
		// * - 연산문자가 '+' 이면, 두 정수의 합 계산
		// * - 연산문자가 '-' 이면, 두 정수의 차 계산
		// * - 연산문자가 'x' 또는 'X'이면, 두 정수의 곱
		// * - 연산문자가 '/'이면, 두 정수의 나누기 몫
		// * --- 단, 나누는 수(두번쨰 정수) 가 0 이면 "0으로 나눌 수 없습니다." 출력되게 하고, 결과값 0 처리함 을 계산 처리 후
		// * 5. 결과 출력

		System.out.println("첫번 째 정수를 입력하세요 : ");
		int numA = scanner.nextInt();
		System.out.println("두번 째 정수를 입력하세요 : ");
		int numB = scanner.nextInt();
		scanner.nextLine();
		System.out.println("연산자를 입력하세요( + , -,  x, / ) : ");
		char ch = scanner.next().charAt(0);
		int result = 0;
		switch (ch) {
		case '+':
			result = numA + numB;
			break;
		case '-':
			result = numA - numB;
			break;
		case 'x':
		case 'X':
			result = numA * numB;
			break;
		case '/':
			if (numB != 0) {
				result = numA / numB;
			} else {
				System.out.println("0으로 나눌 수 없습니다.");
				result = 0;
			}
			break;
		default:
			System.out.println("잘못입력하셨습니다.");
		}
		System.out.println("" + numA + ch + numB + "=" + result);
	}

	public void totalCalculator() {

		// * 과제 2.
		// * 1. 키보드로 두 개의 정수를 입력받음
		// * 2. 두 정수들 중 작은 값을 시작값으로, 큰 값을 종료값으로 사용함
		// * 3. 작은 값에서 큰 값까지 정수의 합계를 구함
		// * - for 문 사용
		// * 4. 합계 출력 처리

		System.out.println("첫번 째 정수를 입력하세요 : ");
		int numA = scanner.nextInt();
		System.out.println("두번 째 정수를 입력하세요 : ");
		int numB = scanner.nextInt();
		int res = 0;

		if (numA > numB) {
			for (int i = numB; i < numA + 1; i++) {
				res += i;
			}
			System.out.println("" + numB + "부터 " + numA + "까지의 합은 " + res + "입니다.");
		} else if (numB > numA) {
			for (int i = numA; i < numB + 1; i++) {
				res += i;
			}
			System.out.println("" + numA + "부터 " + numB + "까지의 합은 " + res + "입니다.");
		} else {
			res = numA;
			System.out.println("" + numA + "부터 " + numB + "까지의 합은 " + res + "입니다.");
		}
	}

	public void profile() {

		// * 과제 3.
		// * 1. 신상정보들을 자료형에 맞춰 변수에 기록하고 변수에 기록된 값을 출력 확인함.
		// * - 콘솔창에 본인의 신상정보가 출력되게 함
		// * 이름 / 나이 / 성별 / 성격

		String name = "오창영";
		int age = 35;
		String gender = "남자";
		String personality = "활동적임";

		System.out.println("이름 : " + name + "\n나이 : " + age + "\n성별 : " + gender + "\n성격 : " + personality);
	}

	public void sungjuk() {

		// * 과제 4.
		// * 1. 변수 선언하고, 키보드로 입력받은 값들을 변수에 기록하고 변수값을 화면에 출력 확인함
		// * - 학생이름 (String)
		// * - 학년 (int)
		// * - 반 (int)
		// * - 번호 (int)
		// * - 성별 (M/F)(char) // 문자열로 입력받은 후 , 문자 하나 분리해야 함
		// * - 성적 (int)
		// * - 학점 (char)
		// * - 점수가 90점 이상이면 학점을 A로 처리
		// * - 점수가 80점 이상 90점 미만 B로 처리
		// * - 점수가 70점 이상 80점 미만 C로 처리
		// * - 점수가 60점 이상 70점 미만 D로 처리
		// * - 점수가 60 미만 F 처리
		// * 출력 예 > 3학년 2반 25번 남학생 홍길동의 점수는 95.5이고, A 학점 입니다.
		// 라면 double로 형변환 하라는 것인지?
		// ** 남학생 / 여학생은 성별 변수의 값을 사용해서 삼항 연산자로 처리함

		System.out.println("학생 이름을 입력하세요 : ");
		String name = scanner.nextLine();
		System.out.println("학년을 입력하세요 : ");
		int year = scanner.nextInt();
		System.out.println("반을 입력하세요 : ");
		int classNum = scanner.nextInt();
		System.out.println("번호를 입력하세요 : ");
		int num = scanner.nextInt();
		System.out.println("성별을 입력하세요 (M/F) : ");
		char gender = scanner.next().charAt(0);
		System.out.println("성적을 입력하세요 : ");
		int score = scanner.nextInt();
		char grade = 'A';

		String stringGender = gender == 'm' ? "남학생" : gender == 'M' ? "남학생" : gender == 'f' ? "여학생" : "여학생";

		if (score > 89) {
			grade = 'A';
		} else if (score > 79) {
			grade = 'B';
		} else if (score > 69) {
			grade = 'C';
		} else if (score > 59) {
			grade = 'D';
		} else {
			grade = 'F';
		}

		System.out.println(year + "학년 " + classNum + "반 " + num + "번 " + stringGender + " " + name + "의 점수는 "
				+ (double) score + "점 이고, " + grade + " 학점 입니다.");
	}

	public void printStarNumber() {

		// * 과제 5.
		// * 정수를 하나 입력받아, 그 수가 양수일 때만 입력된 수를 줄 수로 적용하여 다음과 같이 출력되게 함
		// * -- 1
		// * -- *2
		// * -- **3
		// * -- ***4
		// * -- ****5
		// * - 양수가 아닐 때 , "양수가 아닙니다" 출력
		// * - if 문과 이중 for 문 사용

		System.out.println("양수의 정수를 입력해 주세요 : ");
		int num = scanner.nextInt();

		if (num >= 0) {
			for (int i = 1; i < num + 1; i++) {
				for (int j = 1; j < i + 1; j++) {
					if (i == j) {
						System.out.print(i);
					} else {
						System.out.print("*");
					}
				}
				System.out.println();
			}
		} else {
			System.out.println("양수가 아닙니다.");
		}
	}

	public void sumRandomNumber() {

		// * 과제 6.
		// * 1. 1 ~ 100 사이의 정수 중 임의의 정수를 하나 발생시켜 1부터 발생된 정수까지의 합계를 구하여 출력함
		// * - Math.random() API 사용

		int randomNum = (int) (Math.random() * 100) + 1;
		int sum = 0;

		for (int i = 1; i < randomNum + 1; i++) {
			sum += i;
		}
		System.out.println("1부터 자동으로 생성된 " + randomNum + "까지의 합은 " + sum + " 입니다.");
	}

	public void shutNumber() {

		// * 과제 7.
		// * 1. 두 개의 주사위가 만들어 낼 수 있는 모든 경우의 수 중(random)
		// * 2. 두 주사위 눈의 합이 입력된 수와 같은 경우 "맞췄습니다." 출력
		// * 3. 입력 값과 다르면 "틀렸습니다." 출력함
		// * 4. 정답 유무 출력 후 계속하시겠습니까? (y/n) 출력
		// * 5. "계속 하시겠습니까?(y/n):" 에서 'n'또는 'N' 입력 시 반복 종료 됨
		// * - do ~ while 문으로 반복되게 함

		boolean cont = true;

		do {
			if (!cont) {
				System.out.println("계속하시겠습니까? (Y/N) : ");
				char go = scanner.next().charAt(0);
				if (go == 'y' || go == 'Y') {
					cont = true;
				} else if (go == 'n' || go == 'N') {
					break;
				} else {
					System.out.println("잘못 입력하셨습니다. 다시 입력해주세요.");
					cont = false;
				}
			}
			if (cont) {
				System.out.println("=====주사위 2개의 합을 맞춰보세요=====");
				int dice1 = (int) (Math.random() * 6) + 1;
				int dice2 = (int) (Math.random() * 6) + 1;
				int quiz = dice1 + dice2;
				int input = scanner.nextInt();

				if (input > 1 && input < 13)

					if (input == quiz) {
						System.out.println("=====.맞.았.습.니.다.=====");
						cont = false;
					} else {
						System.out.println("=====.틀.렸.습.니.다.=====");
						System.out.println(
								"1번 주사위 : [" + dice1 + "] \n2번 주사위 : [" + dice2 + "] \n두 주사위의 합은 [" + quiz + "]입니다.");
						System.out.println("=======================");
						cont = false;
					}
				else {
					System.out.println("=====.틀.렸.습.니.다.=====");
					System.out.println("힌트)주사위 2개의 합은 2 ~ 12 입니다.");
					System.out.println("=======================");
					cont = false;
				}
			}
		} while (!cont);
		System.out.println("======.게.임.종.료.======");
	}
}
