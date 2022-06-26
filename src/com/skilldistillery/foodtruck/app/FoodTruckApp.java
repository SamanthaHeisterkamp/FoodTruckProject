package com.skilldistillery.foodtruck.app;

import java.util.Scanner;

import com.skilldistillery.foodtruck.entities.FoodTruck;


public class FoodTruckApp {

	FoodTruckApp app = new FoodTruckApp();
	

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in); // adding scanner for user input
		// will have the menu for users and scanner
		// is the only static method in this entire project
		// Instantiating the FoodTruckApp
		FoodTruck fleetOfFoodTrucks[] = new FoodTruck[5];
		
		String foodTruckName = null;
		String foodTruckMenu = null;
		int foodTruckRating = 0;
		int foodTruckId = 0;
		
		for (int i = 0; i < fleetOfFoodTrucks.length; i++) {

			
				System.out.println("Please input FoodTruck Name: ");
				foodTruckName = sc.next();
				if (foodTruckName.equals("quit") || foodTruckName.equals("Quit")) {
					break;
				}

				System.out.println("What type of food does this FoodTruck sell?");
				foodTruckMenu = sc.next();

				System.out.println("Please rate this FoodTruck on a scale of 1-5.");
				foodTruckRating = sc.nextInt();
				
				fleetOfFoodTrucks[i].setFoodTruckName(foodTruckName);
				fleetOfFoodTrucks[i].setFoodTruckMenu(foodTruckMenu);
				fleetOfFoodTrucks[i].setFoodTruckRating(foodTruckRating);
				
				
		}

			}
		
		



	public void run() {
		// call the non-static methods in the FoodTruckApp class
	}

}
