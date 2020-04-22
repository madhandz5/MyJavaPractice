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
				System.out.println("=====������ �������� �Է��Ͻÿ�=====");
				System.out.println("���� : ");
				kor = sc.nextInt();
				System.out.println("���� : ");
				eng = sc.nextInt();
				System.out.println("���� : ");
				mat = sc.nextInt();
				sum = kor + eng + mat;
				avg = sum / 3;
				dOut.writeUTF("����");
				dOut.writeUTF("����");
				dOut.writeUTF("����");
				dOut.writeUTF("����");
				dOut.writeUTF("���");
				dOut.writeInt(kor);
				dOut.writeInt(eng);
				dOut.writeInt(mat);
				dOut.writeInt(sum);
				dOut.writeDouble(avg);
				System.out.println(++num + "��° �л� ���� ���");
				do {
					System.out.println("��� �����Ͻðڽ��ϱ�? (y/n)");
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
						System.out.println(fileName + " ���Ͽ� ���� �Ϸ�");
						return;
					default:
						System.out.println("�߸��Է��ϼ̽��ϴ�. �ٽ� �Է����ּ���.");
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
					System.out.println(++count + "��° �л�");
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
			System.out.println("���� Ƚ��  " + "  ��ü ����  " + "  ��ü ���  ");
			System.out.println("  " + count + "       " + sumS + "     " + avgS / count);
			System.out.println(fileName + " ���� �б� �Ϸ�!");
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
