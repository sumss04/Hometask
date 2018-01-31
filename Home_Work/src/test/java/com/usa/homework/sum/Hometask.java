package com.usa.homework.sum;

	public class Hometask {
	public static String name(){
		System.out.println("Bangladesh");
		return null;	
	}
	
	public static void salary(){
		System.out.println("25000");
	}
	public void income() {
		System.out.println("10000");
	}
	public void home() {
		System.out.println("Condo");
	}
	
public static void main(String[] args) {
	
	Hometask.name();
	Hometask.salary();
	Hometask obj =new Hometask();
	obj.income();
	Hometask obj1= new Hometask();
	obj1.home();
	
}
}
