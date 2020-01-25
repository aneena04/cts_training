package com.cts.examples.basic;

import java.util.Scanner;

public class GCD {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("enter the first number");
		int n1 = s.nextInt();
		System.out.println("enter the second number");
		int n2=s.nextInt();
		int gcd=1;
		for(int i=1;i<=n1&&i<=n2;i++) {
			if(n1 % i == 0 && n2 % i == 0) {
				 gcd=i;
			}

		}
		System.out.println("gcd of "+n1+" and "+n2+" is "+gcd );

	}

}
