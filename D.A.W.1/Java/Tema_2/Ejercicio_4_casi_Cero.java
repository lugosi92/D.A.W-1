package Tema_2;

import java.util.Scanner;

public class Ejercicio_4_casi_Cero {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Introduce un numero decimal: ");
		double num = sc.nextDouble();
		
		if(num != 0 && num > -0.99 && num < 0.99) {
			System.out.println("El numero es casi 0");
		}else {
			System.out.println("El numero NO es casi cero");
		}

	}

}
