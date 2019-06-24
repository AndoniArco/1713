package com.ipartek.formacion.ejercicioSecuencial;

import java.util.Scanner;

public class EjercicioSecuencial2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * Programa Java que lea un nombre y muestre por pantalla: “Buenos dias
		 * nombre_introducido”
		 */

		String nombre;
		Scanner sc = new Scanner(System.in);
		// leemos el nombre
		System.out.println("Introduce tu nombre: ");
		nombre = sc.nextLine();
		System.out.println("Buenos dias " + nombre);
		sc.close();
	}

}
