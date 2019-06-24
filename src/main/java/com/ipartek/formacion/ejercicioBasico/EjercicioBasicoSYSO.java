package com.ipartek.formacion.ejercicioBasico;

public class EjercicioBasicoSYSO {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*
		 * Ejercicio básico inicial 1:
		 * 
		 * Escribe un programa Java que realice lo siguiente: declarar una variable N de
		 * tipo int, una variable A de tipo double y una variable C de tipo char y
		 * asigna a cada una un valor. A continuación muestra por pantalla: El valor de
		 * cada variable. La suma de N + A La diferencia de A - N El valor numérico
		 * correspondiente al carácter que contiene la variable C. Si por ejemplo le
		 * hemos dado a N el valor 5, a A el valor 4.56 y a C el valor ‘a’, se debe
		 * mostrar por pantalla:
		 */

		int n = 5;
		double a = 2.23;
		char c = 'a';

		System.out.println("Variable N: " + n);
		System.out.println("Variable A: " + a);
		System.out.println("Variable C: " + c);
		System.out.println("Variable N+A: " + (n + a));
		System.out.println("Variable A-N: " + (a - n));
		System.out.println("Caracter numérico C: " + ((int) c));

		/*
		 * Escribe un programa Java que realice lo siguiente: declarar dos variables X e
		 * Y de tipo int, dos variables N y M de tipo double y asigna a cada una un
		 * valor. A continuación muestra por pantalla: El valor de cada variable. La
		 * suma X + Y La diferencia X – Y El producto X * Y El cociente X / Y El resto X
		 * % Y La suma N + M La diferencia N – M El producto N * M El cociente N / M El
		 * resto N % M La suma X + N El cociente Y / M El resto Y % M El doble de cada
		 * variable La suma de todas las variables El producto de todas las variables Si
		 * por ejemplo le hemos dado a X el valor 1, a Y el valor 2, a M el valor 3.2 y
		 * a N el valor 4.7 se debe mostrar por pantalla:
		 */

		int x = 6;
		int y = 2;
		double m = 3.3;
		double n1 = 1.5;
		
		System.out.println("Variable X: " + x);
		System.out.println("Variable Y: " + y);
		System.out.println("Variable M: " + m);
		System.out.println("Variable N: " + n1);
		System.out.println("La suma de X+Y: "+(x+y));
		System.out.println("La resta de X-Y: "+(x-y));
		System.out.println("El producto de X*Y: "+(x*y));
		System.out.println("El cociente de X/Y: "+(x/y));
		System.out.println("El resto de X%Y: "+(x%y));
		System.out.println("La suma de N+M: "+(n1+m));
		System.out.println("La resta de N-M: "+(n1-m));
		System.out.println("El producto de N*M: "+(n1*m));
		System.out.println("El cociente de N/M: "+(n1/m));
		System.out.println("El resto de N%M: "+(n1%m));
		System.out.println("La suma de X+N: "+(x+n1));
		System.out.println("El cociente de Y/M: "+(y/m));
		System.out.println("El resto de Y%M: "+(y%m));
		System.out.println("El doble de cada variable: n= "+(2*n1)+" m= "+(2*m)+" x= "+(2*x)+" y= "+(2*y));
		System.out.println("Suma de todas las variables: " +(n1+m+x+y));
		System.out.println("Producto de todas las variables: " +(n1*m*x*y));
		
		
	}

}
