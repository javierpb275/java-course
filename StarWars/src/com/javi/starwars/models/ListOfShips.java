package com.javi.starwars.models;

import java.util.Random;

public class ListOfShips {
	
	private Ship[] ships;

	public ListOfShips(int listSize) {
		super();
		
		 int aux1, aux2;
		
		Random rand = new Random(System.nanoTime());
		
		ships = new Ship[listSize];
		
		for (int i = 0; i < listSize; i++) {
			aux1 = rand.nextInt(10);
			aux2 = rand.nextInt(10);
			
			ships[i] = new Ship(aux1, aux2);
			
		}
		
	}
	
	public void sample(int i) {
		Ship aux = ships[i];
		
		System.out.println("The value of the ship: " + i + " is Speed: " + aux.getSpeed() + " acceleration: " + aux.getAcceleration());
	}
	
	

}
