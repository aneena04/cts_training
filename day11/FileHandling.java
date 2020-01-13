package com.cts.test;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.util.*;
import java.io.IOException;

public class FileHandling {

	public static void main(String[] args) throws IOException {
		String Path = "C:/Users/Dell/Desktop/Java/data.txt";
		String Path2 = "C:/Users/Dell/Desktop/Java/text.txt";

		File file = new File(Path);
		System.out.println(file.canExecute());
		FileOutputStream fout = new FileOutputStream(Path2);

		System.out.println("can execte  :" + file.canExecute());
		System.out.println("can write  :" + file.canRead());
		System.out.println("can read    :" + file.canWrite());
		System.out.println("file exist    :" + file.exists());
		System.out.println("absolute path    :" + file.getAbsolutePath());
		System.out.println("file name     :" + file.getName());
		System.out.println("write data   :");
		FileInputStream fin = new FileInputStream(file);

		int i;
		while ((i=fin.read())!=-1) {
			fout.write(i);
			System.out.print((char)i);			
		}
		Scanner s = new Scanner(System.in);
		System.out.println("");

		/*String msg = "Welcome to Filehandling";
		byte[] b = msg.getBytes();
		fout.write(b);*/
		//fout.close();
		fin.close();
	}

}
