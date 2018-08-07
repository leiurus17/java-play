package com.gowpar.com.gowpar.playground;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class LambdaExpressions {

	public static void main(String[] args) {

		List<String> names = Arrays.asList("Peter", "Anna", "Mike", "Xenia");
		
		System.out.println(names);
		
		Collections.sort(names, new Comparator<String>() {
			
			@Override
			public int compare(String a, String b) {
				return b.compareTo(a);
			}
		});
		
		System.out.println(names);
		
		List<String> namesLambda = Arrays.asList("Peter", "Anna", "Mike", "Xenia");

		System.out.println(namesLambda);
		
		Collections.sort(namesLambda, (String a, String b) -> {
			return b.compareTo(a);
		});
		
		System.out.println(namesLambda);
	}
}
