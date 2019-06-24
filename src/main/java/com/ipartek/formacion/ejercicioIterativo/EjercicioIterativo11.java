package com.ipartek.formacion.ejercicioIterativo;

import java.util.Scanner;

/**
 * Programa que lea dos números enteros positivos N y M y muestre los múltiplos
 * de N que hay desde 1 hasta M. Por ejemplo si N = 4 y M = 500 el programa
 * mostrará los múltiplos de 4 desde 1 hasta 500. El valor de N deberá ser menor
 * que el valor de M. Si no se introducen valores válidos para N o M se mostrará
 * el mensaje correspondiente y se vuelven a pedir.
 * 
 * @author Curso
 *
 */

public class EjercicioIterativo11 {

	public static void main(String[] args) {

		int n1, n2;
		Scanner sc = new Scanner(System.in);

		do {
			// Cogemos el primer numero
			System.out.println("Introduzca el primer numero: ");
			n1 = sc.nextInt();
			// Cogemos el segundo numero
			System.out.println("Introduzca el segundo numero: ");
			n2 = sc.nextInt();
			if (n1 >= n2) {
				System.out.println("Debes introducir un segundo valor mayor al primero");
			}

		} while (n1 >= n2);

		System.out.println("Numeros pares entre " + n1 + " y " + n2);

		for (int i = 1; i <= n2; i++) {
			if (i % n1 == 0) {
				System.out.println(i);
			}
		}
		sc.close();

	}

}
