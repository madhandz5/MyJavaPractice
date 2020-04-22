package com.kh.inheritanceQuiz.controller;

import com.kh.inheritanceQuiz.vo.Airline;
import com.kh.inheritanceQuiz.vo.Tourist;

public class TourController {

	Airline america = new Airline("미국행", 3000, 300000);
	Airline china = new Airline("중국행", 2000, 200000);
	Airline japan = new Airline("일본행", 1500, 150000);
	Airline[] alArr = { america, china, japan };

	Tourist tt = new Tourist(1000000, 1000);

	public TourController() {

	}

	public boolean isAble(int money, int arrNum) {
		money = bringMyMoney();
		if (money < alArr[arrNum].getAirfare()) {
			return false;
		} else {
			return true;
		}
	}

	public void buyTicket(int arrNum) {
		tt.setMyMoney(tt.getMyMoney() - alArr[arrNum].getAirfare());
		tt.setMyMile(tt.getMyMile() + alArr[arrNum].getMileage());
	}

	public int bringMyMoney() {
		return tt.getMyMoney();
	}

	public int bringMyMile() {
		return tt.getMyMile();
	}

	public void drawMenu() {
		String menuPan = "";
		System.out.println("번호     목 적 지      가  격        마일리지");
		for (int i = 0; i < alArr.length; i++) {
			if (alArr[i] != null) {
				menuPan = " " + (i + 1) + "    " + alArr[i].getCountry() + "      " + alArr[i].getAirfare() + "    "
						+ alArr[i].getMileage();
				System.out.println(menuPan);
			} else {
				break;
			}
		}
	}
}
