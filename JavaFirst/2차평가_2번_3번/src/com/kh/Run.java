package com.kh;

import com.kh.controller.BookManager;

public class Run {

	public static void main(String[] args) {

		new BookManager().fileSave();

		new BookManager().fileOpen();

	}

}
