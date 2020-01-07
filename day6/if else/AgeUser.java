package com.cts.test;

import java.util.Scanner;

public class AgeUser {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
	    System.out.println("Enter the age:");
	    int x=s.nextInt();
if((x>=05)&&(x<=12)) {
    System.out.println("children");
}
else if((x>=13)&&(x<=19)) {
    System.out.println("Teenager");

}
else if((x>=20)&&(x<=35)) {
    System.out.println("young adults");

}
else if((x>=36)&&(x<=45)) {
    System.out.println("mature adults");

}
else if((x>=46)&&(x<=55)) {
    System.out.println("elders");
   

}
else if((x>=56)&&(x<=90)) {
    System.out.println("Seniors");

}
else {
    System.out.println("not available");

}
	}

}
