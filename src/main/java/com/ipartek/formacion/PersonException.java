package com.ipartek.formacion;

public class PersonException extends Exception {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	public static final String ERROR_EDAD = "La edad debe ser mayor a 0";
	public static final String ERROR_ALTURA = "La altura debe ser mayor a 0";
	public static final String ERROR_PESO = "El peso debe ser mayor a 0";

	public PersonException(String error) {
		super(error);
	}

}
