package com.kh.run;

import com.kh.model.vo.Family;
import com.kh.model.vo.Father;

public class Run {

	public static void main(String[] args) {

		// ���� Ÿ������ �ƹ��� Ŭ���� �ν��Ͻ� ȭ

		Family father = new Father("ȫ�繫", 70, 15);
		// �ƹ����� ����
		System.out.println(father.toString());
		// �ƹ����� �ǰ�
		System.out.println("�ƹ����� �ǰ� : " + father.getHealth());
		System.out.println("�ƹ����� ������ : " + father.getWeight());
		// �ƹ����� �Ļ縦 �Ѵ�.
		System.out.println("�ƹ����� �Ļ縦 �Ѵ�.");
		father.eat();
		// �ƹ����� �ǰ� ���
		System.out.println("�ƹ����� �ǰ� : " + father.getHealth());
		System.out.println("�ƹ����� ������ : " + father.getWeight());
		// �ƹ����� ���� �ܴ�.
		System.out.println("�ƹ����� ���� �ܴ�.");
		father.sleep();
		// �ƹ��� �ǰ� ���
		System.out.println("�ƹ����� �ǰ� : " + father.getHealth());
		System.out.println("�ƹ����� ������ : " + father.getWeight());

		// "�ƹ����� �Ʊ�� ����ش�" ���� ���
		System.out.println("�ƹ����� �Ʊ�� ����ش�.");
		// �ƹ��� play�޼��� ȣ��
		((Father) father).play();
		// �ƹ��� �ǰ� ���
		System.out.println("�ƹ����� �ǰ� : " + father.getHealth());
		System.out.println("�ƹ����� ������ : " + father.getWeight());

	}
}
