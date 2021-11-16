package com.employee.services;

import java.util.ArrayList;
import java.util.Scanner;

import com.employee.entities.Company;
import com.employee.entities.Employee;

public class EmployeeService {	
	
	Scanner scan = new Scanner(System.in);
	
	
	public void addCompany() {
	
		ArrayList<Employee> temp = Company.getCompanyList();
		Employee e = getInfo();
		temp.add(e);
		computeEmployeeWage(e);
		Company.setCompanyList(temp);
	}
	
	public void printCompany() {
		
		ArrayList<Employee> temp = Company.getCompanyList();
		for (Employee employee : temp) {
			System.out.println(employee);
		}
	}

	public void computeEmployeeWage(Employee e) {	
		
		final int IS_PART_TIME = 1;
		final int IS_FULL_TIME = 2;
		final int PART_TIME_HOURS = 4;
		final int FULL_TIME_HOURS = 8;	
		
		int days = 0;
		int hours = 0;
		
		String name = e.getName();
		int no_of_days = e.getDays();
		int max_hours_in_month = e.getHours();
		int wages_per_hour = e.getWage();
		
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
					break;
			case IS_FULL_TIME:
					if (hours + FULL_TIME_HOURS > max_hours_in_month) {
//						System.out.println(" skip");
						break;
					}
//					System.out.println(" full time");
					hours += FULL_TIME_HOURS;
					days++;
					break;				
			}
		}
		
		e.setDays(days);
		e.setHours(hours);
		e.setWage(hours * wages_per_hour);
		System.out.println(e);
	}
	
	
	public Employee getInfo() {
//		scan.nextLine(); // to read the extra \n before it
		System.out.print("\n\n Please enter the name of the company: ");
		String name = scan.next();
		
		System.out.print(" Please enter the max no of working days in a month: ");
		int no_of_days = scan.nextInt();
		
		System.out.print(" Please enter the max no fo working hours in a month: ");
		int max_hours_in_month = scan.nextInt();
		
		System.out.print(" Please enter the wages per hour: ");
		int wages_per_hour = scan.nextInt();
		
		return new Employee(name, no_of_days, max_hours_in_month, wages_per_hour);
	}
		
}
