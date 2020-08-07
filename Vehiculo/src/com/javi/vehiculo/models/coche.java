package com.javi.vehiculo.models;

public class coche extends vehiculo {
	
	private int puertas;

	//Constructor
	public coche(String color, int cv, int puertas){
		super(color, cv, 4);
		this.puertas = puertas;			
	}

	//Getter
	public int getPuertas() {
		return puertas;
	}

}
