package com.ipartek.formacion.ejercicioBasico;

public class EjercicioBasicoOperadorCondicionalI {

	/**
	 * Escribe un programa java que declare una variable A de tipo entero y asígnale
	 * un valor. A continuación muestra un mensaje indicando si A es par o impar.
	 * Utiliza el operador condicional ( ? : ) dentro del println para resolverlo.
	 * Si por ejemplo A = 14 la salida será 14 es par Si fuese por ejemplo A = 15 la
	 * salida será: 15 es impar
	 * 
	 * @param args
	 */

	public static void main(String[] args) {

		int a = 14;
		int b = 15;
		System.out.println(a + (a % 2 == 0 ? " es par " : " es impar"));
		System.out.println(b + (b % 2 == 0 ? " es par " : " es impar"));
		System.out.printf("El numero %s es %s \n", b, "largo"); // con %s declaramos las variables que queremos despues
																// sustituir, por los valores que le pasamos
		float numero = 3.1425936363f;
		float numero2 = (float) 3.1425936363;
		float numero3 = 3;

		System.out.printf("El numero formateado es %s \n", String.format("%.2f", numero));
		System.out.printf("El numero formateado es %s \n", String.format("%.2f", numero2));
		System.out.printf("El numero formateado es %s \n", String.format("%.2f", numero3));

	}

}
