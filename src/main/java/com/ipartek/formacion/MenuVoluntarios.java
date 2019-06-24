package com.ipartek.formacion;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.Scanner;

public class MenuVoluntarios {

	static Scanner sc = null;

	static final ArrayList<Alumno> LISTA = new ArrayList<Alumno>();
	static final int OPCION_LISTAR = 1;
	static final int OPCION_CREAR = 2;
	static final int OPCION_ELIMINAR = 3;
	static final int OPCION_VOLUNTARIO = 4;
	static final int OPCION_SALIR = 5;
	static String ultimoVoluntario = "";

	public static void main(String[] args) {

		inicializarLista();

		sc = new Scanner(System.in);
		boolean salir = false;

		System.out.println("****** BIENVENIDO AL MENU DE VOLUNTARIOS ******");

		do {
			System.out.println();
			System.out.println("****** ELIJA UNA OPCIÓN ******");
			System.out.println();
			System.out.println("1) LISTAR ALUMNOS + RANKING");
			System.out.println("2) CREAR ALUMNOS");
			System.out.println("3) ELIMINAR ALUMNOS");
			System.out.println("4) BUSCAR VOLUNTARIO");
			System.out.println("5) SALIR");
			System.out.println();

			try {
				int opcion = Integer.parseInt(sc.nextLine());

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
				case 5:
					salir = true;
					break;

				default:
					break;
				}
			} catch (Exception e) {
				System.out.println("EL DATO INTRODUCIDO NO ES UN NUMERO");
			}

		} while (!salir);

	}

	private static void listarAlumnos() {
		Collections.sort(LISTA);
		for (Alumno alumno : LISTA) {
			System.out.println(alumno.getNombre() + "   " + alumno.getRanking());
		}

	}

	private static void inicializarLista() {

		LISTA.add(new Alumno("Andoni"));
		LISTA.add(new Alumno("Arkaitz"));
		LISTA.add(new Alumno("Veronica"));
		LISTA.add(new Alumno("EderIbañez"));
		LISTA.add(new Alumno("JonAntolin"));
		LISTA.add(new Alumno("Asier"));
		LISTA.add(new Alumno("Manu"));
		LISTA.add(new Alumno("EderSerna"));
		LISTA.add(new Alumno("Jose Luis"));
		LISTA.add(new Alumno("Aritz"));
		LISTA.add(new Alumno("Mounir"));
		LISTA.add(new Alumno("Jon Carrasco"));
		LISTA.add(new Alumno("Gaizka"));
		LISTA.add(new Alumno("Eduardo"));
		LISTA.add(new Alumno("Borja"));

	}

	private static void buscarVoluntario() {

		boolean salir = false;

		while (!salir) {

			int n = (int) (Math.random() * LISTA.size());
			for (int i = 0; i < LISTA.size(); i++) {
				if (i == n && !ultimoVoluntario.equals(LISTA.get(i).getNombre())) {
					System.out.println("***"+LISTA.get(n).getNombre());
					ultimoVoluntario = LISTA.get(n).getNombre();
					LISTA.get(n).aumentarPuntos();
					salir = true;
				} else {
					System.out.println(LISTA.get(i).getNombre());
				}
			}	
		}
	}

	private static void eliminarAlumno() {
		listarAlumnos();
		System.out.println("****** INTRODUCE EL ALUMNO QUE QUIERES ELIMINAR ******");
		int alumElim;
		try {
			alumElim = Integer.parseInt(sc.nextLine());
			LISTA.remove(alumElim);
			System.out.println("****** EL ALUMNO HA SIDO ELIMINADO CORRECTAMENTE ******");
		} catch (Exception e) {
			System.out.println("****** EL NUMERO INTRODUCIDO NO ES VALIDO ******");
		}
	}

	private static void crearAlumno() {
		System.out.println("****** VAMOS A CREAR UN ALUMNO ******");
		System.out.println("****** INTRODUCE EL NOMBRE DEL ALUMNO ******");
		String nombre = sc.nextLine();
		LISTA.add(new Alumno(nombre));
		System.out.println("****** EL ALUMNO " + nombre.toUpperCase() + " HA SIDO CREADO ******");

	}

}
