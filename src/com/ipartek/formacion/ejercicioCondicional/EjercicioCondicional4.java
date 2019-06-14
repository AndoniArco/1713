package com.ipartek.formacion.ejercicioCondicional;

import java.util.Scanner;

/**
 * Programa que lea dos caracteres y compruebe si son iguales.
 * 
 * @author Curso
 *
 */

public class EjercicioCondicional4 {

	public static void main(String[] args) {

		char c1,c2;
		Scanner sc = new Scanner(System.in);
		// leemos el numero
		System.out.println("Introduce el primer numero: ");
		c1 = sc.nextLine().charAt(0);
		// leemos el numero
		System.out.println("Introduce el segundo numero: ");
		c2 = sc.nextLine().charAt(0);
		if(c1 == c2) {
			System.out.println("Los caracteres son iguales");
		} else {
			System.out.println("Los caracteres no son iguales");
		}
		
		sc.close();
	}

}
