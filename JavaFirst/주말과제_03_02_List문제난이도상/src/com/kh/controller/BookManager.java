package com.kh.controller;

import java.util.ArrayList;

import com.kh.model.dao.BookDao;
import com.kh.model.vo.Book;

public class BookManager {

	BookDao bDao = new BookDao();
	ArrayList<Book> bookList = new ArrayList<>();

	public void addBook(Book book) {
		// BookDao�� getLastBookNo() �޼ҵ带 ���� ������ ������ ���� ��ȣ�� �˾ƿ�
		// setter�� �̿��Ͽ� ���� ��ȣ�� ������ ���� ��ȣ +1 ó��
		// ���ʿ� ����Ʈ�� ������ ���� ���,
		// �� ù ���� ����� ��� ���� �߻� � ����ó���� �߻��ϴ��� �˾ƺ��� try-catch���� �̿��Ͽ� ���� �ذ�
		// BookDao�� addBook()�޼ҵ忡 �ش� Book ��ü ����
		int lastNum = bDao.getLastBookNo() + 1;
		book.setbNo(lastNum + 1);
		bDao.addBook(book);

	}

	public int deleteBook(int no) {
		// BookDao�� deleteBook() �޼ҵ忡 ���޹��� ���� ��ȣ ����
		// �� ��� ���� �޾� ����
		int res = bDao.deleteBook(no);
		return res;
	}

	public int searchBook(String title) {
		// BookDao�� searchBook() �޼ҵ忡 ���޹��� ���� ���� ����
		// �� ��� ��(����Ʈ�� �ε��� ��)�� �޾� ����
		int res = bDao.searchBook(title);
		return res;
	}

	public Book selectBook(int index) {
		// BookDao�� selectBook() �޼ҵ忡 ���޹��� �ε��� ����
		// �� ��� ��(�ش� Book��ü)�� �޾� ����
		Book book = bDao.selectBook(index);
		return book;
	}

	public ArrayList<Book> selectAll() {
		// BookDao�� selectAll() �޼ҵ带 ���� ���� ��ü ����Ʈ�� ���� �޾� ����
		ArrayList<Book> selectAll = bDao.selectAll();
		return selectAll;
	}

	public Book[] sortedBookList(int num) {
		// BookDao�� sortedBookList() �޼ҵ带 ���� ���ĵ� ���� ����Ʈ�� ���� �޾�
		// for���� �̿��Ͽ� Book[] �迭�� �߰�
		// �ش� �迭 �ּ� �� ����
		ArrayList<Book> bList = bDao.sortedBookList(num);
		Book[] books = new Book[bList.size()];
		for (int i = 0; i < bList.size(); i++) {
			books[i] = bList.get(i);
		}
		return books;
	}

	public void printBookList(Book[] br) {
		// for each���� �̿��Ͽ� ���޹��� Book[] �迭 ��ü ���
		for (Book book : br) {
			System.out.println(book);
		}
	}
}
