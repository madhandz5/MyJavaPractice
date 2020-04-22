package member.view;

import java.sql.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

import member.controller.MemberController;
import model.vo.Member;

// MVC 패턴에서 VIEW 에 해당한다.
// VIEW 는 사용자에게 데이터를 보내주는 형태, 혹은 모습을 의미한다.
// 사용자의 요청을 Controller에게 전달해주는 역할도 한다.
public class Menu {

	private Scanner sc = new Scanner(System.in);
	private MemberController mController = new MemberController();
	private Map<String, Object> loginMap = null;
	private boolean loginOK = false;

	public void startMenu() {

		do {
			System.out.println("로그인 하세요.");
			System.out.print("관리자 아이디 : ");
			String userId = sc.nextLine();
			System.out.print("패스워드 : ");
			String userPwd = sc.nextLine();

			loginMap = mController.selectLogin(userId, userPwd);
			if ((boolean) loginMap.get("isSuccess")) {
				loginOK = (boolean) loginMap.get("res");
			}

		} while (!loginOK);

		displayMenu();
		System.out.println("회원관리 프로그램을 종료합니다.");
		return;
	}

	public void displayMenu() {

		int no;
		do {

			System.out.println("***** 회원관리 프로그램 *****");
			System.out.println("1. 회원 전체 조회");
			System.out.println("2. 회원 아이디로 조회");
			System.out.println("3. 새 회원 등록");
			System.out.println("4. 회원 암호 수정");
			System.out.println("5. 회원 삭제");
			System.out.println("6. 회원 검색");
			System.out.println("7. 끝내기");
			System.out.println("========================");
			System.out.println("메뉴 선택 : ");
			no = sc.nextInt();
			sc.nextLine();

			switch (no) {
			case 1:
				selectAllMember();
				break;
			case 2:
				selectMember();
				break;
			case 3:
				insertMember();
				break;
			case 4:
				modifyPassword();
				break;
			case 5:
				deleteMember();
				break;
			case 6:
				searchMemeber();
				break;
			case 7:
				exit();
			default:
				System.out.println("잘못입력하셨습니다. 다시 입력하세요.");
				break;
			}

		} while (true);
	}

	public void selectAllMember() {
		// Controller에서 전체 회원을 조회하는 메서드를 호출하여
		// 반환받은 결과를 하단의 m에 넣어주세요.
		printList(mController.selectList());

	}

	public void selectMember() {
		System.out.println("조회할 회원 아이디 : ");
		String userId = sc.nextLine();
		// Controller에서 회원 조회하는 메서드 호출
		// 호출한 메서드의 결과를 하단의 m에 넣어준다.

		System.out.println("------- 회원정보 출력 확인 -------");
		System.out.println(mController.selectMember(userId).get("res"));
	}

	public void insertMember() {
		// Controller에서 회원을 추가하는 메서드를 호출하여 메서드의 결과를 하단 res에 넣어준다.
		Map<String, Object> resultMap = mController.insertMember(inputMember());
		System.out.println(resultMap.get("res"));
	}

	public void modifyPassword() {
		Member member = new Member();
		System.out.println("수정할 아이디 입력 : ");
		member.setUserId(sc.nextLine());
		System.out.println("변경될 암호 입력 : ");
		member.setUserPwd(sc.nextLine());
		System.out.println(mController.updateMember(member).get("res"));

	}

	public void deleteMember() {
		System.out.println("삭제할 회원 아이디 : ");
		// Controller에서 회원을 아이디로 삭제하는 메서드를 호출한 다음 결과값을 하단의 res에 담아주세요
		Map<String, Object> resultMap = mController.deleteMember(sc.nextLine());
		System.out.println(resultMap.get("res"));
	}

	public void searchMemeber() {
		searchMenu();
	}

