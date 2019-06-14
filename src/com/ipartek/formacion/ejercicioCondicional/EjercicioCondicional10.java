package com.ipartek.formacion.ejercicioCondicional;

import java.util.Scanner;

/**
 * Programa que lea una variable entera mes y compruebe si el valor corresponde
 * a un mes de 30 días, de 31 o de 28. Supondremos que febrero tiene 28 días. Se
 * mostrará además el nombre del mes. Se debe comprobar que el valor introducido
 * esté comprendido entre 1 y 12.
 * 
 * @author Curso
 *
 */

public class EjercicioCondicional10 {

	public static void main(String[] args) {
		int mes;
		Scanner sc = new Scanner(System.in);
		// leemos el primer numero
		System.out.println("Introduce el primer numero: ");
		mes = sc.nextInt();

		if (mes >= 1 && mes <= 12) {

			switch (mes) {
			case 1:
				System.out.println("El mes es Enero ");
				break;
			case 2:
				System.out.println("El mes es Febrero ");
				break;
			case 3:
				System.out.println("El mes es Marzo ");
				break;
			case 4:
				System.out.println("El mes es Abril ");
				break;
			case 5:
				System.out.println("El mes es Mayo ");
				break;
			case 6:
				System.out.println("El mes es Junio ");
				break;
			case 7:
				System.out.println("El mes es Julio ");
				break;
			case 8:
				System.out.println("El mes es Agosto ");
				break;
			case 9:
				System.out.println("El mes es Septiembre ");
				break;
			case 10:
				System.out.println("El mes es Octubre ");
				break;
			case 11:
				System.out.println("El mes es Noviembre ");
				break;
			case 12:
				System.out.println("El mes es Diciembre ");
				break;

			default:
				break;
			}

			if (mes == 4 || mes == 6 || mes == 9 || mes == 11) {
				System.out.println("El mes tiene 30 dias");
			} else if (mes == 2) {
				System.out.println("El mes tiene 28 dias");
			} else {
				System.out.println("El mes tiene 31 dias");
			}

		} else {
			System.out.println("El mes no es valido");
		}
		sc.close();
	}
}
