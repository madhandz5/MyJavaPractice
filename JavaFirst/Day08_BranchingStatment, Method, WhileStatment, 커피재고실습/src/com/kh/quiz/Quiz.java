package com.kh.quiz;

import java.util.Scanner;

public class Quiz {

	Scanner sc = new Scanner(System.in);

	public void quiz1() {

		// ���α׷��� ���۵Ǹ� ��Ŀ����� �Է��ϼ���. �����Ϸ��� 0�� �Է� �ϼ��� :�� �ȳ�â�� ����ϰ�
		// �԰� �� Ŀ����� ����ڷκ��� �Է� ��������.
		// ���� Ŀ����� 0���� �Է��� ��� ���α׷��� �����ϼ���.
		//
		// ��� �԰� �� �̷�� ���� "���� �� ���� Ŀ�Ǹ� �ֹ��Ͽ����ϱ�?" ��� �ȳ����� ����� ��
		// ���� �ֹ��� Ŀ�� �� ���� ����ڷκ��� �Է� �޾�,
		// ���� ����� ���� �ֹ��� Ŀ�� ������ ���� ��Ű����.
		//
		// ��� 0�� �Ǹ� "Ŀ�� ��� �����մϴ�"
		// �ȳ����� ����� �� ���α׷��� �����ϼ���.
		//
		// ���� �ֹ��� Ŀ�� ������ ���� ����� ���� ���
		// "�ֹ��� ���� ��� �����ϴ�. �ֹ��� �ٽ� �޾� �ּ���."
		// �ȳ����� ����� �� ���α׷��� �����ϼ���.
		//
		// �ֹ��� ���������� �̷�� ���� "���� Ŀ�� ���� N �� �Դϴ�."
		// �������� ��� ��� ���� �� "���� �� ���� Ŀ�Ǹ� �ֹ��Ͽ����ϱ�?"
		// �ȳ�â���� ���ư�����.

		// 2�ܰ�
		// �ֹ������� ��� ��� ���α׷��� ����Ǵ� ��Ȳ��
		// �ٽ� �ֹ��� �޴� �ڵ�� �����ϼ���

		// 3�ܰ�
		// ��� 0�̵Ǿ "Ŀ����� �����ϴ�"�� ����ϰ�, ���α׷��� ����Ǵ� ��Ȳ��
		// Ŀ�� ��� �ٽ� �Է� �ްԲ� �ڵ带�����ϼ���.

		int jaego = 0;
		boolean empty = true;

		outer: do {
			if (empty) {
				System.out.println("Ŀ�� ��� �Է��ϼ���. �����Ϸ��� 0�� �Է��ϼ���.");
				jaego = sc.nextInt();
				System.out.println("----------------------------------");
				System.out.println("Ŀ�� ��� " + jaego + "�� �԰� �Ǿ����ϴ�.");
				System.out.println("----------------------------------");
				empty = false;

			} else {
				System.out.println("���� ������ Ŀ�Ǹ� �ֹ��Ͽ����ϱ�?");
				int order = sc.nextInt();

				if (jaego < order) {
					System.out.println("-------------------------------------");
					System.out.println("�ֹ��� ���� ��� �����ϴ�.�ֹ��� �ٽ� �޾��ּ���.");
					System.out.println("���� ��� : " + jaego + " �ֹ��� : " + order);
					System.out.println("-------------------------------------");
				} else if (jaego >= order) {
					jaego -= order;
					System.out.println("--------" + order + "�� �ֹ��Ϸ�-----------");
					System.out.println("���� ���� " + jaego + " �Դϴ�.");
					System.out.println("----------------------------");
					if (jaego == 0) {
						System.out.println("��� ��� �����Ǿ����ϴ�.");
						System.out.println("----------------------------");
						empty = true;
					}
				}

			}
		} while (!empty);
		System.out.println("���α׷� ����");

	}

