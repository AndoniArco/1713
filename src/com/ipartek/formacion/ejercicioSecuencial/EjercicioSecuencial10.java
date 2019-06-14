package com.ipartek.formacion.ejercicioSecuencial;

import java.util.Scanner;

/**
 * Programa Java que lea un número entero de 3 cifras y muestre por separado las
 * cifras del número.
 * 
 * @author Curso
 *
 */

public class EjercicioSecuencial10 {

	
	public static void main(String[] args) {
		
		int n;
		Scanner sc = new Scanner(System.in);
        //pedimos el valor N
        System.out.print("Introduzca valor de N: ");
        n = sc.nextInt();
        System.out.println("El primer numero es: "+(n/100));
        System.out.println("El segundo numero es: "+(n/10)%10);
        System.out.println("El ultimo numero es:"+n%10);
		sc.close();
	}
	
}
