package com.ipartek.utilidades;

public class CalculadoraDevolucion {

	public static final float[] BILLETES_MONEDAS = {
			// billetes
			500, 200, 100, 50, 20, 10, 5,
			// monedas
			2, 1, 0.5f, 0.2f, 0.1f, 0.05f, 0.02f, 0.01f };

	/**
	 * Calcula las vueltas optimas para retornar el menor numero de billetes y
	 * monedas
	 * 
	 * @param importe   float coste del articulo a comprar
	 * @param entregado float dinero entrega para comprar
	 * @return int[] cantidad de billetes y monedas retornadas
	 * @see public static final float[] BILLETES_MONEDAS
	 * @throws Exception importe > entregado o si importe < 0 o entregado < 0
	 */

	public static int[] vueltas(float importe, float entregado) throws Exception {
		// TODO realizar implementacion

		float importeDevolver = 0;
		int[] devolucion = { 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 };
		if (importe < 0 || entregado < 0 || entregado < importe) {

			throw new Exception("");
		} else {
			importeDevolver = entregado - importe;
			if (importeDevolver != 0) {
				for (int i = 0; i < BILLETES_MONEDAS.length; i++) {

					if (importeDevolver >= BILLETES_MONEDAS[i]) {
						devolucion[i] = (int) (importeDevolver / BILLETES_MONEDAS[i]);
						importeDevolver = importeDevolver % BILLETES_MONEDAS[i];
						importeDevolver = Math.round(importeDevolver * 100.0f) / 100.0f;
					}
				}
			}

			return devolucion;
		}
	}
}
