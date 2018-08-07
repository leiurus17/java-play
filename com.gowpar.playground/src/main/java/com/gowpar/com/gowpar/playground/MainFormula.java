package com.gowpar.com.gowpar.playground;

public class MainFormula implements Formula {

	@Override
	public double calculate(int a) {
		
		a = a * a;
		
		return a;
	}
	
	public static void main(String[] args) {
		MainFormula mf = new MainFormula();
		
		System.out.println(mf.calculate(12));
		System.out.println(mf.sqrt(12));
	}

}
