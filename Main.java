package com.gmail.klewzow;

public class Main {

	public static void main(String[] args) {
		Student [] student = new Student[15];
		student[0] = new Student("Ivan", "Ivanov", 25, true, "Ukrainian", 25664877856l, 4, 7);
		student[1] = new Student("Vova", "Sidorov", 22, true, "Moldova", 46526566566l, 4, 7);
		student[2] = new Student("Kolia", "Nikolaev", 23, true, "Ukrainian", 4656549654978l, 4, 7);
		student[3] = new Student("Olga", "Kozlova", 18, false, "Ukrainian", 965464646446l, 4, 7);
		student[4] = new Student("Irina", "Mex", 23, false, "Ukrainian", 987946446466l, 4, 7);
		student[5] = new Student("Masha", "Masha", 20, false, "Moldova", 495979545664l, 4, 7);
		student[6] = new Student("Katerina", "Sorina", 29, false, "Ukrainian", 9795466266l, 4, 7);
		student[7] = new Student("Nina", "Klark", 19, false, "Deiche", 49592344234l, 4, 7);
		student[8] = new Student("Oleg", "Busina", 30, true, "Ukrainian", 9723236l, 4, 7);

		Groups grupA = new Groups();

		grupA.addStudent(student[0]);
		grupA.addStudent(student[1]);
		grupA.addStudent(student[2]);
		grupA.addStudent(student[3]);
		grupA.addStudent(student[4]);
		grupA.addStudent(student[5]);
		grupA.addStudent(student[6]);
		grupA.addStudent(student[7]);
		grupA.addStudent(student[8]);
		grupA.addStudent(student[6]);

	 
 		grupA.addStudent(student[5]);
 		grupA.addStudent(student[7]);

		grupA.delStudent(student[6]);
		grupA.delStudent(student[1]);
		grupA.delStudent(student[4]);
		grupA.delStudent(student[8]);

		grupA.addStudent(student[3]);

		System.out.println(grupA.toString());

		System.out.println("Search Student - " + grupA.searchStodentToSurename("Kozlova"));
		System.out.println("Search Student - " + grupA.searchStodentToSurename("Busina"));

		System.out.println();
		System.out.println();
		System.out.println();
		System.out.println();

	}

}
