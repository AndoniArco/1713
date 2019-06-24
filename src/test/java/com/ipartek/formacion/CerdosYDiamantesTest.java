package com.ipartek.formacion;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.Collections;

import org.junit.Test;

public class CerdosYDiamantesTest {

	@Test
	public void test() {

		ArrayList<Ordenable> lista = new ArrayList<Ordenable>();

		Cerdo c1 = new Cerdo(33, "PUMBA");
		Diamantes d1 = new Diamantes(4, "Rojo");
		Cerdo c2 = new Cerdo(3, "PIGLET");
		Diamantes d2 = new Diamantes(40, "Verde");
		Cerdo c3 = new Cerdo(113, "SPIDER-PIG");
		Diamantes d3 = new Diamantes(15, "Amarillo");
		Cerdo c4 = new Cerdo(200, "HAMM");
		Diamantes d4 = new Diamantes(25, "Azul");
		Cerdo c5 = new Cerdo(72, "BABE");
		Diamantes d5 = new Diamantes(43, "Blanco");
		Cerdo c6 = new Cerdo(-5, "PORKY PIG");
		Diamantes d6 = new Diamantes(8, "Morado");

		lista.add(c1);
		lista.add(d1);
		lista.add(c2);
		lista.add(d2);
		lista.add(c3);
		lista.add(d3);
		lista.add(c4);
		lista.add(d4);
		lista.add(c5);
		lista.add(d5);
		lista.add(c6);
		lista.add(d6);
		
		
		for ( Ordenable elemento : lista ) {
			
			
			// diamante.getColor();
			
			if ( elemento instanceof Diamantes ) {
				
				Diamantes diamante = (Diamantes)elemento;
				diamante.getColor();
				
			}
			
			
			if ( elemento instanceof Cerdo ) {
				
				
				Cerdo cerdo = (Cerdo)elemento;
				cerdo.getKilos();
			}
			
			
		}
		
		
		Collections.sort(lista, new ComparadorCerdosDiamantes() );
		
		
		assertEquals( -5 , lista.get(0).getValor());
		assertEquals( 3 , lista.get(1).getValor());
		assertEquals( 4 , lista.get(2).getValor());
		assertEquals( 8 , lista.get(3).getValor());
		assertEquals( 15 , lista.get(4).getValor());
		assertEquals( 25 , lista.get(5).getValor());
		assertEquals( 33 , lista.get(6).getValor());
		assertEquals( 40 , lista.get(7).getValor());
		assertEquals( 43 , lista.get(8).getValor());
		assertEquals( 72 , lista.get(9).getValor());
		assertEquals( 113 , lista.get(10).getValor());
		assertEquals( 200 , lista.get(11).getValor());
		

	}
}