package com.ipartek.formacion.ejercicioIterativo;

import java.util.Scanner;

/**
 * Programa Java que muestre los números del N al 1 utilizando la instrucción
 * do..while.
 * 
 * @author Curso
 *
 */

public class EjercicioIterativo8_2 {

	public static void main(String[] args) {
		int n;
		Scanner sc = new Scanner(System.in);
		//Cogemos el numero
		System.out.println("Introduzca el numero de repeticiones: ");
		n = sc.nextInt();
		System.out.println("Numeros del "+n+" al 1");
		do {
			System.out.println(n);
			n--;
		} while (n >= 1);
		sc.close();
	}

}