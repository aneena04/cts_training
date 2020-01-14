package com.cts.course;
import java.util.Scanner;

public class CoursePrice {

	public static void main(String[] args) {

		StringBuffer sb=new StringBuffer();
		System.out.println("Java               5000");
		System.out.println("C                  3000");	
		System.out.println("C++                2000");
		System.out.println("Python             10000");
		System.out.println("Angular            20000");
		int price=0;


		Scanner s=new Scanner(System.in);

		System.out.println("enter your choices");
		
		String choices=s.nextLine();

		if(choices.contains("Java")) {
			sb.append("Java               5000");
			price=price+5000;
		}
	
		if(choices.contains("C")) {
			sb.append("  C                  3000");
			 price=price+3000;

		}
		
		
		if(choices.contains("C++")) {
			sb.append("   C++                2000");
		 price=price+2000;

		}
		if(choices.contains("Python")) {
			sb.append("  Python             10000");
		price=price+5000;

		}
		
		if(choices.contains("Angular")) {
			sb.append("  Angular            20000");
			 price=price+20000;

		}
	
	
		System.out.println(sb);
		System.out.println("Total price is"+price);
	
}

}
	

