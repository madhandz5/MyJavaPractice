package com.kh.print;

public class PrintTest {
	public static void main(String[] args) {
		System.out.print("�ȳ��ϼ���?");
		System.out.println("�ڹ� �����Դϴ�.");
		System.out.println("print �Լ� �Դϴ�.");

		System.out.printf("%5d\n", 1);
		// %d ������ ����
		System.out.printf("%.2f\n", 1.1);
		// %f ������ �Ǽ�
		System.out.printf("%c\n", 'A');
		// %c ������ ����
		System.out.printf("%s\n", "Hello Java");
		// %s ������ ���ڿ�
		System.out.printf("%b", true);
		// %b ������ ����

	}

}
