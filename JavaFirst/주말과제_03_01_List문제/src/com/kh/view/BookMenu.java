package com.kh.view;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

import com.kh.controller.BookManager;
import com.kh.model.vo.Book;

public class BookMenu {

	Scanner scanner = new Scanner(System.in);
	BookManager bm = new BookManager();

	public BookMenu() {

	}

	public void mainMenu() {

		while (true) {
			System.out.println("*** ���� ���� ���α׷� ***");
			System.out.println("1. �� ���� �߰�");
			System.out.println("2. ���� ����");
			System.out.println("3. ���� �˻� ���");
			System.out.println("4. ��ü ���");
			System.out.println("0. ������");
			System.out.println("===================");
			System.out.println("�޴� ��ȣ ���� : ");
			int input = scanner.nextInt();
			scanner.nextLine();

			switch (input) {
			case 1:
				insertBook();
				break;
			case 2:
				deleteBook();
				break;
			case 3:
				searchBook();
				break;
			case 4:
				selectList();
				break;
			case 0:
				System.out.println("���α׷� ����");
				break;
			}
		}
	}

	public void insertBook() {

		System.out.println("���� ���� : ");
		String title = scanner.nextLine();
		System.out.println("���� �帣 (1 : �ι� / 2 : �ڿ����� / 3 : �Ƿ� / 4 : ��Ÿ");
		int category = scanner.nextInt();
		scanner.nextLine();
		System.out.println("���� ���� : ");
		String author = scanner.nextLine();
		// ������ �Է� ���� title, category, author�� �Ű������� �� Book ��ü ���� (book)
		// BookManager�� insertBook �޼ҵ�� book ����
		Book book = new Book(category, title, author);
		bm.insertBook(book);

	}

	public void deleteBook() {
		// ������ ��ȣ : >> �Է� ���� (bNo)
		System.out.println("���� ��ȣ : ");
		int bNo = scanner.nextInt();
		scanner.nextLine();
		// BookManager�� deleteBook �޼ҵ�� bNo ���� //���� �� ���� ���� (result)
		int result = bm.deleteBook(bNo);
		// result�� 1�� ��� >> ������������ ������ ��� // result�� 0�� ��� >> �������� ���� �������� �ʽ��ϴ�.�����
		if (result == 1) {
			System.out.println("���������� ����");
		} else if (result == 0) {
			System.out.println("������ ���� �������� �ʽ��ϴ�.");
		}
	}

	public void searchBook() {
		// ������ ���� : >> �Է� ���� (title)
		System.out.println("���� ���� : ");
		String title = scanner.nextLine();
		// BookManager�� searchBook �޼ҵ�� title ���� // ���� �� ���� ���� (searchList)
		ArrayList<Book> searchList = new ArrayList<Book>(bm.searchBook(title));
		// searchList�� ��� ���� ��� >> �˻� ����� �������� �ʽ��ϴ�.���
		// searchList�� ������� ���� ��� >> for���� �̿��Ͽ� searchList ��� �Ǵ� Iterator �̿��Ͽ� ���
		if (searchList.isEmpty()) {
			System.out.println("�˻� ����� �������� �ʽ��ϴ�.");
		} else {
			Iterator<Book> iterator = searchList.iterator();
			while (iterator.hasNext()) {
				System.out.println(iterator.next());
			}
		}
	}

	public void selectList() {
		for (Book bookList : bm.selectList()) {
			System.out.println(bookList);
		}
	}
}
