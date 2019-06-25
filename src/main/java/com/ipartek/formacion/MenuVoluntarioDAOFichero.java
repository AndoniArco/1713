package com.ipartek.formacion;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

import com.ipartek.formacion.colecciones.FicheroAlumnos;
import com.ipartek.formacion.modelo.DAOAlumnoArrayList;

public class MenuVoluntarioDAOFichero {

	static Scanner sc = null;
	static final ArrayList<Alumno> LISTA = new ArrayList<Alumno>();
	static final int OPCION_LISTAR = 1;
	static final int OPCION_CREAR = 2;
	static final int OPCION_ELIMINAR = 3;
	static final int OPCION_VOLUNTARIO = 4;
	static final int OPCION_SALIR = 5;
	static String ultimoVoluntario = "";
	static int nextID;
	static int opcion;
	static Alumno anterior = new Alumno(-1,""); 

	public static void main(String[] args) throws Exception {

		inicializarLista();
		nextID = DAOAlumnoArrayList.getInstance().getAll().size()+1;
		
		
		sc = new Scanner(System.in);

		System.out.println("****** BIENVENIDO AL MENU DE VOLUNTARIOS ******");

		do {
			System.out.println();
			System.out.println("****** ELIJA UNA OPCI�N ******");
			System.out.println();
			System.out.println("1) LISTAR ALUMNOS + RANKING");
			System.out.println("2) CREAR ALUMNOS");
			System.out.println("3) ELIMINAR ALUMNOS");
			System.out.println("4) BUSCAR VOLUNTARIO");
			System.out.println("5) SALIR");
			System.out.println();

			try {
				opcion = Integer.parseInt(sc.nextLine());

				switch (opcion) {
				case OPCION_LISTAR:
					listarAlumnos();
					break;
				case OPCION_CREAR:
					crearAlumno();
					break;
				case OPCION_ELIMINAR:
					eliminarAlumno();
					break;
				case OPCION_VOLUNTARIO:
					buscarVoluntario();
					break;

				default:
					break;
				}
			} catch (Exception e) {
				System.out.println("EL DATO INTRODUCIDO NO ES UN NUMERO");
			}

		} while (opcion != OPCION_SALIR);

		FicheroAlumnos.crearFichero();
		
	}

	private static void listarAlumnos() {
		Collections.sort(DAOAlumnoArrayList.getInstance().getAll());
		for (Alumno alumno : DAOAlumnoArrayList.getInstance().getAll()) {
			System.out.println("ID: "+alumno.getId()+" "+alumno.getNombre() + "   " + alumno.getRanking());
		}

	}

	private static void inicializarLista() throws FileNotFoundException, ClassNotFoundException, IOException {
		
		FicheroAlumnos.importarFichero();

		//DAOAlumnoArrayList.getInstance().cargarAlumnos();
		
	}

	private static void buscarVoluntario() {

		boolean salir = false;

		while (!salir) {

			int n = (int) (Math.random() * DAOAlumnoArrayList.getInstance().getAll().size());
			int contador = -1;
			for (Alumno a : DAOAlumnoArrayList.getInstance().getAll()) {
				contador++;
				if (contador == n && !ultimoVoluntario.equals(a.getNombre())) {
					System.out.println("***" + a.getNombre());
					ultimoVoluntario = a.getNombre();
					a.aumentarPuntos();
					salir = true;
				} else {
					System.out.println(a.getNombre());
				}

			}
		}
	}//buscarVoluntario

	private static void eliminarAlumno() {
		listarAlumnos();
		System.out.println("****** INTRODUCE EL ID DEL ALUMNO QUE QUIERES ELIMINAR ******");
		int iElim;
		try {
			iElim = Integer.parseInt(sc.nextLine());
			DAOAlumnoArrayList.getInstance().delete(iElim);
			System.out.println("****** EL ALUMNO HA SIDO ELIMINADO CORRECTAMENTE ******");
		} catch (Exception e) {
			System.out.println("****** EL NUMERO INTRODUCIDO NO ES VALIDO ******");
		}
	}//eliminarAlumno

	private static void crearAlumno() throws Exception {
		System.out.println("****** VAMOS A CREAR UN ALUMNO ******");
		System.out.println("****** INTRODUCE EL NOMBRE DEL ALUMNO ******");
		String nombre = sc.nextLine();
		DAOAlumnoArrayList.getInstance().insert(new Alumno(nextID, nombre));
		nextID++;
		System.out.println("****** EL ALUMNO " + nombre.toUpperCase() + " HA SIDO CREADO ******");
		FicheroAlumnos.crearFichero();
	}

}
