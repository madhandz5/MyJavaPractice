package com.kh.method;

public class Return {

	// ���������� [�����] ��ȯ�� �޼���� (�Ű�����)

	public static void staticMethod() {
		System.out.println("ReturnŬ������ static �޼��� �Դϴ�.");
		System.out.println("------------------------------");
	}

	public int sub(int i, int j) {
		int res = 0;
		res = i - j;
		return res;
	}

	public double div(int i, int j) {
		double res = 0.0;
		res = i / j;
		return res;
	}

	public char capital(char ch) {
		if (ch >= 'A' && ch <= 'Z') {
			ch += 32;
		} else if (ch >= 'a' && ch <= 'z') {
			ch -= 32;
		}
		return ch;
	}

}
