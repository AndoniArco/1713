package com.ipartek.formacion;

import java.text.DecimalFormat;
import java.util.Date;

public class Aula {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//declarar array con nombre alumnos
		
		String[] alumnos = {"Andoni",
							"Arkaitz",
							"Veronica", 
							"EderIbañez", 
							"JonAntolin", 
							"Asier", 
							"Manu", 
							"EderSerna",
							"Jose Luis",
							"Aritz", 
							"Mounir", 
							"Jon Carrasco", 
							"Gaizka", 
							"Eduardo",
							"Borja"};
		
		
		//generar numero aleatorio de 0 - alumnos.length
		
		int n =(int)(Math.random()*alumnos.length);
		
		
		//mostrar voluntario para leer
		System.out.println(alumnos[n]);
		
		///////////////////////////////////////////////////////////////////

		Employee e1 = new Employee("Logan Paul", 23, 'h', 1, 14500000f);
		Employee e2 = new Employee("PewDiePie", 29, 'h', 2, 15500000f);
		Employee e3 = new Employee("Jacksepticeye", 28, 'h', 3, 16000000f);
		Employee e4 = new Employee("Vanoss Gaming", 26, 'h', 4, 17000000f);
		Employee e5 = new Employee("Markiplier", 29, 'h', 5, 17500000f);
		Employee e6 = new Employee("Jeffree Star", 23, 'h', 6, 18000000f);
		Employee e7 = new Employee("DanTDM", 27, 'h', 7, 18500000f);
		Employee e8 = new Employee("Dude Perfect", 30, 'h', 8, 20000000f);
		Employee e9 = new Employee("Jake Paul", 21, 'h', 9, 21600000f);
		Employee e10 = new Employee("Ryan ToysReview", 8, 'h', 10, 22000000f);
		System.out.println(e1);
		System.out.println(e2);
		System.out.println(e3);
		System.out.println(e4);
		System.out.println(e5);
		System.out.println(e6);
		System.out.println(e7);
		System.out.println(e8);
		System.out.println(e9);
		System.out.println(e10);
		
		Employee[] youtubers = new Employee[10]; 
		youtubers[0] = e1;
		youtubers[1] = e2;
		youtubers[2] = e3;
		youtubers[3] = e4;
		youtubers[4] = e5;
		youtubers[5] = e6;
		youtubers[6] = e7;
		youtubers[7] = e8;
		youtubers[8] = e9;
		youtubers[9] = e10;
		System.out.println("//////////////////////////////////");
		System.out.println("//////////////////////////////////");
		System.out.println("//////////////////////////////////");
		System.out.println("//////////////////////////////////");
		System.out.println("//////////////////////////////////");
		System.out.println("//////////////////////////////////");
		
		DecimalFormat dc = new DecimalFormat("##,###,### $");
		
		Employee emp = null;
		
		for (int i = 0; i < youtubers.length; i++) {
			
			emp = youtubers[i];
			//numero, nombre, salario
			System.out.println((i+1)+". "+emp.getNombre()+" "+dc.format(emp.getSalario()));
		}
	}

	
	
}
