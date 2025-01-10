package Arrays;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Ejercicio_4_8_Random_pares {

	public static void main(String[] args) {
		//Escribe la función int[] rellenaPares(int longitud, int fin)
		//que crea y devuelve una tabla ordenada de la longitud especificada, 
		//que se encuentra rellena con números pares aleatorios comprendidos en el rango desde 2 hasta fin (inclusive).
		//Escribe un programa que solicite al usuario la longitud de la tabla 
		//y el último número del rango de creación de números aleatorios (fin), y haga uso de la función, escribiendo en pantalla la tabla devuelta.
		
		Scanner sc = new Scanner (System.in);
		
		System.out.println("Introduce la longitud del array ");
		int longitud = sc.nextInt();
		
		System.out.println("Introduce el numero final ");
		int fin = sc.nextInt();
		
		int[] resultado = rellenaPares(longitud, fin);
			
			Arrays.sort(resultado);
			System.out.println(Arrays.toString(resultado));
		}
		
	
		static int[] rellenaPares(int longitud, int fin) {
		
			Random rand = new Random();
			
			int[] array = new int[longitud];
			
			for(int i = 0; i < array.length; i++ ) {
				array[i] = rand.nextInt((fin/2)+1)*2;
			}
			return array ;
		}
}

		