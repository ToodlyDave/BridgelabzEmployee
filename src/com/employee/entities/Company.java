package com.employee.entities;

import java.util.ArrayList;

public class Company {
	
	private static ArrayList<Employee> CompanyList = new ArrayList<Employee>();

	public static ArrayList<Employee> getCompanyList() {
		return CompanyList;
	}

	public static void setCompanyList(ArrayList<Employee> companyList) {
		CompanyList = companyList;
	}
	
}
