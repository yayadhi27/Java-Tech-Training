package com.Jaya;

public abstract class Animal {
	public abstract void sound();
	
	public void respirate() {
		System.out.println("Respirates");
		
	}
}

class Cat extends Animal {
	public void sound() {
		System.out.println("purrs");
		
	}
}

class Dog extends Animal {
	public void sound() {
		System.out.println("barks");
	}
}
