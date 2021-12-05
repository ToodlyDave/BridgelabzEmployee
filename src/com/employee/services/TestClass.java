package com.employee.services;

import java.util.Scanner;

import com.employee.entities.CompanyEmpWage;

public class TestClass {

	public static CompanyEmpWage getInfo() {
//		scan.nextLine(); // to read the extra \n before it
		Scanner scan = new Scanner(System.in);
		System.out.print("\n\n Please enter the name of the company: ");
		String name = scan.next();
		
		System.out.print(" Please enter the max no of working days in a month: ");
		int no_of_days = scan.nextInt();
		
		if(no_of_days > 30) {
			System.out.println(" Capping no_of_days to 30 days");
			no_of_days = 30;
		}
		
		System.out.print(" Please enter the max no fo working hours in a month: ");
		int max_hours_in_month = scan.nextInt();
		
		System.out.print(" Please enter the wages per hour: ");
		int wages_per_hour = scan.nextInt();
		
		return new CompanyEmpWage(name, no_of_days, max_hours_in_month, wages_per_hour);
	}
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		boolean loop = true;
		int ch;
		
		CompanyService obj = new CompanyService();
		
		while (loop) {
			System.out.println("\n ======== ");
			System.out.println(" 1. Add company\n 2. Print Employee Details\n 3. Print Company Wage\n 4. Exit");
			System.out.print(" Please enter your choice: ");
			ch = scan.nextInt();
			
			switch(ch) {
			case 1:
				obj.addCompany(getInfo());
				break;
			case 2:
				obj.printCompany();
				break;
			case 3:
				obj.findCompany();
				break;
			case 4:
				scan.close();
				return;
			default: 
				System.out.println(" Please enter valid input");
				break;
			}
		}		
		scan.close();		
	}

}
