package com.ipartek.formacion.ejercicioCondicional;

import java.util.Scanner;

/**
 * 1. Programa Java que lea un número entero por teclado y calcule si es par o
 * impar.
 * 
 * Podemos saber si un número es par si el resto de dividir el número entre 2 es
 * igual a cero. En caso contrario el número es impar
 * 
 * El operador Java que calcula el resto de la división entre dos números
 * enteros o no es el operador %
 * 
 * @author Curso
 *
 */

public class EjercicioCondicional1 {

	public static void main(String[] args) {
		
		int n;
		Scanner sc = new Scanner(System.in);
		// leemos el numero
		System.out.println("Introduce el numero: ");
		n = sc.nextInt();
		
		System.out.println(n+(n%2==0 ? " es par" : " es impar"));
		sc.close();
	}
	
}
