package com.cts.examples.basic;

public class Quadratic {

	public static void main(String[] args) {
double a=1.3f;
double b=4.3f;
double c=3.4f;
double r1,r2;
double d=b*b-4*a*c;
if(d>0) {
	r1=-b+Math.sqrt(d);
	r2=-b+Math.sqrt(d);
	System.out.println("root1 is "+r1+" root2 is "+r2);
}
else if(d==0) {
	r1=r2=-b/2*a;
	System.out.println("root is "+r1);
}
else
{
	double real=-b/2*a;
	double img=Math.sqrt(-d)/(2*a);
	System.out.println(real+" "+img);
}


	}

}
