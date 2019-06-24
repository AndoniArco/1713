package com.ipartek.formacion.ejercicioIterativo;

import java.util.Scanner;

/**
 * Programa Java que muestre los números del 1 al 100 utilizando la instrucción
 * for.
 * 
 * @author Curso
 *
 */

public class EjercicioIterativo7_3 {

	public static void main(String[] args) {

		int n;
		Scanner sc = new Scanner(System.in);
		//Cogemos el numero
		System.out.println("Introduzca el numero de repeticiones: ");
		n = sc.nextInt();
		System.out.println("Numeros del 1 hasta "+n);

		for (int i = 1; i <= n; i++) {
			System.out.println(i);
		}
		sc.close();
	}
	

}
