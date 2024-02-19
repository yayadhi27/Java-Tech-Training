package com.Jaya;

public class SavingsAccount extends Account {
	boolean isSaving = true;
	
	public void print() {
		System.out.println("It is a savings account");
	}
	public void isItASavingAccount() {
		System.out.println("Is it a saving account?"+isSaving);
	}
	@Override
	public void whatType() {
		System.out.println("This is a savings type account");
		
	}
	public SavingsAccount() {
		super();
		// TODO Auto-generated constructor stub
	}
	public SavingsAccount(int accountId, String name, double balance, boolean isSaving) {
		super(accountId, name, balance);
		isSaving = true;
		// TODO Auto-generated constructor stub
	}
}
