package com.cts.examples.basic;

import java.util.Scanner;

public class Fibonacci {

	public static void main(String[] args) {
		int a=0;int b=1;
		Scanner s = new Scanner(System.in);
		System.out.println("enter the limit");
		int limit = s.nextInt();

		int fib=0;
		for(int i=0;i<=limit;i++) {
			System.out.println(a);
			int sum=a+b;
			a=b;
			b=sum;
		}
		
		
		
		
	}
}
