package com.kh.abstractClass.sports.model.vo;

// �߻�Ŭ����
// abstract�޼��尡 0���̻� �����ϴ� Ŭ����
// abstract�޼��尡 �ϳ��� �ִٸ� �ݵ�� �߻�Ŭ�������� �Ѵ�.
// �߻�Ŭ������ ��ӹ޴� Ŭ������ �ݵ�� abstract�޼��带 �������̵� �ؾ��Ѵ�.
// ��ü ������ �� �� ������, ������ Ÿ�����δ� ����� �����ϴ�.

public abstract class Sports {

	private int people;

	public Sports() {

	}

	public int getPeople() {
		return people;
	}

	public void setPeople(int people) {
		this.people = people;
	}

	@Override
	public String toString() {
		return "Sports [people=" + people + "]";
	}

	public abstract void rule();

}
