package com.kh.model.vo;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

import com.kh.compareator.AscTitle;
import com.kh.compareator.DescArtist;
import com.kh.compareator.DescTitle;
import com.kh.controller.MusicController;

public class MusicView {

	Scanner scanner = new Scanner(System.in);
	MusicController mc = new MusicController();

	public MusicView() {

	}

	// 메인메뉴
	public void mainMenu() {

		// ******* 메인메뉴 *******
		// 1. 곡 추가 addList()
		// 2. 곡 전체 조회 selectList()
		// 3. 정렬하여 조회 sortMenu()
		// 4. 특정 곡 검색 searchMusic()
		// 5. 특정 곡 삭제 removeMusic()
		// 6. 특정 곡 수정 updateMusic()
		// 0. 종료 "프로그램 종료" 출력 후 main으로 리턴
		// 메인 화면 반복 실행 처리
		while (true) {
			System.out.println("****** 메인메뉴 ******");
			System.out.println("1. 곡 추가");
			System.out.println("2. 곡 전체 조회");
			System.out.println("3. 정렬하여 조회");
			System.out.println("4. 특정 곡 검색");
			System.out.println("5. 특정 곡 삭제");
			System.out.println("6. 특정 곡 수정");
			System.out.println("0. 종료");
			System.out.println("===================");
			System.out.println("원하는 메뉴를 선택하세요 : ");
			int input = scanner.nextInt();
			scanner.nextLine();

			switch (input) {
			case 1:
				addList();
				break;
			case 2:
				selectList();
				break;
			case 3:
				sortMenu();
				break;
			case 4:
				searchMusic();
				break;
			case 5:
				removeMusic();
				break;
			case 6:
				updateMusic();
				break;
			case 0:
				System.out.println("프로그램 종료");
				break;
			}
		}

	}

	// 정렬용 서브메뉴
	public void sortMenu() {

		// 정렬용 메뉴
		// 1. 가수명 별 오름차순 정렬
		// 2. 곡명 별 오름차순 정렬
		// 3. 가수명 별 내림차순 정렬
		// 4. 곡명 별 오름차순 정렬
		// 메뉴 번호 선택 menu 변수를 통해 입력받음.
		// ascDesc(menu) 메소드 실행

		System.out.println("1. 가수명 별 오름차순 정렬");
		System.out.println("2. 곡명 별 오름차순 정렬");
		System.out.println("3. 가수명 별 내림차순 정렬");
		System.out.println("4. 곡명 별 내림차순 정렬");
		System.out.println("================");
		System.out.println("원하는 메뉴를 선택하세요 : ");
		int menu = scanner.nextInt();
		scanner.nextLine();

		switch (menu) {
		case 1:
			ascDesc(1);
			break;
		case 2:
			ascDesc(2);
			break;
		case 3:
			ascDesc(3);
			break;
		case 4:
			ascDesc(4);
			break;
		}
	}

	// 곡 추가
	public void addList() {

		// 가수를 입력하세요 : artist 입력받음
		// 곡명을 입력해주세요 : title 입력받음
		// 입력받은 aritist와 title을 통해 Music 객체 생성 (music)
		// MusicController의 addList 메소드로 music 값 전달

		System.out.println("가수를 입력하세요 : ");
		String inputArtist = scanner.nextLine();
		System.out.println("곡명을 입력해 주세요 : ");
		String inputTitle = scanner.nextLine();

		Music music = new Music(inputArtist, inputTitle);
		mc.addList(music);
	}

	// 전체 조회
	public void selectList() {

		// MusicController의 selectList() 메소드 호출하여 ArrayList<Music> 전달받음
		// 전달 받은 list가 비어있지 않을 경우 조건식에 list의 isEmpty() 사용
		// for문을 이용하여 list 전체 출력 -> 출력문에 list의 get(index) 사용
		// 비어있을 경우 “목록이 존재하지 않습니다.” 출력

		if (mc.selectList().isEmpty()) {
			System.out.println("목록이 존재하지 않습니다.");
		} else {
			for (int i = 0; i < mc.selectList().size(); i++) {
				System.out.println(mc.selectList().get(i));
			}
		}
	}

