package com.ipartek.formacion.ejercicioSecuencial;

import java.util.Scanner;

/**
 * Programa Java que lea un n�mero entero N de 5 cifras y muestre sus cifras
 * igual que en el ejemplo. Por ejemplo para un n�mero N = 12345 La salida debe
 * ser:
 * 
 * 5
 * 45
 * 345
 * 2345
 * 12345
 * 
 * @author Curso
 *
 */

public class EjercicioSecuencial12 {

	public static void main(String[] args) {
		
		int n;
		Scanner sc = new Scanner(System.in);
        //pedimos el valor N
        System.out.print("Introduzca valor de N: ");
        n = sc.nextInt();
        System.out.println(n%10);
        System.out.println(n%100);
        System.out.println(n%1000);
        System.out.println(n%10000);
        System.out.println(n);
		
		sc.close();
	}
	
}
