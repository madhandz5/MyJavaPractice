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
		System.out.println(".replace : " + replaceTest2(string, "string", "��Ʈ��"));
		System.out.println(".toCharArray : " + Arrays.toString(toCharArrayTest(string)));
		System.out.println(".trim : " + trimTest(string));

	}

	// 1.str�� ����
	// java.lang.String.length();

	private int lengthTest(String st) {

		int res = st.length();

		return res;
	}

	// * 2. str�� ��� �빮�ڷ� �ٲ㺸��
	// * - java.lang.String.toUpperCase()

	private String toUpperCaseTest(String st) {
		String res = st.toUpperCase();
		return res;
	}

	// * 3. str�� ��� �ҹ��ڷ� �ٲ㺸��
	// * - java.lang.String.toLowerCase()
	private String toLowerCaseTest(String st) {
		String res = st.toLowerCase();
		return res;
	}

	// * 4. str���� ù��° c�� �ε��� ��ġ.
	// * - java.lang.String.indexOf()
	private int indexOfTest(String st, char word) {
		int res = st.lastIndexOf(word);
		return res;

	}

	// * 5. str���� "Class" �� "java"�� �ٲ㼭 ���
	// * - java.lang.String.replace()

	private String replaceTest(String st, String origin, String toWhat) {

		String res = st.replace(origin, toWhat);
		return res;

	}

	// * 6. str���� "string"�� "��Ʈ��"���� �ٲ㼭 ���
	// * - java.lang.String.replace()

	private String replaceTest2(String st, String origin, String toWhat) {
		String res = st.replace(origin, toWhat);
		return res;

	}

	// * 7. str�� char[] ���·� ���
	// * -java.lang.String.toCharArray()

	private char[] toCharArrayTest(String st) {

		char[] res = st.toCharArray();
		return res;

	}

	// * 8. str�� �� �� ������ ������ �� ���
	// * -java.lang.String.trim()

	private String trimTest(String st) {
		String res = st.trim();
		return res;
	}

	// * 9. test1 : character�� ã�Ƽ� �빮�ڷ� ��ȯ�� �� ��ü ���
	// * -java.lang.String.subString()
	public void test1() {

		String res = string.substring(indexOfTest(string, 'h') - 1, indexOfTest(string, 'h') + 8);

		System.out.println(string.replace(res, res.toUpperCase()));

	}

	// * 10. ���ڿ� str�� ��ü �������� ����ϱ�.

	public void test2() {

		char[] res = string.toCharArray();
		char[] res2 = new char[res.length];
		int j = 0;
		for (int i = res.length - 1; i >= 0; i--) {
			res2[i] = res[j];
			j++;
		}
		System.out.println(Arrays.toString(res));
		System.out.println("-------------���� ����-------------");
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
