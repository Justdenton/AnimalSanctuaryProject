package com.skilldistillery.sanctuary;

import java.util.Random;

public class Attendant {

// Attendant has a makeRounds method that takes an Animal array as a parameter. 
// The makeRounds will iterate over the passed Animal array.
	
	public void makeRounds(Animal[] animals) {
		Random random = new Random();
		System.out.println("Dum de dum, I love taking care of my animal friends...");
// "For each" animal of animals that I check > and if that result isn't null, then I will feed them a random amount of food.		
		for (Animal animal : animals) {
			if (animal != null) {
				System.out.println("I will feed " + animal.getName() + " " + random.nextInt(10) + " foods.");
				int foodAmt = random.nextInt(10) + 1;
				animal.eat(foodAmt);
			} else {
				System.out.println("This enclosure is empty, on to the next one.");
			}
		}
		System.out.println("Everyone's fed now, I can take a break.");
	}
}