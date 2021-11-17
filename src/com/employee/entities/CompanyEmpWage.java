package com.employee.entities;

import java.util.ArrayList;

import com.employee.services.EmpWageBuilder;

public class CompanyEmpWage {

	private int wage = 0;    
	private int days = 0;    
	private int hours = 0;   
	private String name;
	private ArrayList<String> daily_wages = new ArrayList<>();
	
	public CompanyEmpWage(String name, int days, int hours, int wage ) {
		super();
		this.wage = wage;
		this.days = days;
		this.hours = hours;
		this.name = name;
	}	
	
	public ArrayList<String> getDaily_wages() {
		return daily_wages;
	}

	public void setDaily_wages(ArrayList<String> daily_wages) {
		this.daily_wages = daily_wages;
	}

	public int getWage() {
		return wage;
	}

	public void setWage(int wage) {
		this.wage = wage;
	}

	public int getDays() {
		return days;
	}

	public void setDays(int days) {
		this.days = days;
	}

	public int getHours() {
		return hours;
	}

	public void setHours(int hours) {
		this.hours = hours;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	@Override
	public String toString() {		
		System.out.println("\n ==== " + name + " ====");
		for (String string : daily_wages) {
			System.out.println(string);
		}
		System.out.println(" Total wages earned = " + wage);
		System.out.println(" Total working days = " + days);
		System.out.print(" Total working hours = " + hours);	
		return "";
	}
	
	
}
