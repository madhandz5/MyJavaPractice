package com.kh.override.view;

import com.kh.override.model.vo.Book;

public class OverrideTest {

	public void overrideTest() {

		Book book = new Book("������ ����", "������", 100);
		Book book2 = new Book("Ī���� ���� ���߰� �Ѵ�", "��", 300);

		// toString �޼���
		System.out.println(book.toString());
		System.out.println(book2);

		// equals �޼���

		System.out.println(book.equals(book2));
		System.out.println(book.equals(book));

		//

	}

}
