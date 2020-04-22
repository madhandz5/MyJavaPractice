package com.kh.stringConcatration;

import java.util.Scanner;

public class StringConcatration {

	Scanner scanner = new Scanner(System.in);
	String str = "KH Academy";

	public void stringConcat() {

		// ==
		// ���ϼ���
		// ���� �ּҸ� �ٶ󺸰� �ִ����� ���� true / false ��ȯ.
		String test1 = "ABC";
		String test2 = "ABC";
		System.out.println("test1 : " + System.identityHashCode(test1));
		System.out.println("test2 : " + System.identityHashCode(test2));
		System.out.println("��Ʈ�����Ǯ�� �ִ� String��ü�� �Ѵ� �ٶ󺸰� �ִ�." + (test1 == test2));

		String test3 = new String("ABC");
		System.out.println("test3 : " + System.identityHashCode(test3));
		System.out.println("heap������ �ö� String�� ���Ǯ�� �ִ� String �� : " + (test1 == test3));

		// equals �޼���
		// �����
		// �ȿ� ����ִ� ���� �������� Ȯ���ؼ� true / false ��ȯ.
		// �ּҴ� ��� ����.
		// java.lang.String.equals �޼��带 Ȱ���ؼ�
		// test1 �� test3�� ���ϴ� �ڵ带 �ۼ��ϼ���.

		System.out.println("Equals�޼���� test1, test3 �� : " + test1.equals(test3));
		System.out.println("ABC�� �Է��ϼ��� : ");
		String test4 = scanner.nextLine();
		System.out.println("test4 : " + System.identityHashCode(test4));
		System.out.println(test1 == test4);

	}

	// * 1.String
	// * - ���ڿ� ���� ������ �� ���� immutable�̴�.
	// * - ���ڿ� ���� �����ϴ� �۾��� �������� �ʴ�.
	// * - ���ڿ��� �����ϸ� ���ο� �ּҰ��� ��ȯ���ش�.

	public void stringConcatMethod() {
		str = str.concat(" Java Class");
		System.out.println(str);
	}

	// ���ڰ��� ������ �� �ִ�.(mutable �ϴ�)
	// �⺻ 16���� ũ���� buffer�� ����Ѵ�. ũ�⸦ ������ �� �ִ�.
	// -> ���������� ũ�Ⱑ 16�� char[] �� ������ ���´�.
	// ������ ����ȭ�� �������� �ʴ´�.

	public void stringBuilderConcat() {

		String A = "A";
		System.out.println(System.identityHashCode(A));
		A += "B";
		System.out.println(System.identityHashCode(A));

		StringBuilder sBuilder = new StringBuilder();
		System.out.println("���� �� : " + System.identityHashCode(sBuilder));
		sBuilder.append(str).append(" �ڹ� Ŭ����");
		System.out.println("���� �� : " + System.identityHashCode(sBuilder));
		System.out.println(sBuilder);

	}
	// ���ڰ��� ������ �� �ִ�.(mutable)�ϴ�
	// �⺻ 16���� ũ���� buffer�� ����Ѵ�. ũ�⸦ ������ �� �ִ�.
	// -> ���������� ũ�Ⱑ 16�� char[]�� �����Ѵ�.
	// ������ ����ȭ�� �����Ѵ�.

	public void stringBufferConcat() {

		StringBuffer sBuffer = new StringBuffer();

		System.out.println("���� �� : " + System.identityHashCode(sBuffer));
		sBuffer.append(str).append(" Java Class");
		System.out.println("���� �� : " + System.identityHashCode(sBuffer));
		System.out.println(sBuffer);

	}

}
