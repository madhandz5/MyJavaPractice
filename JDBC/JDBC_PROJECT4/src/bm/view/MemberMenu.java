package bm.view;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

import bm.controller.MemberController;
import bm.controller.RentBookController;
import bm.model.vo.Member;

public class MemberMenu {

	Scanner sc = new Scanner(System.in);
	MemberController mController = new MemberController();
	RentBookController rbController = new RentBookController();
	int no = 0;

	public void joinMenu() {

		Member member = new Member();
		Map<String, Object> resultMap = new HashMap<String, Object>();

		List<Member> memberList = new ArrayList<Member>();
		resultMap = mController.printAllMembers();
		memberList = (List<Member>) resultMap.get("res");
		boolean idOk = false;
		String mId = "";
		do {
			idOk = true;
			System.out.print("아이디 : ");
			mId = sc.nextLine();
			for (int i = 0; i < memberList.size(); i++) {
				if (memberList.get(i).getmId().equals(mId)) {
					System.out.println("===========================");
					System.out.println("이미 존재하는 아이디 입니다.");
					System.out.println("===========================");
					idOk = false;
				} else {
					member.setmId(mId);
				}
			}
		} while (!idOk);
		System.out.print("비밀번호 : ");
		member.setmPwd(sc.nextLine());
		System.out.print("전화번호 : ");
		member.setPhone(sc.nextLine());

		resultMap = mController.insertMember(member);
		if ((boolean) resultMap.get("isSuccess")) {
			System.out.println("*****************************");
			System.out.println("ID : " + member.getmId() + ", 비밀번호 : " + member.getmPwd());
			System.out.println(member.getmGrade());
			System.out.println(member.getRentAble_Date());
			System.out.println("회원가입을 축하드립니다.");
			System.out.println("*****************************");
		}

	}

	public Member loginMenu() {
		Map<String, Object> resultMap = new HashMap<String, Object>();
		boolean loginOK = false;
		String id = "";
		Member member = null;
		do {
			System.out.print("아이디 :");
			String userId = sc.nextLine();
			System.out.print("패스워드 : ");
			String userPwd = sc.nextLine();
			resultMap = mController.logIn(userId, userPwd);
			if ((boolean) resultMap.get("isSuccess")) {
				member = (Member) resultMap.get("res");
			}
			if (member != null) {
				loginOK = true;
				id = member.getmId();
				System.out.println("\n" + id + "님 환영합니다.\n");
			} else {
				System.out.println("아이디나 비밀번호가 틀렸습니다.");
				System.out.println();

			}
		} while (!loginOK);
		return member;
	}

	public void myPage(Member m) {

		do {
			System.out.println("*******MyPage********");
			System.out.println("1. 내 정보 확인하기");
			System.out.println("2. 회원정보변경");
			System.out.println("3. 대출내역확인");
			System.out.println("4. 도서 연장 / 반납");
			System.out.println("9. 회원 탈퇴");
			System.out.println("0. 이전 메뉴로 돌아가기");
			System.out.print("입력 : ");
			no = sc.nextInt();
			sc.nextLine();

			switch (no) {
			case 1:
				System.out.println((Member) mController.refreshInfo(m.getmId()).get("res"));
				break;
			case 2:
				updateInfo(m.getmId());
				break;
			case 3:
				myRentInfo(m.getmId());
				break;
			case 4:
				myRentInfo(m.getmId());
				break;
			case 9:
				deleteMember(m.getmId());
				break;
			case 0:
				return;
			default:
				break;
			}
		} while (true);
	}

	// 회원정보 수정
	public void updateInfo(String mId) {
		Map<String, Object> resultMap = new HashMap<>();
		System.out.println("***회원정보변경***");
		System.out.println("변경을 원하지 않는 항목은 X를 입력하세요.");
		System.out.println("비밀번호변경 : ");
		String newPwd = sc.nextLine();
		System.out.println("휴대폰번호 변경 : ");
		String newPhone = sc.nextLine();
		resultMap = mController.updateInfo(mId, newPwd, newPhone);
		System.out.println(resultMap.get("res"));
	}

