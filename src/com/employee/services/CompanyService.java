package com.employee.services;

import java.util.ArrayList;
import java.util.Scanner;

import com.employee.entities.CompanyEmpWage;
import com.employee.entities.CompanyInterface;

public class CompanyService implements CompanyInterface{
	
	Scanner scan = new Scanner(System.in);
	EmpWageBuilder obj = new EmpWageBuilder();

	@Override
	public void addCompany() {
		ArrayList<CompanyEmpWage> temp = EmpWageBuilder.getCompanyList();
		CompanyEmpWage e = getInfo();
		obj.computeEmployeeWage(e);
		temp.add(e);
		EmpWageBuilder.setCompanyList(temp);
	}
	
	@Override
	public void printCompany() {
		
		ArrayList<CompanyEmpWage> temp = EmpWageBuilder.getCompanyList();
		for (CompanyEmpWage employee : temp) {
			System.out.println(employee);
		}
	}
	
	@Override
	public CompanyEmpWage getInfo() {
//		scan.nextLine(); // to read the extra \n before it
		System.out.print("\n\n Please enter the name of the company: ");
		String name = scan.next();
		
		System.out.print(" Please enter the max no of working days in a month: ");
		int no_of_days = scan.nextInt();
		
		System.out.print(" Please enter the max no fo working hours in a month: ");
		int max_hours_in_month = scan.nextInt();
		
		System.out.print(" Please enter the wages per hour: ");
		int wages_per_hour = scan.nextInt();
		
		return new CompanyEmpWage(name, no_of_days, max_hours_in_month, wages_per_hour);
	}
}
