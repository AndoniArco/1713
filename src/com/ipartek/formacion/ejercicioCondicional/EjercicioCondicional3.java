package com.ipartek.formacion.ejercicioCondicional;

import java.util.Scanner;

/**
 * Programa que lea un carácter por teclado y compruebe si es una letra mayúscula
 * @author Curso
 *
 */

public class EjercicioCondicional3 {

	public static void main(String[] args) {
		
		char c;
		Scanner sc = new Scanner(System.in);
		// leemos el numero
		System.out.println("Introduce el caracter: ");
		c = sc.nextLine().charAt(0);
		System.out.println(c + (Character.isUpperCase(c) ? " es mayuscula" : " no es mayuscula"));
		sc.close();
	}
	
}
