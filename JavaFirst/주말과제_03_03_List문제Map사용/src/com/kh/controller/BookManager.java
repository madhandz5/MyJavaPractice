package com.kh.controller;

import java.util.HashMap;
import java.util.Scanner;

import com.kh.model.dao.BookDao;
import com.kh.model.vo.Book;

public class BookManager {

	Scanner scanner = new Scanner(System.in);
	BookDao bd = new BookDao();

	public BookManager() {

	}

	public void addBook(Book book) {
		// BookDao�� getLastBookNo() �޼ҵ带 ���� ������ ������ ���� ��ȣ�� �˾ƿ�
		// ù ���� ��� 0���� �޾ƿ��Բ�
		// BookDao�� getLastBookNo() ���� ���� �� ��!
		// setter�� �̿��Ͽ� ���� ��ȣ�� ������ ���� ��ȣ +1 ó��
		// BookDao�� addBook()�޼ҵ忡 �ش� Book ��ü ����
		String lastNoStr = Integer.toString(bd.getLastBookNo() + 1);
		bd.addBook(book);
		book.setbNo(lastNoStr);

	}

	public Book deleteBook(String key) {
		// BookDao�� deleteBook() �޼ҵ忡 ���޹��� ���� ��ȣ ����
		// �� ��� ���� �޾� ����
		Book deleteBook = bd.deleteBook(key);
		return deleteBook;
	}

	public String searchBook(String title) {
		// BookDao�� searchBook() �޼ҵ忡 ���޹��� ���� ���� ����
		// �� ��� ��(map�� key��)�� �޾� ����
		String searchBook = bd.searchBook(title);
		return searchBook;
	}

	public Book selectBook(String key) {
		// BookDao�� selectBook() �޼ҵ忡 ���޹��� key�� ����
		// �� ��� ��(�ش� Book��ü)�� �޾� ����
		Book selectBook = bd.selectBook(key);
		return selectBook;
	}

	public HashMap<String, Book> selectAll() {
		// BookDao�� selectAll() �޼ҵ带 ���� ���� ��ü�� ���� �޾� ����
		HashMap<String, Book> bookMap = bd.selectAll();
		return bookMap;
	}

	public Book[] sortedBookList() {
		// BookDao�� sortedBookList() �޼ҵ带 ���� ���ĵ� ���� ����Ʈ�� ���� �޾�
		// for���� �̿��Ͽ� Book[] �迭��
		// �ش� �迭 �ּ� �� ����
		Book[] sortedBookList = new Book[bd.sortedBookList().size()];
		for (int i = 0; i < bd.sortedBookList().size(); i++) {
			sortedBookList[i] = bd.sortedBookList().get(i);
		}
		return sortedBookList;
	}

	public void printBookList(Book[] br) {
		// for each���� �̿��Ͽ� ���޹��� Book[] �迭 ��ü ���
		for (Book book : br) {
			System.out.println(book);
		}
	}

}
