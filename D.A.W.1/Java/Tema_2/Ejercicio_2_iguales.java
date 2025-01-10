package Tema_2;

import java.util.Scanner;

public class Ejercicio_2_iguales {

	public static void main(String[] args) {
		
		
		Scanner sc= new Scanner (System.in);
		
		System.out.println("Intrudce el primer numero: ");
		int num1 = sc.nextInt();
		
		System.out.println("Intrudce el segundo numero: ");
		int num2 = sc.nextInt();
		
		if(num1 == num2) {
			System.out.println("Los numeros son iguales");
		}else {
			System.out.println("Los numeros son distintos");
		}

	}

}
