package com.Jaya;

public class CalcB implements Calc{
	
	@Override
	public void sqr(int x) {
		
		System.out.println("calcB ="+(x*x));
	}
	
	@Override
	public String toString() {
		return "CalcB []";
				}
	
	

}
