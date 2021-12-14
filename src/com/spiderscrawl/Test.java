package com.spiderscrawl;

public class Test {

	public static void main(String[] args) {
		
//		Student student = new Student();
		
//		Student student1 = student;
//		
//		System.out.println("Student : "+student);
//		System.out.println("Student1 : "+student1);
//		
//		student1.roll = 111;
//		student1.name = "india";
//		
//		System.out.println(student.equals(student1));
		
		
		System.out.println("..........................................");
		Student student = new Student();
		System.out.println("Student : "+student);
		
		Student student1 = new Student();
		
		System.out.println("Student1 : "+student1);
		
		student1.roll = 111;
		student1.name = "india";
		
		System.out.println(student.equals(student1));

	}

}
