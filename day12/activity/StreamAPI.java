package com.cts.activity;

import java.util.ArrayList;
import java.util.stream.Collectors;
import java.util.List;

public class StreamAPI {

	public static void main(String[] args) {
	
		 
		List<String> names=new ArrayList<String>();
addNames(names);
//names.forEach(System.out::println);
List<String> lengthscale=names.stream().filter(s->s.length()>=5).collect(Collectors.toList());
lengthscale.forEach(System.out::println);
//print in cap letters
List<String> capNames=names.stream().map(name->name.toUpperCase()).collect(Collectors.toList());
//capNames.for
}

private static void addNames(List<String> names){
	names.add("Abin");
	names.add("Sai");
	names.add("Nagasri");
	names.add("Aneena Thomas");

	}
}