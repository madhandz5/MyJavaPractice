package com.kh.library.controller;

import com.kh.library.model.vo.AniBook;
import com.kh.library.model.vo.Book;
import com.kh.library.model.vo.CookBook;
import com.kh.library.model.vo.Member;

public class LibraryManager {

	private Member mem = null;
	private Book[] bList = new Book[6];
	private Book[] rentList = new Book[bList.length];
	private int rentCount = 0;

	{
		bList[0] = new CookBook("백종원의 집밥", "백종원", "tvN", true);
		bList[1] = new AniBook("한번 더 해요", "미티", "원모어", 19);
		bList[2] = new AniBook("루피의 원피스", "루피", "japan", 12);
		bList[3] = new CookBook("이혜정의 얼마나 맛있게요", "이혜정", "문학", false);
		bList[4] = new CookBook("최현석 날 따라해봐", "최현석", "소금책", true);
		bList[5] = new CookBook("백종원의 골목식당", "백종원", "SBS", false);
	}

	public LibraryManager() {
	}

	public void insertMember(Member mem) {
		this.mem = mem;
	}

	public Member myPage() {
		return mem;
	}

	public Book[] selectAll() {
		return bList;
	}

	public void rentList() {
		System.out.println("=====================대여 리스트=====================");
		for (int i = 0; i < rentList.length; i++) {
			if (rentList[i] != null) {
				System.out.println((i + 1) + "번째  - " + rentList[i].toString());
			} else {
				break;
			}
		}
		System.out.println("==================================================");
		System.out.println("                                    총 " + rentCount + " 권 대여중");
	}

	// 내코드

	// public Book[] searchBook(String keyword) {
	// int count = 0;
	// Book[] searchList = new Book[bList.length];
	// for (int i = 0; i < bList.length; i++)
	// if (bList[i].getTitle().contains(keyword)) {
	// if (bList[i] instanceof AniBook) {
	// searchList[count] = new AniBook(((AniBook) bList[i]).getTitle(), ((AniBook)
	// bList[i]).getAuthor(),
	// ((AniBook) bList[i]).getPublisher(), ((AniBook) bList[i]).getAccessAge());
	// } else if (bList[i] instanceof CookBook) {
	// searchList[count] = new CookBook(((CookBook) bList[i]).getTitle(),
	// ((CookBook) bList[i]).getAuthor(), ((CookBook) bList[i]).getPublisher(),
	// ((CookBook) bList[i]).isCoupon());
	// } else {
	// searchList[count] = new Book(bList[i].getTitle(), bList[i].getAuthor(),
	// bList[i].getPublisher());
	// }
	// count++;
	// }
	// System.out.println("\"" + keyword + "\" 단어로 검색 결과, 총 " + count + " 건이
	// 검색되었습니다.");
	// return searchList;
	// }

	// 강사 코드

	// public Book[] searchBook(String keyword) {
	//
	// int cnt = 0;
	// int idx = 0;
	// for (int i = 0; i < bList.length; i++) {
	// if (bList[i].getTitle().contains(keyword)) {
	// cnt++;
	// }
	// }
	// Book[] searchList = new Book[cnt];
	// for (int i = 0; i < bList.length; i++) {
	//
	// if (bList[i].getTitle().contains(keyword)) {
	// searchList[idx] = bList[i];
	// idx++;
	// }
	// }
	// return searchList;
	// }

	public Book[] searchBook(String keyword) {
		int idx = 0;
		Book[] searchList = new Book[5];
		for (int i = 0; i < bList.length; i++) {

			if (bList[i].getTitle().contains(keyword)) {
				searchList[idx] = bList[i];
				idx++;
			}
		}
		return searchList;
	}

	public int rentBook(int index) {
		int result = 0;
		if ((bList[index] instanceof AniBook) && ((AniBook) bList[index]).getAccessAge() > mem.getAge()) {
			result = 1;
		} else if ((bList[index] instanceof CookBook) && ((CookBook) bList[index]).isCoupon()) {
			mem.setCouponCount(mem.getCouponCount() + 1);
			rentList[rentCount] = new Book(bList[index].getTitle(), bList[index].getAuthor(),
					bList[index].getPublisher());
			rentCount++;
			result = 2;
		} else {
			rentList[rentCount] = new Book(bList[index].getTitle(), bList[index].getAuthor(),
					bList[index].getPublisher());
			rentCount++;
			result = 0;
		}
		return result;
	}
}
