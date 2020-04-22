package com.kh.view;

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
			System.out.println("2. �������� ���� �� ���");
			System.out.println("3. ���� ����");
			System.out.println("4. ���� �˻����");
			System.out.println("5. ��ü ���");
			System.out.println("6. ������");
			System.out.println("===================");
			System.out.println("�޴� ��ȣ ���� : ");
			int input = scanner.nextInt();
			scanner.nextLine();

			switch (input) {
			case 1:
				bm.addBook(inputBook());
				break;
			case 2:
				System.out.println("��� �����ұ��? ( �������� : 0, �������� : 1 )");
				int sortNum = scanner.nextInt();
				scanner.nextLine();
				bm.printBookList(bm.sortedBookList(sortNum));
				break;
			case 3:
				if (bm.deleteBook(inputBookNo()) == 0) {
					System.out.println("���������� ����");
				} else if (bm.deleteBook(inputBookNo()) == 1) {
					System.out.println("������ ���� �������� ����");
				}
				break;
			case 4:
				String keyword = inputBookTitle();
				int index = bm.searchBook(keyword);
				if (index == -1) {
					System.out.println("��ȸ�� ���� �������� ����");
				} else {
					System.out.println("������ȣ : " + index);
				}
				break;
			case 5:
				if (bm.selectAll().isEmpty()) {
					System.out.println("������ �����ϴ�.");
				} else {
					Iterator<Book> iterator = bm.selectAll().iterator();
					while (iterator.hasNext()) {
						System.out.println(iterator.next());
					}
				}
				break;
			case 6:
				break;
			}
		}
	}

	public Book inputBook() {
		Book book = new Book();
		System.out.println("���� ���� : ");
		String title = scanner.nextLine();
		System.out.println("���� �帣  (1 : �ι�, 2 : �ڿ�����, 3 : �Ƿ�, 4 : ��Ÿ) : ");
		int category = scanner.nextInt();
		scanner.nextLine();
		System.out.println("���� ���� : ");
		String author = scanner.nextLine();
		book = new Book(category, title, author);
		return book;
	}

	public int inputBookNo() {
		System.out.println("���� ��ȣ : ");
		int bNo = scanner.nextInt();
		scanner.nextLine();
		return bNo;
	}

	public String inputBookTitle() {
		System.out.println("���� ���� : ");
		String title = scanner.nextLine();
		return title;
	}

}
