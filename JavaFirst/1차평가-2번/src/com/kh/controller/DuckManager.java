package com.kh.controller;

import com.kh.model.vo.Duck;
import com.kh.model.vo.Mallard;
import com.kh.model.vo.RubberDuck;

public class DuckManager {
	
	public static void main(String[] args) {

		Duck[] ducks = new Duck[] { new RubberDuck("������", "������", 100), new Mallard("�в���", "û�տ���", "����", "white"),
				new RubberDuck("����", "������", 100), new Mallard("û����", "û�տ���", "�λ�", "blue"),
				new Mallard("�̼�����", "û�տ���", "�߱�", "yellow") };

		for (int i = 0; i < ducks.length; i++) {
			ducks[i].quack();

		}
	}

}
