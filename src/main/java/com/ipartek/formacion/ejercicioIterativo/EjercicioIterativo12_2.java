package com.ipartek.formacion.ejercicioIterativo;

import java.util.Scanner;

/**
 * Programa que lea n�meros enteros por teclado y para cada n�mero introducido
 * indique si es positivo o negativo y si es par o impar. Se utilizar� un bucle
 * do .. while. La lectura de n�meros en esta versi�n tambi�n finaliza cuando se
 * introduzca un cero.
 * 
 * @author Curso
 *
 */

public class EjercicioIterativo12_2 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int numero;

		System.out.print("Introduce un numero (0 para acabar): ");
		numero = sc.nextInt();

		do {

			if (numero > 0) {
				System.out.print("Positivo");
			} else {
				System.out.print("Negativo");
			}
			if (numero % 2 == 0) {
				System.out.println(" Par");
			} else {
				System.out.println(" Impar");
			}

			System.out.print("Introduce un n�mero (0 para acabar): ");
			numero = sc.nextInt();

		} while (numero != 0);
		sc.close();
	}

}
