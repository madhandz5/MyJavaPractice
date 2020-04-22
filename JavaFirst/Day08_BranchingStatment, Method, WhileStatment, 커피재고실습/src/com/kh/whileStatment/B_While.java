package com.kh.whileStatment;

import java.util.Scanner;

public class B_While {

	Scanner sc = new Scanner(System.in);

	// while ���� ���ǽĸ� �����ϴ� �ݺ����̴�.
	// (�ʱ�İ� �������� �������� �ʴ´�.)

	public void testWhile() {
		int i = 0;
		while (i < 5) {
			System.out.println("while�� ��������");
			i++;
		}
	}

	public void testWhile2() {

		int dan = 2;
		while (dan < 10) {
			int su = 1;
			while (su < 10) {
				System.out.println(dan + " X " + su + "=" + (dan * su));
				su++;
			}
			dan++;
		}
	}
	// ��й�ȣ�� 123456
	// ����ڰ� ��й�ȣ�� �°� �Է��ϸ� �α��� ���� ������ ����ϼ���.
	// ��й�ȣ�� Ʋ���� �Է��ϸ� �� ȸ �߸� �Է��Ͽ����� �˷��ִ� ������ �ۼ��ϼ���.
	// ��й�ȣ�� 5ȸ Ʋ����
	// "��й�ȣ�� 5ȸ �߸� �Է��Ͽ� 10�а� �α��� �� �� �����ϴ�."
	// ������ ����ϼ���.

	// ����ڰ� �ڷ����� �Է��ϸ� �ش� �ڷ����� ũ��� �ּҰ�, �ִ밪�� ��ȯ���ּ�

	public void whileQuiz() {

		String pw = "123456";
		String input = "";
		int tryCount = 1;

		while (!(pw.equals(input)) && tryCount < 6) {

			System.out.println("��й�ȣ �Է�");
			input = sc.nextLine();

			if (pw.equals(input)) {
				System.out.println("�α��� ����");
			} else {
				System.out.println("��й�ȣ" + tryCount + "ȸ ����");
				tryCount++;
			}
		}
		if (tryCount == 6) {
			System.out.println("��й�ȣ�� 5ȸ �̻� �߸��Է��Ͽ����ϴ�. 10�а� �α��κҰ�");
		}
	}

	public void whileQuiz2() {

		boolean rgx = true;

		while (rgx) {

			System.out.println("�˰���� �ڷ����� �Է��ϼ���.");
			System.out.println("boolean / char /byte/short/int/long/float/double/����:exit");

			String data = sc.nextLine();
			int size = 0;
			double max = 0;
			double min = 0;

			switch (data) {
			case "boolean":
				size = 1;
				max = 1;
				min = 0;
				break;
			case "char":
				size = Character.SIZE;
				max = Character.MAX_VALUE;
				min = Character.MIN_VALUE;
				break;
			case "int":
				size = Integer.SIZE;
				max = Integer.MAX_VALUE;
				min = Integer.MIN_VALUE;
				break;

			case "byte":
				size = Byte.SIZE;
				max = Byte.MAX_VALUE;
				min = Byte.MIN_VALUE;
				break;
			case "short":
				size = Short.SIZE;
				max = Short.MAX_VALUE;
				min = Short.MIN_VALUE;
				break;
			case "long":
				size = Long.SIZE;
				max = Long.MAX_VALUE;
				min = Long.MIN_VALUE;
				break;
			case "float":
				size = Float.SIZE;
				max = Float.MAX_VALUE;
				min = Float.MIN_VALUE;
				break;
			case "double":
				size = Double.SIZE;
				max = Double.MAX_VALUE;
				min = Double.MIN_VALUE;
				break;

			case "exit":
				rgx = false;
				break;
			default:
				System.out.println("�߸� �Է��Ͽ����ϴ�.");
				System.out.println("���α׷��� ����Ǿ����ϴ�.");
				break;
			}
			if (size != 0) {
				System.out.println(data + "-Size: " + size + "///" + "Max: " + max + "///" + "Min: " + min);
			}
		}
	}
}