package com.javi.utils;

import java.util.Scanner;

public class AmazonUtil {
	
	public static int validateUserResponseMenu(int min, int max) {
		//Read user's answer
		Scanner sc = new Scanner(System.in);
		
		//Validate int answer
		while(!sc.hasNextInt()) {
			sc.next();
			System.out.println("No ingresaste una opción válida1");
			System.out.println("Intenta otra vez1");
		}
		
		int response = sc.nextInt();
		
		//Validate rank answer
		while(response < min || response > max) {
			//Ask for new answer
			System.out.println("No ingresaste una opción válida");
			System.out.println("Intenta otra vez");
			
			while(!sc.hasNextInt()) {
				sc.next();
				System.out.println("No ingresaste una opción válida");
				System.out.println("Intenta otra vez");
			}
			response = sc.nextInt();
		}
		System.out.println("Tu Respuesta fue: " + response + "\n");
		return response;
	}

}
