package com.kh.myException;

public class MyException extends Exception {

	public MyException() {

	}

	public MyException(String msg) {
		super(msg);

		// �θ�����ڿ� ���ڿ��� �Ѱ��ָ�
		// Throwable�� �ִ� ����(detailMessage)�� ���� ������ �ش�.
		// detailMessage�� ���� �־��ָ�, e.getMessage()�޼��带 ����
		// �� ���� ����� �� �ִ�.
	}

}
