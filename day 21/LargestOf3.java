package com.cts.examples.basic;

import java.util.Scanner;

public class LargestOf3 {

	public static void main(String[] args) {
		 Scanner s=new Scanner(System.in);
System.out.println("enter first number");
int a=s.nextInt();
System.out.println("enter first number");
int b=s.nextInt();
System.out.println("enter first number");
int c=s.nextInt();
if(a>b) {
	if(a>c) {
	System.out.println("a is largest");
      }
	else {
		System.out.println("c is largest");
	}
	}
else 	{
	if(b>c){
	System.out.println("b is largest");
}
	else {
		System.out.println("c is largest");
	}
}
	}
}

