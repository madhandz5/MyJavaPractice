package com.kh.model;

import java.util.Scanner;

public class IfSample {

	Scanner scanner = new Scanner(System.in);

	public void maxNumber() {
		System.out.println("===두 개의 정수를 입력받아, 두 수중 큰 값 출력하기===");
		System.out.println("첫번 째 정수를 입력하세요 : ");
		int a = scanner.nextInt();
		scanner.nextLine();
		System.out.println("두번 째 정수를 입력하세요 : ");
		int b = scanner.nextInt();
		scanner.nextLine();
		if (a > b) {
			System.out.println("큰 수는 : " + a);
		} else if (b > a) {
			System.out.println("큰 수는 : " + b);
		} else {
			System.out.println("두 정수는 같습니다.");
		}
	}

	public void minNumber() {
		System.out.println("===두 개의 정수를 입력받아, 두 수중 작은 값 출력하기===");
		System.out.println("첫번 째 정수를 입력하세요 : ");
		int a = scanner.nextInt();
		scanner.nextLine();
		System.out.println("두번 째 정수를 입력하세요 : ");
		int b = scanner.nextInt();
		scanner.nextLine();
		if (a > b) {
			System.out.println("작은 수는  : " + b);
		} else if (b > a) {
			System.out.println("작은 수는 : " + a);
		} else {
			System.out.println("두 정수는 같습니다.");
		}
	}

	public void threeMaxMin() {
		System.out.println("===세 개의 정수를 입력받아, 세 수중 가장 큰 수와 가장 작은 수 출력하기===");
		System.out.println("첫번 째 정수를 입력하세요 : ");
		int a = scanner.nextInt();
		scanner.nextLine();
		System.out.println("두번 째 정수를 입력하세요 : ");
		int b = scanner.nextInt();
		scanner.nextLine();
		System.out.println("세번 째 정수를 입력하세요 : ");
		int c = scanner.nextInt();
		scanner.nextLine();
		if (a > b && a > c) {
			System.out.println("세 정수중 가장 큰 수는 : " + a);
		} else if (b > a && b > c) {
			System.out.println("세 정수중 가장 큰 수는 : " + b);
		} else if (c > a && c > b) {
			System.out.println("세 정수중 가장 큰 수는 : " + c);
		} else {
			System.out.println("세 정수는 같습니다.");
		}
	}

	public void checkEven() {
		System.out.println("===한 개의 정수를 입력받아, 짝수인지 홀수인지 출력하기===");
		int a = scanner.nextInt();
		scanner.nextLine();
		if (a % 2 == 0) {
			System.out.println("입력하신 수는 짝수입니다.");
		} else {
			System.out.println("입력하신 수는 홀수 입니다.");
		}

	}

	public void isPassFail() {
		System.out.println("===국,영,수 세 과목의 점수를 입력받아, 합격/불합격 확인하기===");
		int kor = scanner.nextInt();
		scanner.nextLine();
		int eng = scanner.nextInt();
		scanner.nextLine();
		int mat = scanner.nextInt();
		scanner.nextLine();
		int sum = kor + eng + mat;
		double avg = sum / 3;
		System.out.println("국어 점수 : " + kor);
		System.out.println("영어 점수 : " + eng);
		System.out.println("수학 점수 : " + mat);
		System.out.println("점수 합 : " + sum);
		System.out.println("점수 평균 : " + avg);
		if (avg > 59) {
			if (kor > 59 && eng > 59 && mat > 59) {
				System.out.println("합격입니다.");
			} else if (kor > 59 && eng > 59) {
				System.out.println("수학 점수 과락, 불합격 입니다.");
			} else if (eng > 59 && mat > 59) {
				System.out.println("국어 점수 과락, 불합격입니다.");
			} else if (kor > 59 && mat > 59) {
				System.out.println("영어 점수 과락, 불합격입니다.");
			} else {
				System.out.println("두과목 이상 과락, 불합격입니다.");
			}
		} else {
			System.out.println("평균점수 미달 불합격 입니다.");
		}
	}

	public void scoreGrade() {
		System.out.println("====점수를 입력받아, 학점 확인하기====");
		System.out.println("점수를 입력하세요 : ");
		int score = scanner.nextInt();
		scanner.nextLine();
		if (score > 89) {
			if (score > 94) {
				System.out.println("A+");
			}
			System.out.println("A");
		} else if (score > 79) {
			if (score > 84) {
				System.out.println("B+");
			}
			System.out.println("B");
		} else if (score > 69) {
			if (score > 74) {
				System.out.println("C+");
			}
			System.out.println("C");
		} else if (score > 59) {
			if (score > 64) {
				System.out.println("D+");
			}
			System.out.println("D");
		} else {
			System.out.println("F");
		}
	}

	public void checkPlusMinusZero() {
		System.out.println("===한 개의 정수를 입력받아, 양수인지 0인지 음수인지 확인하기===");
		System.out.println("정수를 입력하세요 : ");
		int a = scanner.nextInt();
		scanner.nextLine();
		if (a > 0) {
			System.out.println("양수입니다.");
		} else if (a < 0) {
			System.out.println("음수입니다.");
		} else {
			System.out.println("0입니다.");
		}
	}

	public void whatCharacter() {
		System.out.println("===문자 하나를 입력받아, 영어 대문자인지 소문자인지, 숫자문자인지 기타문자인지 확인하기===");
		char ch = scanner.next().charAt(0);
		scanner.nextLine();
		if (ch > 64 && ch < 91) {
			System.out.println("영어 대문자 입니다.");
		} else if (ch > 96 && ch < 123) {
			System.out.println("영어 소문자 입니다.");
		} else if (ch > 47 && ch < 58) {
			System.out.println("숫자 문자 입니다.");
		} else {
			System.out.println("기타문자입니다.");
		}
	}

}
