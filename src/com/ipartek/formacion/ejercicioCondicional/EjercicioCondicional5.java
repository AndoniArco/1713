package com.ipartek.formacion.ejercicioCondicional;

import java.util.Scanner;

/**
 * Programa java que lea dos caracteres por teclado y compruebe si los dos son letras minúsculas
 * @author Curso
 *
 */

public class EjercicioCondicional5 {

	public static void main(String[] args) {
		
		char c1,c2;
		Scanner sc = new Scanner(System.in);
		// leemos el numero
		System.out.println("Introduce el primer numero: ");
		c1 = sc.nextLine().charAt(0);
		// leemos el numero
		System.out.println("Introduce el segundo numero: ");
		c2 = sc.nextLine().charAt(0);
		if (Character.isLowerCase(c1) && Character.isLowerCase(c2)){
			System.out.println("Ambos son minusculas");
		} else {
			System.out.println("Alguno de los caracteres no es minuscula");
		}
		
		sc.close();
		
	}
	
}
