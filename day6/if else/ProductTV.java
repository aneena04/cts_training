package com.cts.test;
import java.util.Scanner;

public class ProductTV {
	
	public static void main(String[] args) {
	Scanner s=new Scanner(System.in);
	System.out.println("Products 1.CRT TV 2.LCD-14inches 3.LCD-21inches");
	System.out.println("Enter the product:");
	String product=s.nextLine();
	int SP=0;
if(product.equals("CRT TV")) {
	 SP=10000;
	 int  D=SP*5/100;
	int v=SP-D;
	 System.out.println("amount to be payed is"+v);
}

else if(product.equals("LCD-14inches")) {
	 SP=15000;
	 int D=SP*8/100;
	 int v=SP-D;
	 System.out.println("amount to be payed is"+v);
	
}
else if(product.equals("LCD-21inches")) {
	 SP=18000;
	 int D=SP*10/100;
	int v=SP-D;
	 System.out.println("amount to be payed is"+v);
}
else {
	System.out.println("product is not fond");

}


	}

}
