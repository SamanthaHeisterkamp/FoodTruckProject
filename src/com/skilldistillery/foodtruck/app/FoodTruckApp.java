package com.skilldistillery.foodtruck.app;

import java.util.Scanner;

import com.skilldistillery.foodtruck.entities.FoodTruck;

public class FoodTruckApp {
	private FoodTruck[] fleetOfFoodTrucks = new FoodTruck[5];

	public static void main(String[] args) {
		FoodTruckApp app = new FoodTruckApp();
		app.run();
	}

	public void run() {

		// will have the menu for users and scanner
		// is the only static method in this entire project
		// Instantiating the FoodTruckApp
		String foodTruckName = " ";
		String foodTruckMenu = " ";
		int foodTruckRating = 0;

		System.out.println("			Welcome to: ");
		System.out.println("		      FoodTruck Rating");
		System.out.println("Where local foodies come together to rate mobile street foods. ");
		System.out.println(" ");
		Scanner sc = new Scanner(System.in); // adding scanner for user input
		for (int i = 0; i < fleetOfFoodTrucks.length; i++) {

			System.out.println("Please input FoodTruck Name: ");
			foodTruckName = sc.nextLine();

			if (foodTruckName.equals("quit") || foodTruckName.equals("Quit")) {
				break;
			}

			System.out.println("What type of food does this FoodTruck throwdown?");
			foodTruckMenu = sc.nextLine();

			System.out.println(
					"Please rate this FoodTruck on a Gordon Ramsay scale of 1-5: \n with 1 being : My Gran could do better! And she's dead! \n and 5 being: That was f***ING delicious!");
			foodTruckRating = sc.nextInt();
			sc.nextLine();

			FoodTruck addFoodTruck = new FoodTruck(foodTruckName, foodTruckMenu, foodTruckRating);
			fleetOfFoodTrucks[i] = addFoodTruck;
		}
		boolean menu = true;
		while (menu) {
			

			System.out.println("FoodTruck Rating Menu ");
			System.out.println("Please enter a menu number.");
			System.out.println("---------------------------");
			System.out.println("(1) List all nom FoodTrucks.");
			System.out.println("(2) Average Rating of all FoodTrucks.");
			System.out.println("(3) Highest Rated FoodTruck");
			System.out.println("(4) Exit FoodTruck Rating Menu.");
			System.out.println("---------------------------");
			int menuInput = sc.nextInt();
			if (menuInput < 5) {

				switch (menuInput) {
				case 1:
					for (int a = 0; a < fleetOfFoodTrucks.length; a++) {
						if (fleetOfFoodTrucks[a] != null) {
							System.out.println(fleetOfFoodTrucks[a]);
						}

					}
					break;
				case 2:
					int sumRatings = 0;
					int count = 0;
					int averageOfRatings = 0;
					for (int a = 0; a < fleetOfFoodTrucks.length; a++) {
						if (fleetOfFoodTrucks[a] != null) {

							sumRatings += fleetOfFoodTrucks[a].getFoodTruckRating();
							count++;

							averageOfRatings = sumRatings / count;
						}
					}
					System.out.println("Average rating of Food Trucks is: " + averageOfRatings);
					break;
				case 3:
					int highestRated = 0;
					int counted = 0;
					for (int a = 0; a < fleetOfFoodTrucks.length; a++) {
						if (fleetOfFoodTrucks[a] != null) {

							if (highestRated < fleetOfFoodTrucks[a].getFoodTruckRating()) {
								highestRated = fleetOfFoodTrucks[a].getFoodTruckRating();
								counted = a;
							}

						}
					}
					System.out.println("Highest Rated Food Trucks is: \n " + fleetOfFoodTrucks[counted].toString());
					break;
				case 4:
					System.out.println("Thank you for rating local Food Trucks today! \n Have a NomNomNom day!");
					menu = false;
					break;
				}
			}
		}

	} // call the non-static methods in the FoodTruckApp class
}
