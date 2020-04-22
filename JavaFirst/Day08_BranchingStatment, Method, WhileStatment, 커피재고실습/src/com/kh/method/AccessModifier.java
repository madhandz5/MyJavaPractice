package com.kh.method;

public class AccessModifier {

	// �޼���� ����������[�����] ��ȯ�� �޼����(�Ű�����)

	// �޼��� ���� ������.
	// public(+) : ��� ��Ű������ ���� ����
	public void publicMethod() {
		System.out.println("public method");
	}

	// protected(#) : ��Ӱ����� ��쿡 ��ӵ� ������ ȣ�� ����
	// ��� ���谡 �ƴ� ��� ���� ��Ű�� ���� ��� ���� ����
	protected void protectedMethod() {
		System.out.println("protected method");
	}

	// default(~) : ���� ��Ű�� �������� ������ ����
	void defaultMethod() {
		System.out.println("default method");
	}

	// private(-) : ���� Ŭ���� �������� ������ ����
	private void privateMethod() {
		System.out.println("private method");
	}

}
