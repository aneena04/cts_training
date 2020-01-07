package com.cts.test;

import java.util.Scanner;

public class ExamResult {

	public static void main(String[] args) {
			Scanner s=new Scanner(System.in);
		    System.out.println("Enter the mark1:");
		    int x=s.nextInt();
		    if(x>=75) {
		    	System.out.println("Enter the mark2:");
			    int y=s.nextInt();
			    if(y>=75) {
			    	int avg=(x+y)/2;
			    	if(avg>=80) {
						System.out.println("you are accepted");
			    	}
			    	 else {
							System.out.println("you are rejected");

				    }
			    }
			    	else {
							System.out.println("you are rejected");

				    }
			    }
		    else {
						System.out.println("you are rejected");

			    }
			    }
}