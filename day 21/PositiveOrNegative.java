package com.cts.examples.basic;

import java.util.Scanner;

public class PositiveOrNegative {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("enter the number");
		double num=s.nextDouble();
		if(num>0.0) {
			System.out.println("number is positive");
		}
		else if(num<0.0) {
			System.out.println("number is negative");

		}			

		else {
			System.out.println("number is zero");
		}
	}

}
