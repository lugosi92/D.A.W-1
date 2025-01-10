package Tema_4;

import java.util.Scanner;

public class Ejercicio_1_Eco {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int n= 0;
		
		System.out.println("Introduce n numeros: " + n);
		n = sc.nextInt();
		
		eco(n);
	}
	
		
		
		static void eco(int a ) {
			for (int i = 0; i < a; i++) {
				System.out.println("Ecoo");
			}
		}
	}


