package com.kh.view;

import java.util.Iterator;
import java.util.Scanner;

import com.kh.controller.BookManager;
import com.kh.model.dao.BookDao;
import com.kh.model.vo.Book;

public class BookMenu {

	Scanner scanner = new Scanner(System.in);
	BookManager bm = new BookManager();

	public BookMenu() {

	}

	public void mainMenu() {

		while (true) {
			System.out.println("***���� ���� ���α׷�***");
			System.out.println("1. �� ���� �߰�");
			System.out.println("2. �������� ���� �� ���");
			System.out.println("3. ���� ����");
			System.out.println("4. ���� �˻� ���");
			System.out.println("5. ��ü ���");
			System.out.println("6. ������");
			System.out.println("=================");
			System.out.println("�޴� ��ȣ ���� : ");
			int input = scanner.nextInt();
			scanner.nextLine();

			switch (input) {
			// �ش� �޴� ��ȣ�� ���� BookManager Ŭ���� �޼ҵ� ����

			case 1:
				bm.addBook(inputBook());
				// addBook(inputBook()�� ������ ��ü) ����
				break;
			case 2:
				bm.printBookList(bm.sortedBookList());
				// sortedBookList() ���� -> Book[]���Ϲ޾� printBookList(Book[]) ����
				break;
			case 3:
				// deleteBook (inputBookNo()�� ������ ������ȣ ����)
				// -> Book ���Ϲ޾� null �� �ƴ� ��� "���������� ����" null �� ��� "������ ���� �������� ����"
				if (bm.deleteBook(inputBookNo()).getTitle() == null) {
					System.out.println("������ ���� �������� ����");
				} else {
					System.out.println("���������� ����");
				}
				break;
			case 4:
				// searchBook (inputBookTitle()�� ������ ���� ����) ����
				// => key ���� �޾� null�� ��� ����ȸ�� ���� �������� ������
				// null�� �ƴ� ��� selectBook(key) ���
				String title = inputBookTitle();
				String keyword = bm.searchBook(title);
				if (bm.selectBook(keyword).getTitle() == null) {
					System.out.println("��ȸ�� ���� �������� ����");
				} else {
					System.out.println(bm.selectBook(keyword));
				}
				break;
			case 5:
				// selectAll() ���� => ��� map ���� �޾� ������� ��� �������ϴ�.�� �ƴ� ��� Iterator, keySet()�� �̿��Ͽ�
				// ��ü ���
				if (bm.selectAll().isEmpty()) {
					System.out.println("�����ϴ�.");
				} else {
					Iterator iterator = bm.selectAll().keySet().iterator();
					while (iterator.hasNext()) {
						String key = (String) iterator.next();
						System.out.println(bm.selectAll().get(key));
					}
				}
				break;
			case 6:
				System.out.println("����");
				break;
			}
		}

	}

	public Book inputBook() {

		// "���� ���� : " >> �Է� ����
		// "���� �帣 (1:�ι� / 2:�ڿ����� / 3:�Ƿ� / 4:��Ÿ) : " >> �Է� ����
		// (���ڷ�)
		// "���� ���� : " >> �Է� ����
		// �Ű����� �����ڸ� �̿��Ͽ� ���� �ʱⰪ�� �̿��� Book��ü ����
		System.out.println("���� ���� : ");
		String title = scanner.nextLine();
		System.out.println("���� �帣 (1:�ι� / 2:�ڿ����� / 3:�Ƿ� / 4:��Ÿ) :");
		int category = scanner.nextInt();
		scanner.nextLine();
		System.out.println("���� ���� : ");
		String author = scanner.nextLine();
		Book inputBook = new Book(category, title, author);
		return inputBook;
	}

	public String inputBookNo() {
		// ������ ��ȣ : �� >> �Է� ���� >> ����
		System.out.println("���� ��ȣ : ");
		String bNo = scanner.nextLine();
		return bNo;
	}

	public String inputBookTitle() {
		// ������ ���� : �� >> �Է� ���� >> ����
		System.out.println("���� ���� : ");
		String title = scanner.nextLine();
		return title;
	}

}
