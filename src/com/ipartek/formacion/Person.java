package com.ipartek.formacion;

//TODO Hacer un constructor donde la persona por defecto va a tener nombre = Anonimo, 
//	   edad = 18 años, altura = 0, peso = 0, ojos = marrones, sexo = i. Sobrecargar la persona
//	   indicando nombre, edad y sexo

public class Person {

	// atributos
	private int id;
	private String nombre;
	private int edad;
	private float altura; // 1.70 metros
	private float peso;
	private String colorOjos;
	private char sexo; // 'h' hombre 'm' mujer 'i'indefinido

	public Person() {
		super();
		this.id  = -1;
		this.nombre = "Anonimo";
		this.edad = 18;
		this.altura = 0;
		this.peso = 0;
		this.colorOjos = "marrones";
		this.sexo = 'i';
	}

	public Person(String nombre) {
		this();
		this.nombre = nombre;
	}
	
	public Person(String nombre, int edad, char sexo) {
		this();
		this.nombre = nombre;
		this.edad = edad;
		this.sexo = sexo;
	}

	public String getNombre() {
		return nombre;
	}

	
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getId() {
		return this.id;
	}
	
	
	public int getEdad() {
		return edad;
	}

	public void setEdad(int edad) throws PersonException {
		if (edad < 0) {
			throw new PersonException(PersonException.ERROR_EDAD);
		} else {
			this.edad = edad;
		}
	}
	
	public void setId(int pId) {
		this.id = pId;
	}

	public float getAltura() {
		return altura;
	}

	public void setAltura(float altura) throws PersonException {
		if (altura < 0) {
			throw new PersonException(PersonException.ERROR_ALTURA);
		} else {
			this.altura = altura;
		}
	}

	public float getPeso() {
		return peso;
	}

	public void setPeso(float peso) throws PersonException {
		if (peso < 0) {
			throw new PersonException(PersonException.ERROR_PESO);
		} else {
			this.peso = peso;
		}
	
	}

	public String getColorOjos() {
		return colorOjos;
	}

	public void setColorOjos(String colorOjos) {
		this.colorOjos = colorOjos;
	}

	public char getSexo() {
		return sexo;
	}

	public void setSexo(char sexo) {
		this.sexo = sexo;
	}

}
