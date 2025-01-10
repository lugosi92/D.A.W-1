package Strings;

import java.util.Scanner;

public class Ejercicio_3A_adivina_contraseña {

	public static void main(String[] args) {
		String contraseña, palabra;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Introduce contraseña: ");
		contraseña = sc.nextLine();
		
		do {
			System.out.println("Adivina la contraseña: ");
			palabra = sc.nextLine();
			
			int comparacion = contraseña.compareTo(palabra);
			
			if(comparacion == 0) {
				System.out.println("Has acertad");
			}else if(comparacion < 0) {
				System.out.println("La palabra es mayor");
			}else {
				System.out.println("La palabra es menor");
			}
		} while (!contraseña.equals(palabra));
	}

}
