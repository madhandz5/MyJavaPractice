package com.kh.model.comparator;

import java.util.Comparator;

import com.kh.model.vo.Book;

public class AscCategory implements Comparator<Book> {
	{

	}

	@Override
	public int compare(Book o1, Book o2) {
		// TODO Auto-generated method stub
		return o1.getTitle().compareToIgnoreCase(o2.getTitle());
	}

}
