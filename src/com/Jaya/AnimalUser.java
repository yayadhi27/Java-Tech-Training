package com.Jaya;

public class AnimalUser {

	public static void main(String[] args) {
		
		Animal[] obj = new Animal[2];
		obj[0] = new Cat();
		obj[1] = new Dog();
		
		for(Animal animal: obj) {
			animal.sound();
			animal.respirate();
			System.out.println("\n");
		}
		

	}

}
