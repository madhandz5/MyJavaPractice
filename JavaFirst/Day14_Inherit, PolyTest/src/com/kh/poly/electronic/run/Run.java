package com.kh.poly.electronic.run;

import com.kh.poly.electronic.controller.YongSan;
import com.kh.poly.electronic.model.vo.Desktop;
import com.kh.poly.electronic.model.vo.Electronic;
import com.kh.poly.electronic.model.vo.NoteBook;
import com.kh.poly.electronic.model.vo.Tablet;

public class Run {

	public static void main(String[] args) {

		YongSan ys = new YongSan();
		Desktop dt = new Desktop("삼성", "컴퓨터", 1200000, "지포스");
		NoteBook note = new NoteBook("LG", "그램", 1500000, 3);
		Tablet tab = new Tablet("애플", "프로", 2500000, true);

		ys.insert(tab);
		ys.insert(dt);
		ys.insert(note);

		Electronic[] elec = ys.select();

		for (int i = 0; i < elec.length; i++) {
			if (elec[i] == null)
				break;
			else
				System.out.println(elec[i]);

		}

		// ys.insert(new Desktop("삼성", "컴퓨터", 1200000, "Geforce"));
		// ys.insert(new NoteBook("LG", "그램", 1500000, 3));
		// ys.insert(new Tablet("애플", "프로", 2500000, true));
		//
		// System.out.println(ys.selectDesk());
		// System.out.println(ys.selectNote());
		// System.out.println(ys.selectTab());

	}

}
