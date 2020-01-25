package com.cts.examples.basic;

import java.util.Scanner;

public class Factorial {

	public static void main(String[] args) {
		int fact=1;
		Scanner s=new Scanner(System.in);
		System.out.println("enter the number");
		int num=s.nextInt();
		for(int i=num;i>0;i--) {
			fact=fact*i;
			
		}
		System.out.println("Factorial of number is "+fact);
		
	}

}
