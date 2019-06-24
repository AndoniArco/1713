package com.ipartek.formacion.ejercicioBasico;

import java.util.Scanner;

/**
 * @see http://www.campus.formacion.ipartek.com/moodle/mod/page/view.php?id=882
 * @author Curso
 *
 */

public class VariablesPrimitivasWrappers {

	public static void main(String[] args) {

		// declarar todos los posibles tipos de variables primitivas

		// numeros enteros

		byte b = 2;
		short s = 4;
		int i = 0;
		long l = 8;

		// numeros reales

		float f = 2.34f;
		double d = 4.65;

		char c = 'a'; // comillas simples

		boolean b1 = true; // or false

		// Wrappers

		int numeroParseado = Integer.parseInt("3");

		System.out.printf("El rango de un int es %d , %d \n\n\n", Integer.MIN_VALUE, Integer.MAX_VALUE);

		// indicar si el carcter introducido por pantalla es
		// mayusculas o minusculas
		// letra o numero

		char c1;
		Scanner sc = new Scanner(System.in);
		System.out.println("Por favor introduzca un caracter: ");
		c1 = sc.next().charAt(0);

		System.out.println("Has escrito " + c1);

		if (Character.isLetter(c1)) {
			System.out.println(c1 + " es una letra");
			System.out.println(c1 + (Character.isLowerCase(c1) ? " es minuscula " : " es mayuscula"));
		} else {
			System.out.println(c1 + " es un digito");
		}

		sc.close();

	}

}