	public void searchMenu() {

		int no;

		do {
			Map<String, Object> resultMap = null;
			System.out.println("****회원 검색 메뉴****");
			System.out.println("1. 이름으로 검색");
			System.out.println("2. 나이로 검색");
			System.out.println("3. 성별로 검색");
			System.out.println("4. 가입날짜별 검색");
			System.out.println("5. 이전메뉴로 이동");
			System.out.println("-------------------");
			System.out.println("메뉴 선택 : ");
			no = sc.nextInt();
			sc.nextLine();

			switch (no) {
			case 1:
				System.out.println("**** 이름으로 검색 ****");
				System.out.println("검색할 이름 입력 : ");
				String nameKeyword = sc.nextLine();
				resultMap = mController.selectSearchName(nameKeyword);
				System.out.println(resultMap.get("res"));
				break;
			case 2:
				System.out.println("**** 나이로 검색 ****");
				System.out.println("최소 나이 입력 : ");
				int beginAge = sc.nextInt();
				sc.nextLine();
				System.out.println("최대 나이 입력 : ");
				int endAge = sc.nextInt();
				sc.nextLine();
				resultMap = mController.selectSearchAge(beginAge, endAge);
				System.out.println(resultMap.get("res"));
				break;
			case 3:
				System.out.println("**** 성별로 검색 *****");
				System.out.println("검색할 성별을 입력하세요 (남자 : M, 여자 : F) :  ");
				String gender = sc.nextLine();
				resultMap = mController.selectSearchGender(gender);
				System.out.println(resultMap.get("res"));
				break;
			case 4:
				System.out.println("****가입 날짜별 검색 *****");
				System.out.println("시작 날짜를 입력하세요[YYYY-MM-DD] : ");
				String beginDate = sc.nextLine();
				System.out.println("종료 날짜를 입력하세요[YYYY-MM-DD] : ");
				String endDate = sc.nextLine();
				Date bd = Date.valueOf(beginDate);
				Date ed = Date.valueOf(endDate);
				resultMap = mController.selectSearchEnrollDate(bd, ed);
				System.out.println(resultMap.get("res"));
				break;
			case 5:
				displayMenu();
				break;
			default:
				System.out.println("잘못입력하셨습니다. 다시 입력해주세요.");
				break;
			}

		} while (true);
	}

	@SuppressWarnings("unchecked")
	public void printList(Map<String, Object> map) {
		if ((boolean) map.get("isSuccess")) {
			if (((List<Member>) map.get("res")).size() == 0) {
				System.out.println("회원이 존재하지 않습니다.");
			} else {
				for (Member member : (List<Member>) map.get("res")) {
					System.out.println(member);
				}

			}
		} else {
			System.out.println(map.get("res"));
		}
	}

	public void exit() {
		System.out.println("정말로 끝내시겠습니까? (예 : Y / 아니오 : N)");
		if (sc.next().toUpperCase().charAt(0) == 'Y') {
			System.out.println("프로그램 종료");
			System.exit(0);
		} else {
			System.out.println("프로그램이 계속됩니다.");
			displayMenu();
		}
	}

	public Member inputMember() {
		Member member = new Member();

		System.out.println("----------- 회원 정보를 입력하세요 ---------");
		System.out.println("회원 아이디 : ");
		member.setUserId(sc.nextLine());
		System.out.println("회원 비밀번호 : ");
		member.setUserPwd(sc.nextLine());
		System.out.println("회원 이름 : ");
		member.setUserName(sc.nextLine());
		System.out.println("회원 성별[남 : M / 여 : F] : ");
		member.setGender(sc.nextLine());
		System.out.println("회원 나이 : ");
		member.setAge(sc.nextInt());
		sc.nextLine();
		System.out.println("회원 전화번호 : ");
		member.setPhone(sc.nextLine());
		System.out.println("회원  이메일 : ");
		member.seteMail(sc.nextLine());
		System.out.println("기타 하고싶은 말 : ");
		member.setEtc(sc.nextLine());

		return member;
	}
}
