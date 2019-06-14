package com.ipartek.formacion;

public class Perro {

	// atributos: nombre, raza, edad, vacunado

	private String nombre;
	private String raza;
	private int edad;
	private boolean vacunado;
	
	
	public Perro() {
		super();
		// TODO Auto-generated constructor stub
	}


	public Perro(String nombre, String raza, int edad, boolean vacunado) {
		super();
		this.nombre = nombre;
		this.raza = raza;
		this.edad = edad;
		this.vacunado = vacunado;
	}






	// GETTERS Y SETTERS
	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getRaza() {
		return raza;
	}

	public void setRaza(String raza) {
		this.raza = raza;
	}

	public int getEdad() {
		return edad;
	}

	/**
	 * Setteamos edad del perro, en caso de ser <0 ponemos un 0
	 * @param edad int valor en años
	 */
	
	public void setEdad(int edad) throws Exception {
		if (edad < 0) {
			throw new PerroException(PerroException.ERROR_EDAD);
		}
		else {
			this.edad = edad;
		}
			
	}

	public boolean isVacunado() {
		return vacunado;
	}

	public void setVacunado(boolean vacunado) {
		this.vacunado = vacunado;
	}

	@Override
	public String toString() {
		return "Perro [nombre=" + nombre + ", raza=" + raza + ", edad=" + edad + ", vacunado=" + vacunado + "]";
	}

}
