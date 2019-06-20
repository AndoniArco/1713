package com.ipartek.formacion;

public class Alumno extends Person implements Comparable<Alumno>{

	private int ranking;
	
	public Alumno() {
		super();
	}
	
	public Alumno(String nombre) {
		super(nombre);
		this.ranking = 0;
	}
	
	public int getRanking() {
		return this.ranking;
	}
	
	private void setRanking(int pRanking) {
		this.ranking = pRanking;
	}

	public void aumentarPuntos() {
		
		this.ranking = this.ranking+1;
		
	}

	@Override
	public int compareTo(Alumno o) {

		return o.getRanking() - this.ranking;
	}
	
}
