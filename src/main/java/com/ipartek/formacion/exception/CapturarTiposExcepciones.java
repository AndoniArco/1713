package com.ipartek.formacion.exception;

import com.ipartek.formacion.Perro;
import com.ipartek.formacion.PerroException;

/**
 * Se pueden capturar mas de un tipo de Excepciones Siempre la ultima en
 * capturar que sea Exception, que es la mas generica.
 * 
 * @author Curso
 *
 */

public class CapturarTiposExcepciones {

	public static void main(String[] args) {

		boolean repetir = true;
		Perro[] perros = new Perro[3];
		int i = 0;
		while (repetir) {
			try {
//				if(i>=perros.length) {
//					Perro p = null;
//					p.toString();
//				}
				Perro p = new Perro();
				perros[i] = p;
				p.setEdad(2);
				i++;
			} catch (ArrayIndexOutOfBoundsException e) {
				System.out.println("Se ha salido fuera del indice");
				repetir = false;
			} catch (PerroException e) {
				System.out.println("PerroExcepcion");
				repetir = false;
			} catch (NullPointerException e) {
				System.out.println("Excepcion Null");
				repetir = false;
			} catch (Exception e) {
				System.out.println("Excepcion Generica, siempre la ultima");
				repetir = false;
			}
		}

	}

}
