package Tema_1;

import java.util.Scanner;

public class Ejercicio_12_Valor_absoluto {

	public static void main(String[] args) {
		

		Scanner sc = new Scanner(System.in);
		
		System.out.println("Introduce un numero: ");
		int num = sc.nextInt();
		
		int valorAbsoluto = Math.abs(num);
		
		int abosluto = num > 0 ? num : -1 * num; 
		
		System.out.println("El valorAbsoluto es: " +valorAbsoluto);
		
		System.out.println("El valor absooluto es: " + abosluto);

	}

}
