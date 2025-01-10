package Tema_2;

import java.util.Scanner;

public class Ejercicio_5_ordenar_decreciente {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Introduce el primer numero: ");
		int num1 = sc.nextInt();
		
		System.out.println("Introduce el segundo numero: ");
		int num2 = sc.nextInt();
		
		if(num1 > num2) {
			System.out.println(num1 + "-" + num2);
		}else {
			System.out.println(num2 + "-" + num1);
		}
		
		int mayor = num1 > num2 ? num1 : num2; //Si num1 es mayor, entonces mayor = n1, si no = n2
		
		int menor = num1 < num2 ? num1 : num2; //Si num1 es menor que num2, entonces menor = n1, si no = n1;
	
		
		System.out.println(mayor + "-" + menor);
				

	}

}
