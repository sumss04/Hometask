package com.usa.homework.sum;

import java.util.ArrayList;

public class ArrayList12233 {

	public static void main(String[] args) {
		int maxSalary=5000;
		ArrayList<Integer> salary=new ArrayList<Integer>();
	salary.add(3000);
	salary.add(4000);
	salary.add(5000);
		//System.out.println(salary.size());
		//System.out.println(salary);
		
		for(int i=0;i<salary.size();i++) {
			//System.out.println(salary.get(i));
			if(maxSalary==salary.get(i) ) {
				System.out.println(salary.get(i) );
			}
		}
		
	}

}
