package com.cts.test;

import java.util.Scanner;

public class HoursResources {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
	    System.out.println("Enter the hours:");
	    int x=s.nextInt();
	    System.out.println("Enter the number of resources:");
		    int y=s.nextInt();
		    Prdrhr pr=new Prdrhr();
		    pr.prdct(x, y);
	
	}
}
	class Prdrhr{
		public void prdct(int x, int y)
		{
		    System.out.println("The number of prodctive hours are :"+(x*y));
			}
}