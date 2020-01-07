package com.cts.test;

import java.util.Scanner;

public class NumCheck {
	public static void main(String[] args) {
	Scanner s=new Scanner(System.in);
    System.out.println("Enter the number:");
    int x=s.nextInt();
    if(x>0)
    {
      System.out.println("Number is positive");
    }
    else if(x<0)
    {
      System.out.println("Number is negative");  
    }
    else
    {
        
       System.out.println("Number is zero"); 
    }

}
}

