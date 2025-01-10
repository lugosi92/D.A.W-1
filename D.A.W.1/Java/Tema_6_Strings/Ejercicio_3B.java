package Strings;

import java.util.Scanner;

public class Ejercicio_3B {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		String contraseña;
		String palabra;
		
		System.out.println("Introduce contraseña: ");
		contraseña = sc.nextLine();
		
		System.out.println("Introduce la palabra: ");
		palabra = sc.nextLine();
		
		int longitud = contraseña.length();
		
		System.out.println("La longitud de la contraseña es: " + longitud);
		
		while(!contraseña.equals(palabra)) {
			String procesoPista = "";
			for (int i = 0; i < contraseña.length(); i++) {
				if(contraseña.charAt(i) == palabra.charAt(i)) {
					procesoPista+=contraseña.charAt(i);
				}else {
					procesoPista += '*';
				}
			}
			System.out.println(procesoPista);
			System.out.println("Introduce palabra: ");
			palabra = sc.nextLine();
		}
		System.out.println("Acertaste");
		
	}
}


