package Strings;

import java.util.Scanner;

public class Ejercicio_4_34_palabra_repetida {

	public static void main(String[] args) {
		// Diseñar un programa que solicite al usuario una frase y una palabra.
		//A continuación buscará cuantas veces aparece la palabra en la frase
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Introduce una frase");
		String frase = sc.nextLine();
		
		System.out.println("Introduce una palabra que contenga la frase");
		String palabra = sc.nextLine();
		
		int contador = 0;
		for (int i = 0; i < frase.length(); i++) {
		
			int indicePalabra = frase.indexOf(palabra, i);
			contador++;
		}

		System.out.println("La palabra " + palabra + " aparece " + contador);
		}
	}

