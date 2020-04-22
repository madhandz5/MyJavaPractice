package com.kh.array;

import java.util.Arrays;

public class ArrayCopy {

	public void shallowCopy() {

		int[] orginArr = { 1, 2, 3, 4, 5 };
		int[] copyArr = orginArr;

		System.out.println("orginArr : " + Arrays.toString(orginArr));
		System.out.println("copyArr : " + Arrays.toString(copyArr));

		orginArr[0] = 9999;

		System.out.println("orginArr : " + Arrays.toString(orginArr));
		System.out.println("copyArr : " + Arrays.toString(copyArr));

		// 주소값을 확인하는
		System.out.println("orginArr : " + System.identityHashCode(orginArr));
		System.out.println("copyArr : " + System.identityHashCode(copyArr));

	}

	public void deepCopy() {

		int[] orginArr = { 1, 2, 3, 4, 5 };
		int[] copyArr = new int[5];

		for (int i = 0; i < copyArr.length; i++) {
			copyArr[i] = orginArr[i];
		}

		System.out.println("orginArr : " + Arrays.toString(orginArr));
		System.out.println("copyArr : " + Arrays.toString(copyArr));

		orginArr[0] = 9999;

		System.out.println("orginArr : " + Arrays.toString(orginArr));
		System.out.println("copyArr : " + Arrays.toString(copyArr));

		// 주소값을 확인하는
		System.out.println("orginArr : " + System.identityHashCode(orginArr));
		System.out.println("copyArr : " + System.identityHashCode(copyArr));
	}

}
