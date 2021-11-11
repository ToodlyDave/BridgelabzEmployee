package com.employee;

public class Employee {
	
	private static final int NO_OF_DAYS = 20;
	private static final int MAX_HOURS_IN_MONTH = 100;
	private static final int WAGES_PER_HOUR = 20;
	private static final int IS_PART_TIME = 1;
	private static final int IS_FULL_TIME = 2;
	private static final int PART_TIME_HOURS = 4;
	private static final int FULL_TIME_HOURS = 8;

	public void computeEmployeeWage() {		
		int wage = 0;    
		int days = 0;    
		int hours = 0;   
		
		while (days < NO_OF_DAYS && hours < MAX_HOURS_IN_MONTH) {
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
		
		wage = hours * WAGES_PER_HOUR;
		
		System.out.println(" Total wages earned = " + wage);
		System.out.println(" Total working days = " + days);
		System.out.println(" Total working hours = " + hours);	
	}
	
}
