package Tema_1;

import java.util.Scanner;

public class Ejercicio_6_media {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Introducir nota 1: ");
		double nota1 = sc.nextDouble();
		
		System.out.println("Introducir nota 2: ");
		double nota2 = sc.nextDouble();
		
		double notaMedia = (nota1 + nota2) / 2;
		
		System.out.println("La nota media es: " + notaMedia);
		

	}

}
