package com.ipartek.formacion.ejercicioSecuencial;

import java.util.Scanner;

/**
 * Programa que lee por teclado el valor del radio de una circunferencia y
 * calcula y muestra por pantalla la longitud y el área de la circunferencia.
 * Longitud de la circunferencia = 2*PI*Radio, Area de la circunferencia =
 * PI*Radio^2
 * 
 * @author Curso
 *
 */

public class EjercicioSecuencial5 {

	public static void main(String[] args) {

		double radio, longitud, area;
		Scanner sc = new Scanner(System.in);
		// leemos el numero del radio
		System.out.println("Introduce el radio de la circunferencia: ");
		radio = sc.nextDouble();
		longitud = (2 * Math.PI * radio);
		area = Math.PI * Math.pow(radio, 2);

		System.out.println("La longitud de la circunferencia es " + longitud + " y su area es " + area);
		sc.close();
	}

}
