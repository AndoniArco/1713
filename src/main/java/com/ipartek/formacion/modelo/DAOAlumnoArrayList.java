package com.ipartek.formacion.modelo;

import java.util.ArrayList;

import com.ipartek.formacion.Alumno;

public class DAOAlumnoArrayList implements IPersistible<Alumno> {

	
	private static DAOAlumnoArrayList INSTANCE;
	private ArrayList<Alumno> lista;

	public static synchronized DAOAlumnoArrayList getInstance(){
		
		if ( INSTANCE == null ) {
			INSTANCE = new DAOAlumnoArrayList();
		}
		
		return INSTANCE;
		
	}
	
	public DAOAlumnoArrayList() {
		super();
		lista = new ArrayList<Alumno>();
	}

	@Override
	public ArrayList<Alumno> getAll() {

		return lista;
	}

	@Override
	public Alumno getById(int id) {
		Alumno resul = null;

		for(Alumno a: lista) {
			if(a.getId() == id) {
				resul = a;
				break;
			}
		}
		
		return resul;
	}

	@Override
	public boolean insert(Alumno pojo) {
		
		return lista.add(pojo);
	}

	@Override
	public boolean delete(int id) {

		return lista.remove(getById(id));
	}

	@Override
	public boolean update(Alumno pojo) {
		
		int index = -1;
		boolean resul = false;
		
		for(Alumno a : lista) {
			index++;
			if(a.getId() == pojo.getId()) {
				lista.set(index, pojo);
				resul = true;
				break;
			}
		}		
		
		return resul;
	}

}
