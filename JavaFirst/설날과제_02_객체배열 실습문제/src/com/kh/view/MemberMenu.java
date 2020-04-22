package com.kh.view;

import java.util.Scanner;

import com.kh.controller.MemberController;
import com.kh.model.vo.Member;

public class MemberMenu {

	MemberController mc = new MemberController();
	Scanner sc = new Scanner(System.in);

	public void mainMenu() {
		while (true) {
			System.out.println("====== 회원 관리 메뉴 ======");
			System.out.println("1. 신규 회원 등록");
			System.out.println("2. 회원 정보 검색");
			System.out.println("3. 회원 정보 수정");
			System.out.println("4. 회원 정보 삭제");
			System.out.println("5. 회원 정보 출력");
			System.out.println("6. 회원 정보 정렬");
			System.out.println("9. 프로그램 종료");
			System.out.println("========================");
			System.out.println("번호 입력 : ");
			int input = sc.nextInt();
			sc.nextLine();
			switch (input) {
			case 1:
				insertMember();
				break;
			case 2:
				searchMember();
				break;
			case 3:
				updateMember();
				break;
			case 4:
				deleteMember();
				break;
			case 5:
				printAllMember();
				break;
			case 6:
				sortMember();
				break;
			case 9:
				System.out.println("프로그램을 종료합니다.");
				System.exit(0);
				break;
			default:
				break;
			}
		}
	}

	public void insertMember() {
		if (mc.getMemberCount() == mc.SIZE) {
			System.out.println("최대 회원수에 도달하였습니다.");
			return;
		}
		System.out.println("아이디: ");
		String userId = sc.nextLine();
		if (mc.checkId(userId) != null) {
			System.out.println("동일한 아이디가 존재합니다. 회원등록 실패");
			return;
		}
		System.out.println("비밀번호 : ");
		String pw = sc.nextLine();
		System.out.println("이름 : ");
		String name = sc.nextLine();
		System.out.println("나이 : ");
		int age = sc.nextInt();
		sc.nextLine();
		System.out.println("성별 : ");
		char gender = sc.next().charAt(0);
		sc.nextLine();
		System.out.println("이메일 : ");
		String eMail = sc.nextLine();

		mc.insertMember(new Member(userId, pw, name, age, gender, eMail));
		System.out.println("성공적으로 회원등록이 완료되었습니다.");
	}

	public void searchMember() {
		Member searchMember = null;
		System.out.println("====== 회원 정보 검색 ======");
		System.out.println("1. 아이디로 검색하기");
		System.out.println("2. 이름으로 검색하기");
		System.out.println("3. 이메일로 검색하기");
		System.out.println("9. 이전 메뉴로");
		System.out.println("========================");
		System.out.println("메뉴 선택 : ");
		int menu = sc.nextInt();
		sc.nextLine();
		switch (menu) {
		case 1:
			System.out.println("아이디 검색 : ");
			String userId = sc.nextLine();
			searchMember = mc.searchMember(menu, userId);
			if (searchMember != null) {
				System.out.println(searchMember.information());
			} else {
				System.out.println("검색된 결과가 없습니다.");
				break;
			}
			break;
		case 2:
			System.out.println("이름 검색 : ");
			String name = sc.nextLine();
			searchMember = mc.searchMember(menu, name);
			if (searchMember != null) {
				System.out.println(searchMember.information());
			} else {
				System.out.println("검색된 결과가 없습니다.");
				break;
			}
			break;
		case 3:
			System.out.println("이메일 검색 : ");
			String eMail = sc.nextLine();
			searchMember = mc.searchMember(menu, eMail);
			if (searchMember != null) {
				System.out.println(searchMember.information());
			} else {
				System.out.println("검색된 결과가 없습니다.");
				break;
			}
			break;
		case 9:
			System.out.println("이전메뉴로 돌아갑니다.");
			mainMenu();
			return;
		default:
			break;
		}
	}

