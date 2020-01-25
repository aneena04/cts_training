package com.cts.examples.basic;

import java.util.Scanner;

public class Alphabet {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("enter the string");
String ch=s.next()		;		
	if(ch.charAt(0)>'a'&&ch.charAt(0)<'z'||ch.charAt(0)>'A'&&ch.charAt(0)<'Z') {
		System.out.println("It is an alphabet");
	}
	else {
		System.out.println("It is not an alphabet");
	}

}
}