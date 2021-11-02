package com.employee;

public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double attendance = Math.floor( (Math.random() * 10) % 2);
		double partTime = Math.floor( (Math.random() * 10) % 2);
		int wage;
		if (attendance == 0) {
			System.out.println(" Employee is absent. ");
		}
		else {
			if (partTime != 0) {
				wage = 160;
			}
			else {
				wage = 160;
			}
			System.out.println(" Employess is present");
			System.out.println(" The wages earned = " + wage);
		}
	}

}
