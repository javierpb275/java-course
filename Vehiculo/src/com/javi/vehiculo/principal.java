package com.javi.vehiculo;

import java.util.Scanner;
import java.util.Vector;

import com.javi.vehiculo.models.coche;
import com.javi.vehiculo.models.moto;
import com.javi.vehiculo.models.vehiculo;

public class principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//----------------------------------
		
		Vector<vehiculo> vec = new Vector<vehiculo>();
		
		vec.add(new coche("rojo", 100, 4));
		vec.add(new moto("verde", 200, false));
		
		//----------------------------------
		
		vehiculo c = new coche("rojo", 100, 4);//Polimorfismo: Objetos de tipos diferentes pero puedo meter dentro de una referencia de tipo vehiculo un objeto de tipo coche porque coche hereda de vehiculo
		vehiculo m = new moto("verde", 200, false);
		
		//----------------------------------
		
		vehiculo v;
		
		Scanner S = new Scanner(System.in);
		
		int opcion;
		
		System.out.println("Elige una opcion: ");
		opcion= S.nextInt();
		
		switch(opcion) {
		case 1:
			v = new coche("azul", 150, 4);
			break;
		case 2:
			v = new moto("amarillo", 300, false);
			break;
		default:
			v = null;
		}
		
		System.out.println("La velocidad es de: "+ v.getVelocidad());
		
		v.acelera();
		
		System.out.println("La velocidad es de: "+ v.getVelocidad());
		
		System.out.println();
		
		//----------------------------------
		
		System.out.println("La velocidad del coche es de: "+c.getVelocidad());
		System.out.println("La velocidad del moto es de: "+m.getVelocidad());
		
		System.out.println();
		//----------------------------------
		
		System.out.println("La velocidad del coche es de: "+ vec.get(0).getVelocidad());
		System.out.println("La velocidad del moto es de: "+vec.get(1).getVelocidad());
		
		System.out.println();
		//----------------------------------
		
		c.acelera();//referencia
		m.acelera();//objeto
		//----------------------------------
		
		vec.get(0).acelera();
		vec.get(1).acelera();
		//----------------------------------
		
		System.out.println("La velocidad del coche es de: "+c.getVelocidad());
		System.out.println("La velocidad del moto es de: "+m.getVelocidad());
		
		System.out.println();
		
		//----------------------------------
		
		System.out.println("La velocidad del coche es de: "+ vec.get(0).getVelocidad());
		System.out.println("La velocidad del moto es de: "+vec.get(1).getVelocidad());
		
		//c.getPuertas(); : El problema es que la comprobacion de si existe el metodo lo hace solamente en la clase padre (vehiculo), por lo tanto no podemos acceder a metodos de la clase coche

	}

}
