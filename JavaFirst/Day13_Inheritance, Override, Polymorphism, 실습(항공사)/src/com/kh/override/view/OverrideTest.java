package com.kh.override.view;

import com.kh.override.model.vo.Book;

public class OverrideTest {

	public void overrideTest() {

		Book book = new Book("수학의 정석", "나수학", 100);
		Book book2 = new Book("칭찬은 고래도 춤추게 한다", "고래", 300);

		// toString 메서드
		System.out.println(book.toString());
		System.out.println(book2);

		// equals 메서드

		System.out.println(book.equals(book2));
		System.out.println(book.equals(book));

		//

	}

}
