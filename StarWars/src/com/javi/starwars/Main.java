package com.javi.starwars;

import java.util.Random;

import com.javi.starwars.models.CharacterSw;
import com.javi.starwars.models.ListOfShips;

public class Main {

	public static void main(String[] args) {
		
		Random rand = new Random(System.nanoTime());
		
		//Vector/Array of objects:
		ListOfShips ships = new ListOfShips(4);
		
		ships.sample(2);
		System.out.println();
		//-----------------------
		
		int random, hp;
		boolean jedi = true, sith = true;
		
		
		CharacterSw luke = new CharacterSw(300, 15, 10, 2, 2, "Luke");
		CharacterSw yoda = new CharacterSw(200, 5, 60, 10, 10, "Yoda");
		CharacterSw darth_vader = new CharacterSw(500, 10, 40, 4, 5, "Darth Vader");
		
		
		/*
		luke.setAttack(15);
		luke.setForce(10);
		luke.setLvl(2);
		luke.setName("Luke");
		luke.setPh(2);
		luke.setHp(300);
		
		darth_vader.setAttack(10);
		darth_vader.setForce(40);
		darth_vader.setLvl(5);
		darth_vader.setName("Darth Vader");
		darth_vader.setPh(4);
		darth_vader.setHp(500);
		
		yoda.setAttack(5);
		yoda.setForce(60);
		yoda.setLvl(10);
		yoda.setName("Yoda");
		yoda.setPh(10);
		yoda.setHp(200);
		*/
		
		System.out.println(luke.getName() + " hp: " + luke.getHp());
		System.out.println(darth_vader.getName() + " hp: " + darth_vader.getHp());
		System.out.println(yoda.getName() + " hp: " + yoda.getHp());
		System.out.println();
		System.out.println();
		
		do {
			
			random = rand.nextInt(1);
			if(random == 0) {
				hp = luke.physical_attack();
			}
			else {
				hp = luke.force_attack();
			}
			
			System.out.println(luke.getName() + " attacks: " + hp);
			darth_vader.damage(hp);
			
			//-----------------
			
			random = rand.nextInt(1);
			if(random == 0) {
				hp = yoda.physical_attack();
			}
			else {
				hp = yoda.force_attack();
			}
			
			System.out.println(yoda.getName() + " attacks: " + hp);
			darth_vader.damage(hp);
			
			//----------------------
			
			if(darth_vader.getHp() > 0) {
				random = rand.nextInt(1);
				if(random == 0) {
					hp = darth_vader.physical_attack();
				}
				else {
					hp = darth_vader.force_attack();
				}
				
				System.out.println(darth_vader.getName() + " attacks: " + hp);
				
				random = rand.nextInt(1);
				if(random == 0) {
					luke.damage(hp);
				}
				else {
					yoda.damage(hp);
				}
				
				if(luke.getHp() <= 0 && yoda.getHp() <= 0) {
					jedi = false;
				}
				
			}
			else {
				sith = false;
			}
			
			//---------------------------------------------
			
			System.out.println();
			System.out.println(luke.getName() + " hp: " + luke.getHp());
			System.out.println(darth_vader.getName() + " hp: " + darth_vader.getHp());
			System.out.println(yoda.getName() + " hp: " + yoda.getHp());
			System.out.println();
			System.out.println();
			
			try {
				System.in.read();
			} catch(Exception e) {}
			

		} while(jedi && sith);

	}
	
}