	// 정렬 조회
	public void ascDesc(int num) {

		// 조건문을 통해 전달받은 num 값이
		// 1일 경우 Collections.sort(sortList);
		// 2일 경우 Collections.sort(sortList, new AscTitle());
		// 3일 경우 Collections.sort(sortList, new DescArtist());
		// 4일 경우 Collections.sort(sortList, new DescTitle());
		// for문을 통해 sortList 출력
		ArrayList<Music> sortList = new ArrayList<Music>();

		sortList.addAll(mc.selectList());

		switch (num) {
		case 1:
			Collections.sort(sortList);
			break;
		case 2:
			Collections.sort(sortList, new AscTitle());
			break;
		case 3:
			Collections.sort(sortList, new DescArtist());
			break;
		case 4:
			Collections.sort(sortList, new DescTitle());
			break;
		}
		for (Music music : sortList) {
			System.out.println(music);
		}
	}

	// 곡 검색
	public void searchMusic() {
		// 검색할 곡의 제목을 입력하시오 : >> 입력 받음(title)
		// MusicController의 searchMusic 메소드로 전달
		// 검색 결과 값 전달 받음 (Music객체)
		// 전달 받은 값이 없으면 >> “검색한 곡이 없습니다.” 출력
		// 반환 값이 있으면 >> 전달받은 곡 출력

		System.out.println("검색할 곡의 제목을 입력하시오 : ");
		String searchTitle = scanner.nextLine();
		if (mc.searchMusic(searchTitle) != null) {
			System.out.println(mc.searchMusic(searchTitle));
		} else {
			System.out.println("검색한 곡이 없습니다.");
		}

	}

	// 곡 삭제
	public void removeMusic() {

		// 삭제할 곡의 제목을 입력하시오 : >> 입력 받음(title)
		// MusicController의 removeMusic 메소드로 전달 검색 결과 값 전달 받음(result)
		// result가 0보다 크면 >> “성공적으로 삭제하였습니다.” 출력
		// 아닐경우 >> “삭제할 곡을 찾지 못했습니다.” 출력

		System.out.println("삭제할 곡의 제목을 입력하시오 : ");
		String removeTitle = scanner.nextLine();
		if (mc.removeMusic(removeTitle) > 0) {
			System.out.println("성공적으로 삭제 하였습니다.");
		} else {
			System.out.println("삭제할 곡을 찾지 못했습니다.");
		}

	}

	// 곡 수정
	public void updateMusic() {

		// 수정할 곡의 제목을 입력하시오 : >> 입력 받음(title)
		// 수정할 가수명 : >> 입력 받음(updateArtist)
		// 수정할 제목명 : >> 입력 받음(updateTitle)
		// updateArtist, updateTitle을 가지고 Music객체 생성(updateMusic)

		// MusicController의 updateMusic 메소드로 title, updateMusic 전달
		// 검색 결과 값 전달 받음(result)
		// result가 0보다 크면 >> “성공적으로 수정되었습니다.” 출력
		// 아니면 >> “수정할 곡을 찾지 못했습니다.” 출력

		System.out.println("수정할 곡의 제목을 입력하시오 : ");
		String title = scanner.nextLine();
		System.out.println("수정할 가수명을 입력하시오 : ");
		String updateArtist = scanner.nextLine();
		System.out.println("수정할 제목명을 입력하시오 : ");
		String updateTitle = scanner.nextLine();

		if (mc.updateMusic(title, new Music(updateArtist, updateTitle)) > 0) {
			System.out.println("성공적으로 수정되었습니다.");
		} else {
			System.out.println("수정할 곡을 찾지 못했습니다.");
		}

	}
}
