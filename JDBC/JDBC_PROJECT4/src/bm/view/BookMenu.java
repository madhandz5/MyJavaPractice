package bm.view;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

import bm.controller.BookController;
import bm.controller.RentBookController;
import bm.model.vo.Book;
import bm.model.vo.Member;

public class BookMenu {
	Map<String, Object> resultMap = new HashMap<String, Object>();
	Scanner sc = new Scanner(System.in);

	BookController bController = new BookController();
	RentBookController rbController = new RentBookController();

	public void bookMenu(Member m) {
		Map<String, Object> resultMap = new HashMap<>();
		Map<Integer, Book> bookMap = new LinkedHashMap<Integer, Book>();

		do {
			System.out.println("***도서검색***");
			System.out.println("1. 도서명 검색");
			System.out.println("2. 작가 검색");
			System.out.println("3. 이전메뉴로");
			System.out.print("번호 : ");
			int no = sc.nextInt();
			sc.nextLine();
			switch (no) {
			case 1:
				// 도서명 검색
				resultMap = null;
				System.out.print("검색할 도서명을 입력하세요 : ");
				String bookTitle = sc.nextLine();
				resultMap = bController.searchBookByTitle(bookTitle);
				bookMap = (Map) resultMap.get("res");
				if (!bookMap.isEmpty()) {
					for (Integer key : bookMap.keySet()) {
						System.out.println(bookMap.get(key));
					}
				} else {
					System.out.println("검색 결과가 없습니다.");
				}

				break;
			case 2:
				// 작가 검색
				resultMap = null;
				System.out.print("검색할 작가명을 입력하세요 : ");
				String author = sc.nextLine();
				resultMap = bController.searchBookByAuthor(author);
				bookMap = (Map) resultMap.get("res");
				if (!bookMap.isEmpty()) {
					for (Integer key : bookMap.keySet()) {
						System.out.println(bookMap.get(key));
					}
				} else {
					System.out.println("검색 결과가 없습니다.");
				}
				break;
			case 3:
				// 이전 메뉴로
				return;
			default:
				System.out.println("번호를 정확히 입력해주세요.");
			}

			if (!bookMap.isEmpty()) {
				System.out.println("대출할 도서가 있으신가요? [Y/N]");
				if (sc.next().toUpperCase().equals("Y")) {
					sc.nextLine();
					System.out.println("대출할 도서번호를 입력해주세요 [여러 권일 경우 ,로 구분]: ");
					String rbNo = sc.nextLine();
					String[] rbNos = rbNo.split(",");
					for (int i = 0; i < rbNos.length; i++) {
						if (bookMap.containsKey(Integer.parseInt(rbNos[i]))) {
							insertRentInfo(rbNos[i]);
						} else {
							System.out.println(rbNos[i] + "는 없는 도서번호 입니다.");
						}
					}
				} else {
					return;
				}
			}
		} while (true);
	}

	public void insertRentInfo(String b_bno) {
		Map<String, Object> resultMap = new HashMap<>();
		resultMap = rbController.insertRentInfo(b_bno);
		System.out.println(resultMap.get("res"));
	}
}
