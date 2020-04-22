package com.kh.controller;

import java.util.ArrayList;

import com.kh.model.vo.Book;

public class BookManager {

	ArrayList<Book> bookList = new ArrayList<>();

	public void insertBook(Book book) {
		// ���� ���� book�� ���� ������ȣ�� null�� ä�� �����µ�
		// �켱 ���� ���� �� �ʱ�ȭ lastNo = bookList.get(bookList.size()-1).getbNo() + 1;
		// ������ ���� ��ȣ + 1
		// ���ο� ������ �߰��� ������ �߰��Ǵ� ������ ������ȣ�� ����Ʈ ������ ���� ��ȣ�� ������ȣ�� �ο��ؾߵ�
		// �ش� ���� �߻� �� lastNo = 1; �� �ʱ�ȭ
		// setter�� �̿��Ͽ� book ���� ��ȣ�� lastNo�� ����
		// bookList�� book �߰�
		int lastNo = 0;
		try {
			lastNo = bookList.get(bookList.size() - 1).getbNo() + 1;
			book.setbNo(lastNo);
			bookList.add(book);
		} catch (ArrayIndexOutOfBoundsException e) {
			lastNo = 1;
			book.setbNo(lastNo);
			bookList.add(book);
		}
	}

	public int deleteBook(int bNo) {
		// for���� �̿��Ͽ� ���޹��� ������ȣ�� �����ϴ� ���� ����
		// ���������� ���� �� ��� 1 ����
		// ���� ���� ���� ��� ��, �����ϴ� ���� ��ȣ�� ���� ��� 0 ����
		int result = 0;
		for (int i = 0; i < bookList.size(); i++) {
			if (bookList.get(i).getbNo() == bNo) {
				bookList.remove(i);
				result = 1;
			} else {
				result = 0;
			}
		}
		return result;
	}

	public ArrayList<Book> searchBook(String title) {
		// �˻� ��������� ������ ����Ʈ
		ArrayList<Book> searchList = new ArrayList<Book>();
		// for���� �̿��Ͽ� ���޹��� ������ ������ ������ searchList�� �߰�
		for (int i = 0; i < bookList.size(); i++) {
			if (bookList.get(i).getTitle().contains(title)) {
				searchList.add(bookList.get(i));
			}
		}
		// searchList ����
		return searchList;
	}

	public ArrayList<Book> selectList() {
		// bookList ����
		return bookList;
	}
}