	public void updateMember() {
		System.out.println("====== 회원 정보 검색 ======");
		System.out.println("1. 비밀번호 수정");
		System.out.println("2. 이름 수정");
		System.out.println("3. 이메일 수정");
		System.out.println("9. 이전 메뉴로");
		System.out.println("========================");
		System.out.println("메뉴 선택 : ");
		int menu = sc.nextInt();
		sc.nextLine();
		System.out.println("변경할 아이디 : ");
		String userId = sc.nextLine();
		Member m = mc.checkId(userId);

		switch (menu) {
		case 1:
			if (m == null) {
				System.out.println("변경할 회원이 존재하지 않습니다.");
			} else {
				System.out.println("변경할 비밀번호 : ");
				String update = sc.nextLine();
				mc.updateMember(m, menu, update);
			}
			break;
		case 2:
			if (m == null) {
				System.out.println("변경할 회원이 존재하지 않습니다.");
			} else {
				System.out.println("변경할 이름 : ");
				String update = sc.nextLine();
				mc.updateMember(m, menu, update);
			}
			break;
		case 3:
			if (m == null) {
				System.out.println("변경할 회원이 존재하지 않습니다.");
			} else {
				System.out.println("변경할 이메일 : ");
				String update = sc.nextLine();
				mc.updateMember(m, menu, update);
			}
			break;
		case 9:
			System.out.println("이전메뉴로 돌아갑니다.");
			mainMenu();
			return;
		default:
			System.out.println("잘못 입력했습니다. 이전 메뉴로 돌아갑니다.");
			mainMenu();
			return;
		}

	}

	public void deleteMember() {
		System.out.println("삭제할 회원 아이디 : ");
		String userId = sc.nextLine();
		Member mem = mc.checkId(userId);
		if (mem == null) {
			System.out.println("삭제할 회원이 존재하지 않습니다.");
		} else {
			mem.information();
			System.out.println("정말 삭제하시겠습니까? (y/n) :");
			int select = sc.next().charAt(0);
			sc.nextLine();
			if (select == 'y' || select == 'Y') {
				mc.deleteMember(userId);
				System.out.println("회원 정보가 삭제되었습니다.");
			} else {
				System.out.println("메뉴로 돌아갑니다.");
				mainMenu();
				return;
			}

		}

	}

	public void printAllMember() {
		Member[] mem = mc.getMem();
		for (int i = 0; i < mem.length; i++) {
			if (mem[i] != null) {
				System.out.println(mem[i].information());
			} else {
				break;
			}
		}
	}

	public void sortMember() {
		Member[] sortMem = null;
		while (true) {
			System.out.println("====== 회원 정보 정렬 ======");
			System.out.println("1. 아이디 오름차순 정렬");
			System.out.println("2. 아이디 내림차순 정렬");
			System.out.println("3. 나이 오름차순 정렬");
			System.out.println("4. 나이 내림차순 정렬");
			System.out.println("5. 성별 내림차순 정렬(남여순)");
			System.out.println("9. 이전 메뉴로");
			System.out.println("========================");
			System.out.println("메뉴 선택 : ");
			int menu = sc.nextInt();
			sc.nextLine();

			switch (menu) {
			case 1:
				sortMem = mc.sortIdAsc();
				break;
			case 2:
				sortMem = mc.sortIdDesc();
				break;
			case 3:
				sortMem = mc.sortAgeAsc();
				break;
			case 4:
				sortMem = mc.sortAgeDesc();
				break;
			case 5:
				sortMem = mc.sortGenderDesc();
				break;
			case 9:
				System.out.println("이전메뉴로 돌아갑니다.");
				mainMenu();
				return;
			default:
				System.out.println("잘못 입력하였습니다. 다시 입력해 주세요.");
				break;
			}
			for (int i = 0; i < mc.getMemberCount(); i++) {
				if (sortMem != null) {
					System.out.println(sortMem[i].information());
				}
			}
		}
	}
}
