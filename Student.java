package com.gmail.klewzow;

public class Student extends Human {
	private int groupName;
	private int course;

	public Student(String name, String surename, int age, boolean gender, String nacionality, long iPn, int groupName,
			int course) {
		super(name, surename, age, gender, nacionality, iPn);
		this.groupName = groupName;
		this.course = course;
	}

	public Student() {
		super();
	}

	public int getGroupName() {
		return groupName;
	}

	public void setGroupName(int groupName) {
		this.groupName = groupName;
	}

	public int getCourse() {
		return course;
	}

	public void setCourse(int course) {
		this.course = course;
	}

	@Override
	public String toString() {
		return "\n" + super.toString() + "\nStudent [groupName=" + groupName + ", course=" + course + "]\n";
	}

}
