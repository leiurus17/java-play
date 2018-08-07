package com.gowpar.com.gowpar.playground;

import org.joda.time.DateTime;
import org.joda.time.format.DateTimeFormat;

public class DateTimeAttackTest {

	public static void main(String[] args) {
		DateTime dt = new DateTime();
		
		System.out.println(dt.toString(DateTimeFormat.longDateTime()));
	}
	
}
