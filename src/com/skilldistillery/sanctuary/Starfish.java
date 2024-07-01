package com.skilldistillery.sanctuary;

public class Starfish extends Animal {
	
// private static String noise field set to the noise that species of animal makes.	
	// Override the inherited makeNoise method, so that it prints the value of the noise static field.
	private static String noise = "Leedle Leedle Leddle Lee!";
	
	public Starfish(String name) {
		super(name);
	}
	
// Override the inherited makeNoise method, so that it prints the value of the noise static field.	
	@Override
	public void makeNoise() {
		System.out.println(noise);
	}
// 	Override the inherited eat method to specialize it for that animal to make that animal's noise, and describe what it's eating.
// EXAMPLE : ("Moo.", "I love eating these 9 hays.").
	@Override
	public void eat(int amount) {
		System.out.println("I love chomping " + amount + " Krabby patties!");
	}
	

}
