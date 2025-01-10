package Tema_3;

import java.util.Scanner;

public class Ejercicio_9_tablas_multiplicar {

	public static void main(String[] args) {
		//pedir un numero entre 1 y 10
		//mostrar su tabla de multplicar
		
		
		Scanner sc = new Scanner(System.in);
		int num = 0;
	
		do {
			System.out.println("Introduce un numero (1-10)");
			num = sc.nextInt();
		}while(!(num>= 1 && num<=10));
		
		for (int i = 0; i < 10; i++) {
			System.out.println(num + "*" + i + "=" + num * i);
		}
		

	}

}
