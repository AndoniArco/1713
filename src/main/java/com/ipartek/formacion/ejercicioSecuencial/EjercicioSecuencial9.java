package com.ipartek.formacion.ejercicioSecuencial;

import java.util.Scanner;

/**
 * Programa Java que calcule el área de un triángulo en función de las
 * longitudes de sus lados (a, b, c), según la siguiente fórmula: Area =
 * RaizCuadrada(p*(p-a)*(p-b)*(p-c)) donde p = (a+b+c)/2
 * 
 * @author Curso
 *
 */

public class EjercicioSecuencial9 {

	public static void main(String[] args) {
		
		double a,b,c,p,area;
		Scanner sc = new Scanner (System.in);
		System.out.println("Proporcioname uno de los lados:");
		a = sc.nextDouble();
		System.out.println("Proporcioname otro de los lados:");
		b = sc.nextDouble();
		System.out.println("Proporcioname otro de los lados:");
		c = sc.nextDouble();
		p = (a+b+c)/2;
		area = Math.sqrt((p*(p-a)*(p-b)*(p-c)));
		System.out.println("El area de los numeros proporcionados es "+area);
		sc.close();
	}
	
	
}
