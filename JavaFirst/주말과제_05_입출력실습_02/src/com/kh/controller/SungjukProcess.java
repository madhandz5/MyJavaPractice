package com.kh.controller;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.EOFException;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;

public class SungjukProcess {

	Scanner sc = new Scanner(System.in);
	String fileName = "score.dat";

	public SungjukProcess() {

	}

	public void sungjukSave() {
		int num = 0;
		int kor = 0, eng = 0, mat = 0, sum = 0;
		double avg = 0.0;
		boolean cont = true;
		boolean correct = false;
		try (DataOutputStream dOut = new DataOutputStream(new FileOutputStream(fileName));) {
			do {
				System.out.println("=====다음의 성적들을 입력하시오=====");
				System.out.println("국어 : ");
				kor = sc.nextInt();
				System.out.println("영어 : ");
				eng = sc.nextInt();
				System.out.println("수학 : ");
				mat = sc.nextInt();
				sum = kor + eng + mat;
				avg = sum / 3;
				dOut.writeUTF("국어");
				dOut.writeUTF("영어");
				dOut.writeUTF("수학");
				dOut.writeUTF("총점");
				dOut.writeUTF("평균");
				dOut.writeInt(kor);
				dOut.writeInt(eng);
				dOut.writeInt(mat);
				dOut.writeInt(sum);
				dOut.writeDouble(avg);
				System.out.println(++num + "번째 학생 정보 기록");
				do {
					System.out.println("계속 저장하시겠습니까? (y/n)");
					char input = sc.next().charAt(0);
					switch (input) {
					case 'y':
					case 'Y':
						cont = true;
						correct = true;
						break;
					case 'n':
					case 'N':
						cont = false;
						correct = true;
						System.out.println(fileName + " 파일에 저장 완료");
						return;
					default:
						System.out.println("잘못입력하셨습니다. 다시 입력해주세요.");
						correct = false;
						break;
					}
				} while (!correct);
			} while (cont);
		} catch (Exception e) {
			System.out.println(e);
		}
	}

	public void scoreRead() {
		int count = 0;
		int kor = 0, eng = 0, mat = 0, sum = 0, sumS = 0;
		double avg = 0.0, avgS = 0.0;
		try (DataInputStream dis = new DataInputStream(new FileInputStream(fileName));) {
			while (dis.available() != -1) {
				if (dis.available() != 0) {
					System.out.println(++count + "번째 학생");
				}
				System.out.println(dis.readUTF() + "       " + dis.readUTF() + "       " + dis.readUTF() + "       "
						+ dis.readUTF() + "       " + dis.readUTF());
				kor = dis.readInt();
				eng = dis.readInt();
				mat = dis.readInt();
				sum = dis.readInt();
				avg = dis.readDouble();
				System.out.println(kor + "     " + eng + "     " + mat + "    " + sum + "   " + avg);
				sumS += sum;
				avgS += avg;
			}
		} catch (EOFException e) {
			System.out.println("읽은 횟수  " + "  전체 총점  " + "  전체 평균  ");
			System.out.println("  " + count + "       " + sumS + "     " + avgS / count);
			System.out.println(fileName + " 파일 읽기 완료!");
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
