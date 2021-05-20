package com.gmail.klewzow;

import java.util.Arrays;

public class Groups {

	private Student[] studentsInGroup = new Student[10];

	public Groups(Student student) {
		super();

	}

	public Groups() {
		super();
	}

	public void addStudent(Student student) {

		for (int i = 0;; i++) {
			try {
				if (i >= studentsInGroup.length) {
					throw new MyExeption();
				}
				if (this.studentsInGroup[i] == null) {

					studentsInGroup[i] = student;
					break;
				}

			} catch (MyExeption e) {

				break;
			}

		}
	}

	public void delStudent(Student student) {
		for (int i = 0; i < studentsInGroup.length; i++) {
			try {

				if ((this.studentsInGroup[i].getSurename()).equals(student.getSurename())) {
					studentsInGroup[i] = null;
					break;
				}
			} catch (NullPointerException e) {

				continue;
			}
		}
	}

	public String searchStodentToSurename(String surename) {
		StringBuffer sb = new StringBuffer();
		for (int i = 0; i < studentsInGroup.length; i++) {
			try {

				if ((this.studentsInGroup[i].getSurename()).equals(surename)) {
					sb.append(studentsInGroup[i].toString());
					break;
				}
			} catch (NullPointerException e) {

				continue;
			}
		}
		if (sb.toString().equals("")) {
			sb.append("Student not found.");
		}

		return sb.toString();
	}

	public Student[] getStudentsInGroup() {
		return studentsInGroup;
	}

	public void setStudentsInGroup(Student[] studentsInGroup) {
		this.studentsInGroup = studentsInGroup;
	}

	@Override
	public String toString() {
		return "Groups [ studentsInGroup=" + Arrays.toString(studentsInGroup) + "]";
	}

}
