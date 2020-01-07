package com.cts.test;

import java.util.Scanner;

public class Rectangle {
	public static  void main(String[] args) {
		Scanner s=new Scanner(System.in);
	    System.out.println("Enter the length:");
	    int x=s.nextInt();
	    System.out.println("Enter the breadth:");
	    int y=s.nextInt();
	    Area area=new Area();
	    area.area(x, y);
	    area.perimeter(x, y);
	  

	}
	}

	class Area{
	public void area(int x, int y)
	{
	    System.out.println("The area is :"+(x*y));
	}
	public void perimeter( int x, int y)
	{
	    System.out.println("The perimeter is :"+((2*x)+(2*y)));
	}

	}
	
