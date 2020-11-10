package com.qa.community.garagetask;

public class Car extends Vehicle{
	
	protected boolean hasSunroof = true;
	protected int price = 500;

	
	public Car() {
		super();
		this.hasSunroof = true;
		this.colour = "black";
		this.price = 500;
	}
	
	

	public Car(int numOfWheels, String colour, boolean runsOnFuel) {
		super();
		this.numOfWheels = numOfWheels;
		this.colour = colour;
		this.runsOnFuel = runsOnFuel;
	}



	public Car(boolean hasSunroof) {
		super();
		this.hasSunroof = hasSunroof;
	}

	public boolean isHasSunroof() {
		return hasSunroof;
	}

	public void setHasSunroof(boolean hasSunroof) {
		this.hasSunroof = hasSunroof;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}
	
	@Override
	public void motorFees() {
		System.out.println("The total fees for this vehicles is: " + this.price);
	}
	
	

	
	
	
	
}
