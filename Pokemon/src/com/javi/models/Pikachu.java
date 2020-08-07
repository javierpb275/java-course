package com.javi.models;

import java.util.Random;

public class Pikachu extends Pokemon{
	
	
	private int pm1, pm2; //Veces que se pueden realizar los ataques

	private Random rand = new Random(System.nanoTime());
	
	//Constructor
	
	public Pikachu(){		
		nivel = rand.nextInt(5) + 1; //Le sumo 1 al nivel, para tener como minimo el nivel 1
		
		ataque = 10 * nivel;
		defensa = 5 * nivel;
		vida = 10 * nivel;
		
		pm1 = 10;
		pm2 = 10;
	}
	
	//Getters
	
	public int getPm1(){
		return pm1;
	}
	
	public int getPm2(){
		return pm2;
	}
	
	//Ataques: Deben de tener el PM de cada ataque que sea mayor que 0, sino no se realiza
	//el ataque.
	//Placaje es un ataque basico y quita de daño lo mismo que tenga de ataque pikachu
	public int placaje(){
		int daño;
		
		if(pm1 > 0){
			daño = ataque;
			pm1--;
		}
		else{
			daño = 0;
		}
		
		return daño;
	}
	
	//Rayo es un ataque un poco mas fuerte y quita el doble de daño que el atributo ataque
	public int rayo(){
		int daño;
		
		if(pm2 > 0){
			daño = ataque * 2;
			pm2--;
		}
		else{
			daño = 0;
		}
		
		return daño;
	}
	
	//Ataque recibido:
	//Cuando un pikachu recibe daño se llama a este metodo, que lo que hace es restarle vida
	//al pobre pikachu en funcion del daño recibido
	public int daño_recibido(int daño){
		if((daño - defensa) > 0 ){ // Porque - por - es +.
			vida -= (daño - defensa);
		}	
		
		return vida;
	}
	
	//Datos
	//Simplemente mostrar por pantalla las datos del pikachu en cuestion
	public void mostrar(String nombre){
		System.out.println("Nombre: "+nombre+" Nivel: "+nivel+" Vida: "+vida);
	}


}
