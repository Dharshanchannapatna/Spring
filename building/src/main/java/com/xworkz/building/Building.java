package com.xworkz.building;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component

public class Building {
	@Value("2")
	int noOfFloors;
	@Value("blue")
	String colour;
	@Autowired
	Building1 building1;

	public Building() {
		System.out.println(this.getClass().getSimpleName());
	}

	public Building(int noOfFloors, String colour,Building1 building1) {
        this.building1=building1;
		this.noOfFloors = noOfFloors;
		this.colour = colour;
	}

	public void setNoOfFloors(int noOfFloors) {
		this.noOfFloors = noOfFloors;
	}

	public void setColour(String colour) {
		this.colour = colour;
	}

	public void setBuilding1(Building1 building1) {
		this.building1 = building1;
	}

	@Override
	public String toString() {
		return "Building [noOfFloors=" + noOfFloors + ", colour=" + colour + ", building1=" + building1 + "]";
	}

	
}
