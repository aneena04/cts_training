package com.cts.test;

import java.util.Scanner;
public class Prodct {

	public static void main(String[] args) {
		int total=0;
		Scanner s=new Scanner(System.in);
		System.out.println("Products 1.apple 2.orange 3.mango");
		System.out.println("Enter the product:");

		String product=s.nextLine();
		System.out.println("Enter the quantity:");
		int quantity=s.nextInt();
		
		if(product.equals("apple")) {
			System.out.println(total=total+quantity*60);
		}
		else if(product.equals("orange")) {
			System.out.println(total=total+quantity*40);
		}
		else if(product.equals("mango")) {
			System.out.println(total=total+quantity*100);
		}
		else {
			System.out.println("product not found");
		}
		
		System.out.println("total price is"+total);
	}

}
