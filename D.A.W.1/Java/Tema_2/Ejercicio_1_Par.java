package Tema_2;

import java.util.Scanner;

public class Ejercicio_1_Par {

	public static void main(String[] args) {
		
		Scanner sc= new Scanner(System.in);
		
		System.out.println("Introuce un numero entero: ");
		int num = sc.nextInt();
		
		if( num % 2 == 0) {
			System.out.println("El numero es par");
		}else {
			System.out.println("Numero es impar");
		}
		
		
	}

}
