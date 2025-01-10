package Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class Ejercicio_5_rellenaPares {

	public static void main(String[] args) {
		/*
		 * Funcion que cree y devuelva una tabla ordenada de longitud especificada
		 * Tabla rellena con numeros aleatorios  pares desde el 2 hasta el fin
		 */

		Scanner sc = new Scanner(System.in);
		
		System.out.println("Introduce la longitud");
		int longitud = sc.nextInt();
		
		System.out.println("Introduce el fin");
		int fin = sc.nextInt();
		
		int[] tabla = rellenaPares(longitud, fin);
		
		System.out.println(Arrays.toString(tabla));
		
		
	}
	
	static int[] rellenaPares(int longitud, int fin) {
		
		int[] array = new int[longitud];
		
		for (int i = 0; i < array.length; i++) {
			 array[i] = (int) (Math.random() * (fin / 2)) * 2 + 2;
				
		}
		
		Arrays.sort(array);
		return array;
	}
	//(Math.random()*(fin/2)) * 2 + 2;
	
	
	
	
	
}
