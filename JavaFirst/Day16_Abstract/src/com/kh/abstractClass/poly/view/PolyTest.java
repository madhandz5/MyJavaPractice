package com.kh.abstractClass.poly.view;

import com.kh.abstractClass.poly.model.vo.Child1;
import com.kh.abstractClass.poly.model.vo.Child2;
import com.kh.abstractClass.poly.model.vo.Parent;

public class PolyTest {

	public void polyTest() {

		// * Parent p0, �θ�Ÿ�� ������ �θ� Ŭ���� �ν��Ͻ�ȭ
		// Parent p0 = new Parent();

		// * ���� �ڵ尡 ������ �� p0�� �ڽ� Ÿ������ �ٿ�ĳ����
		// * - �ٿ� ĳ���� : ���� ������ Ÿ���� �ļ�Ÿ���� Ÿ������ ����

		// ������ ������ ���� ������ ��Ÿ�� ���� �߻�
		// Child1 pp = (Child1) p0;

		// * Parent c0, �θ�Ÿ�� ������ �ڽ� Ŭ���� �ν��Ͻ� ȭ
		// * �� �ڵ尡 ������ �� c0�� �ڽ� Ÿ������ �ٿ� ĳ����
		Parent c0 = new Child1();
		Child1 cc = (Child1) c0;

		// * Child p1, �ڽ� Ÿ�� ������ �θ� Ŭ���� �ν��Ͻ� ȭ

		// ������ ����
		// Child1 p1 = new Parent();

		// * ���� �ڵ尡 ������ �� p1�� �θ�Ÿ�� ������ �� ĳ����
		// * - ��ĳ���� : ���� ������ Ÿ���� ���� Ÿ������ ����

		// �Ұ��� �ϹǷ� ��ĳ���� ����

		// * Child c1, �ڽ� Ÿ�� ������ �ڽ� Ŭ���� �ν��Ͻ� ȭ
		Child1 c1 = new Child1();

		// * ���� �ڵ尡 ������ �� c1�� �θ�Ÿ�� ������ ��ĳ����
		Parent p = c1;

		Parent p2 = new Child1();

		// System.out.println(p2.info());
		//
		// System.out.println(((Child1) p2).info());

		Child1 c11 = new Child1(3, 6, 9);

		Child2 c2 = new Child2();
		Child2 c22 = new Child2(5, 7, 9);
		// System.out.println(c2.info());

		int[][] iArr = new int[4][1];
		iArr[0][0] = 1;
		iArr[1][0] = 1;

		Object iArr2 = iArr;

		Parent[] pArr = new Parent[4];
		pArr[0] = c1;
		pArr[1] = c11;
		pArr[2] = c2;
		pArr[3] = c22;

		// for (int i = 0; i < pArr.length; i++) {
		// if (pArr[i] instanceof Child1) {
		// System.out.println(i + ((Child1) pArr[i]).info());
		// } else {
		// System.out.println(i + ((Child2) pArr[i]).info());
		// }
		// }
		for (int j = 0; j < pArr.length; j++) {
			System.out.println(pArr[j].info());
		}
	}

}
