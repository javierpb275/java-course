package com.javi.pokemon;

import java.util.Scanner;

import com.javi.models.Battle;
import com.javi.models.Pokemon;
import com.javi.models.Trainer;

public class Main {
	
	public static void main(String[] args){
		Scanner s = new Scanner(System.in);
		String nombre;
		int opcion;
		
		System.out.println("Cual es tu nombre?");
		nombre = s.nextLine();
		
		//Pokemon pepe = new Pokemon(1, 2, 3, 4); NO puedes hacer esto, ya que se trata de una clase abstracta
		
		Trainer yo = new Trainer(nombre);
		Battle bat = new Battle(yo);
		
		do{
			
			yo.mostrar_mochila();
			System.out.println();
			System.out.println();
			
			System.out.println("Elige una opcion: ");
			System.out.println("1) Empezar una batalla");
			System.out.println("2) Salir");
			
			opcion = s.nextInt();
			
			if(opcion == 1){
				bat.comienza();
			}
			
		}while(opcion != 2);
	}


}
