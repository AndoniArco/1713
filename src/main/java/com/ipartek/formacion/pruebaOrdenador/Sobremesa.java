package com.ipartek.formacion.pruebaOrdenador;

public class Sobremesa extends Ordenador{

	private String torre;
	private boolean wiFi;
	
	
	
	public Sobremesa(String placa, String tarjetaGrafica, int nucleos, boolean grabadora, String torre, boolean wiFi) {
		super(placa,tarjetaGrafica,nucleos,grabadora);
		setTorre(torre);
		setWiFi(wiFi);
	}



	public String getTorre() {
		return torre;
	}



	public boolean isWiFi() {
		return wiFi;
	}



	private void setTorre(String torre) {
		this.torre = torre;
	}



	private void setWiFi(boolean wiFi) {
		this.wiFi = wiFi;
	}
	
	
	
}
