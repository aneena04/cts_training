package com.cts.examples.basic;

import java.util.Scanner;

public class NaturalNumbers {

	public static void main(String[] args) {
		int sum=0;
		Scanner s = new Scanner(System.in);
		System.out.println("enter the limit");
		int limit = s.nextInt();
		for (int i = 0; i <=limit; i++) {
			
			sum = sum + i;
		}
		System.out.println("sum is " + sum);
	}

}
