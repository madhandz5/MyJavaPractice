package com.kh.object.arr;

import com.kh.object.encapsulation.KookbobDreeper;

public class ObjectArr {

	public void objectArr() {

		// ����帮�� �迭
		KookbobDreeper[] kbd = { new KookbobDreeper("ġŲ", 25000), new KookbobDreeper("ȸ", 50000),
				new KookbobDreeper("����ī��", 120000) };

		for (int i = 0; i < kbd.length; i++) {
			kbd[i].dreep();
		}
	}
}
