package com.kh.abstractClass.poly.view;

import com.kh.abstractClass.poly.model.vo.Child1;
import com.kh.abstractClass.poly.model.vo.Child2;
import com.kh.abstractClass.poly.model.vo.Parent;

public class PolyTest {

	public void polyTest() {

		// * Parent p0, 부모타입 변수로 부모 클래스 인스턴스화
		// Parent p0 = new Parent();

		// * 위의 코드가 가능할 시 p0을 자식 타입으로 다운캐스팅
		// * - 다운 캐스팅 : 현재 변수의 타입을 후손타입인 타입으로 변경

		// 컴파일 에러는 나지 않지만 런타임 에러 발생
		// Child1 pp = (Child1) p0;

		// * Parent c0, 부모타입 변수로 자식 클래스 인스턴스 화
		// * 위 코드가 가능할 시 c0을 자식 타입으로 다운 캐스팅
		Parent c0 = new Child1();
		Child1 cc = (Child1) c0;

		// * Child p1, 자식 타입 변수로 부모 클래스 인스턴스 화

		// 컴파일 에러
		// Child1 p1 = new Parent();

		// * 위의 코드가 가능할 시 p1을 부모타입 변수로 업 캐스팅
		// * - 업캐스팅 : 현재 변수의 타입을 선조 타입으로 변경

		// 불가능 하므로 업캐스팅 안함

		// * Child c1, 자식 타입 변수로 자식 클래스 인스턴스 화
		Child1 c1 = new Child1();

		// * 위의 코드가 가능할 시 c1을 부모타입 변수로 업캐스팅
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
