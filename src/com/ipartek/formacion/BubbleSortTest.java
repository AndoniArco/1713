package com.ipartek.formacion;

import static org.junit.Assert.*;

import org.junit.Test;

public class BubbleSortTest {

	@Test
	public void testOrdenado() throws Exception {
		int[] lista = {3,0,1,8,7,2,5,4,6,9};
		int[] listaOrdenada = BubbleSort.ordenar(lista);
		
		for (int i = 0; i < listaOrdenada.length; i++) {
			assertEquals(i, listaOrdenada[i]);
		}
		
		int[] lOrden = {-22,0,1,2,3,4,5,6,7,8,9};
		lista = new int[]{3,0,1,8,7,2,5,4,6,9,-22};
		listaOrdenada = BubbleSort.ordenar(lista);
		
		assertArrayEquals(lOrden, listaOrdenada);
		
		lOrden = new int[]{-22,0,1,2,3,4,5,6,7,8,9,100};
		lista = new int[]{3,0,1,8,100,7,2,5,4,6,9,-22};
		listaOrdenada = BubbleSort.ordenar(lista);
		
		assertArrayEquals(lOrden, listaOrdenada);
		
		
	}
	
	@Test (expected = Exception.class)
	public void testNulo() throws Exception {
		int[] lista = null;
		int[] listaOrdenada = BubbleSort.ordenar(lista);
		
		for (int i = 0; i < listaOrdenada.length; i++) {
			assertEquals(i, listaOrdenada[i]);
		}
		
	}

}
