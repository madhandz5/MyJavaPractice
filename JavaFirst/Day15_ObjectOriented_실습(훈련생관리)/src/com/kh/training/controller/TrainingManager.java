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
		// ���� �� Trainee ��ü �迭 �� ��ŭ �ݺ������� �ݺ��ϸ�
		// �̸�, ��, ������ �Է� �޾� ��ü �迭 �ʱ�
		for (int i = 0; i < trainees.length; i++) {
			System.out.println("�Ʒû� �̸��� �Է��ϼ��� :");
			String name = sc.next();
			System.out.println("�Ʒû� ���� �Է��ϼ��� : ");
			char classRoom = sc.next().charAt(0);
			System.out.println("�Ʒû� ���� �Է��ϼ��� : ");
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
		System.out.println("=== �Ʒû� ��ü ���� ��� ===");
		for (int i = 0; i < trainees.length; i++) {
			if (trainees[i] == null) {
				System.out.println("�Ʒû��� �����ϴ�.");
				break;
			} else {
				System.out.println("ȸ����ȣ : " + i + "  " + trainees[i].inform() + "  ������� : " + passFail(i));
			}
		}
		System.out.println("���� �հ� : " + sumScore());
		System.out.println("���� ��� : " + avgScore());
	}

	public void searchTrainees() {
		System.out.println("�˻��� ��� �̸� : ");
		String who = sc.next();
		boolean noSearch = false;
		for (int i = 0; i < trainees.length; i++) {
			if (who.equals(trainees[i].getName())) {
				System.out.println("ȸ����ȣ : " + i + "  " + trainees[i].inform() + " / ������� : " + passFail(i));
				noSearch = true;
			}
		}
		if (!noSearch) {
			System.out.println("ã�� �Ʒû��� �����ϴ�.");
		}
	}
}
