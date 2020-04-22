package com.kh.poly.electronic.controller;

import com.kh.poly.electronic.model.vo.Electronic;

public class YongSan {

	// private Desktop desk = null;
	// private NoteBook note = null;
	// private Tablet tab = null;
	private Electronic[] elec = new Electronic[10];
	private int cnt = 0;
	// public void insert(Desktop d) {
	// System.out.println("데스크탑을 넣었습니다.");
	// this.desk = d;
	// }
	//
	// public void insert(NoteBook n) {
	// System.out.println("노트북 넣었습니다.");
	// this.note = n;
	// }
	//
	// public void insert(Tablet t) {
	// System.out.println("태블릿 넣었습니다.");
	// this.tab = t;
	// }
	//
	// public Desktop selectDesk() {
	// return this.desk;
	//
	// }
	//
	// public NoteBook selectNote() {
	// return this.note;
	// }
	//
	// public Tablet selectTab() {
	// return this.tab;
	// }

	public void insert(Electronic anything) {

		System.out.println("전자기기 넣습니다.");
		elec[cnt] = anything;
		cnt++;
	}

	public Electronic[] select() {
		return elec;
	}
}
