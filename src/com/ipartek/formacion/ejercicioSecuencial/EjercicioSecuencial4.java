package com.ipartek.formacion.ejercicioSecuencial;

import java.util.Scanner;

public class EjercicioSecuencial4 {

	
	public static void main(String[] args) {
		/*
		 * Programa que lea una cantidad de grados cent�grados y la pase a grados
		 * Fahrenheit. La f�rmula correspondiente para pasar de grados cent�grados a
		 * fahrenheit es: F = 32 + ( 9 * C / 5)
		 */
		
		double c;
		double f;
		Scanner sc = new Scanner(System.in);
		// leemos el numero entero
		System.out.println("Introduce la temperatura: ");
		c = sc.nextInt();
		f = 32 + (9 * c / 5);
		System.out.println("Los grados �C son "+ c + "C� y su valor Fahrenheit es "+f+"�F.");
				sc.close();
		
		
	}
	
}
