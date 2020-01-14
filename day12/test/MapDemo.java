package com.cts.test;
//import java.util.HashMap;
//import java.util.Hashtable;
import java.util.LinkedHashMap;

import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
public class MapDemo {

	public static void main(String[] args) {
//Map<String,Integer> map=new HashMap<String,Integer>();
		LinkedHashMap<String,Integer> map=new LinkedHashMap<String,Integer>();

		
		//Hashtable<String,Integer> map=new Hashtable<String, Integer>();
map.put("java", 2000);
map.put("C", 8000);
map.put("Python", 5000);
//map.put(null,9000);

System.out.println(map);
System.out.println(map.containsKey("java"));
System.out.println(map.containsValue(10000));
map.replace("java",2000,6000);
System.out.println(map);
 Set<Entry<String,Integer>> entries=map.entrySet();
//for(Map.Entry<String,Integer> entry :map.entrySet()) {
//	System.out.println(entry.getKey()+"............"+entry.getValue());
	//System.out.println(entry.getKey()+"===="+entry.getValue());


//} 
for(Map.Entry<String,Integer> entry :map.entrySet()) {
	//System.out.println(entry.getKey()+"............"+entry.getValue());
	System.out.println(entry.getKey()+"===="+entry.getValue());

}
	} 
	

}  