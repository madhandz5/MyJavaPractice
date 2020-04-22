package com.kh.run;

import com.kh.controller.BookManager;

public class Run {

	public static void main(String[] args) {

		BookManager bm = new BookManager();
		bm.fileSave();
		bm.fileRead();
	}

}
