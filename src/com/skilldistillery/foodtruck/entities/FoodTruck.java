package com.skilldistillery.foodtruck.entities;


// does not have a main
public class FoodTruck {


	

	//have an array of up to five food trucks.
	// You will define a FoodTruck class with fields for a
	// unique numeric id, a name ("TacoRific", "Mediterranean Medic", etc.),
	// food type ("Tacos", "Falafel", etc.), and a numeric rating.
	private String foodTruckName;
	private int foodTruckId;
	private String foodTruckMenu;
	private int foodTruckRating;
	
	
	public FoodTruck() { // creating the no arc constructor (default constructor)
	}

	public FoodTruck(String foodTruckName, int foodTruckId, String foodTruckMenu, int foodTruckRating) { // entering
																											// them in
																											// order
		this.foodTruckName = foodTruckName; // finishing the constructor
		this.foodTruckId = foodTruckId;
		this.foodTruckMenu = foodTruckMenu;
		this.foodTruckRating = foodTruckRating;

	}

	public String getFoodTruckName() { // used command, opt, s to generate getters and setters. Seriously. Don't type
										// them all in again. Save yourself some time.
		return foodTruckName;
	}

	public void setFoodTruckName(String foodTruckName) {
		this.foodTruckName = foodTruckName;
	}

	public int getFoodTruckId() {
		return foodTruckId;
	}

	public void setFoodTruckId(int foodTruckId) {
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

	@Override
	public String toString() {
		String output = "FoodTruck Name: " + foodTruckName + "\n FoodTruck Id: " + foodTruckId + "\n FoodTruck Menu: "
				+ foodTruckMenu + "\n Food Truck Rating: " + foodTruckRating;
		
		return output;
	}


	}
	


	