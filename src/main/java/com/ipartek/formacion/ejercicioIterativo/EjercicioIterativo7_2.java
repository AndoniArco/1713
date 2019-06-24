package com.ipartek.formacion.ejercicioIterativo;

import java.util.Scanner;

/**
 * Programa Java que muestre los números del 1 hasta N utilizando la instrucción
 * do..while.
 * 
 * @author Curso
 *
 */

public class EjercicioIterativo7_2{

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int i = 1;
		int n;
		Scanner sc = new Scanner(System.in);
		//Cogemos el numero
		System.out.println("Introduzca el numero de repeticiones: ");
		n = sc.nextInt();
		System.out.println("Numeros del 1 hasta "+n);
		do {
			System.out.println(i);
			i++;
		} while (n >= i);

		sc.close();
	}

}