package Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class Ejercicio_3_inverso {

	public static void main(String[] args) {
		/*
		 * Solicitar n numeros
		 * Introducir n numeros
		 * Mostrar orden inverso
		 */
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Intruduce cantidad de numeros: " );
		int num = sc.nextInt();
		
		int[] array = new int[num];
		
		for (int i = 0; i < array.length; i++) {
			System.out.println("Introduce los numeros: ");
			array[i] = sc.nextInt();
			
		}
		
		System.out.println("Orden inverso");
		for (int i = array.length -1; i >=0; i--) {
			System.out.println(array[i]);
			
		}

	}

}
