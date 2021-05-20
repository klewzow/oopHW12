package com.gmail.klewzow;

public class Main {

	public static void main(String[] args) throws MyExeption {
		Human ivan = new Human("Ivan", "Ivanov", 25, true, "Ukrainian", 25664877856l);
		Human vova = new Human("Vova", "Sidorov", 22, true, "Moldova", 46526566566l);

		Student studentIvan = new Student(ivan, 4, 7);
		Student studentVova = new Student(vova, 4, 7);
		Student studentKolia = new Student("Kolia", "Nikolaev", 23, true, "Ukrainian", 4656549654978l, 4, 7);
		Student studentOlga = new Student("Olga", "Kozlova", 18, false, "Ukrainian", 965464646446l, 4, 7);
		Student studentIrina = new Student("Irina", "Mex", 23, false, "Ukrainian", 987946446466l, 4, 7);
		Student studentMasha = new Student("Masha", "Masha", 20, false, "Moldova", 495979545664l, 4, 7);
		Student studentKaterina = new Student("Katerina", "Sorina", 29, false, "Ukrainian", 9795466266l, 4, 7);
 

		Groups grupA = new Groups();
		
		
		grupA.addStudent(studentOlga);
		grupA.addStudent(studentVova);
		grupA.addStudent(studentKaterina);
		grupA.addStudent(studentIrina);
		grupA.addStudent(studentIvan);
		grupA.addStudent(studentMasha);
		grupA.addStudent(studentIvan);
		grupA.addStudent(studentKolia);
		grupA.addStudent(studentIvan);
		grupA.addStudent(studentVova);

		grupA.addStudent(studentIvan);
		grupA.addStudent(studentVova);
		grupA.addStudent(studentIvan);

		grupA.delStudent(studentVova);
		grupA.delStudent(studentIvan);
		grupA.delStudent(studentKolia);
		grupA.delStudent(studentVova);

		grupA.addStudent(studentVova);

		System.out.println(grupA.toString());
		
		
		
		
		System.out.println("Search Student - " + grupA.searchStodentToSurename("Sorina"));
		System.out.println("Search Student - " + grupA.searchStodentToSurename("Nikolaev"));
	}

}
