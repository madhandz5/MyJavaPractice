package com.kh.controllstatment.decisionMaking;

import java.util.Scanner;

public class C_IfElseIf {

	Scanner sc = new Scanner(System.in);

	public void testIfElseIf() {

		// if else if 는 다중 조건을 줄 수 있는 문법이다.
		// [표현식]
		// if (조건식) {
		// 실행 코드1
		// }
		// else if (조건식) {
		// 실행 코드2
		// } else {
		// 실행코드3
		// }
		// 점수를 하나 입력받아서 등급을 나누어 점수와 등급을 출력하시오.
		// 등급은, 90점 이상은 A등급
		// 90점 미만, 80점 이상은 B등급
		// 80점 미만 70점 이상은 C등급
		// 70점 미만 60점 이상은 D등급
		// 60점 미만은 F등급

		System.out.println("점수를 입력하세요");
		int score = sc.nextInt();
		String grade;

		if (score >= 90) {
			grade = "A";
		} else if (score >= 80) {
			grade = "B";
		} else if (score >= 70) {
			grade = "C";
		} else if (score >= 60) {
			grade = "D";
		} else {
			grade = "F";
		}
		System.out.println(grade);
	}

	public void testIfElseIf2() {

		// 위의 문제에서
		// 각 등급별 점수가 중간 점수 이상일 때 (ex 95점)
		// 등급에 "+" 라는 문자를 추가하여 출력하세요.
		// 예 ) 95점 이상은 등급이 A+로 출력되게 함.

		System.out.println("점수를 입력하세요");
		int score = sc.nextInt();
		String grade;

		if (score >= 90) {
			if (score >= 95) {
				grade = "A+";
			} else {
				grade = "A";
			}
		} else if (score >= 80) {
			if (score >= 85) {
				grade = "B+";
			} else {
				grade = "B";
			}
		} else if (score >= 70) {
			if (score >= 75) {
				grade = "C+";
			} else {
				grade = "C";
			}
		} else if (score >= 60) {
			if (score >= 65) {
				grade = "D+";
			} else {
				grade = "D";
			}
		} else {
			grade = "F";
		}
		System.out.println(grade);
	}

	public void test() {
		// 국어, 영어, 수학 점수를 각각 입력받고 평균 50점 이상,
		// 각 과목 35점 이상일 때 "합격입니다."를 출력하고
		// 평균이 50점 미만인 경우 "평균점수 미달로 불합격입니다."를
		// 출력하며, 평균은 50점 이상이지만 과락(35점미만)인 과목이 있으면
		// (해당 과목) 과락으로 불합격 입니다." 를 출력하세요.

		System.out.println("국어 점수를 입력하세요.");
		int kor = sc.nextInt();

		System.out.println("영어 점수를 입력하세요.");
		int eng = sc.nextInt();

		System.out.println("수학 점수를 입력하세요");
		int mat = sc.nextInt();

		double avg = (kor + eng + mat) / 3.0;

		if (avg >= 50) {
			if (kor >= 35 && eng >= 35 && mat >= 35) {
				System.out.println("평균" + avg + "합격입니다.");
			} else if (kor >= 35 && eng >= 35) {
				System.out.println("평균" + avg + "점이지만 수학과목 과락으로 불합격입니다.");
			} else if (kor >= 35 && mat >= 35) {
				System.out.println("평균" + avg + "점이지만 영어과목 과락으로 불합격입니다.");
			} else if (eng >= 35 && mat >= 35) {
				System.out.println("평균" + avg + "점이지만 국어과목 과락으로 불합격입니다.");
			} else if (eng >= 35) {
				System.out.println("국어, 수학 과목 과락으로 불합격입니다.");
			} else if (kor >= 35) {
				System.out.println("영어, 수학 과목 과락으로 불합격입니다.");
			} else if (mat >= 35) {
				System.out.println("국어, 영어 과목 과락으로 불합격입니다.");
			}
			// else {
			// System.out.println("평균" + avg + "점이지만 2과목 이상 과락이라 불합격입니다.");
			// }
		} else {
			System.out.println("평균 " + avg + "점으로 불합격입니다.");
		}
	}

	public void testAnswer() {
		// 국어, 영어, 수학 점수를 각각 입력받고 평균 50점 이상,
		// 각 과목 35점 이상일 때 "합격입니다."를 출력하고
		// 평균이 50점 미만인 경우 "평균점수 미달로 불합격입니다."를
		// 출력하며, 평균은 50점 이상이지만 과락(35점미만)인 과목이 있으면
		// (해당 과목) 과락으로 불합격 입니다." 를 출력하세요.

		System.out.println("국어 점수를 입력하세요.");
		int kor = sc.nextInt();

		System.out.println("영어 점수를 입력하세요.");
		int eng = sc.nextInt();

		System.out.println("수학 점수를 입력하세요");
		int mat = sc.nextInt();

		String res = "";
		double avg = (kor + eng + mat) / 3.0;

		if (avg >= 50) {
			if (kor < 35 || eng < 35 || mat < 35) {
				if (kor < 35) {
					res = "국어";
				}
				if (eng < 35) {
					res = "영어";
				}
				if (mat < 35) {
					res = "수학";
				}
				if (kor < 35 && eng < 35) {
					res = "국어, 영어";
				}
				if (eng < 35 && mat < 35) {
					res = "영어, 수학";
				}
				if (kor < 35 && mat < 35) {
					res = "국어, 수학";
				}

				System.out.println(res + "과락으로 불합격입니다.");
			} else {
				System.out.println("합격입니다.");
			}
		} else {
			System.out.println("평균점수 미달로 불합격입니다.");
		}
	}
}