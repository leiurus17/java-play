package com.gowpar.com.gowpar.playground;

import java.util.ArrayList;
import java.util.Random;

public class OddEvenStream {
	
	public static void main(String[] args) {
		
		ArrayList<Integer> randomIntList = generateRandomIntList();
		
		randomIntList
			.stream()
			.map(i -> i%2 ==0)
			.forEach(System.out::println);
			
	}
	
	public static ArrayList<Integer> generateRandomIntList() {
		
		ArrayList<Integer> arrayList = new ArrayList<Integer>();
		Random random = new Random();
		
		for (int i = 0; i <= 2000; i++) {
			arrayList.add(random.nextInt(1000));
		}
		
		return arrayList;
	}

}
