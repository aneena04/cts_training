package com.cts.examples.basic;

import java.util.Scanner;

public class MultiplicationTable {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("enter the number");
		int num=s.nextInt();
		for(int i=0;i<=10;i++) {
            System.out.printf("%d * %d = %d \n", num, i, num * i);
		}
	}

}
