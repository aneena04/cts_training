package com.cts.test;

import java.util.Scanner;

public class Largest {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the first number");
		int x = s.nextInt();
		System.out.println("Enter the second number");
		int y = s.nextInt();
		System.out.println("Enter the third number");
		int z = s.nextInt();
	if(x>y) {
	
		if(x>z) {
			System.out.println("the largest number is"+x);

		}
		else {
			System.out.println("the largest number is"+z);

		}
	}
		else  {
			if(y>z) {
				System.out.println("the largest number is"+y);
			}
			else {
				System.out.println("the largest number is"+z);

			}

			}
			
		}

}
