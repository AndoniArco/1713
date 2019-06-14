package com.ipartek.formacion.ejercicioCondicional;

import java.util.Scanner;

/**
 * Programa que lea dos números por teclado y muestre el resultado de la
 * división del primer número por el segundo. Se debe comprobar que el divisor
 * no puede ser cero.
 * 
 * @author Curso
 *
 */

public class EjercicioCondicional7 {

	public static void main(String[] args) {

		double n1, n2;
		Scanner sc = new Scanner(System.in);
		// leemos el primero numero
		System.out.println("Introduce el primer numero: ");
		n1 = sc.nextDouble();
		// leemos el segundo numero
		System.out.println("Introduce el segundo numero: ");
		n2 = sc.nextDouble();
		if (n2 == 0) {
			System.out.println("El divisor es 0 y no podemos realizar la division");
		} else {
			System.out.println("La division de los numeros es: " + n1 / n2);
		}

		sc.close();
	}

}
