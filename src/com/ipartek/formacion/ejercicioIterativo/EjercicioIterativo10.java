package com.ipartek.formacion.ejercicioIterativo;

import java.util.Scanner;

/**
 * Programa que pida que se introduzcan dos números enteros A y B por teclado y
 * muestre los números pares que hay entre A y B. A debe ser menor que B. Si no
 * es así se mostrará un mensaje indicándolo y se vuelven a introducir.
 * 
 * @author Curso
 *
 */

public class EjercicioIterativo10 {

	public static void main(String[] args) {
		int n1,n2;
		Scanner sc = new Scanner(System.in);
		
		do {
			//Cogemos el primer numero
			System.out.println("Introduzca el primer numero: ");
			n1 = sc.nextInt();
			//Cogemos el segundo numero
			System.out.println("Introduzca el segundo numero: ");
			n2 = sc.nextInt();
			if(n1 >= n2) {
				System.out.println("Debes introducir un segundo valor mayor al primero");
			}
			
		} while (n1>=n2);
		
		System.out.println("Numeros pares entre "+n1+" y "+n2);
		
		for (int i = n1; i <=n2; i++) {
			if(i%2==0){
				System.out.println(i);
			}
		}
		sc.close();
	}
	
}
