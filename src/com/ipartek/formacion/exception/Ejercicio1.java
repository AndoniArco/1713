package com.ipartek.formacion.exception;

import java.util.Scanner;

public class Ejercicio1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("Comienza Programa");

		Scanner sc = new Scanner(System.in);

		System.out.println("Por favor introduce un numero del 0 al 9");
		try {

			String sNumero = sc.nextLine(); // usar siempre mejor esto y no nextInt, nextChar
			int numero = Integer.parseInt(sNumero);

			System.out.println("Su numero es " + numero);

		} catch (Exception e) {
			e.printStackTrace();
			System.out.println("Mensaje Excepcion "+e.getMessage());
			System.out.println("*** TE DIJE UN NUMERO***");
		} finally {

			sc.close();
		}

		System.out.println("Finaliza Programa");
	}

}