	public void quiz1Answer() {
		// ���α׷��� ���۵Ǹ� ��Ŀ����� �Է��ϼ���. �����Ϸ��� 0�� �Է� �ϼ��� :�� �ȳ�â�� ����ϰ�
		// �԰� �� Ŀ����� ����ڷκ��� �Է� ��������.
		// ���� Ŀ����� 0���� �Է��� ��� ���α׷��� �����ϼ���.
		//
		// ��� �԰� �� �̷�� ���� "���� �� ���� Ŀ�Ǹ� �ֹ��Ͽ����ϱ�?" ��� �ȳ����� ����� ��
		// ���� �ֹ��� Ŀ�� �� ���� ����ڷκ��� �Է� �޾�,
		// ���� ����� ���� �ֹ��� Ŀ�� ������ ���� ��Ű����.
		//
		// ��� 0�� �Ǹ� "Ŀ�� ��� �����մϴ�"
		// �ȳ����� ����� �� ���α׷��� �����ϼ���.
		//
		// ���� �ֹ��� Ŀ�� ������ ���� ����� ���� ���
		// "�ֹ��� ���� ��� �����ϴ�. �ֹ��� �ٽ� �޾� �ּ���."
		// �ȳ����� ����� �� ���α׷��� �����ϼ���.
		//
		// �ֹ��� ���������� �̷�� ���� "���� Ŀ�� ���� N �� �Դϴ�."
		// �������� ��� ��� ���� �� "���� �� ���� Ŀ�Ǹ� �ֹ��Ͽ����ϱ�?"
		// �ȳ�â���� ���ư�����.
		boolean rgx = false;
		int stock = 0;

		System.out.println("Ŀ�� ��� �Է��ϼ���. �����Ϸ��� 0�� �Է��ϼ���.");
		stock = sc.nextInt();

		if (stock == 0) {
			System.out.println("���� 0�� �̻� �Է����ּ���.");
		} else {
			rgx = true;
		}

		while (rgx) {
			System.out.println();
			System.out.println("���� ������ Ŀ�Ǹ� �ֹ��Ͽ����ϱ�?");
			int sellCoffee = sc.nextInt();

			// ���� �ֹ��� Ŀ�� �������� ��� ���� ���
			if (stock >= sellCoffee) {
				// ���� �ֹ��� Ŀ�� ������ ��� ���� ���
				if (stock == sellCoffee) {
					System.out.println("Ŀ��" + sellCoffee + "�� �Ǹ��Ͽ����ϴ�.");
					System.out.println("Ŀ�� ��� �����ϴ�.");
					stock -= sellCoffee;
					rgx = false;
				} else {
					System.out.println("Ŀ��" + sellCoffee + "�� �Ǹ��Ͽ����ϴ�.");
					stock -= sellCoffee;
					System.out.println("���� Ŀ�� ���� " + stock + "�Դϴ�.");
					System.out.println("-------------------------------");
				}
			}
			// ���� �ֹ��� Ŀ�� ������ ����� ���� ���
			else {
				System.out.println("�ֹ������� ��� �����ϴ�.");
				System.out.println("�ֹ��� �ٽ� �޾��ּ���.");
				rgx = false;
			}
		}
		System.out.println("���α׷��� ���� �Ǿ����ϴ�.");
	}

