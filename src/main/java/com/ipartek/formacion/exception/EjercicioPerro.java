package com.ipartek.formacion.exception;

import java.util.Scanner;

import com.ipartek.formacion.Perro;

public class EjercicioPerro {

	public static void main(String[] args) {

		int iEdad = -1;
		String sNombre = null;
		String sRaza = null;
		String auxVacunado = null;
		boolean vacunado = false;
		Scanner sc = new Scanner(System.in);
		boolean repetir = false;
		System.out.println("Comienza el programa");

		do {
			try {

				if (sNombre == null) {
					System.out.println("Introduzca el nombre del perro");
					sNombre = sc.nextLine();
				}
				if (sRaza == null) {
					System.out.println("Introduzca la raza del perro");
					sRaza = sc.nextLine();
				}
				if (iEdad < 0) {
					System.out.println("Introduzca la edad del perro");
					iEdad = Integer.parseInt(sc.nextLine());
					if (iEdad < 0) {
						throw new Exception("La edad no puede ser < 0");
					}
				}
				if (auxVacunado == null) {
					System.out.println("�Se encuentra el perro vacunado?(S/N)");
					auxVacunado = sc.nextLine();
					if (auxVacunado.equalsIgnoreCase("S")) {

						vacunado = true;
						repetir = false;
					} else if (auxVacunado.equalsIgnoreCase("N")) {

						repetir = false;

					} else {
						auxVacunado = null;
						throw new Exception("La respuesta tiene que ser S o N");
					}
				}

			} catch (Exception e) {
				// TODO: handle exception sEdad,
				repetir = true;
				System.out.println(e.getMessage());
			//	System.out.println("El dato introducido no es valido.");
			}

		} while (repetir);
		Perro p = new Perro(sNombre, sNombre, iEdad, vacunado);
		System.out.println(p.toString());
		sc.close();
	}

}