	// 회원 전체 조회

	public void printAllMembers() {
		Map<String, Object> resultMap = new HashMap<>();
		List<Member> memberList = new ArrayList<Member>();
		resultMap = mController.printAllMembers();
		memberList = (List<Member>) resultMap.get("res");
		for (Member member : memberList) {
			System.out.println(member);
		}
	}

	// 회원 탈퇴
	public void deleteMember(String mId) {
		Map<String, Object> resultMap = new HashMap<>();

		System.out.println("정말로 탈퇴 하시겠습니까? (Y/N) ");
		if (sc.next().toUpperCase().equals("Y")) {
			resultMap = mController.deleteMember(mId);
			System.out.println(resultMap.get("res"));
			new FrontMenu().frontMenu();
		}
	}

	// 대출 내역 조회
	public void myRentInfo(String mId) {
		Map<String, Object> resultMap = new HashMap<>();
		resultMap = mController.myRentInfo(mId);
		for (String key : resultMap.keySet()) {
			resultMap.get(key);
		}
		if (!((Map) resultMap.get("res")).isEmpty()) {
			System.out.println("=======================================================");
			System.out.println(resultMap.get("res"));
			System.out.println("=======================================================");
			while (true) {
				System.out.println();
				System.out.println("상세보기 [대출번호 or 0(종료) 입력]: ");
				int rmIdx = sc.nextInt();
				sc.nextLine();
				if (rmIdx != 0) {
					if (((Map) resultMap.get("res")).containsValue(rmIdx)) {
						myRentInfoDetail(rmIdx);
					} else {
						System.out.println("*****번호를 잘못 입력했습니다.*****");
					}
				} else {
					return;
				}
			}
		} else {
			System.out.println("대출중인 내역이 없습니다.");
		}
	}

	// 대출내역 전체 상세조회
	public void myRentInfoDetail(int rmIdx) {

		Map<String, Object> resultMap = new HashMap<>();
		resultMap = mController.rentInfoDetail(rmIdx);
		Map<Integer, Object> rentResultMap = (Map<Integer, Object>) resultMap.get("res");
		int rbIdx = 0;
		System.out.println("********상세정보********");
		for (Integer kSet : rentResultMap.keySet()) {
			System.out.println(rentResultMap.get(kSet));
		}
		if (no == 4) {
			System.out.println("1. 도서 반납");
			System.out.println("2. 도서 연장");
			System.out.println("0. 이전 메뉴");
			System.out.print("번호를 선택하세요 : ");

			int input = sc.nextInt();
			sc.nextLine();

			switch (input) {
			case 1:
				System.out.print("반납할 도서의 대출코드를 입력하세요. : ");
				rbIdx = sc.nextInt();
				sc.nextLine();
				if (rentResultMap.containsKey(rbIdx)) {
					resultMap = rbController.updateReturnRentBook(rbIdx);
					System.out.println(resultMap.get("res"));
				} else {
					System.out.println("**********************");
					System.out.println("대출도서코드를 확인하세요.");
					System.out.println("**********************");
				}
				break;
			case 2:
				System.out.print("연장할 도서의 대출도서코드를 입력하세요 : ");
				rbIdx = sc.nextInt();
				sc.nextLine();
				if (rentResultMap.containsKey(rbIdx)) {
					resultMap = rbController.updateExtendRentBook(rbIdx);
					System.out.println(resultMap.get("res"));
				} else {
					System.out.println("**********************");
					System.out.println("대출도서코드를 확인하세요.");
					System.out.println("**********************");
				}
				return;
			case 0:
				return;
			default:
				System.out.println("잘못입력했습니다. 다시 입력해주세요.");
				break;
			}
		}
	}
}