	public void quiz1Answer2() {
		// 2�ܰ�
		// �ֹ������� ��� ��� ���α׷��� ����Ǵ� ��Ȳ��
		// �ٽ� �ֹ��� �޴� �ڵ�� �����ϼ���

		boolean rgx = false;
		int stock = 0;

		System.out.println("Ŀ�� ��� �Է��ϼ���. �����Ϸ��� 0�� �Է��ϼ���.");
		stock = sc.nextInt();

		if (stock == 0) {
			System.out.println("���� 0�� �̻� �Է����ּ���.");
		} else {
			rgx = true;
		}

		while (rgx) {
			System.out.println();
			System.out.println("���� ������ Ŀ�Ǹ� �ֹ��Ͽ����ϱ�?");
			int sellCoffee = sc.nextInt();

			// ���� �ֹ��� Ŀ�� �������� ��� ���� ���
			if (stock >= sellCoffee) {
				// ���� �ֹ��� Ŀ�� ������ ��� ���� ���
				if (stock == sellCoffee) {
					System.out.println("Ŀ��" + sellCoffee + "�� �Ǹ��Ͽ����ϴ�.");
					System.out.println("Ŀ�� ��� �����ϴ�.");
					stock -= sellCoffee;
					rgx = false;
				} else {
					System.out.println("Ŀ��" + sellCoffee + "�� �Ǹ��Ͽ����ϴ�.");
					stock -= sellCoffee;
					System.out.println("���� Ŀ�� ���� " + stock + "�Դϴ�.");
					System.out.println("-------------------------------");
				}
			}
			// ���� �ֹ��� Ŀ�� ������ ����� ���� ���
			else {
				System.out.println("�ֹ������� ��� �����ϴ�.");
				System.out.println("�ֹ��� �ٽ� �޾��ּ���.");
			}
		}
		System.out.println("���α׷��� ���� �Ǿ����ϴ�.");
	}

	public void quiz1Answer3() {
		// 3�ܰ�
		// ��� 0�̵Ǿ "Ŀ����� �����ϴ�"�� ����ϰ�, ���α׷��� ����Ǵ� ��Ȳ��
		// Ŀ�� ��� �ٽ� �Է� �ްԲ� �ڵ带�����ϼ���.

		boolean rgx = false;
		boolean stockRgx = true;
		int stock = 0;

		do {

			if (stockRgx) {

				System.out.println("Ŀ����� �Է��ϼ���. �����Ϸ��� 0�� �Է��ϼ���");
				System.out.print("Ŀ����� : ");
				stock = sc.nextInt();

				if (stock > 0) {
					rgx = true;
					stockRgx = false;
					System.out.println("Ŀ���ǸŸ� �����մϴ�.");
					System.out.println("------------------------------");
				} else {
					System.out.println("���α׷��� �����մϴ�.");
					break;
				}
			}

			if (rgx) {
				System.out.println();
				System.out.print("���� �� ���� Ŀ�Ǹ� �ֹ��Ͽ����ϱ� ? :");
				int sellcoffee = sc.nextInt();

				if (stock >= sellcoffee) {

					if (stock - sellcoffee > 0) {

						stock -= sellcoffee;
						System.out.println("Ŀ��" + sellcoffee + "�� �Ǹ��Ͽ����ϴ�.");
						System.out.println("���� Ŀ�� ���� " + stock + "�Դϴ�.");
						System.out.println("------------------------------");

					} else {
						stock -= sellcoffee;
						System.out.println("Ŀ��" + sellcoffee + "�� �Ǹ��Ͽ����ϴ�.");
						System.out.println("Ŀ����� �����ϴ�.\n");
						// rgx = false;
						stockRgx = true;
					}

				} else {

					System.out.println("�ֹ��� ���� ��� �����ϴ�.");
					System.out.println("�ֹ��� �ٽ� �޾� �ּ���.");
					System.out.println("------------------------------");
					continue;
				}
			}

			// ���α׷� ���� ������ �ٸ���
			// �Ʒ����� ��� �Է� �޴� ���� ���� �ڵ����� �����غ���.

			/*
			 * if(!rgx) {
			 * 
			 * System.out.println("Ŀ����� �Է��ϼ���. �����Ϸ��� 0�� �Է��ϼ���");
			 * System.out.print("Ŀ����� : "); stock = sc.nextInt();
			 * 
			 * if(stock > 0) { rgx = true; System.out.println("Ŀ���ǸŸ� �����մϴ�.");
			 * System.out.println("------------------------------"); }else {
			 * System.out.println("���α׷��� �����մϴ�."); } }
			 */

		} while (rgx);
	}

}
