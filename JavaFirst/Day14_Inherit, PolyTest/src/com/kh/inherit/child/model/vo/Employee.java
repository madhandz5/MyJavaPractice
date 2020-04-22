package com.kh.inherit.child.model.vo;

import com.kh.inherit.parent.model.vo.Person;

public class Employee extends Person {

	private int salary;
	private String dept;

	public Employee() {
		super();
	}

	public Employee(String name, int age, double height, double weight, int salary, String dept) {
		super(name, age, height, weight);
		this.salary = salary;
		this.dept = dept;
	}

	public int getSalary() {
		return salary;
	}

	public void setSalary(int salary) {
		this.salary = salary;
	}

	public String getDept() {
		return dept;
	}

	public void setDept(String dept) {
		this.dept = dept;
	}
}
