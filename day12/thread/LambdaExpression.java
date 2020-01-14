package com.cts.thread;

public class LambdaExpression {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		Hello hello=new Hello()
//				{
//			public void display() {
//				System.out.println("this is lambda");
//				
//			}
//				
//			
//				};
//	Hello h= ()->{
//		System.out.println("this is lambda");
//	};
//	h.display();
//	}
		Runnable r=()->{
			System.out.println("im runnable");
		};
	
		Hello h=(a,b)-> a+b;
		
		System.out.println(h.add(10,20));
	}
}
@FunctionalInterface
interface Hello{
	
	//public void display();
	public int add(int a,int b);
	}

