package com.xworkz.football;

public class FootBall {
	String shape;
	boolean isAirFilled;

	public FootBall(String shape) {
		this.shape = shape;
		System.out.println(shape);
	}

	public FootBall(String shape, boolean isAirFilled) {
		this.shape = shape;
		this.isAirFilled = isAirFilled;
		System.out.println("Football shape and airfilled:" + shape + " " + isAirFilled);

	}

}
