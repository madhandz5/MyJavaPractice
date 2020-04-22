package com.kh.controller;

import com.kh.model.vo.Member;

public class MemberController {

	public final int SIZE = 10;

	private int memberCount;
	private Member[] mem = new Member[SIZE];

	{
		mem[0] = new Member("user01", "pass01", "김유신", 20, 'M', "kim12@naver.com");
		mem[1] = new Member("user02", "pass02", "이순신", 60, 'M', "lee2@naver.com");
		mem[2] = new Member("user03", "pass03", "유관순", 17, 'F', "yo5@hanmail.net");
		mem[3] = new Member("user04", "pass04", "연개소문", 57, 'M', "yeon@gmail.com");
		mem[4] = new Member("user05", "pass05", "신사임당", 45, 'F', "shin@naver.com");
		memberCount = 5;
	}

	public int getMemberCount() {
		return memberCount;
	}

	public Member[] getMem() {
		return mem;
	}

	public Member checkId(String userId) {
		Member m = null;
		for (int i = 0; i < memberCount; i++) {
			if (mem[i].getUserId().equals(userId)) {
				m = mem[i];
			}
		}
		return m;
	}

	public void insertMember(Member m) {
		mem[memberCount++] = m;
	}

	public Member searchMember(int menu, String search) {
		Member searchMember = null;
		if (menu == 1) {
			for (int i = 0; i < memberCount; i++) {
				if (search.equals(mem[i].getUserId())) {
					searchMember = mem[i];
				}
			}
		} else if (menu == 2) {
			for (int i = 0; i < memberCount; i++) {
				if (search.equals(mem[i].getName())) {
					searchMember = mem[i];
				}
			}
		} else if (menu == 3) {
			for (int i = 0; i < memberCount; i++) {
				if (search.equals(mem[i].getEmail())) {
					searchMember = mem[i];
				}
			}
		}
		return searchMember;
	}

	public void updateMember(Member m, int menu, String update) {
		if (menu == 1) {
			m.setUserPwd(update);
		} else if (menu == 2) {
			m.setName(update);
		} else if (menu == 3) {
			m.setEmail(update);
		}
	}

	public void deleteMember(String userId) {
		for (int i = 0; i < memberCount; i++) {
			if (mem[i].getUserId().equals(userId)) {
				for (int j = i; j < memberCount; j++) {
					mem[j] = mem[j + 1];
				}
				memberCount--;
			}
		}

	}

	public Member[] sortIdAsc() {
		Member[] sortIdAsc = mem.clone();
		for (int i = 0; i < memberCount; i++) {
			for (int j = i + 1; j < memberCount; j++) {
				if (sortIdAsc[j].getUserId().compareTo(sortIdAsc[i].getUserId()) < 0) {
					mem[i] = sortIdAsc[i];
					sortIdAsc[i] = sortIdAsc[j];
					sortIdAsc[j] = mem[i];
				}
			}
		}
		return sortIdAsc;

	}

	public Member[] sortIdDesc() {
		Member[] sortIdDesc = mem.clone();
		Member[] temp = new Member[memberCount];
		for (int i = 0; i < memberCount; i++) {
			for (int j = i + 1; j < memberCount; j++) {
				if (sortIdDesc[j].getUserId().compareTo(sortIdDesc[i].getUserId()) > 0) {
					temp[i] = sortIdDesc[i];
					sortIdDesc[i] = sortIdDesc[j];
					sortIdDesc[j] = temp[i];
				}
			}
		}
		return sortIdDesc;
	}

	public Member[] sortAgeAsc() {
		Member[] sortAgeAsc = mem.clone();
		Member[] temp = new Member[memberCount];
		for (int i = 0; i < memberCount; i++) {
			for (int j = i + 1; j < memberCount; j++) {
				if (sortAgeAsc[j].getAge() - sortAgeAsc[i].getAge() < 0) {
					temp[i] = sortAgeAsc[i];
					sortAgeAsc[i] = sortAgeAsc[j];
					sortAgeAsc[j] = temp[i];
				}
			}
		}
		return sortAgeAsc;
	}

	public Member[] sortAgeDesc() {
		Member[] sortAgeDesc = mem.clone();
		Member[] temp = new Member[memberCount];
		for (int i = 0; i < memberCount; i++) {
			for (int j = i + 1; j < memberCount; j++) {
				if (sortAgeDesc[i].getAge() - sortAgeDesc[j].getAge() < -1) {
					temp[i] = sortAgeDesc[i];
					sortAgeDesc[i] = sortAgeDesc[j];
					sortAgeDesc[j] = temp[i];
				}
			}
		}
		return sortAgeDesc;
	}

	public Member[] sortGenderDesc() {
		Member[] sortGenderDesc = mem.clone();
		Member[] temp = new Member[memberCount];
		for (int i = 0; i < memberCount; i++) {
			for (int j = i + 1; j < memberCount; j++) {
				if (sortGenderDesc[j].getGender() - sortGenderDesc[i].getGender() > 0) {
					temp[i] = sortGenderDesc[i];
					sortGenderDesc[i] = sortGenderDesc[j];
					sortGenderDesc[j] = temp[i];
				}
			}
		}
		return sortGenderDesc;

	}

}
