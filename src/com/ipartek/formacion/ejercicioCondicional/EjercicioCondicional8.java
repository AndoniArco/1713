package com.ipartek.formacion.ejercicioCondicional;

import java.util.Scanner;

/**
 * Calcular el mayor de tres números enteros en Java.
 * 
 * El programa lee por teclado tres números enteros y calcula y muestra el mayor
 * de los tres.
 * 
 * @author Curso
 *
 */

public class EjercicioCondicional8 {

	public static void main(String[] args) {

		int n1, n2, n3;
		Scanner sc = new Scanner(System.in);
		// leemos el primer numero
		System.out.println("Introduce el primer numero: ");
		n1 = sc.nextInt();
		// leemos el segundo numero
		System.out.println("Introduce el segundo numero: ");
		n2 = sc.nextInt();
		// leemos el tercer numero
		System.out.println("Introduce el tercer numero: ");
		n3 = sc.nextInt();
		if (n1 > n2) {
			if (n1 > n3) {
				System.out.println("El mayor numero es: " + n1);
			} else {
				System.out.println("El mayor numero es: " + n3);
			}
		} else if (n2 > n3) {
			System.out.println("El mayor numero es: " + n2);
		} else {
			System.out.println("El mayor numero es: " + n3);
		} 

		sc.close();
	}

}
