package com.ipartek.formacion.ejercicioSecuencial;

import java.util.Scanner;

/**
 * Programa lea la longitud de los catetos de un triángulo rectángulo y calcule
 * la longitud de la hipotenusa según el teorema de Pitágoras. Formula
 * pitagoras: a^2 = b^2 + c^2 . Siendo b y c catetos.
 * 
 * @author Curso
 *
 */

public class EjercicioSecuencial7 {

	public static void main(String[] args) {

		double cateto1, cateto2, hipotenusa;
		Scanner sc = new Scanner(System.in);
		// leemos el primer cateto
		System.out.println("Introduce un cateto: ");
		cateto1 = sc.nextDouble();
		// leemos el segundo cateto
		System.out.println("Introduce otro cateto: ");
		cateto2 = sc.nextDouble();
		hipotenusa = Math.sqrt((Math.pow(cateto1, 2) + Math.pow(cateto2, 2)));
		System.out.println("La hipotenusa de los catetos " + cateto1 + " y " + cateto2 + " es " + hipotenusa);
		sc.close();
	}

}
