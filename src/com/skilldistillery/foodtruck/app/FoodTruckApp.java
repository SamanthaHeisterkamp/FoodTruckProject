package com.skilldistillery.foodtruck.app;

import java.util.Scanner;

import com.skilldistillery.foodtruck.entities.FoodTruck;


public class FoodTruckApp {

	private FoodTruck fleetOfFoodTrucks[]; // an array

	public static void main(String[] args) {
		// will have the menu for users and scanner
		// is the only static method in this entire project
		FoodTruckApp app = new FoodTruckApp(); // Instantiating the FoodTruckApp
		app.run();
		Scanner sc = new Scanner(System.in); // adding scanner for user input
		String foodTruckName = null;
		String foodTruckMenu = null;
		int foodTruckRating = 0;
			//for (int i = 0; i <= fleetOfFoodTrucks; i++) {

				System.out.println("Please input FoodTruck Name: ");
				foodTruckName = sc.next();
				

				System.out.println("What type of food does this FoodTruck sell?");
				foodTruckMenu = sc.next();

				System.out.println("Please rate this FoodTruck on a scale of 1-5.");
				foodTruckRating = sc.nextInt();

			}
		
		



	public void run() {
		// call the non-static methods in the FoodTruckApp class
	}
}
