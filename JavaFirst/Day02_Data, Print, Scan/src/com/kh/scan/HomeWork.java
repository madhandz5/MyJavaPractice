package com.kh.scan;

import java.util.Scanner;

public class HomeWork {
	public static void main(String[] args) {

		int a;

		System.out.println("����� ǥ�� �ұ��? (1 ~ 9)");

		Scanner sc = new Scanner(System.in);

		a = sc.nextInt();
		sc.nextLine();

		if (a == 1) {

			System.out.println("====1��====");

			for (int i = 1; i <= 9; i++) {
				System.out.print("1 * " + a);
				System.out.println(a * i);

			}
		}

	}

}
