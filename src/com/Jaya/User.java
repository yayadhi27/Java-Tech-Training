package com.Jaya;

public class User {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Account a1 = new Account();
		//a1.checkBalance();
		//Account a2 = new Account(562,"jaya",31000);
		//a2.checkBalance();
		
		Account a3 = new SavingsAccount(3,"jaya",1000,true);
		Account.displayCounter();
		Account a4 = new CurrentAccount(4,"hari",1000,500000);
		Account.displayCounter();
		
		//a1.whatType();
		//a2.whatType();
		a3.whatType();
		a4.whatType();
		
		a3.print();
		a4.print();
		
		a3.withdraw(590);
		a4.withdraw(900);
		
		
		
		
		
		
		
		/*a1.setAccountId(123);
		a1.setName("A1");
		a1.setBalance(15000);
		a1.checkBalance();
		a1.withdraw(7000);
		a2.withdraw(36000);
		a2.deposit(10000);
		a2.withdraw(35000);*/
		
	}

}
