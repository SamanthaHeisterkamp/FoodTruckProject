package com.skilldistillery.foodtruck.app;

import java.util.Scanner;

import com.skilldistillery.foodtruck.entities.FoodTruck;

public class FoodTruckApp {

	public static void main(String[] args) {
		FoodTruckApp app = new FoodTruckApp();
		Scanner sc = new Scanner(System.in); // adding scanner for user input
		FoodTruck foodtruck = new FoodTruck();
		// will have the menu for users and scanner
		// is the only static method in this entire project
		// Instantiating the FoodTruckApp
		String foodTruckName;
		String foodTruckMenu;
		int foodTruckRating;
		int foodTruckId;

		FoodTruck[] fleetOfFoodTrucks = new FoodTruck[5];

		System.out.println("			Welcome to: ");
		System.out.println("		      FoodTruck Rating");
		System.out.println("Where local foodies come together to rate mobile street foods. ");
		System.out.println(" ");
		for (int i = 0; i < fleetOfFoodTrucks.length; i++) {
			
			System.out.println("Please input FoodTruck Name: ");
			foodTruckName = sc.next();
			

			if (foodTruckName.equals("quit") || foodTruckName.equals("Quit")) {
				break;
			}

			System.out.println("What type of food does this FoodTruck throwdown?");
			foodTruckMenu = sc.next();

			System.out.println("Please rate this FoodTruck on a Gordon Ramsay scale of 1-5:");
			System.out.println("with 1 being : My Gran could do better! And she's dead!");
			System.out.println("and 5 being: That was f***ING delicious!");
			foodTruckRating = sc.nextInt();

			FoodTruck addFoodTruck = new FoodTruck();
			fleetOfFoodTrucks[i] = addFoodTruck;
		}
		boolean menu = true;
		while(menu) {
			System.out.println("FoodTruck Rating Menu ");
			System.out.println("Please enter a menu number.");
			System.out.println("---------------------------");
			System.out.println("(1) List all nom FoodTrucks.");
			System.out.println("(2) Average Rating of all FoodTrucks.");
			System.out.println("(3) Highest Rated FoodTruck");
			System.out.println("(4) Exit FoodTruck Rating Menu.");
			System.out.println("---------------------------");
			int menuInput = sc.nextInt();
			
			switch (menuInput) {
				case 1:
				case 2:
				case 3:
				case 4:
				
			}
			
		}
	}

	
public void run() {
		// call the non-static methods in the FoodTruckApp class
	}
}

