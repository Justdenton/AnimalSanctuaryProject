package com.skilldistillery.sanctuary;

import java.util.Scanner;

// ONLY CLASS WITH MAIN
public class AnimalSanctuaryApp {

// AnimalSanctuaryApp has a non-static field of type Sanctuary.
	private Sanctuary sanctuary;

// AnimalSanctuaryApp will also have a field for a Scanner.
	private Scanner scanner;

	public static void main(String[] args) {
		AnimalSanctuaryApp app = new AnimalSanctuaryApp();
		app.launchApp();
	}

	private void launchApp() {
		// Assign a new Sanctuary object to the field.
		sanctuary = new Sanctuary();
		// Assign a new Scanner object to the field.
		scanner = new Scanner(System.in);

		// In a loop, display a menu with options to:
		// List the animals by calling the sanctuary's listAnimals method.
		// Add a new animal
		// This will prompt the user to choose which subtype.
		// When the user chooses the type, construct that type of animal and add it to
		// the sanctuary.
		// Prompt the user for the animal's name, and assign the name to the animal.
		// Add the animal to the sanctuary by passing it to the sanctuary's addAnimal
		// method.
		// Start the attendant's rounds.
		// Quit.
		while (true) {
			System.out.println("Please choose from the following options: ");
			System.out.println("1. List animals. ");
			System.out.println("2. Add a new animal. ");
			System.out.println("3. Start attendant's rounds. ");
			System.out.println("4. Quit. ");
			System.out.println();
			int choice = scanner.nextInt();

			switch (choice) {
			case 1:
				sanctuary.listAnimals();
				break;

			case 2:
				addNewAnimal();
				break;

			case 3:
				sanctuary.startAttendantRounds();
				break;

			case 4:
				System.out.println("You have chosen to quit, goodbye!");
				return;
			default:
				System.out.println("Invalid option, please try again.");

			}

		}

	}

	private void addNewAnimal() {
		System.out.println("Choose the type of animal you would like to add: ");
		System.out.println("1. Cow");
		System.out.println("2. Starfish");
		System.out.println("3. Alien");
		System.out.println("Choose an option: ");
		int animalSpec = scanner.nextInt();
		scanner.nextLine(); // clear the newline

		System.out.println("Enter the name of the animal: ");
		String name = scanner.nextLine();

		Animal animal = null;
		switch (animalSpec) {
		case 1:
			animal = new Cow(name);
			break;
		case 2:
			animal = new Starfish(name);
			break;
		case 3:
			animal = new Alien(name);
			break;
		default:
			System.out.println("Invalid option; animal not added.");
			return;
		}

		sanctuary.addAnimal(animal);

	}
}
