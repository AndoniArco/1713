package com.ipartek.formacion.ejercicioSecuencial;

import java.util.Scanner;

/**
 * Programa que pase una velocidad en Km/h a m/s. La velocidad se lee por teclado.
 * X km/h *( 1000m/1km )*( 1h/3.600s )
 * @author Curso
 *
 */

public class EjercicioSecuencial6 {

	
	public static void main(String[] args) {
		
		
		double veloKmH,veloMS ;
		Scanner sc = new Scanner(System.in);
		// leemos el numero del radio
		System.out.println("Introduce la velocidad: ");
		veloKmH = sc.nextDouble();
		veloMS = veloKmH * 1000 / 3600;
		System.out.println("La velocidad convertida es: "+veloMS);
		sc.close();
	}
	
}
