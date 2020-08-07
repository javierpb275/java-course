package com.javi.models;

public abstract class Pokemon { //Una clase Abstracta es una clase de la cual no se pueden instanciar objetos.
	
	protected int ataque, defensa, nivel, vida; //Estadisticas
	
	//Getters
		public int getNivel() {
			return nivel;
		}

		public int getAtaque() {
			return ataque;
		}

		public int getDefensa() {
			return defensa;
		}

		public int getVida() {
			return vida;
		}

}
