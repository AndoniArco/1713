package com.ipartek.formacion.colecciones;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectInputStream.GetField;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.List;

import com.ipartek.formacion.Alumno;
import com.ipartek.formacion.modelo.DAOAlumnoArrayList;

public class FicheroAlumnos {

	public static void crearFichero() throws Exception {
		//TODO
		ArrayList<Alumno> aLista = DAOAlumnoArrayList.getInstance().getAll();
		String ficheroListadoAlumnos = "alumnos.txt";
		ClassLoader classLoader = new FicheroAlumnos().getClass().getClassLoader();
		ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream( classLoader.getResource(ficheroListadoAlumnos).getFile()));
		oos.writeObject(aLista);
		oos.flush();
		oos.close();
	}
	
	public static void importarFichero() throws FileNotFoundException, IOException, ClassNotFoundException {
		
		String ficheroListadoAlumnos = "alumnos.txt";
		DAOAlumnoArrayList.getInstance().getAll();
		ClassLoader classLoader = new FicheroAlumnos().getClass().getClassLoader();
		try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream(classLoader.getResource(ficheroListadoAlumnos).getFile()));) {

			// TODO mirar para no resetear
			ArrayList<Alumno> aLista = (ArrayList<Alumno>)ois.readObject();
			for(Alumno a : aLista) {
				System.out.println(a.toString());
				DAOAlumnoArrayList.getInstance().insert(a);
			}

			System.out.println("Terminamos de leer");
		} catch (Exception e) {
			// TODO: handle exception
		}
		
	}
	
}