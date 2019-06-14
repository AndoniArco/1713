package com.ipartek.formacion.ejercicioIterativo;

import java.util.Scanner;

/**
 * Programa Java que convierte millas a kilómetros. El programa pide que se
 * introduzca una cantidad de millas y calcula y muestra su equivalente en
 * Kilómetros. El proceso se repite hasta que se introduzca un 0 como valor para
 * las millas. 1 Milla equivale a 1.6093 Kilómetros. El valor de los KM
 * resultantes se debe mostrar con dos decimales.
 * 
 * @author Curso
 *
 */

public class EjercicioIterativo13 {

	public static void main(String[] args) {
		
		int millas;
		double km;
		Scanner sc = new Scanner(System.in);
		do {
			//Recogemos el valor de las millas
			System.out.print("Introduce un en millas: ");
			millas = sc.nextInt();
			
			if(millas>0) {
				km = millas *1.6093;
				System.out.printf("%d numero formateado es %.2f \n",millas, km);
			}
			
		} while (millas >0);
		sc.close();
	}
	
}
