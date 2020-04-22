package com.kh.run;

import com.kh.model.vo.Family;
import com.kh.model.vo.Father;

public class Run {

	public static void main(String[] args) {

		// 가족 타입으로 아버지 클래스 인스턴스 화

		Family father = new Father("홍당무", 70, 15);
		// 아버지의 정보
		System.out.println(father.toString());
		// 아버지의 건강
		System.out.println("아버지의 건강 : " + father.getHealth());
		System.out.println("아버지의 몸무게 : " + father.getWeight());
		// 아버지가 식사를 한다.
		System.out.println("아버지가 식사를 한다.");
		father.eat();
		// 아버지의 건강 출력
		System.out.println("아버지의 건강 : " + father.getHealth());
		System.out.println("아버지의 몸무게 : " + father.getWeight());
		// 아버지가 잠을 잔다.
		System.out.println("아버지가 잠을 잔다.");
		father.sleep();
		// 아버지 건강 출력
		System.out.println("아버지의 건강 : " + father.getHealth());
		System.out.println("아버지의 몸무게 : " + father.getWeight());

		// "아버지가 아기랑 놀아준다" 문구 출력
		System.out.println("아버지가 아기랑 놀아준다.");
		// 아버지 play메서드 호출
		((Father) father).play();
		// 아버지 건강 출력
		System.out.println("아버지의 건강 : " + father.getHealth());
		System.out.println("아버지의 몸무게 : " + father.getWeight());

	}
}
