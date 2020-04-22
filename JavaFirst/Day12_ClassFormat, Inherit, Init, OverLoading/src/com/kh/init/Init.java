package com.kh.init;

public class Init {

	// * - �ʵ庯�� �ʱ�ȭ ����
	// * - �ν��ϼ� ���� : jvm �⺻�� -> �ʵ庯���� ���� ������ �� -> �ʱ�ȭ ���-> ������
	// * - Ŭ���� ���� : jvm �⺻�� -> �ʵ庯���� ���� ������ �� -> static �ʱ�ȭ ���

	private int nonStaticVar = 10;
	public static int staticVar = 20;

	// * 1. �ʱ�ȭ ���
	// * - Ŭ������ �ν��Ͻ�ȭ �Ǵ� ���� �ѹ��� ȣ��Ǿ� �ν��ϼ� ������ ���� �ʱ�ȭ ���ش�.
	{
		System.out.println("�ʱ�ȭ���");
		System.out.println("nonStaticVar = 10 : " + nonStaticVar);
		nonStaticVar = 100;
		System.out.println("nonStaticVar = 100 : " + nonStaticVar);
	}

	// * 2. Static �ʱ�ȭ ���
	// * - Ŭ���� ������ ���� �ʱ�ȭ ���ش�.
	static {
		System.out.println("static �ʱ�ȭ ���");
		System.out.println("staticVar = 20 : " + staticVar);
		staticVar = 200;
		System.out.println("staticVar = 200 : " + staticVar);
	}

	public Init() {
		System.out.println("================================");
		System.out.println("�����ڸ� ���� �ʱ�ȭ");
		System.out.println("nonStaticVar = 100 : " + nonStaticVar);
		nonStaticVar = 1000;
		System.out.println("nonStaticVar = 1000 : " + nonStaticVar);
		staticVar = 2000;
		System.out.println("staticVar = 2000 : " + staticVar);
	}
}
