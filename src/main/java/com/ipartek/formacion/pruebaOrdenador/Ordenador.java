package com.ipartek.formacion.pruebaOrdenador;

public abstract class Ordenador {

	private String placa;
	private String tarjetaGrafica;
	private int nucleos;
	private boolean grabadora;
	
	
	public Ordenador(String placa, String tarjetaGrafica, int nucleos, boolean grabadora) {
		super();
		this.placa = placa;
		this.tarjetaGrafica = tarjetaGrafica;
		this.nucleos = nucleos;
		this.grabadora = grabadora;
	}
	
	public String getPlaca() {
		return placa;
	}
	public String getTarjetaGrafica() {
		return tarjetaGrafica;
	}
	public int getNucleos() {
		return nucleos;
	}
	public boolean isGrabadora() {
		return grabadora;
	}
	private void setPlaca(String placa) {
		this.placa = placa;
	}
	private void setTarjetaGrafica(String tarjetaGrafica) {
		this.tarjetaGrafica = tarjetaGrafica;
	}
	private void setNucleos(int nucleos) {
		this.nucleos = nucleos;
	}
	private void setGrabadora(boolean grabadora) {
		this.grabadora = grabadora;
	}
	
	
	
}
