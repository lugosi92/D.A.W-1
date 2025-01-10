package Tema_1;

import java.util.Scanner;

public class Ejercicio_4_calcular_edad {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Introduce el año actual: ");
		int añoActual = sc.nextInt();
		
		System.out.println("Introduce tu año de nacimiento: ");
		int añoNacimiento = sc.nextInt();
		
		int edadActual = añoActual - añoNacimiento;
		
		System.out.println("Su edad es: " + edadActual);
		
		

	}

}
