package com.ipartek.formacion.ejercicioSecuencial;

import java.util.Scanner;

public class EjercicioSecuencial3 {

	public static void main(String[] args) {

		/*
		 * Escribe un programa Java que lee un número entero por teclado y obtiene y
		 * muestra por pantalla el doble y el triple de ese número.
		 */
		int n1;
		Scanner sc = new Scanner(System.in);
		// leemos el numero entero
		System.out.println("Introduce un numero entero: ");
		n1 = sc.nextInt();
		System.out.println(
				"El numero obtenido es: " + n1 + " y su doble es: " + (2 * n1) + " y su triple es: " + (3 * n1));
		sc.close();
	}

}
