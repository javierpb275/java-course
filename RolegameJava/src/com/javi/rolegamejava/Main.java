package com.javi.rolegamejava;

import com.javi.rolegamejava.models.User;
import com.javi.rolegamejava.models.Warrior;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		User pepe = new User("Pepe", 50, 10, 1);
		Warrior paco = new Warrior("Paco", 50, 10, 1, 5);
		
		System.out.println("The user: " + pepe.getName() + " uses: " + pepe.fight() + " attack points");
		System.out.println("The user: " + paco.getName() + " uses: " + paco.fight() + " attack points");
		
		pepe.damage(paco.fight());
		paco.damage(pepe.fight());
		
		System.out.println("The user: " + pepe.getName() + " has: " + pepe.getHp() + " damage points");
		System.out.println("The user: " + paco.getName() + " has: " + paco.getHp() + " damage points");
		
	}

}
