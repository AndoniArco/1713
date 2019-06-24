package com.ipartek.formacion.exception;

import java.util.Scanner;

import com.ipartek.formacion.Youtube;

public class CrearVideoYoutube {

	public static void main(String[] args) {

		boolean repetir = true;
		Youtube video = null;
		System.out.println("-------CREAR VIDEO YOUTUBE---------");
		System.out.println("-----------------------------------");

		Scanner sc = new Scanner(System.in);
		do {
			System.out.println("---------TITULO DEL VIDEO----------");
			System.out.println("---------LONGITUD [2,150]----------");
			String titulo = sc.nextLine();

			System.out.println("---------CODIGO DEL VIDEO----------");
			System.out.println("-----------LONGITUD [11]-----------");
			String codigo = sc.nextLine();
			try {
				video = new Youtube(titulo, codigo);
				repetir = false;
			} catch (Exception e) {
				System.out.println("Error " + e.getMessage());
			}

		} while (repetir);
		sc.close();
		System.out.println("-----VIDEO CREADO CORRECTAMENTE-----");
		System.out.println(video);
	}
}
