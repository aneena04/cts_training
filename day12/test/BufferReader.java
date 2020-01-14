package com.cts.test;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;
import java.io.FileReader;
import java.io.FileWriter;

public class BufferReader {

	public static void main(String[] args) throws IOException {
 		Scanner s=new Scanner(System.in);
		String Path = "C:/Users/Dell/Desktop/Java/data.txt";
		String Path2="C:/Users/Dell/Desktop/Java/data1.txt";
		
		FileReader fr = new FileReader(Path); 
        BufferedReader br = new BufferedReader(fr);
        
		
		FileWriter fr1=new FileWriter(Path2); 
        BufferedWriter br2 = new BufferedWriter (fr1);
        

        	int i;
	        while((i=br.read())!=-1) 
	        {
	        	br2.write(i);
	        	System.out.print((char)i);
	        	
	        }
	    
	}
 
}
