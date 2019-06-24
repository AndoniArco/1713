package com.ipartek.formacion.ejercicioIterativo;

import java.util.Scanner;

/**
 * Programa Java que muestre los números del 1 al N utilizando la instrucción
 * while.
 * 
 * @author Curso
 *
 */

public class EjercicioIterativo7_1 {

	public static void main(String[] args) {
		int n;
		Scanner sc = new Scanner(System.in);
		//Cogemos el numero
		System.out.println("Introduzca el numero de repeticiones: ");
		n = sc.nextInt();
		int i = 1;
		System.out.println("Numeros del 1 a "+n);
		while (n >= i) {
			System.out.println(i);
			i++;
		}
		sc.close();
	}

}