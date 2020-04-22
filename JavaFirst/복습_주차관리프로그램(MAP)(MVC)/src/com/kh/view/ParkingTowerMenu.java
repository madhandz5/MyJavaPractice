package com.kh.view;

import java.util.Map;
import java.util.Scanner;

import com.kh.controller.ParkingTowerManager;
import com.kh.model.Car;

public class ParkingTowerMenu {

	Scanner scanner = new Scanner(System.in);
	ParkingTowerManager ptm = new ParkingTowerManager();

	public void mainMenu() {

		while (true) {
			System.out.println("==== *주차 타워 관리*====");
			System.out.println("1. 차량 주차");
			System.out.println("2. 전체 출력");
			System.out.println("3. 차량 출차");
			System.out.println("4. 주차 차량 검색");
			System.out.println("0. 끝내기");
			System.out.println("=====================");
			System.out.println("메뉴 선택 : ");
			int menuSelectNum = scanner.nextInt();
			scanner.nextLine();

			switch (menuSelectNum) {
			case 1:
				insertCar();
				break;
			case 2:
				selectMap();
				break;
			case 3:
				deleteCar();
				break;
			case 4:
				searchCar();
				break;
			case 0:
				System.out.println("프로그램 종료");
			}

		}
	}

	public void insertCar() {
		System.out.println("차량 번호 ");
		int carNum = scanner.nextInt();
		scanner.nextLine();
		System.out.println("차량 타입 (1: 경차 / 2 : 세단 / 3 : SUV / 4 : 트럭");
		int carType = scanner.nextInt();
		scanner.nextLine();
		System.out.println("차량 소유자 : ");
		String owner = scanner.nextLine();

		// 위에서 입력 받은 carNum, carType, owner를 매개변수로 한 Car 객체 생성 (car)
		// ParkingTowerManager의 insertCar 메소드로 car 전달
		Car newCar = new Car(carNum, carType, owner);
		ptm.insertCar(newCar);

	}

	public void selectMap() {

		// ParkingTowerManager의 selectMap() 메소드 호출
		// 리턴 값 전달 받음 (carMap)
		// carMap가 비어 있을 경우 >> "주차된 차량이 없습니다."출력
		// carMap가 비어있지 않을 경우 >> 전체출력
		Map<Integer, Car> car = ptm.selectMap();

		if (car.isEmpty()) {
			System.out.println("주차된 차량이 없습니다.");
		} else {
			for (int k : car.keySet()) {
				System.out.println(car.get(k));
			}
		}
	}

	public void deleteCar() {
		// "차량 번호 : ">> 입력 받음 (carNum)
		System.out.println("차량 번호를 입력하세요 : ");
		int carNum = scanner.nextInt();
		scanner.nextLine();

		// ParkingTowerManager의 deleteCar 메소드로 carNum 전달
		// 리턴 값 전달 받음 (res)
		int res = ptm.deleteCar(carNum);
		// res가 null이 아닐 경우 >> res 출력, “차량 출차 완료!” 출력
		if (res == 1) {
			System.out.println(res);
			System.out.println("차량 출차 완료!");
		} else {
			System.out.println("입력하신 차량이 주차되어 있지 않습니다.");
		}
		// res가 null일 경우 >> “입력하신 차량이 주차되어 있지 않습니다.”출력
	}

	public void searchCar() {
		// "주차 차량 검색(차주입력) : ">> 입력 받음 (owner)
		// ParkingTowerManager의 searchCar 메소드로 owner 전달
		// 리턴 값 전달 받음 (searchMap)
		// searchMap가 비어 있을 경우 >> "검색한 차량이 주차 되어 있지 않습니다."출력
		// searchMap가 비어있지 않을 경우 >> 전체출력
		System.out.println("주차 차량 검색(차주 입력) : ");
		String owner = scanner.nextLine();

		if (ptm.searchCar(owner).isEmpty()) {
			System.out.println("검색한 차량이 주차 되어 있지 않습니다.");
		} else {
			for (int k : ptm.searchCar(owner).keySet()) {
				System.out.println(ptm.searchCar(owner).get(k));
			}
		}
	}

}
