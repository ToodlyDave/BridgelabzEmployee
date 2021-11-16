package com.employee;

import java.util.Scanner;

public class Employee {	
	
	Scanner scan = new Scanner(System.in);
	
	private int wage = 0;    
	private int days = 0;    
	private int hours = 0;   
	private String name;

	public void computeEmployeeWage(String name, int no_of_days, int max_hours_in_month, int wages_per_hour) {	
		
		final int IS_PART_TIME = 1;
		final int IS_FULL_TIME = 2;
		final int PART_TIME_HOURS = 4;
		final int FULL_TIME_HOURS = 8;	
		
		this.name = name;
		
		while (days < no_of_days && hours < max_hours_in_month) {
			
			int attendance = (int)Math.floor( (Math.random() * 10) % 3);
			
			if (hours + PART_TIME_HOURS > max_hours_in_month && hours + FULL_TIME_HOURS > max_hours_in_month) {
				break;
			}
			
			switch (attendance) {
			case 0:
				//System.out.println(" Employee is absent. ");
				break;
				
			case IS_PART_TIME: 
					if (hours + PART_TIME_HOURS > max_hours_in_month) {
						System.out.println(" skip");
						break;
					}
					System.out.println(" part time");
					hours += PART_TIME_HOURS;
					days++;
					break;
			case IS_FULL_TIME:
					if (hours + FULL_TIME_HOURS > max_hours_in_month) {
						System.out.println(" skip");
						break;
					}
					System.out.println(" full time");
					hours += FULL_TIME_HOURS;
					days++;
					break;				
			}
		}
		
		wage = hours * wages_per_hour;
		
		printEmployee();
	}
	
	
	public void getInfo() {
//		scan.nextLine(); // to read the extra \n before it
		System.out.print("\n\n Please enter the name of the company: ");
		String name = scan.nextLine();
		
		System.out.print(" Please enter the max no of working days in a month: ");
		int no_of_days = scan.nextInt();
		
		System.out.print(" Please enter the max no fo working hours in a month: ");
		int max_hours_in_month = scan.nextInt();
		
		System.out.print(" Please enter the wages per hour: ");
		int wages_per_hour = scan.nextInt();
		
		computeEmployeeWage(name, no_of_days, max_hours_in_month, wages_per_hour);
	}
	
	public void printEmployee() {
		System.out.println(" ==== " + name + " ====");
		System.out.println(" Total wages earned = " + wage);
		System.out.println(" Total working days = " + days);
		System.out.println(" Total working hours = " + hours);	
	}
}
