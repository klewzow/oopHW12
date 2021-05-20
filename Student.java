package com.gmail.klewzow;

public class Student extends Human {
	private int groupName;
	private int course;

	public Student(Human human, int groupName, int course) {
		super(human.getName(), human.getSurename(), human.getAge(), human.isGender(), human.getNacionality(),
				human.getiPn());
		this.course = course;
		this.groupName = groupName;
	}

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
	public String getName() {
		return super.getName();
	}

	@Override
	public void setName(String name) {
		super.setName(name);
	}

	@Override
	public String getSurename() {
		return super.getSurename();
	}

	@Override
	public void setSurename(String surename) {
		super.setSurename(surename);
	}

	@Override
	public int getAge() {
		return super.getAge();
	}

	@Override
	public void setAge(int age) {
		super.setAge(age);
	}

	@Override
	public boolean isGender() {
		return super.isGender();
	}

	@Override
	public void setGender(boolean gender) {
		super.setGender(gender);
	}

	@Override
	public String getNacionality() {
		return super.getNacionality();
	}

	@Override
	public void setNacionality(String nacionality) {
		super.setNacionality(nacionality);
	}

	@Override
	public long getiPn() {
		return super.getiPn();
	}

	@Override
	public void setiPn(long iPn) {
		super.setiPn(iPn);
	}

	@Override
	public String toString() {
		return "\n" + super.toString() + "\nStudent [groupName=" + groupName + ", course=" + course + "]\n";
	}

}
