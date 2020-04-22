package com.kh.array;

import java.util.Arrays;

public class ArrayPrac {

	// [문제 1.]
	// java.lang.Math 클래스의 random() 메서드를 사용해 보세요.
	// java api 사용하기

	public int[] lottoNumbers() {

		int[] lottoNums = new int[6];
		for (int i = 0; i < lottoNums.length; i++) {

			// 여기에서 사용해서
			// Math random()메서드의 결과값을 10번 출력해주세요.
			lottoNums[i] = (int) (Math.random() * 45) + 1;

			for (int j = 0; j < i; j++) {
				if (lottoNums[i] == lottoNums[j]) {
					i--;
					break;
				}
			}
		}
		ArrayUtil arrayUtil = new ArrayUtil();
		arrayUtil.sort(lottoNums);
		// Arrays.sort(lottoNums);
		return lottoNums;

	}

	public void prac2() {

		// [문제2]
		// - 구현 내용:
		// 1. 크기가 10인 int[] 선언, 할당함
		// 2. 1~100사이의 임의의 정수를 발생시켜, 배열공간에 기록함.
		// 배열[인덱스] = (int)(Math.random()*100)+1;
		// 3. 기록된 10개의 값 중 가장 큰 값과 가장 작은값을 알아내기
		// 4. 출력확인

		int[] nums = new int[10];

		for (int i = 0; i < nums.length; i++) {
			nums[i] = (int) (Math.random() * 100) + 1;
		}

		int max = nums[0]; // 최대값
		int min = nums[0]; // 최소값

		for (int i = 0; i < nums.length; i++) {
			if (max < nums[i]) {
				// max의 값보다 array[i]이 크면 max = array[i]
				max = nums[i];
			}
			if (min > nums[i]) {
				// min의 값보다 array[i]이 작으면 min = array[i]
				min = nums[i];
			}
		}
		System.out.println(Arrays.toString(nums));

		System.out.println("최소값 : " + min + "  최대값 : " + max);
	}

	public void test2() {

		String data = "abcdefgh";
		// 문자열 data에서 cde를 추출해 출력해주세요.
		// java.lang.String 클래스의 substring 메서드를 활용하시면 됩니다.

		System.out.println(data.substring(2, 5));

		String number = "123456";
		// number를 int형으로 변환해주세요.
		// java.lang.Integer 클래스의 parseInt 메서드

		System.out.println("문자열 number 는 : " + number);
		System.out.println("정수형 number 는 : " + Integer.parseInt(number));
		System.out.println("파싱한 숫자를 2로 나누었습니다. : " + Integer.parseInt(number) / 2);
	}

	public void test3() {

		// 크기가 10인 int[] 를 3개 생성하세요.
		// 각 int[]을 1~95 사이의 난수로 초기화하세요.
		// 3개의 int[]에 들어가 있는 숫자들 중에서 7번째 8번째 9번째로 작은 수를 출력하세요.

		int[] iArr = new int[10];
		int[] iArr2 = new int[10];
		int[] iArr3 = new int[10];

		for (int i = 0; i < 10; i++) {
			iArr[i] = (int) (Math.random() * 95) + 1;
			iArr2[i] = (int) (Math.random() * 95) + 1;
			iArr3[i] = (int) (Math.random() * 95) + 1;
		}

		ArrayUtil arrayUtil = new ArrayUtil();

		System.out.println(Arrays.toString(
				arrayUtil.subArr(arrayUtil.sort(arrayUtil.addAll(iArr3, arrayUtil.addAll(iArr, iArr2))), 6, 9)));
	}
}
