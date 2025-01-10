package Strings;

import java.util.Iterator;
import java.util.Scanner;

public class Ejercicio_4_32_invertir_frase {

	public static void main(String[] args) {
		// Diseñar una función a la que se le pase una cadena de caracteres y 
		//la devuelva invertida. 
		//Por ejemplo, la cadena “Hola mundo” quedaría “odnum aloH”.

		Scanner sc = new Scanner(System.in);
		
		System.out.println("Introduce una frase para invertir");
		String frase = sc.nextLine();
		
		String resultado = invertidos(frase);
		
		System.out.println("La frase invertida es " + resultado);
	}
		static String invertidos (String frases) {
			
			char[] caracteres = new char[frases.length()];
			
			for (int i = 0; i < frases.length(); i++) {
				
			//mueve el ultimo caracter al principio
				caracteres[i] = frases.charAt(frases.length() - i - 1);
			}
			return new String(caracteres);
		}

}
