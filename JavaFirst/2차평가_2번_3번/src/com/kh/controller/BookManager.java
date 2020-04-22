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
		bookList.add(new Book("�ڹٸ� ��ƶ�", 30000));
		bookList.add(new Book("����Ŭ ����", 35000));
		bookList.add(new Book("��ǥ�� 2.0", 27500));
		bookList.add(new Book("�ڹ� Servlet/JSP", 28000));
		bookList.add(new Book("ajax ����", 15000));

		// => ����� bookList ���� ��� Ȯ���Ѵ�.

		for (Book book : bookList) {
			System.out.println(book);
		}
		// => ��ü�� books.dat ���Ͽ� ���� ����ϱ� ���� �⺻ ��Ʈ���� ���� ��Ʈ�� ��ü�� �����Ѵ�.
		// => bookList �� ����� Book ��ü���� books.dat ���Ͽ� ��� ���� ó���Ѵ�.
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
		// => books.dat ���Ϸ� ���� ��ü�� �о���� �� �ִ� �⺻��Ʈ���� ������Ʈ�� �����Ѵ�.
		try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream("books.dat"));) {

			try {
				// => �о���� ��ü���� ArrayList bookList�� �����Ѵ�.
				bookList = (List<Book>) ois.readObject();
				for (int i = 0; i < bookList.size(); i++) {
					// => bookList �� ����� Book ��ü���� �ֿܼ� Ȯ���� ���� ��� ó���Ѵ�.
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
