package com.kh.run;

import com.kh.abstractClass.sports.model.vo.BasketBall;
import com.kh.abstractClass.sports.model.vo.FootBall;
import com.kh.abstractClass.sports.model.vo.Sports;

public class Run {

	public static void main(String[] args) {

		// new PolyTest().polyTest();

		// Sports Class를 다형성을 적용해서 Run 할것.

		Sports[] sports = new Sports[2];

		sports[0] = new BasketBall();
		sports[1] = new FootBall();

		for (int i = 0; i < sports.length; i++) {
			sports[i].rule();
		}

	}

}
