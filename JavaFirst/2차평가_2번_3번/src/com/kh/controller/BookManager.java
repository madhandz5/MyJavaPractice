package com.kh.controller;

import java.io.EOFException;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.List;

import com.kh.model.vo.Book;

public class BookManager {

	public void fileSave() {
		List<Book> bookList = new ArrayList<Book>();
		bookList.add(new Book("자바를 잡아라", 30000));
		bookList.add(new Book("오라클 정복", 35000));
		bookList.add(new Book("웹표준 2.0", 27500));
		bookList.add(new Book("자바 Servlet/JSP", 28000));
		bookList.add(new Book("ajax 사용법", 15000));

		// => 저장된 bookList 정보 출력 확인한다.

		for (Book book : bookList) {
			System.out.println(book);
		}
		// => 객체를 books.dat 파일에 저장 출력하기 위한 기본 스트림과 보조 스트림 객체를 생성한다.
		// => bookList 에 저장된 Book 객체들을 books.dat 파일에 기록 저장 처리한다.
		try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("books.dat"));) {
			oos.writeObject(bookList);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	public void fileOpen() {
		List<Book> bookList = new ArrayList<Book>();
		// => books.dat 파일로 부터 객체를 읽어들일 수 있는 기본스트림과 보조스트림 생성한다.
		try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream("books.dat"));) {

			try {
				// => 읽어들인 객체들을 ArrayList bookList에 저장한다.
				bookList = (List<Book>) ois.readObject();
				for (int i = 0; i < bookList.size(); i++) {
					// => bookList 에 저장된 Book 객체들을 콘솔에 확인을 위해 출력 처리한다.
					System.out.println(bookList.get(i));
				}
			} catch (ClassNotFoundException e) {
				e.printStackTrace();
			}

		} catch (EOFException e) {
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}

	}

}
