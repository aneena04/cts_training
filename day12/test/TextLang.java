package com.cts.test;
import java.util.*;
public class TextLang {
	static Scanner sc=new Scanner(System.in);
	public static void main(String[] args) {
		String s;
		System.out.println("Enter the message:");
		s=sc.nextLine();
		int c=1;
		while(c==1) {
			if(s.contains("yes")) {
				s=s.replace("yes", "s");
			}
			else if(s.contains("you")) {
				s=s.replace("you", "u");
			}
			else if(s.contains("today")) {
				s=s.replace("today", "2day");
			}
			else if(s.contains("why")) {
				s=s.replace("why", "y");
			}
			else {
				c=0;
			}
			System.out.println(s);

		}	}
}

