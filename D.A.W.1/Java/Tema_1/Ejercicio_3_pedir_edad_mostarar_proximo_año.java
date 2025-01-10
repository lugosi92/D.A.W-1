package Tema_1;

import java.util.Scanner;

public class Ejercicio_3_pedir_edad_mostarar_proximo_año {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Intrudce su edad: ");
		int edad = sc.nextInt();
		
		int edadTotal = edad + 1;
		
		System.out.println("Su edad el año que viene es: " + edadTotal + " años");
		
	}

}
