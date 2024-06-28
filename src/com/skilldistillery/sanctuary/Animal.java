package com.skilldistillery.sanctuary;
// No instances of the Animal class are constructed, only objects of the subclass types. (GRADING)
public class Animal {
	
	// Private name field.
	private String name;
	
	// Constructor.
	public Animal(String name) {
		this.name = name; 
	}
	
	// public void makeNoise method.
	public void makeNoise() {
		System.out.println("prints string - animal's (animal object) noise");
	}
	
	// eat method with an int parameter - amount of food it is being fed.
		// When called - says how much food it is eating.
	public void eat(int fedFood) {
		
		System.out.println("I'm eating # of food");
		
	}

	// GET & SET for name field.
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

}
