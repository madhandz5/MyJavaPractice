package com.kh.controller;

import com.kh.model.vo.Duck;
import com.kh.model.vo.Mallard;
import com.kh.model.vo.RubberDuck;

public class DuckManager {
	
	public static void main(String[] args) {

		Duck[] ducks = new Duck[] { new RubberDuck("도날드", "러버덕", 100), new Mallard("꽥꽥이", "청둥오리", "서울", "white"),
				new RubberDuck("고무고무", "러버덕", 100), new Mallard("청둥이", "청둥오리", "부산", "blue"),
				new Mallard("미세먼지", "청둥오리", "중국", "yellow") };

		for (int i = 0; i < ducks.length; i++) {
			ducks[i].quack();

		}
	}

}
