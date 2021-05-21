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
				if (studentsInGroup[i] == null) {
					addS(student, i);
					break;
				}

			} catch (MyExeption e) {
				break;
			}

		}

	}

	private void addS(Student student, int i) throws MyExeption {

		studentsInGroup[i] = student;

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

	public Student searchStodentToSurename(String surename) {

		for (int i = 0; i < studentsInGroup.length; i++) {
			try {

				if ((this.studentsInGroup[i].getSurename()).equals(surename)) {

					return this.studentsInGroup[i];
				}
			} catch (NullPointerException e) {

				continue;
			}
		}

		return null;
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
