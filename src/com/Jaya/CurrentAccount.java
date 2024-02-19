package com.Jaya;

public class CurrentAccount extends Account{
	double overdraftLimit;
	
	public void showODLimit() {
		System.out.println("Limit is: "+overdraftLimit);
		
	}
	@Override
	public void whatType() {
		System.out.println("Current type account");
		
	}
	public CurrentAccount() {
		super();
		// TODO Auto-generated constructor stub
	}
	public CurrentAccount(int accountId, String name, double balance, double odLimit) {
		super(accountId, name, balance);
		overdraftLimit = odLimit;
		// TODO Auto-generated constructor stub
	}

	public void print() {
		// TODO Auto-generated method stub
		System.out.println("Current account");
	}
}
