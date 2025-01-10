package Tema_4;

import java.util.Scanner;

public class Ejercicio_2_comprendidos {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int entero = 0;
		int entero2 = 0;
		
		System.out.println("Entero 1: " + entero);
		entero = sc.nextInt();
		
		System.out.println("Entero 2: " + entero2);
		entero2 = sc.nextInt();
		
		enteros( entero,  entero2);
		
		
	}

	static void enteros(int a, int b) {
		for (int i = a+1; i < b; i++) {
			System.out.println(i);
			
		}
	}
}
