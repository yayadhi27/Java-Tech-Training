package com.Jaya;

public class PrintableUser {
	
	public static void PrintAll(Printable[] pArray) {
		for(Printable p1: pArray) {
			p1.print();
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Printable[] printables = new Printable[4];
		printables[0] = new SavingsAccount(3,"jaya",10000,true);
		printables[1] = new Rectangle("olive",3,4);
		printables[2] = new CurrentAccount(4,"kirthi",10000,500000);
		printables[3] = new Circle("black",7);
		
		PrintableUser.PrintAll(printables);
		
	}

}
