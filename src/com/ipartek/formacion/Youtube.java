package com.ipartek.formacion;

public class Youtube {

	private static final int LONGITUD_CODIGO = 11;
	private static final int LONGITUD_MIN_TITULO = 2;
	private static final int LONGITUD_MAX_TITULO = 150;
	private static final String URL = "https://www.youtube.com/watch?v=";
	// propiedades

	private String titulo;// minimo 2 letras maximo 150
	private String codigo;
	private int reproducciones;

	// constructores

	public Youtube() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Youtube(String titulo, String codigo) throws Exception {
		this();/*
		this.titulo = titulo;
		this.codigo = codigo;*/
		setTitulo(titulo);
		setCodigo(codigo);
		this.reproducciones = 0;
		
	}

	// getters y setters

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) throws Exception {
		if (titulo != null && 
			titulo.length() >= LONGITUD_MIN_TITULO &&
			titulo.length() <= LONGITUD_MAX_TITULO) {
			this.titulo = titulo;
		} else {
			throw new Exception("El titulo no cumple con el minimo de " + LONGITUD_MIN_TITULO
					+ " caracteres y el maximo de " + LONGITUD_MAX_TITULO);
		}
		
	}

	public String getCodigo() {
		return codigo;
	}

	public void setCodigo(String codigo) throws Exception {
		if (codigo != null && codigo.length() == LONGITUD_CODIGO) {
			this.codigo = codigo;
		} else {
			throw new Exception("Longitud codigo debe ser " + LONGITUD_CODIGO);
		}
	}

	public int getReproducciones() {
		return reproducciones;
	}

	public void setReproducciones(int reproducciones) {
		this.reproducciones = reproducciones;
	}

	
	
	// funciones

	@Override
	public String toString() {
		return "Youtube [titulo=" + titulo + ", codigo=" + codigo + ", reproducciones=" + reproducciones + "]";
	}

	public String getURL() {
		return URL + codigo;
	}

}
