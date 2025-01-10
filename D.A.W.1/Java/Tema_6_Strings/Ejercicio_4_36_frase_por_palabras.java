package Strings;

import java.util.Arrays;
import java.util.Scanner;

public class Ejercicio_4_36_frase_por_palabras {

	public static void main(String[] args) {

		// 1.- Introducir palabra por palabara
		// 2.- Poner "fin" cuando termine la frase i=fin
		// 3.- Mostrar toda la frase
		// 4.- La palabra fin no tiene que aparecer
		Scanner sc = new Scanner(System.in);
		
		
		System.out.println("Introduce una frase palabra por palabra(Usa 'fin' para terminar la frase)");
		String palabra = sc.nextLine();
		String frase = "";
		String fin = "fin";
		
		while (!palabra.equals(fin)){
			System.out.println("Palabra: " + palabra);
			palabra = sc.nextLine();
			//frase += palabra + " "; 
		}
		
		System.out.println(frase.toString());
		
		
		/*int contPalabras = 0;		
		System.out.println("Cuantas palabras vas a introducir");
		contPalabras = sc.nextInt();
		
		String frase = "";
		
		sc.nextLine(); // El for no pregunta palabra 1 y 2 del tiron
	
		String palabra;
		String fin = "fin";
	
		for (int i = 0; i < contPalabras; i++) {
			System.out.println("Palabra: " + (i + 1) );
			palabra = sc.nextLine();
			frase += palabra + " "; // Agregar la palabra a la frase
		if (frase.equals(fin))
			break;
		}		
		System.out.println(frase.toString());*/
		
	}
}
