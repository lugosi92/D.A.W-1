package Arrays;

import java.util.Arrays;
import java.util.Iterator;
import java.util.Scanner;

public class Ejercicio_4_6_tabla_al_reves {

	public static void main(String[] args) {
		// Escribir una aplicación que solicite al usuario cuántos números desea introducir.
		// A continuación, introducir los números por teclado.
		// El programa devuelve los números en orden inverso al introducido.
		Scanner sc = new Scanner(System.in);

		// INTRODUCE LAS CANTIDAD DE NUMEROS
		System.out.println("Introduce la cantidad de numeros: ");
		int numeros = sc.nextInt();

		int[] array = new int[numeros];

		// INTRODUCE LOS NUMEROS POR TECLADO
		for (int i = 0; i < array.length; i++) {
			System.out.println("Introduce el valor de cada numero ");
			array[i] = sc.nextInt();
		}
		
		//ORDEN INVERSO 
		for ( int i = array.length - 1 ; i >=0; i--) {
			System.out.println("Nuneros inversos " + array[i]);
		}

	}

}
