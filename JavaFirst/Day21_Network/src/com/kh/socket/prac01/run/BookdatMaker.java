package com.kh.socket.prac01.run;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

import com.kh.socket.prac01.model.Book;

public class BookdatMaker {

	public static void main(String[] args) {
		Book book = new Book("해리포터", 50000);

		// 이 Book 데이터를 저장한 books.dat 파일을 해당 프로젝트 경로 아래에 만들어 주세요.
		// 단 스트림은 자동 종료 되게끔 처리해 주세요.(try with resource 문 활용)

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
