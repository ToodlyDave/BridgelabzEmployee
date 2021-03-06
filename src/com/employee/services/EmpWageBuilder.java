package com.employee.services;

import java.util.ArrayList;
import com.employee.entities.CompanyEmpWage;
import com.employee.entities.EmpWageInterface;

public class EmpWageBuilder implements EmpWageInterface{	
	
	private static ArrayList<CompanyEmpWage> CompanyList = new ArrayList<CompanyEmpWage>();

	public static ArrayList<CompanyEmpWage> getCompanyList() {
		return CompanyList;
	}

	public static void setCompanyList(ArrayList<CompanyEmpWage> companyList) {
		CompanyList = companyList;
	}
	
	@Override
	public void computeEmployeeWage(CompanyEmpWage e) {	
		
		final int IS_PART_TIME = 1;
		final int IS_FULL_TIME = 2;
		final int PART_TIME_HOURS = 4;
		final int FULL_TIME_HOURS = 8;	
		
		int days = 0;
		int hours = 0;
		
		int no_of_days = e.getDays();
		int max_hours_in_month = e.getHours();
		int wages_per_hour = e.getWage();
		ArrayList<String> daily_wages = e.getDaily_wages();
		
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
//						System.out.println(" skip");
						break;
					}
//					System.out.println(" part time");
					hours += PART_TIME_HOURS;
					days++;
					daily_wages.add("part time: " + (PART_TIME_HOURS * wages_per_hour));
					break;
			case IS_FULL_TIME:
					if (hours + FULL_TIME_HOURS > max_hours_in_month) {
//						System.out.println(" skip");
						break;
					}
//					System.out.println(" full time");
					hours += FULL_TIME_HOURS;
					days++;
					daily_wages.add("full time: " + (FULL_TIME_HOURS * wages_per_hour));
					break;				
			}
		}
		
		e.setDays(days);
		e.setHours(hours);
		e.setWage(hours * wages_per_hour);
		System.out.println(e);
	}
	
	
}
