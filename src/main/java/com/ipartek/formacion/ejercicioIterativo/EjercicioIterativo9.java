package com.ipartek.formacion.ejercicioIterativo;

import java.util.Scanner;

/**
 * Programa que pida que se introduzcan dos números enteros por teclado y
 * muestre los números desde el menor hasta el mayor de los números
 * introducidos. Los dos números introducidos deben ser distintos. Si son
 * iguales se mostrará un mensaje indicándolo y se vuelven a introducir.
 * 
 * @author Curso
 *
 */

public class EjercicioIterativo9 {

	
	public static void main(String[] args) {
		
		int n1,n2,mayor,menor;
		Scanner sc = new Scanner(System.in);
		
		do {
			//Cogemos el primer numero
			System.out.println("Introduzca el primer numero: ");
			n1 = sc.nextInt();
			//Cogemos el segundo numero
			System.out.println("Introduzca el segundo numero: ");
			n2 = sc.nextInt();
			if(n1 == n2) {
				System.out.println("Debes introducir valores distintos");
			}
			
		} while (n1==n2);
		
		//Calculamos cual es el mayor
		
		if(n1>n2) {
			mayor = n1;
			menor = n2;
		} else {
			mayor = n2;
			menor = n1;
		}
		
		System.out.println("Imprimir del "+menor+" al "+mayor);
		
		for(int i = menor; i<=mayor; i++) {
			System.out.println(i);
		}
		sc.close();
	}
}
