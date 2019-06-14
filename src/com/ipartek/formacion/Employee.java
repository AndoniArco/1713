package com.ipartek.formacion;

import java.util.Date;

//Sobrecargar el constructor con nombre, edad, sexo y salario

public class Employee extends Person {

	public final float SALARIO_MINIMO = 937.05f;

	private int numEmpleado;
	private Date diaContratacion;
	private float salario;

	public Employee() {
		super();
		this.numEmpleado = 0;
		this.diaContratacion = new Date();
		this.salario = SALARIO_MINIMO;
	}

	public Employee(String nombre, int edad, char sexo, int numEmpleado, float salario) {
		super(nombre, edad, sexo);
		this.diaContratacion = new Date();
		this.numEmpleado = numEmpleado;
		this.salario = salario;
	}

	public int getNumEmpleado() {
		return numEmpleado;
	}

	public void setNumEmpleado(int numEmpleado) {
		this.numEmpleado = numEmpleado;
	}

	public Date getDiaContratacion() {
		return diaContratacion;
	}

	public void setDiaContratacion(Date diaContratacion) {
		this.diaContratacion = diaContratacion;
	}

	public float getSalario() {
		return salario;
	}

	public void setSalario(float salario) {
		this.salario = salario;
	}

	@Override
	public String toString() {
		return "Employee [numEmpleado=" + numEmpleado + ", diaContratacion=" + diaContratacion.toString() + ", salario="
				+ salario + ", " + super.toString() + "]";
	}

}
