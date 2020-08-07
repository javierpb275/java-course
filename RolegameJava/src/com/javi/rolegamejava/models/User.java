package com.javi.rolegamejava.models;

public class User {
	
	//public: todos pueden acceder a esos atributos
	//private: solo yo (laclase en la que se encuentra) puedo acceder a esos atributos
	//protected: solo yo y mis hijos pueden acceder a estos atributos
	
	private String name;
	protected int hp, attack, defense; //hp: puntos de salud
	
	//Constructor:
	public User(String name, int hp, int attack, int defense){
		this.name = name;
		this.hp = hp;
		this.attack = attack;
		this.defense = defense;
	}
	
	
	//Getters:
	public String getName() {
		return name;
	}
	public int getHp() {
		return hp;
	}

	//Metodos:
	//Cuantos puntos de daño puedo quitarle a otro personaje
	public /*final*/ int fight(){ //Cuando ponemos final en un metodo, no se puede sobreescribir
		int aux = attack;
		
		if(aux < 0){
			aux = 0;
		}
		return aux;
	}
	
	//Cuantos puntos de daño me van a quitar a mi
	public void  damage(int points){
		hp -= points;
	}

}
