package com.kh.operator;

import java.util.Scanner;

public class OperatorPrac {
	Scanner sc = new Scanner(System.in);

	public void optest01() {

		// 안내문 출력
		System.out.println("주민등록번호를 입력하여 주세요(-를 포함하여)");
		// 입력받은 주민등록번호를 String info 변수명으로 초기화하고 선언함.
		String info = sc.nextLine();

		// 주민등록번호 1번째 자리 판별
		char first = info.charAt(0);
		// 주민등록번호 8번째 자리 판별
		char second = info.charAt(7);
		// second 변수는 info(입력받은 주민등록번호)변수 의 인덱스 7 (8번째 자리) 이므로,
		// 그 값이 1이 true 이면 남자를 반환, false 이면 여자를 반환함.
		String gender = second == '1' ? "남자" : "여자";
		// first 변수는 info(입력받은 주민등록번호) 변수의 인덱스 0 (1번째 자리) 이므로,
		// 그 값이 0 혹은 1이 true 면 미성년자, false 면 성인을 반환함.
		String isAdult = first == '0' || first == '1' ? "미성년자" : "성인";
		// 결과값 출력
		System.out.println("당신은 " + gender + "이고, " + isAdult + " 입니다.");
	}

	public void optest02() {

		// 국어(정수), 영어(정수), 수학(정수), 총점(정수), 평균(실수) 변수 선언하고
		// 각 점수를 키보드로 입력받고
		// 합계 (국어+영어+수학) 와 평균(합계/3.0)을 계산하고,
		// 세 과목의 점수와 평균을 가지고 합격 여부 처리함
		// 합격의 조건
		// 세 과목의 점수가 각각 40점 이상이면서, 평균이 60점 이상이면 합격, 아니면 불합격 처리함

		// 각 점수를 정수로 선언하라고 하였으니까, 시키는대로 선언
		int korScore, engScore, mathScore, sum;
		// 평균은 실수로 선언하라고 했으므로 시키는대로 선언
		double avr;

		System.out.println("국어 점수를 입력해주세요.");
		korScore = sc.nextInt();
		System.out.println("영어 점수를 입력해 주세요.");
		engScore = sc.nextInt();
		System.out.println("수학 점수를 입력해 주세요");
		mathScore = sc.nextInt();

		// 입력받은 세 값을 더해줌
		sum = korScore + engScore + mathScore;
		// 더해준 값을 3으로 나눔. avr 변수가 double 자료형이므로 3.0 으로 해야됨.
		avr = sum / 3.0;

		String res = korScore >= 40 && engScore >= 40 && mathScore >= 40 && avr >= 60 ? "합격" : "불합격";
		System.out.println(res + "입니다.");
	}

	public void optest03() {

		// * 국어(정수), 영어(정수), 수학(정수) 변수를 선언하고,
		// * 각 점수를 키보드로 입력받은 뒤 합계(국어+영어+수학)와 평균(합계/3.0)을
		// * 계산하고, 세 과목의 평균에 따라 성적 등급을 부여해라
		// * 등급 :
		// * 평균 90점 이상 : A
		// * 평균 80점 이상 : B
		// * 평균 70점 이상 : C
		// * 평균 60점 이상 : D
		// * 평균 60점 미만 : F

		int kor, eng, mat;

		System.out.println("국어 점수를 입력하세요 : ");
		kor = sc.nextInt();
		System.out.println("영어 점수를 입력하세요 : ");
		eng = sc.nextInt();
		System.out.println("수학 점수를 입력하세요 : ");
		mat = sc.nextInt();

		double avg = (kor + eng + mat) / 3.0;

		String res = avg >= 90 ? "A등급" : avg >= 80 ? "B등급" : avg >= 70 ? "C등급" : avg >= 60 ? "D등급" : "F등급";

		System.out.printf("평균 %.2f점으로 " + res + "입니다.", avg);
	}

	public void optest04() {

		// * 국어(정수), 영어(정수), 수학(정수) 변수를 선언하고,
		// * 각 점수를 키보드로 입력받은 뒤 합계(국어+영어+수학)와 평균(합계/3.0)을
		// * 계산하고, 세 과목의 평균에 따라 성적 등급을 부여해라
		// * 등급 :
		// * 평균 90점 이상 : A
		// * 평균 80점 이상 : B
		// * 평균 70점 이상 : C
		// * 평균 60점 이상 : D
		// * 평균 60점 미만 : F

		int kor, eng, mat;

		System.out.println("국어 점수를 입력하세요 : ");
		kor = sc.nextInt();
		System.out.println("영어 점수를 입력하세요 : ");
		eng = sc.nextInt();
		System.out.println("수학 점수를 입력하세요 : ");
		mat = sc.nextInt();

		double avg = (kor + eng + mat) / 3.0;

		if (avg >= 90) {
			System.out.println("A등급");
		} else if (avg >= 80) {
			System.out.println("B등급");
		} else if (avg >= 70) {
			System.out.println("C등급");
		} else if (avg >= 60) {
			System.out.println("D등급");
		} else {
			System.out.println("F등급");
		}
	}
}
