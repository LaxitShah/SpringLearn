package com;
class Student{
	
	static Student student;
	private Student() {
		
	}
	public static Student getInstance() {
		
		if(student==null) {
			student=new Student();
		}
		return student;
	}
}

public class StudentTest {
	 
	public static void main(String[] args) {
//		Student s1=new Student();
//		Student s2=new Student();
		
		Student s1=Student.getInstance();
		Student s2=Student.getInstance();
		
		
		System.out.println(s1.hashCode());
		System.out.println(s2.hashCode());
	}
}
