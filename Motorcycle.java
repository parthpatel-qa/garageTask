package com.qa.community.garagetask;

public class Motorcycle extends Vehicle{
	
	protected boolean skipTraffic = true;
	protected int motorPrice = 350;
	
	public Motorcycle() {
		super();
		this.skipTraffic = true;
		this.numOfWheels = 2;
		this.colour = "Red";
		this.price = 350;

	}
	

	public Motorcycle(int numOfWheels, String colour, boolean runsOnFuel) {
		super();
		this.numOfWheels = numOfWheels;
		this.colour = colour;
		this.runsOnFuel = runsOnFuel;
	}


	public Motorcycle(boolean skipTraffic) {
		super();
		this.skipTraffic = skipTraffic;
	}

	public boolean isSkipTraffic() {
		return skipTraffic;
	}

	public void setSkipTraffic(boolean skipTraffic) {
		this.skipTraffic = skipTraffic;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}
	
	
}
