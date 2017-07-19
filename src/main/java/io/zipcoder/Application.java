package io.zipcoder;

import java.util.Arrays;

public class Application {
	public static void main(String[] args) {

		int numberOfPets = Console.getIntInput("How many Pets do you have?");

		Pet[] pets = new Pet[numberOfPets];
		for (int i = 0; i < numberOfPets; i++) {
			
			String name = null;
			Pet pet = null;
			
			String typeOfPet = Console.getStringInput("Do you have a Dog, Cat or Dinosaur?");
			switch (typeOfPet.toLowerCase()) {
			
			case "dog":
				name = Console.getStringInput("What is the name of your Dog?");
				pet = new Dog(name);
				break;

			case "cat":
				name = Console.getStringInput("What is the name of your Cat?");
				pet = new Cat(name);
				break;

			case "dinosaur":
				name = Console.getStringInput("What is the name of your Dinosaur?");
				pet = new Dinosaur(name);
				break;

			}
			pets[i] = pet;
			//i++;
		}

		Console.println("Hear your Pets speak : ");
		// for (int i = 0; i < numberOfPets; i++) {
		for (Pet pet : pets) {
			//Console.println(Arrays.deepToString(pets));
			//System.out.print(Arrays.asList(pets));
			//Console.println(Arrays.toString(pets) + pet.speak());
		}

	}

}
