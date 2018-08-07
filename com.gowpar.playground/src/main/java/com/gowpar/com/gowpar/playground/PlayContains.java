package com.gowpar.com.gowpar.playground;

import java.util.ArrayList;
import java.util.List;

public class PlayContains {
	
	public static void main(String[] args) {
		
		List<String> listToTest = new ArrayList<String>();
		boolean hasHorse = false;
		
		listToTest.add("Dog");
		listToTest.add("Cat");
		listToTest.add("Mouse");
		listToTest.add("Rabbit");
		listToTest.add("Horse");
		
		hasHorse = listToTest.contains("Horse");
		
		System.out.println(hasHorse);
		
	}

}
