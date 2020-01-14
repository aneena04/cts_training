package com.cts.test;

import java.util.*;  
public class Collection{  
public static void main(String args[]){  
LinkedList<String> al=new LinkedList<String>();  
al.add("100");  
al.add("20000");  
al.add("1000");  
al.add("1");  
al.addFirst("aaa");
al.addLast("mmm");
System.out.println(al.getFirst());


Iterator<String> itr=al.iterator();  
while(itr.hasNext()){  
System.out.println(itr.next());  


//ListIterator lit=al.listIterator();
while(itr.hasNext())
{
	System.out.println(itr.next());
	
}
System.out.println("---------Now In backward---------");
/*while(itr.hasPrevious())
{
	System.out.println(itr.previous());
}*/
}
}  
}  

