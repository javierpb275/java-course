package com.javi.starwars.models;

public class Ship {
	
	private int speed, acceleration;

	//Constructor
	public Ship(int speed, int acceleration) {
		super();
		this.speed = speed;
		this.acceleration = acceleration;
	}

	//Sets and Gets
	public int getSpeed() {
		return speed;
	}

	public void setSpeed(int speed) {
		this.speed = speed;
	}

	public int getAcceleration() {
		return acceleration;
	}

	public void setAcceleration(int acceleration) {
		this.acceleration = acceleration;
	}
	
	
	
	

}
