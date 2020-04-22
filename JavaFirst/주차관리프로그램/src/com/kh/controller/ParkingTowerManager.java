package com.kh.controller;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

import com.kh.model.Car;

public class ParkingTowerManager {
	private Map<Integer, Car> carMap = new HashMap<Integer, Car>();
	private int parkingNo = 0;

	public ParkingTowerManager() {

	}

	public void insertCar(Car car) {
		// ������ �߰��� �� Map�� key���� ���� ��ȣ���ϰ� value���� Car��ü���Ѵ�.
		// �̶� Ű���� parkingNO�� 1�� �߰��ϸ�
		// ��� //carMap�� put�� ����Ͽ� ���� �߰�
		carMap.put(parkingNo++, car);

	}

	public Map<Integer, Car> selectMap() {

		return carMap;
	}

	public int deleteCar(int parkingNo) {
		// carMap�� entrySet()�� ���� SetŸ������ �ٲ��ְ�
		// for���� ���� ���� ���޹��� carNum������ getValue()��
		// ���� ���� �ϴ� ��� �����Ѵ�.
		// ���������� ���� �� ��� 1 ����
		// ���� ���� ���� ��� ��, �����ϴ� ���� ��ȣ�� ����
		// ��� 0 ����
		int res = 0;
		for (int i = 0; i < carMap.size(); i++) {
			if (parkingNo == carMap.get(i).getCarNum()) {
				res = 1;
				carMap.remove(i);
			}
		}
		return res;
	}

	public Map<Integer, Car> searchCar(String owner) {

		Map<Integer, Car> searchMap = new HashMap<Integer, Car>();

		Set<Map.Entry<Integer, Car>> it = carMap.entrySet();
		for (Entry<Integer, Car> entry : it) {
			if (entry.getValue().getOwner().contains(owner)) {
				searchMap.put(entry.getKey(), entry.getValue());
			}
		}
		// map�� entrySet(), �� ���
		// entry�� getValue() �� ���޹��� owner�� ������ ������ ���� ���
		// searchMap�� entry�� getKey()���� entry�� getValue()���� ������ ����
		// searchMap ����

		// for (
		//
		// int i = 0; i < carMap.size(); i++) {
		// if (owner.equals(carMap.get(i).getOwner())) {
		// searchMap.put(i,
		// new Car(carMap.get(i).getCarNum(), carMap.get(i).getCarType(),
		// carMap.get(i).getOwner()));
		// }
		//
		// }

		return searchMap;
	}
}
