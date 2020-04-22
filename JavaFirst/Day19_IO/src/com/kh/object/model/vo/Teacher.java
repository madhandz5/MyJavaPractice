package com.kh.object.model.vo;

import java.io.Serializable;

public class Teacher implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -7001351395565717612L;
	private String classR;
	private String name;

	public Teacher() {
	}

	public Teacher(String classR, String name) {
		this.classR = classR;
		this.name = name;
	}

	public String getClassR() {
		return classR;
	}

	public void setClassR(String classR) {
		this.classR = classR;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "Teacher [classR=" + classR + ", name=" + name + "]";
	}

}
