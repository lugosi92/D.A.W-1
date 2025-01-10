package Strings;

import java.util.Scanner;

public class Ejercicio_6_invertida_cadena {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Introduce la frase: ");
		String frase = sc.nextLine();
		
		String despues = invertido(frase);
		System.out.println(despues);
		
	}
		
		static String invertido (String original) {
			
			String nuevo = "";
			
			for (int i = 0; i < original.length(); i++) {
				nuevo = original.charAt(i) + nuevo;
				
			}
			return nuevo;
		}

	}


