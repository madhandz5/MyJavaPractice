package com.kh.model;

public class PrimitiveTypeSample {

	byte defByte;
	short defShort;
	int defInt;
	long defLong;
	char defChar;
	float defFloat;
	double defDouble;
	boolean defBool;

	public void typeSize() {
		System.out.println("======�⺻�ڷ��� �޸� �Ҵ�ũ�� Ȯ���ϱ� ======");
		System.out.println("Byte  : " + Byte.BYTES);
		System.out.println("Short : " + Short.BYTES);
		System.out.println("Integer : " + Integer.BYTES);
		System.out.println("Long : " + Long.BYTES);
		System.out.println("Character : " + Character.BYTES);
		System.out.println("Float : " + Float.BYTES);
		System.out.println("Double : " + Double.BYTES);

	}

	public void minMaxValue() {
		System.out.println("======�⺻�ڷ��� ���� �ּҰ�, �ִ밪 ����ϱ� ======");
		System.out.println("Byte  : " + Byte.MIN_VALUE + "," + Byte.MAX_VALUE);
		System.out.println("Short : " + Short.MIN_VALUE + "," + Short.MAX_VALUE);
		System.out.println("Integer : " + Integer.MIN_VALUE + "," + Integer.MAX_VALUE);
		System.out.println("Long : " + Long.MIN_VALUE + "," + Long.MAX_VALUE);
		System.out.println("Character : " + Character.MIN_VALUE + "," + Character.MAX_VALUE);
		System.out.println("Float : " + Float.MIN_VALUE + "," + Float.MAX_VALUE);
		System.out.println("Double : " + Double.MIN_VALUE + "," + Double.MAX_VALUE);

	}

	public void bitSize() {
		System.out.println("======�⺻�ڷ��� ��Ʈ ���� Ȯ���ϱ� ======");
		System.out.println("Byte  : " + Byte.SIZE);
		System.out.println("Short : " + Short.SIZE);
		System.out.println("Integer : " + Integer.SIZE);
		System.out.println("Long : " + Long.SIZE);
		System.out.println("Character : " + Character.SIZE);
		System.out.println("Float : " + Float.SIZE);
		System.out.println("Double : " + Double.SIZE);

	}

}
