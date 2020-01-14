package com.cts.activity;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class SerializationDemo {

	public static void main(String[] args) {
		Employee emp1 = new Employee(101, "Abin Joshy", "Hydrabad", 22, 6678687687L, 40000.00);
		try {
			serialize(emp1,"serial.txt");
			Employee emp=(Employee) deserialize("serial.txt");
			System.out.println(emp);
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}catch(IOException e) {
		  		e.printStackTrace();

		}
		
		
		
	}
public static Object deserialize(String fileName) throws IOException, ClassNotFoundException 
{
	FileInputStream fin=new FileInputStream(fileName);
	BufferedInputStream bin=new BufferedInputStream(fin);
	ObjectInputStream in=new ObjectInputStream(bin);
Object obj=in.readObject();
return obj;
	
	
	}
public static void serialize(Object obj,String fileName)  throws IOException 
{
	
	FileOutputStream fout=new FileOutputStream(fileName);
	BufferedOutputStream br=new BufferedOutputStream(fout);
	ObjectOutputStream out=new ObjectOutputStream(br);
	out.writeObject(obj);
	out.close();
	br.close();
	fout.close();
	
}
	}

