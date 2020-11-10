package com.qa.community.garagetask;

import java.util.ArrayList;

public abstract class Garage {
	
	//Attributes
	
	protected int numOfStaff = 4;
	protected int maxVehicles = 10;
	protected String name = "CarsRus";
	protected ArrayList<Vehicle> vehicleList = new ArrayList<>();
			
	//Constructors
	
	public Garage() {}
	
	public Garage(int numOfStaff, int maxVehicles, String name) {
		super();
		this.numOfStaff = numOfStaff;
		this.maxVehicles = maxVehicles;
		this.name = name;
	}
	
	//Methods
	
	public void job() {
		System.out.println(this.name + " will fix up any vehicle");
	}
	public void cheap() {
		System.out.println(this.name + " offers the best prices in town for any vehicle!");
	}
	
	public void add(Vehicle vehicle) {
		this.vehicleList.add(vehicle);
		
	}
	
	public void remove(Vehicle bye) {
		this.vehicleList.remove(bye);
	}
	
	public void fix(Vehicle fees) {
		this.vehicleList.add(fees);
	}
	
	public void empty(Vehicle emp) {
		this.vehicleList.clear();
	}

	public int getNumOfStaff() {
		return numOfStaff;
	}

	public void setNumOfStaff(int numOfStaff) {
		this.numOfStaff = numOfStaff;
	}

	public int getMaxVehicles() {
		return maxVehicles;
	}

	public void setMaxVehicles(int maxVehicles) {
		this.maxVehicles = maxVehicles;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	} 

}
