package com.xworkz.building;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Building1 {
	@Value("true")
	boolean gate;
	@Value("false")
	boolean parking;

	public Building1() {
		System.out.println(this.getClass().getSimpleName());
	}

	public Building1(boolean gate, boolean parking) {
		
		this.gate = gate;
		this.parking = parking;
	}

	public void setGate(boolean gate) {
		this.gate = gate;
	}

	public void setParking(boolean parking) {
		this.parking = parking;
	}

	@Override
	public String toString() {
		return "Building1 [gate=" + gate + ", parking=" + parking + "]";
	}

}
