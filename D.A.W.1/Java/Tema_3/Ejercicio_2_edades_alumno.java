package Tema_3;

import java.util.Scanner;

public class Ejercicio_2_edades_alumno {

	public static void main(String[] args) {
	
		Scanner sc = new Scanner(System.in);
		
		
		//Suma edades
		//Media
		//Numero alumnos
		//Mayores de edad
		
		int sumaEdades = 0;
		int numAlumnos = 0;
		int numMayores = 0;
		
		double media = 0;
		
		System.out.println("Introduce la edad de los alumnos: (negativo para salir)");
		int edad = sc.nextInt();
		
		while (edad >=0) {
			sumaEdades += edad;
			
			numAlumnos++;
			
			if(edad >=18 ) {
				numMayores++;
			}
			
			System.out.println("Introduce la edad: ");
			edad = sc.nextInt();
		}
		
		
		
			media = (double) edad / numAlumnos;
			
			System.out.println("Suma de todas las edades: " + sumaEdades + "\n" + "Numero de alumnos: " + numAlumnos+ 
					           "\n" + "Mayores de edad: " + numMayores + "\n" + "Media" + media);
		}
		
	}


