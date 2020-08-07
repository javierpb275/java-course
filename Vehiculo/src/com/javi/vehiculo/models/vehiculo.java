package com.javi.vehiculo.models;

public class vehiculo {
	
	private String color;
	private int cv, ruedas;
	protected int velocidad;
	
	//Constructor
	public vehiculo(String color, int cv, int ruedas){
		this.color = color;
		this.cv = cv;
		this.ruedas = ruedas;
		velocidad = 0;
	}
	
	//Gets
	public int getCv() {
		return cv;
	}
	public int getRuedas() {
		return ruedas;
	}
	public int getVelocidad() {
		return velocidad;
	}
	
	//metodos
	public void acelera(){
		velocidad += 10;
	}
		
	public void frena(){
		velocidad = 0;
	}

}
