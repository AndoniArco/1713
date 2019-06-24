package com.ipartek.formacion.ejercicioIterativo;

import java.util.Scanner;

/**
 * Programa Java que muestre los números de N al 1 utilizando la instrucción
 * while.
 * 
 * @author Curso
 *
 */

public class EjercicioIterativo8_1 {

	public static void main(String[] args) {
		int n;
		Scanner sc = new Scanner(System.in);
		//Cogemos el numero
		System.out.println("Introduzca el numero de repeticiones: ");
		n = sc.nextInt();
		int i = 100;
		System.out.println("Numeros del "+n+" al 1");
		while (i >= 1) {
			System.out.println(i);
			i--;
		}
		sc.close();
	}

}