package com.ipartek.formacion.ejercicioCondicional;

import java.util.Scanner;

/**
 * 2. Programa que lea un n�mero entero y muestre si el n�mero es m�ltiplo de
 * 10.
 * 
 * Podemos comprobar si un n�mero entero es m�ltiplo de 10 si al dividirlo por
 * 10 es resto de esta divisi�n es cero.
 * 
 * @author Curso
 *
 */

public class EjercicioCondicional2 {

	public static void main(String[] args) {
		
		int n;
		Scanner sc = new Scanner(System.in);
		// leemos el numero
		System.out.println("Introduce el numero: ");
		n = sc.nextInt();
		
		System.out.println(n+(n%10==0 ? " es multiplo de 10" : " no es multiplo de 10"));
		sc.close();
		
	}
	
}
