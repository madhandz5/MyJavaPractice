package com.kh.stringMethod;

import java.util.Arrays;

public class StringMethod {

	String string = "    The String class represents character strings    ";

	public void cotrollerMethod() {

		System.out.println(".length : " + lengthTest(string));
		System.out.println(".toUpperCase : " + toUpperCaseTest(string));
		System.out.println(".toLowerCase : " + toLowerCaseTest(string));
		System.out.println(".indexOf : " + indexOfTest(string, 'c'));
		System.out.println(".replace : " + replaceTest(string, "class", "Java"));
		System.out.println(".replace : " + replaceTest2(string, "string", "스트링"));
		System.out.println(".toCharArray : " + Arrays.toString(toCharArrayTest(string)));
		System.out.println(".trim : " + trimTest(string));

	}

	// 1.str의 길이
	// java.lang.String.length();

	private int lengthTest(String st) {

		int res = st.length();

		return res;
	}

	// * 2. str을 모두 대문자로 바꿔보자
	// * - java.lang.String.toUpperCase()

	private String toUpperCaseTest(String st) {
		String res = st.toUpperCase();
		return res;
	}

	// * 3. str을 모두 소문자로 바꿔보자
	// * - java.lang.String.toLowerCase()
	private String toLowerCaseTest(String st) {
		String res = st.toLowerCase();
		return res;
	}

	// * 4. str에서 첫번째 c의 인덱스 위치.
	// * - java.lang.String.indexOf()
	private int indexOfTest(String st, char word) {
		int res = st.lastIndexOf(word);
		return res;

	}

	// * 5. str에서 "Class" 를 "java"로 바꿔서 출력
	// * - java.lang.String.replace()

	private String replaceTest(String st, String origin, String toWhat) {

		String res = st.replace(origin, toWhat);
		return res;

	}

	// * 6. str에서 "string"을 "스트링"으로 바꿔서 출력
	// * - java.lang.String.replace()

	private String replaceTest2(String st, String origin, String toWhat) {
		String res = st.replace(origin, toWhat);
		return res;

	}

	// * 7. str을 char[] 형태로 출력
	// * -java.lang.String.toCharArray()

	private char[] toCharArrayTest(String st) {

		char[] res = st.toCharArray();
		return res;

	}

	// * 8. str을 앞 뒤 공백을 제거한 후 출력
	// * -java.lang.String.trim()

	private String trimTest(String st) {
		String res = st.trim();
		return res;
	}

	// * 9. test1 : character를 찾아서 대문자로 변환한 후 전체 출력
	// * -java.lang.String.subString()
	public void test1() {

		String res = string.substring(indexOfTest(string, 'h') - 1, indexOfTest(string, 'h') + 8);

		System.out.println(string.replace(res, res.toUpperCase()));

	}

	// * 10. 문자열 str을 전체 역순으로 출력하기.

	public void test2() {

		char[] res = string.toCharArray();
		char[] res2 = new char[res.length];
		int j = 0;
		for (int i = res.length - 1; i >= 0; i--) {
			res2[i] = res[j];
			j++;
		}
		System.out.println(Arrays.toString(res));
		System.out.println("-------------역순 정렬-------------");
		System.out.println(Arrays.toString(res2));
	}

	public void test1Answer() {

		String target = "character";
		int start = string.indexOf(target);
		int end = target.length() + start;

		String upper = string.substring(start, end).toUpperCase();
		String answer = string.replace(target, upper);

		System.out.println(answer);
	}

	public void test2Answer() {

		char[] ch = new char[string.length()];
		ch = string.toCharArray();

		for (int i = ch.length - 1; i >= 0; i--) {
			System.out.print(ch[i]);
		}
	}

	public void test2Answer2() {
		for (int i = string.length() - 1; i >= 0; i--) {
			System.out.print(string.charAt(i));
		}
	}
}
