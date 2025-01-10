package Strings;

import java.util.Scanner;

public class Ejercicio_4_31_espacios_en_blanco {

	public static void main(String[] args) {
		// Diseñar una aplicación que pida al usuario que introduzca una frase por teclado 
		//e indique cuántos espacios en blanco tiene.

		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Introduce una frase ");
		String frase = sc.nextLine();
		
		int contador = 0;
		for (int i = 0; i < frase.length(); i++) {
// contador += (frase.charAt(i) == ' ') ? 1 : 0; 
			if(frase.charAt(i)  ==  ' ') {
			contador++;
			}	
			
		}
		System.out.println("La cantoidad de espacios en blanco es " + contador);
		
		
		
	}

}
