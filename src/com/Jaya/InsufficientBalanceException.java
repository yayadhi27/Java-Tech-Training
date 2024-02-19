package com.Jaya;

public class InsufficientBalanceException extends Exception {
	
	public void displayMessage() {
		System.out.println("Insufficient balance");
	}
}
