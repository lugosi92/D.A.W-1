package Tema_3;

import java.util.Scanner;

public class Ejercicio_11_factorial {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		double  factorial = 1;
		int num;
		
		System.out.println("Introduce un numero");
		num = sc.nextInt();
		
		for (int i = 0; i < num; i--) {
			
			factorial = factorial * i;
		}
		System.out.println("Numero factorial es" + factorial);
	}

}
