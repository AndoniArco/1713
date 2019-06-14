package com.ipartek.formacion.ejercicioSecuencial;

import java.util.Scanner;

/**
 * Programa que pida por teclado la fecha de nacimiento de una persona (dia,
 * mes, a�o) y calcule su n�mero de la suerte. El n�mero de la suerte se calcula
 * sumando el d�a, mes y a�o de la fecha de nacimiento y a continuaci�n sumando
 * las cifras obtenidas en la suma. Por ejemplo: Si la fecha de nacimiento es
 * 12/07/1980 Calculamos el n�mero de la suerte as�: 12+7+1980 = 1999 1+9+9+9 =
 * 28 N�mero de la suerte: 28
 * 
 * @author Curso
 *
 */

public class EjercicioSecuencial13 {

	public static void main(String[] args) {
		int dia, mes, anno, total, cifra1, cifra2, cifra3, cifra4;
		Scanner sc = new Scanner(System.in);
		// pedimos el valor N
		System.out.print("Introduzca el dia: ");
		dia = sc.nextInt();
		System.out.print("Introduzca el mes: ");
		mes = sc.nextInt();
		System.out.print("Introduzca el a�o: ");
		anno = sc.nextInt();
		total = dia + mes + anno;
		cifra1 = total / 1000;
		cifra2 = total / 100 % 10;
		cifra3 = total / 10 % 10;
		cifra4 = total % 10;
		System.out.println(cifra1 + cifra2 + cifra3 + cifra4);

		sc.close();
	}

}
