package com.kh.run;

import com.kh.model.vo.GalaxyNote9;
import com.kh.model.vo.SmartPhone;
import com.kh.model.vo.V40;

public class Run {

	public static void main(String[] args) {

		SmartPhone[] phone = new SmartPhone[2];

		phone[0] = new GalaxyNote9("갤럭시 노트 9");
		phone[1] = new V40("V40");

		for (int i = 0; i < phone.length; i++) {
			System.out.print(phone[i].getModel() + "은 ");
			phone[i].printMaker();
			System.out.println("에서 만들어 졌다.");
			phone[i].makeaCall();
			phone[i].takeaCall();
			phone[i].touch();
			phone[i].charge();
			phone[i].picture();
			System.out.println();
		}
	}
}
