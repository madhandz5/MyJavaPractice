package com.kh.socket.prac01.run;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

import com.kh.socket.prac01.model.Book;

public class BookdatMaker {

	public static void main(String[] args) {
		Book book = new Book("�ظ�����", 50000);

		// �� Book �����͸� ������ books.dat ������ �ش� ������Ʈ ��� �Ʒ��� ����� �ּ���.
		// �� ��Ʈ���� �ڵ� ���� �ǰԲ� ó���� �ּ���.(try with resource �� Ȱ��)

		// try {
		// FileWriter wr = new FileWriter("books.dat");
		// String data = book.toString();
		// wr.write(data.toCharArray());
		// wr.flush();
		//
		// } catch (IOException e) {
		// e.printStackTrace();
		// }
		try (ObjectOutputStream os = new ObjectOutputStream(new FileOutputStream("books.dat"));) {
			os.writeObject(book);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
