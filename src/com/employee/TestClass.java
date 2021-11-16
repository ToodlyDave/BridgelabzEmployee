package com.employee;

import java.util.ArrayList;
import java.util.Scanner;

public class TestClass {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String name;
		boolean loop = true;
		int ch;
		
		ArrayList<Employee> obj = new ArrayList<Employee>();
		
		while (loop) {
			System.out.println(" ======== ");
			System.out.println(" 1. Add company\n 2. Print Employee Details\n 3. Exit");
			System.out.print(" Please enter your choice: ");
			ch = scan.nextInt();
			
			switch(ch) {
			case 1:
				obj.add( new Employee() );
				obj.get(obj.size() - 1).getInfo();
				break;
			case 2:
				for(int i = 0; i < obj.size(); i++) {
					obj.get(i).printEmployee();
				}
				break;
			case 3:
				return;
			default: 
				System.out.println(" Please enter valid input");
				break;
			}
		}
		
		scan.close();		
	}

}
