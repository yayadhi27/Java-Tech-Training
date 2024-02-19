package com.Jaya;

public abstract class Account implements Printable {
	private int accountId;
	private String name;
	private double balance;
	//private String type;
	private static int counter = 0;

	public Account(int accountId, String name, double balance) {
		super();
		this.accountId = accountId;
		this.name = name;
		this.balance = balance;
		counter++;
		System.out.println("Parameterized constructor");
	}
	
	public static void displayCounter() {
		System.out.println("Counter value:"+counter);
	}
	public abstract void whatType();
	public int getAccountId() {
		return accountId;
	}
	public void setAccountId(int accountId) {
		this.accountId = accountId;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getBalance() {
		return balance;
	}
	public void setBalance(double balance) {
		this.balance = balance;
	}
	public Account() {
		super();
		System.out.println("Non parameterized constructor");
	}
	
	public void checkBalance() {
		System.out.println("Current balance is: "+this.balance);
		
	}
	
	public void withdraw(double amt) {
		try {
				if(balance > amt)
					balance -= amt;
				else
					throw new InsufficientBalanceException();
		} catch (InsufficientBalanceException e) {
			e.displayMessage();
		}
		finally {
			this.checkBalance();
		}
		
	}
	
	public void deposit(double amt) {
		balance += amt;
		this.checkBalance();
	}

	public abstract void print();
	
	

}
