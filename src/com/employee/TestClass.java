package com.employee;

import java.util.Scanner;

public class TestClass {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String name;
		
		System.out.print(" Please enter the no of companies: ");
		int n = scan.nextInt();
		
		Employee obj = new Employee();
		
		for (int i = 0; i < n; i++) {
			
			scan.nextLine(); // to read the extra \n before it
			System.out.print("\n\n Please enter the name of the company: ");
			name = scan.nextLine();
			
			System.out.print(" Please enter the max no of working days in a month: ");
			int no_of_days = scan.nextInt();
			
			System.out.print(" Please enter the max no fo working hours in a month: ");
			int max_hours_in_month = scan.nextInt();
			
			System.out.print(" Please enter the wages per hour: ");
			int wages_per_hour = scan.nextInt();
			
			obj.computeEmployeeWage(name, no_of_days, max_hours_in_month, wages_per_hour);
			name = "";
		}
		scan.close();		
	}

}
