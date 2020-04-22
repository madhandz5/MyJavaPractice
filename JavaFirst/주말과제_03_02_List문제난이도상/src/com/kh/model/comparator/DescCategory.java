package com.kh.model.comparator;

import java.util.Comparator;

import com.kh.model.vo.Book;

public class DescCategory implements Comparator<Book> {

	@Override
	public int compare(Book o1, Book o2) {
		return o2.getTitle().compareTo(o1.getTitle());
	}

}
