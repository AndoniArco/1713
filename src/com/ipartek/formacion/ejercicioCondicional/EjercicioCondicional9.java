package com.ipartek.formacion.ejercicioCondicional;

import java.util.Scanner;

/**
 * Programa que lea por teclado tres números enteros H, M, S correspondientes a
 * hora, minutos y segundos respectivamente, y comprueba si la hora que indican
 * es una hora válida.
 * 
 * Supondremos que se leemos una hora en modo 24 Horas, es decir, el valor
 * válido para las horas será mayor o igual que cero y menor que 24.
 * 
 * El valor válido para los minutos y segundos estará comprendido entre 0 y 59
 * ambos incluidos
 * 
 * @author Curso
 *
 */

public class EjercicioCondicional9 {

	public static void main(String[] args) {
		
		int h, m, s;
		Scanner sc = new Scanner(System.in);
		// leemos el primer numero
		System.out.println("Introduce la hora: ");
		h = sc.nextInt();
		// leemos el segundo numero
		System.out.println("Introduce los minutos: ");
		m = sc.nextInt();
		// leemos el tercer numero
		System.out.println("Introduce los segundos: ");
		s = sc.nextInt();
		
		if(h>=0 && h<=24 && m>=0 && m<=59 && s>=0 && s<=59 ) {
			System.out.println("La hora es correcta");
		} else {
			System.out.println("La hora es incorrecta");
		}
		sc.close();
	}
	
}
