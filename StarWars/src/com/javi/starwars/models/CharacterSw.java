package com.javi.starwars.models;

import java.util.Random;

public class CharacterSw {
	
	private Random rand = new Random(System.nanoTime());
	
	private int hp, attack, force, ph, lvl;
	private String name;
	
	public CharacterSw(int hp, int attack, int force, int ph, int lvl, String name) {
		super();
		this.hp = hp;
		this.attack = attack;
		this.force = force;
		this.ph = ph;
		this.lvl = lvl;
		this.name = name;
		
	}
	
	
	//sets and gets
	
	public int getHp() {
		return hp;
	}
	
	public void setHp(int hp) {
		this.hp = hp;
	}
	
	//---------------------
	
	public int getAttack() {
		return attack;
	}
	
	public void setAttack(int attack) {
		this.attack = attack;
	}
	
	//---------------------
	
	public int getForce() {
		return force;
	}
	
	public void setForce(int force) {
		this.force = force;
	}
	
	//---------------------
	
	public int getPh() {
		return ph;
	}
	
	public void setPh(int ph) {
		this.ph = ph;
	}
	
	//---------------------
	
	public int getLvl() {
		return lvl;
	}
	
	public void setLvl(int lvl) {
		this.lvl = lvl;
	}
	
	//---------------------
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	//---------------------
	
	//ATTACKS:
	
	public int physical_attack() {
		int random = rand.nextInt(2);
		return lvl * attack * random;
	}
	
	public int force_attack() {
		if(ph > 0) {
			ph--;
			return lvl = force;
		}
		else {
			return 0;
		}
	}
	
	public void damage(int hp) {
		this.hp -= hp;
	}

}
