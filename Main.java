package com.company;

import java.util.ArrayList;

public class Main {
	public static void main(String[] args) {


		School mySchool = new School();

		mySchool.setName("Good Grades High");


		School mySchool2 = new School();
		mySchool2.setName("Woop High");


		System.out.println("This schools name is: " + mySchool.getName());
		mySchool.setAmountOfStudents(5);
		System.out.println(mySchool.getName()+ " has "+ mySchool.getAmountOfStudents() +" students");

		Cat myCat = new Cat();
		myCat.setCatName("Nala");
		System.out.println("this school has a cat named " + myCat.getCatName());
		myCat.setCatColour("black with white");
		System.out.println("This cat's colour is " + myCat.getCatColour());

		student myStudent = new student();
		student myStudent2 = new student();
		student myStudent3 = new student();
		student myStudent4 = new student();
		student myStudent5 = new student();
		myStudent.setStudentsName("Thimmothy");
		myStudent2.setStudentsName("Thimmooo");
		myStudent3.setStudentsName("Timmothy");
		myStudent4.setStudentsName("dpimmothy");
		myStudent5.setStudentsName("Thiothy");

		System.out.println("this school has a school student named " + myStudent.getStudentsName());
		myStudent.setStudentsAge(40);
		System.out.println("he is " + myStudent.getStudentsAge() + " years old");

		ArrayList<String> schoolNames = new ArrayList<>();
		schoolNames.add(mySchool.getName());
		schoolNames.add(mySchool2.getName());
		System.out.println("All the school names are " +schoolNames);

		ArrayList<String> studentNames = new ArrayList<>();
		studentNames.add(myStudent.getStudentsName());
		studentNames.add(myStudent2.getStudentsName());
		studentNames.add(myStudent3.getStudentsName());
		studentNames.add(myStudent4.getStudentsName());
		studentNames.add(myStudent5.getStudentsName());
		System.out.println("All the names of the students in the schools are " + studentNames);
		System.out.println(mySchool.getStudent());
		}



}

