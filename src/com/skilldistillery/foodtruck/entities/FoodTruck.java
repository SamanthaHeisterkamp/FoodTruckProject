package com.skilldistillery.foodtruck.entities;

// does not have a main
public class FoodTruck {
	// You will define a FoodTruck class with fields for a
	// unique numeric id, a name ("TacoRific", "Mediterranean Medic", etc.),
	// food type ("Tacos", "Falafel", etc.), and a numeric rating.
	private String foodTruckName; // every truck has a name
	private String foodTruckId; // every truck has an id
	private String foodTruckMenu; // every truck has a menu
	private int foodTruckRating; // every truck has a rating

	public FoodTruck() { // creating the no arc constructor (default constructor)

	}

	public FoodTruck(String foodTruckName, String foodTruckId, String foodTruckMenu, int foodTruckRating) { // entering
																											// them in
																											// order
		this.foodTruckName = foodTruckName; // finishing the constructor
		this.foodTruckId = foodTruckId;
		this.foodTruckMenu = foodTruckMenu;
		this.foodTruckRating = foodTruckRating;

//have an array of up to five food trucks.

	}

	public String getFoodTruckName() { // used command, opt, s to generate getters and setters. Seriously. Don't type
										// them all in again. Save yourself some time.
		return foodTruckName;
	}

	public void setFoodTruckName(String foodTruckName) {
		this.foodTruckName = foodTruckName;
	}

	public String getFoodTruckId() {
		return foodTruckId;
	}

	public void setFoodTruckId(String foodTruckId) {
		this.foodTruckId = foodTruckId;
	}

	public String getFoodTruckMenu() {
		return foodTruckMenu;
	}

	public void setFoodTruckMenu(String foodTruckMenu) {
		this.foodTruckMenu = foodTruckMenu;
	}

	public int getFoodTruckRating() {
		return foodTruckRating;
	}

	public void setFoodTruckRating(int foodTruckRating) {
		this.foodTruckRating = foodTruckRating;
	}

}