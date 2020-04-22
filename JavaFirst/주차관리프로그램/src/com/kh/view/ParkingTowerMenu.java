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
			System.out.println("==== *���� Ÿ�� ����*====");
			System.out.println("1. ���� ����");
			System.out.println("2. ��ü ���");
			System.out.println("3. ���� ����");
			System.out.println("4. ���� ���� �˻�");
			System.out.println("0. ������");
			System.out.println("=====================");
			System.out.println("�޴� ���� : ");
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
				System.out.println("���α׷� ����");
			}

		}
	}

	public void insertCar() {
		System.out.println("���� ��ȣ ");
		int carNum = scanner.nextInt();
		scanner.nextLine();
		System.out.println("���� Ÿ�� (1: ���� / 2 : ���� / 3 : SUV / 4 : Ʈ��");
		int carType = scanner.nextInt();
		scanner.nextLine();
		System.out.println("���� ������ : ");
		String owner = scanner.nextLine();

		// ������ �Է� ���� carNum, carType, owner�� �Ű������� �� Car ��ü ���� (car)
		// ParkingTowerManager�� insertCar �޼ҵ�� car ����
		Car newCar = new Car(carNum, carType, owner);
		ptm.insertCar(newCar);

	}

	public void selectMap() {

		// ParkingTowerManager�� selectMap() �޼ҵ� ȣ��
		// ���� �� ���� ���� (carMap)
		// carMap�� ��� ���� ��� >> "������ ������ �����ϴ�."���
		// carMap�� ������� ���� ��� >> ��ü���
		Map<Integer, Car> car = ptm.selectMap();

		if (car.isEmpty()) {
			System.out.println("������ ������ �����ϴ�.");
		} else {
			for (int k : car.keySet()) {
				System.out.println(car.get(k));
			}
		}
	}

	public void deleteCar() {
		// "���� ��ȣ : ">> �Է� ���� (carNum)
		System.out.println("���� ��ȣ�� �Է��ϼ��� : ");
		int carNum = scanner.nextInt();
		scanner.nextLine();

		// ParkingTowerManager�� deleteCar �޼ҵ�� carNum ����
		// ���� �� ���� ���� (res)
		int res = ptm.deleteCar(carNum);
		// res�� null�� �ƴ� ��� >> res ���, ������ ���� �Ϸ�!�� ���
		if (res == 1) {
			System.out.println(res);
			System.out.println("���� ���� �Ϸ�!");
		} else {
			System.out.println("�Է��Ͻ� ������ �����Ǿ� ���� �ʽ��ϴ�.");
		}
		// res�� null�� ��� >> ���Է��Ͻ� ������ �����Ǿ� ���� �ʽ��ϴ�.�����
	}

	public void searchCar() {
		// "���� ���� �˻�(�����Է�) : ">> �Է� ���� (owner)
		// ParkingTowerManager�� searchCar �޼ҵ�� owner ����
		// ���� �� ���� ���� (searchMap)
		// searchMap�� ��� ���� ��� >> "�˻��� ������ ���� �Ǿ� ���� �ʽ��ϴ�."���
		// searchMap�� ������� ���� ��� >> ��ü���
		System.out.println("���� ���� �˻�(���� �Է�) : ");
		String owner = scanner.nextLine();

		if (ptm.searchCar(owner).isEmpty()) {
			System.out.println("�˻��� ������ ���� �Ǿ� ���� �ʽ��ϴ�.");
		} else {
			for (int k : ptm.searchCar(owner).keySet()) {
				System.out.println(ptm.searchCar(owner).get(k));
			}
		}
	}

}
