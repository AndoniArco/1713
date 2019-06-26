package com.ipartek.formacion.ejercicioGenerales;

import java.util.Scanner;

/**
 * En esta entrada vamos a explicar dos m�todos para realizar el intercambio de
 * valores entre dos variables. El primer m�todo de intercambio utiliza una
 * variable auxiliar y el segundo m�todo realiza el intercambio de valores sin
 * utilizar variable auxiliar. Intercambio de valores entre dos variables
 * utilizando una variable auxiliar.
 * 
 * Programa para intercambiar el valor de dos variables. Los valores iniciales
 * se leen por teclado.
 * 
 * Por ejemplo, suponiendo que las variables se llaman A y B, si A contiene 3 y
 * B contiene 5, despu�s del intercambio A contendr� 5 y B 3.
 * 
 * En este ejemplo, para intercambiar el valor entre dos variables utilizaremos
 * una avariable auxiliar donde guardar el valor de una de ellas. Despu�s
 * veremos la forma de hacerlo sin usar una variable auxiliar para el
 * intercambio.
 * 
 * Las instrucciones a realizar son:
 * 
 * AUX = A; A = B; B = AUX;
 * 
 * @author Curso
 *
 */

public class Ejercicio1 {

	public static void main(String[] args) {

		int a, b, aux;

		Scanner sc = new Scanner(System.in);
		System.out.println("Introduzca el valor de A:");
		a = sc.nextInt();
		System.out.println("Introduzca el valor de B:");
		b = sc.nextInt();
		System.out.printf("Los valores introducidos son a: %d y b: %d \n \n", a, b);
		aux = a;
		a = b;	
		b = aux;
		System.out.printf("Los valores se han invertido y ahora son a: %d y b: %d",a,b);
		sc.close();
		
	}

}
