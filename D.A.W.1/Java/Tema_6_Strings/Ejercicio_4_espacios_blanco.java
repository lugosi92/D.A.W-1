package Strings;

import java.util.Scanner;

public class Ejercicio_4_espacios_blanco {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Introduce la frase");
		String frase = sc.nextLine();
		
		int contador = 0;
		
		
		for (int i = 0; i < frase.length(); i++) {
			if(frase.charAt(i) == ' ') {
				contador ++;
			}
		}
		System.out.println("Cantidad: " + contador);
	}

}
