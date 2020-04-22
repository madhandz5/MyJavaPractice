package com.kh.method;

public class MethodTest {

	public void methodTest() {
		// static �޼��� �����غ���
		Static.staticMethod();
		Return.staticMethod();
	}

	public void methodTest1() {
		// AccessModifier amf = new AccessModifier();

		// AccessModifier Ŭ������ publicMethod ȣ���غ���
		// amf.publicMethod();
		// AccessModifier Ŭ������ protecedMethod ȣ���غ���
		// amf.protectedMethod();
		// AccessModifier Ŭ������ defaultMethod ȣ���غ���
		// amf.defaultMethod();
		// AccessModifier Ŭ������ privateMethod ȣ���غ���

		Return rt = new Return();
		// return Ŭ������ sub�޼��带 ȣ���Ѵ��� �Ű������� ���ϴ� ���� �ְ�
		// �޼��尡 �����ִ� ���� �˸��� ������ ��� ����� ����غ���.
		System.out.println(rt.sub(10, 20));
		// return Ŭ������ div�޼��带 ȣ���Ѵ��� �Ű������� ���ϴ� ���� �ְ�
		// �޼��尡 �����ִ� ���� �˸��� ������ ��� ����� ����غ���.
		System.out.println(rt.div(20, 10));
		// return Ŭ������ capital�޼��带 ȣ���Ѵ��� �Ű������� ���ϴ� ���� �ְ�
		// �޼��尡 �����ִ� ���� �˸��� ������ ��� ����� ����غ���.
		System.out.println(rt.capital('a'));
	}

	public void staticTest() {
		System.out.println("Byte�� �ּҰ���" + Byte.MIN_VALUE + "�Դϴ�.");
		Static.name = "������";
		System.out.println("���� �̸��� " + Static.name + "�Դϴ�.");
	}

	public void staticTest1() {
		System.out.println("Short�� �ּҰ���" + Short.MIN_VALUE + "�Դϴ�.");
		System.out.println("���� �̸��� " + Static.name + "�Դϴ�.");
	}

	public void staticTest2() {
		System.out.println("Int�� �ּҰ���" + Integer.MIN_VALUE + "�Դϴ�.");
		System.out.println("���� �̸��� " + Static.name + "�Դϴ�.");
	}

}
