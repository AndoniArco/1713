package com.ipartek.formacion.ejercicioCondicional;

import java.util.Scanner;

/**
 * Programa java que lea un carácter por teclado y compruebe si es un dígito
 * numérico (cifra entre 0 y 9).
 * 
 * @author Curso
 *
 */

public class EjercicioCondicional6 {

	public static void main(String[] args) {

		char n;
		Scanner sc = new Scanner(System.in);
		// leemos el numero
		System.out.println("Introduce el caracter: ");
		n = sc.nextLine().charAt(0);
		if (Character.isDigit(n)) {
			System.out.println("El caracter es un digito");
		} else {
			System.out.println("El caracter no es un digito");
		}

		sc.close();
	}

}
