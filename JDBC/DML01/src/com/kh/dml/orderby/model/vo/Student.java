package com.kh.dml.orderby.model.vo;

public class Student {

	private String name;
	private String className;
	private int score;

	public Student() {

	}

	public Student(String name, String className, int score) {
		super();
		this.name = name;
		this.className = className;
		this.score = score;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getClassName() {
		return className;
	}

	public void setClassName(String className) {
		this.className = className;
	}

	public int getScore() {
		return score;
	}

	public void setScore(int score) {
		this.score = score;
	}

	@Override
	public String toString() {
		return "Student [name=" + name + ", className=" + className + ", score=" + score + "]";
	}
}
