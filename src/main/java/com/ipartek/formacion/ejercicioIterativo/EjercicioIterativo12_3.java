package com.ipartek.formacion.ejercicioIterativo;

import java.io.IOException;
import java.util.Scanner;

/**
 * Programa que lea n�meros enteros por teclado y para cada n�mero introducido
 * indique si es positivo o negativo y si es par o impar. Se utilizar� un bucle
 * do .. while pero en este caso la lectura de n�meros finaliza cuando se
 * responda �N� � �n� a la pregunta �Desea introducir m�s n�meros? (S/N):�
 * 
 * @author Curso
 *
 */

public class EjercicioIterativo12_3 {

	public static void main(String[] args) throws IOException {
		Scanner sc = new Scanner(System.in);
		int numero;
		char c;
		

		do {
			System.out.print("Introduce un numero (0 para acabar): ");
			numero = sc.nextInt();
			
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

			System.out.print("Desea introducir m�s n�meros? (S/N): ");
			c = (char)System.in.read();

		} while (c != 'n' && c != 'N');
		sc.close();
	}
}
