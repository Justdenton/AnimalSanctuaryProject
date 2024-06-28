package com.skilldistillery.sanctuary;

import java.util.Scanner; 

public class AnimalSanctuaryApp {
	
// AnimalSanctuaryApp has a non-static field of type Sanctuary.
	private 
	
// AnimalSanctuaryApp will also have a field for a Scanner.
	private Scanner scanner; 
	
	public static void main(String[] args) {
		AnimalSanctuaryApp app = new AnimalSanctuaryApp();
		app.launchApp();
	}
	
	private void launchApp() {
		Sanctuary.Sanctuary = = Sanctuary.new
	}

	
	/*
	 * In launchApp:
Assign a new Sanctuary object to the field.

Assign a new Scanner object to the field.

In a loop, display a menu with options to:

List the animals by calling the sanctuary's listAnimals method.
Add a new animal
This will prompt the user to choose which subtype.
When the user chooses the type, construct that type of animal and add it to the sanctuary.
Prompt the user for the animal's name, and assign the name to the animal.
Add the animal to the sanctuary by passing it to the sanctuary's addAnimal method.
Start the attendant's rounds.
Quit.
	 */
}
