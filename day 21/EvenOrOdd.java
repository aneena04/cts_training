package com.cts.examples.basic;

import java.util.Scanner;

public class EvenOrOdd {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);   
		System.out.println("enter the number");
int num=s.nextInt();
if(num%2==0) {
	System.out.println("number is even");
}
else {
	System.out.println("number is odd");
}
	}

}
