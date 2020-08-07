package com.javi.vehiculo.models;

public class moto extends vehiculo {
	
private boolean reparar_cadena;
	
	//Constructor
	public moto(String color, int cv, boolean reparar_cadena){
		super(color, cv, 2);
		this.reparar_cadena = reparar_cadena;
	}
	
	//metodos
	public void acelera(){
		velocidad += 20;
	}

}
