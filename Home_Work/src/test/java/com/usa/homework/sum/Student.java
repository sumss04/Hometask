package com.usa.homework.sum;

public class Student {
	
		//Instance variable=object level variable
		String name;
		int salary;
		
		//Static or class level variable
		static String name1;
		static int salary1;
		
		public void getName(String name) {
		// local variable     
			String a;
			int b;
			
		}
		public static void getSalary(int salary) {
			
		}
	//boy name and girl name is variable here
	
	public static void main(String[] args) {
		String boyName="Sumon";
		String girlName="Naba";
		int boySalary=1000;
		int girlSalary=1200;
		Student boy=new Student();
		Student girl=new Student();
		System.out.println(boySalary);
		System.out.println(girlSalary);
		System.out.println(boyName);
		System.out.println(girlName);
	}

}
