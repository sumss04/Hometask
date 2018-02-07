package com.usa.homework.sum;

public class Task2 {
	//write a non-static , non-void method name
	//getbalance() and print – I have only zeros balance
	
	public String getbalance() {
		System.out.println("I have only zero balance");
		return null;
	}
	public static void main(String[] args) {
		Task2 obj=new Task2();
		obj.getbalance();
	}

}
