package com.ipartek.formacion.pruebaOrdenador;

public class Portatil extends Ordenador{

	private float pulgadas;
	private String modelo;
	private float bateria;
	
	public Portatil(String placa, String tarjetaGrafica, int nucleos, boolean grabadora, float pulgadas, String modelo, float bateria) throws Exception {
		super(placa,tarjetaGrafica,nucleos,grabadora);
		setPulgadas(pulgadas);
		setModelo(modelo);
		setBateria(bateria);
	}

	public float getPulgadas() {
		return pulgadas;
	}

	public String getModelo() {
		return modelo;
	}

	public float getBateria() {
		return bateria;
	}

	private void setPulgadas(float pulgadas) {
		this.pulgadas = pulgadas;
	}

	private void setModelo(String modelo) {
		this.modelo = modelo;
	}

	private void setBateria(float bateria) throws Exception {
		if(bateria< 20.0f) {
				throw new Exception();
		} else {
			this.bateria = bateria;
		}
		
	}
	
	
	
	
	
}
