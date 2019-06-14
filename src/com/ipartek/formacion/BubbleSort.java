package com.ipartek.formacion;

public class BubbleSort {

	/**
	 * Ordena una lista de enteros pasado por parametro.
	 * 
	 * @param lista int[] lista inicial desordenada.
	 * @return listaOrdenada int[] devuelve la lista inicial de manera ordenada
	 * @throws Exception lista = null
	 */

	public static int[] ordenar(int[] lista) throws Exception {

		int[] listaOrdenada = lista;
		int temp = 0;
		if (listaOrdenada != null) {
			for (int i = 0; i < listaOrdenada.length; i++) {

				for (int j = 0; j < listaOrdenada.length - i - 1; j++) {
					if (listaOrdenada[j] > listaOrdenada[j + 1]) {
						temp = listaOrdenada[j];
						listaOrdenada[j] = listaOrdenada[j + 1];
						listaOrdenada[j + 1] = temp;
					}

				}	

			}
		} else {
			throw new Exception(" La lista es nula.");
		}
		return listaOrdenada;
	}

}
