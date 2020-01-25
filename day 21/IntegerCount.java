package com.cts.examples.basic;

public class IntegerCount {

	public static void main(String[] args) {
int n=1977777778; int count=0; 
while(n != 0)
{
    n = n/10;
count=count+1;
}


System.out.println("count is"+count);

	}

}
