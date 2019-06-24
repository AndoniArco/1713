package com.ipartek.formacion.exception;

import java.util.Scanner;

public class Ejercicio2 {

	public static void main(String[] args) {

		System.out.println("Comienza Programa");

		Scanner sc = new Scanner(System.in);
		boolean repetir = true;
		String sN1;
		String sN2;
		int n1 = 0;
		boolean aux1 = true;
		boolean aux2 = true;
		int n2 = 0;
		int resultado;
		
		
		while (repetir) {

			try {
				if (aux1) {
					System.out.println("Introduce el primer numero");
					sN1 = sc.nextLine(); // usar siempre mejor esto y no nextInt, nextChar
					n1 = Integer.parseInt(sN1);
					aux1 = false;
				}
				if (aux2) {
					System.out.println("Introduce el segundo numero");
					sN2 = sc.nextLine(); // usar siempre mejor esto y no nextInt, nextChar
					n2 = Integer.parseInt(sN2);
					aux2 = false;
				}

				resultado = n1 + n2;

				System.out.println("El resultado de la suma es: " + resultado);

				repetir = false;

			} catch (Exception e) {

				System.out.println("*** TE DIJE UN NUMERO***");
			}

		}
		sc.close();
		System.out.println("Finaliza el programa");

	}

}
