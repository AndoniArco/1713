package com.ipartek.formacion.ejercicioSecuencial;

import java.util.Scanner;

public class EjercicioSecuencial1{

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*
		 * Programa Java que lea dos números enteros por teclado y los muestre por
		 * pantalla.
		 */

		int n1, n2;
		Scanner sc = new Scanner(System.in);
		// leemos el primer numero
		System.out.println("Introduce el numero entero: ");
		n1 = sc.nextInt();
		// leemos el segundo numero
		System.out.println("Introduce otro numero entero: ");
		n2 = sc.nextInt();
		// mostrar resultado
		System.out.println("El primer numero es el " + n1 + ", el segundo numero es " + n2);
		sc.close();
	}

}
