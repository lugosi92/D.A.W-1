package Tema_3;

import java.util.Scanner;

public class Ejercicio_4_Arbol_mas_alto {

	public static void main(String[] args) {
		// Solicitar cm de cada arbol (-1) salir
		
		//Cual es el arbol mas alto 
		//Cual es su eqtiqueta 
		
		Scanner sc = new Scanner(System.in);
		
		int altura = 0;
		int etiqueta = 0;
		int etiquetaAlta = 0;
		int alturaAlta = 0;
		
		System.out.println("Introduce la altura en cm (-1 para salir)");
		altura = sc.nextInt();
		
		
		while ( altura != -1) {
			if(altura>alturaAlta) {
				alturaAlta = altura;
				etiquetaAlta = 0;
			}
			etiqueta++;
			System.out.println("Introduce la altura en cm (-1 para salir)");
			altura = sc.nextInt();
		}
		System.out.println("El arbol mas alto es: " + alturaAlta);
		System.out.println("Su etiqueta es: " + etiquetaAlta);
	}
	
}
