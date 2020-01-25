package com.cts.examples.basic;

public class LeapYear {

	public static void main(String[] args) {
int year=2020;
boolean leap=false;
if((year%4==0&&year%100!=0)||year%400==0)
//				if(year%100==0) 
//				
//							if (year%400==0) 
//							leap=true;
//							
//							else
//							leap=false;
//							
//		
//				else
		leap=true;
	

else 
leap=false;

	if(leap==true) {
	System.out.println("it is a leap year");
	}
	else {
	System.out.println("it is not a leap year");
	}
	
}
}

