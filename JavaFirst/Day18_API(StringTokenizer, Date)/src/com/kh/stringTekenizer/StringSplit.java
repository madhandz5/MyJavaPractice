package com.kh.stringTekenizer;

import java.util.StringTokenizer;

public class StringSplit {

	public void split() {
		// StringTokenizer st = new StringTokenizer("this is a test", "t", true);
		// while (st.hasMoreTokens()) {
		// System.out.println(st.nextToken());
		// }

		String test = "boo:and?foo:doo";

		StringTokenizer st2 = new StringTokenizer(test, ":?");
		while (st2.hasMoreTokens()) {
			System.out.println(st2.nextToken());
		}

		System.out.println("°ËStringTokenizer===°Èsplit");

		String[] test2 = test.split("[:?]");
		for (int i = 0; i < test2.length; i++) {
			System.out.println(test2[i]);
		}

		//
		// String[] result = "this is a test".split("\\s");
		// for (int x = 0; x < result.length; x++)
		// System.out.println(result[x]);

	}

}
