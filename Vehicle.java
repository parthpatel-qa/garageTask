package com.qa.community.garagetask;

public abstract class Vehicle {
	
	//Attributes
	protected int numOfWheels = 4;
	protected String colour = "";
	protected boolean runsOnFuel = true;
	protected int price = 0;
	
	//Constructors
	
	public Vehicle() {
		super();
		this.numOfWheels = 4;
		this.colour = "";
		this.runsOnFuel = true;
		this.price = 0;
	}
	
	//Overloaded Constructors
	
	public Vehicle(int numOfWheels, String colour, boolean runsOnFuel, int price) {
		super();
		this.numOfWheels = numOfWheels;
		this.colour = colour;
		this.runsOnFuel = runsOnFuel;
		this.price = price;
	}
	

	//Getters and Setters

	public int numOfWheels() {
		return numOfWheels;
	}


	public void setNumOfWheels(int numOfWheels) {
		this.numOfWheels = numOfWheels;
	}


	public String colour() {
		return colour;
	}


	public void setColour(String colour) {
		this.colour = colour;
	}


	public boolean runsOnFuel() {
		return runsOnFuel;
	}


	public void setRunsOnFuel(boolean runsOnFuel) {
		this.runsOnFuel = runsOnFuel;
	}
	
	//Methods
	//Vehicles should all have a base price and then additional fees can
	//be added depending on the type of vehicle with override
	public void motorFees() {
		System.out.println("The total fees for this vehicles is: " + this.price);
	}
	
	

}
