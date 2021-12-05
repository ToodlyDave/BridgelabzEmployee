package com.employee.services;

import java.util.ArrayList;
import java.util.Scanner;

import com.employee.entities.CompanyEmpWage;
import com.employee.entities.CompanyInterface;

public class CompanyService implements CompanyInterface {

	Scanner scan = new Scanner(System.in);
	EmpWageBuilder obj = new EmpWageBuilder();

	@Override
	public void addCompany(CompanyEmpWage e) {
		ArrayList<CompanyEmpWage> temp = EmpWageBuilder.getCompanyList();
//		CompanyEmpWage e = getInfo();
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
	public void findCompany() {
		ArrayList<CompanyEmpWage> temp = EmpWageBuilder.getCompanyList();

		System.out.println(" Please enter the name of the company: ");
		String name = scan.next();

		for (CompanyEmpWage companyEmpWage : temp) {
			if (companyEmpWage.getName().equals(name)) {
				System.out.println("The total wages for this company: " + companyEmpWage.getWage());
				return;
			}
		}

		System.out.println(" Company of this name does not exist!");
	}
}
