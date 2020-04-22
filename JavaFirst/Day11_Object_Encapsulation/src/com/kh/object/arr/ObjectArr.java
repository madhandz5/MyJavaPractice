package com.kh.object.arr;

import com.kh.object.encapsulation.KookbobDreeper;

public class ObjectArr {

	public void objectArr() {

		// 국밥드리퍼 배열
		KookbobDreeper[] kbd = { new KookbobDreeper("치킨", 25000), new KookbobDreeper("회", 50000),
				new KookbobDreeper("오마카세", 120000) };

		for (int i = 0; i < kbd.length; i++) {
			kbd[i].dreep();
		}
	}
}
