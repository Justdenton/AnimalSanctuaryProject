package com.skilldistillery.sanctuary;

public class Sanctuary {

// A Sanctuary has an array of five Animals representing the enclosures in the sanctuary.	
	private Animal[] animals = new Animal[5];
// A Sanctuary also has an Attendant field.	
	private Attendant attendant;
	
	public Sanctuary() {
		this.attendant = new Attendant();
		
	}
	
// setAttendant allows an attendant to be assigned to its Attendant field.	
	public void setAttendant(Attendant attendant) {
		this.attendant = attendant; 
	}

// The Sanctuary has a listAnimals method that iterates over its Animal array and prints the animal's name.
	// OR "This enclosure is empty" if that array element is null.	
	public void listAnimals() {

		for (int i = 0; i < animals.length; i++) {
			if (animals[i] == null) {
				System.out.println("This enclosure is empty.");
			} else {
				System.out.println(animals[i].getName());
			}
		}
	}
// The Sanctuary has an addAnimal method that takes an Animal parameter and places it in the first empty (null) slot in the array.	
	// If there are no more empty slots, it outputs "Sorry, the sanctuary is full."
	public void addAnimal(Animal animal) {
		for (int i = 0; i < animals.length; i++) {
			if (animals[i] == null){
				animals[i] = animal;
				System.out.println(animal.getName() + " has been added.");
				return;
			}
		}
		System.out.println("Sorry, the sanctuary is full.");
	}
// Last, Sanctuary has a startAttendantRounds method which invokes its attendant's makeRounds.	
	public void startAttendantRounds() {
		attendant.makeRounds(animals);
	}
	
		
}
