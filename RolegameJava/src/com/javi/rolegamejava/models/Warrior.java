package com.javi.rolegamejava.models;

public class Warrior extends User {
	
	private int armor;

	//Constructor
	public Warrior(String name, int hp, int attack, int defense, int armor) {
		super(name, hp, attack, defense);
		
		this.armor = armor;
	}
	
	//Sobreescritura de metodos
	
	public int fight() {
		return attack * 2;
	}
	
	public void damage(int points) {
		int aux = points - armor;
		
		if(aux < 0) {
			aux = 0;
		}
		
		hp -= aux;
	}

}
