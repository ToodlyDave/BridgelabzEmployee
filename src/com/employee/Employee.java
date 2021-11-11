package com.employee;

import java.util.Scanner;

public class Employee {
	

	public void computeEmployeeWage(String name, int no_of_days, int max_hours_in_month, int wages_per_hour) {	
		
		Scanner scan = new Scanner(System.in);
		
		final int IS_PART_TIME = 1;
		final int IS_FULL_TIME = 2;
		final int PART_TIME_HOURS = 4;
		final int FULL_TIME_HOURS = 8;
		
		int wage = 0;    
		int days = 0;    
		int hours = 0;   
		
		while (days < no_of_days && hours < max_hours_in_month) {
			int attendance = (int)Math.floor( (Math.random() * 10) % 3);
			
			switch (attendance) {
			case 0:
				//System.out.println(" Employee is absent. ");
				break;
				
			case IS_PART_TIME: 
					if (hours + PART_TIME_HOURS > 100) {
						break;
					}
					hours += PART_TIME_HOURS;
					days++;
					break;
			case IS_FULL_TIME:
					if (hours + FULL_TIME_HOURS > 100) {
						break;
					}
					hours += FULL_TIME_HOURS;
					days++;
					break;				
			}
		}
		
		wage = hours * wages_per_hour;
		
		System.out.println(" ==== " + name + " ====");
		System.out.println(" Total wages earned = " + wage);
		System.out.println(" Total working days = " + days);
		System.out.println(" Total working hours = " + hours);	
	}
	
}
