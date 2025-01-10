package Tema_1;

import java.util.Scanner;

public class Ejercicio_8_mayor_de_edad {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Intrudce su edad: ");
		int edad = sc.nextInt();
		
		boolean mayorEdad = edad >= 18;
		
		System.out.println("Mayor de edad: " + mayorEdad);
				
			
	}

}
