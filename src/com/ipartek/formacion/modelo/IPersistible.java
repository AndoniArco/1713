package com.ipartek.formacion.modelo;

import java.util.ArrayList;

/**
 * Operaciones Basicas de CRUD
 * @author Curso
 * @param <P>
 *
 */

public interface IPersistible<P> {

	ArrayList<P> getAll();
	
	P getById(int id);
	
	boolean insert (P pojo);
	
	boolean delete (int id);
	
	boolean update (P pojo);
	
}
