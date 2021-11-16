package com.employee.services;

import java.util.ArrayList;
import java.util.Scanner;

import com.employee.entities.Company;
import com.employee.entities.Employee;

public class CompanyService {
	
	Scanner scan = new Scanner(System.in);

	public void addCompany() {
		
		ArrayList<Employee> temp = Company.getCompanyList();
		Employee e = getInfo();
		e.objEmployeeService.computeEmployeeWage(e);
		temp.add(e);
		Company.setCompanyList(temp);
	}
	
	public void printCompany() {
		
		ArrayList<Employee> temp = Company.getCompanyList();
		for (Employee employee : temp) {
			System.out.println(employee);
		}
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
