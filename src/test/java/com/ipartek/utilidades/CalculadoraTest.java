package com.ipartek.utilidades;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class CalculadoraTest {

		@Test
		public void testSumar() {
			// fail("Not yet implemented");
			int resultado = Calculadora.sumar(2, 3);
			assertEquals("No suma bien", 5, resultado);
		}

		@Test
		public void restar() {

			assertEquals(0, Calculadora.restar(2, 2));
			assertEquals(-1, Calculadora.restar(2, 3));
			assertEquals(1, Calculadora.restar(3, 2));
		}

		@Test
		public void multiplicar() {
			assertEquals(0, Calculadora.multiplicar(2, 0));
			assertEquals(4, Calculadora.multiplicar(2, 2));
			assertEquals(0, Calculadora.multiplicar(0, 2));
			assertEquals(25, Calculadora.multiplicar(5, 5));
		}

		@Test(expected = ArithmeticException.class)
		public void dividir() {
			assertEquals(0, Calculadora.dividir(0, 2));
			assertEquals(2, Calculadora.dividir(4, 2));
			assertEquals(5, Calculadora.dividir(15, 3));
			assertEquals(0, Calculadora.dividir(3, 0));

		}

}

