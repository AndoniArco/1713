package com.ipartek.formacion.ejercicioSecuencial;

import java.util.Scanner;

/**
 * Programa que tome como dato de entrada un número que corresponde a la
 * longitud del radio una esfera y nos calcula y escribe el volumen de la esfera
 * que se corresponden con dicho radio.
 * 
 * La fórmula para calcular el volumen de la esfera es v = (4/3)*PI*r^3
 * 
 * @author Curso
 *
 */

public class EjercicioSecuencial8 {

	public static void main(String[] args) {

		double radio, volumen;
		Scanner sc = new Scanner(System.in);
		// leemos el numero del radio
		System.out.println("Introduce el radio de la circunferencia: ");
		radio = sc.nextDouble();
		volumen = (4.0/3) * Math.PI*Math.pow(radio, 3);
		System.out.printf("El volumen asociado al radio %s, es de %s", radio, volumen);
		sc.close();
		
		
	}

}
