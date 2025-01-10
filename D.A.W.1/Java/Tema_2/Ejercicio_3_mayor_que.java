package Tema_2;

import java.util.Scanner;

public class Ejercicio_3_mayor_que {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Introduce el primer numero");
		int num1 = sc.nextInt();
		
		System.out.println("Introduce el segundo numero distinto al primero: ");
		int num2 = sc.nextInt();
		
		if(num1 < num2) {
			System.out.println("El numero mayor es: " + num2);
		}else {
			System.out.println("El numero mayor es: " + num1);
		}

	}

}
