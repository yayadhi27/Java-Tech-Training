package com.Jaya;

import java.io.*;

public class ExceptionDemo {

	public static void main(String[] args) throws Exception{
		// TODO Auto-generated method stub
		System.out.println("Entered main method...");
		System.out.println("Code is to see the result of a division");
		try {
			System.out.println(10/2);
			System.out.println("Result of a division is displayed above");
		}
		catch (Exception e) {
			System.out.println("Cannot be divide by zero");
		}
		
		System.out.println("End of main method");
	}

}
