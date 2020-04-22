package com.kh.training.controller;

import java.util.Scanner;

import com.kh.training.model.vo.Trainee;

public class TrainingManager {

	Scanner sc = new Scanner(System.in);
	private Trainee[] trainees;

	private final int CUTLINE = 60;

	public TrainingManager(int num) {
		this.trainees = new Trainee[num];
	}

	public void insertTrainees() {
		// 생성 된 Trainee 객체 배열 수 만큼 반복문으로 반복하며
		// 이름, 반, 점수를 입력 받아 객체 배열 초기
		for (int i = 0; i < trainees.length; i++) {
			System.out.println("훈련생 이름을 입력하세요 :");
			String name = sc.next();
			System.out.println("훈련생 반을 입력하세요 : ");
			char classRoom = sc.next().charAt(0);
			System.out.println("훈련생 점수 입력하세요 : ");
			int score = sc.nextInt();
			trainees[i] = new Trainee(name, classRoom, score);
		}
	}

	public int sumScore() {
		int sum = 0;
		for (int i = 0; i < trainees.length; i++) {
			sum += trainees[i].getScore();
		}
		return sum;
	}

	public double avgScore() {
		double avg = sumScore() / trainees.length;
		return avg;
	}

	public String passFail(int i) {
		String res = "";
		if (trainees[i].getScore() < CUTLINE) {
			res = "Fail";
		} else {
			res = "Pass";
		}
		return res;
	}

	public void printTrainees() {
		System.out.println("=== 훈련생 전체 정보 출력 ===");
		for (int i = 0; i < trainees.length; i++) {
			if (trainees[i] == null) {
				System.out.println("훈련생이 없습니다.");
				break;
			} else {
				System.out.println("회원번호 : " + i + "  " + trainees[i].inform() + "  통과여부 : " + passFail(i));
			}
		}
		System.out.println("점수 합계 : " + sumScore());
		System.out.println("점수 평균 : " + avgScore());
	}

	public void searchTrainees() {
		System.out.println("검색할 사람 이름 : ");
		String who = sc.next();
		boolean noSearch = false;
		for (int i = 0; i < trainees.length; i++) {
			if (who.equals(trainees[i].getName())) {
				System.out.println("회원번호 : " + i + "  " + trainees[i].inform() + " / 통과여부 : " + passFail(i));
				noSearch = true;
			}
		}
		if (!noSearch) {
			System.out.println("찾는 훈련생이 없습니다.");
		}
	}
}
