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
	//Placaje es un ataque basico y quita de da�o lo mismo que tenga de ataque pikachu
	public int placaje(){
		int da�o;
		
		if(pm1 > 0){
			da�o = ataque;
			pm1--;
		}
		else{
			da�o = 0;
		}
		
		return da�o;
	}
	
	//Rayo es un ataque un poco mas fuerte y quita el doble de da�o que el atributo ataque
	public int rayo(){
		int da�o;
		
		if(pm2 > 0){
			da�o = ataque * 2;
			pm2--;
		}
		else{
			da�o = 0;
		}
		
		return da�o;
	}
	
	//Ataque recibido:
	//Cuando un pikachu recibe da�o se llama a este metodo, que lo que hace es restarle vida
	//al pobre pikachu en funcion del da�o recibido
	public int da�o_recibido(int da�o){
		if((da�o - defensa) > 0 ){ // Porque - por - es +.
			vida -= (da�o - defensa);
		}	
		
		return vida;
	}
	
	//Datos
	//Simplemente mostrar por pantalla las datos del pikachu en cuestion
	public void mostrar(String nombre){
		System.out.println("Nombre: "+nombre+" Nivel: "+nivel+" Vida: "+vida);
	}


}
