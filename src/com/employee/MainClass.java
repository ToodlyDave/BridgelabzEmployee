package com.employee;

public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int wage = 0;
		int days = 0, hours = 0;
		int flag = 0;
		while (days < 20 && hours <= 100) {
			int attendance = (int)Math.floor( (Math.random() * 10) % 2);
			double partTime = Math.floor( (Math.random() * 10) % 2);
			switch (attendance) {
				case 0:
					//System.out.println(" Employee is absent. ");
					break;
					
				case 1: 
					if (partTime != 0) {
						wage += 160;
						hours += 4;
						if (hours > 100) {
							flag = 1;
							//System.out.println(" we overshot " + hours);
						}
					}
					else {
						hours += 8;
						wage += 80;
						if (hours > 100) {
							flag = 2;
							//System.out.println(" we overshort full + " + hours);
						}
					}
					days++;
					//System.out.println("\n Employess is present for " + days + " days");
					//System.out.println(" The wages earned = " + wage + "\n");
					break;				
			}
		}
		
		if (flag == 1) {
			hours -= 8;
			days--;
		}
		else if (flag == 2) {
			hours -= 8;
			days--;
		}
		System.out.println(" The wages earned = " + wage);
		System.out.println(" Total working days = " + days);
		System.out.println(" Total working hours = " + hours);
	}

}
