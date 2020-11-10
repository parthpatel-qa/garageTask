package com.qa.community.garagetask;

public class Tesla extends Vehicle{
	
	protected boolean isSilent = true;
	protected int teslaPrice = 650;

	public Tesla() {
		super();
		this.colour = "white";
		this.isSilent = true;
		this.runsOnFuel = false;
		this.price = 650;
		
	}
	
	

	public Tesla(int numOfWheels, String colour, boolean runsOnFuel) {
		super();
		this.numOfWheels = numOfWheels;
		this.colour = colour;
		this.runsOnFuel = runsOnFuel;
	}



	public Tesla(boolean isSilent) {
		super();
		this.isSilent = isSilent;
	}

	public boolean isSilent() {
		return isSilent;
	}

	public void setSilent(boolean isSilent) {
		this.isSilent = isSilent;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}
	
	
}