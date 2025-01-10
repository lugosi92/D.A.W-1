package Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class Ejercicio8b {

	public static void main(String[] args) {
		/*
		 * almacenar n numeros en una tabla
		 * tabla con valores pares y otra con impares
		 */
		
		Scanner sc = new Scanner(System.in);
		
		
		
		System.out.println("Cuantos numeros vas a introducir");
		int n = sc.nextInt();
		
		int[] array  = new int[n];
		
		for (int i = 0; i < array.length; i++) {
			System.out.println("Introduce los numeros");
			array[i] = sc.nextInt();
		}
		
		System.out.println(Arrays.toString(array));
		
		int[] pares = new int[0];
		int[] impares = new int[0];
		
		for (int i = 0; i < array.length; i++) {
			if(array[i] %  2 == 0) {
				pares = Arrays.copyOf(pares, pares.length+1);
				pares[pares.length-1] = array[i];
			}else {
				impares = Arrays.copyOf(impares, impares.length+1);
				impares[impares.length-1] = array[i];
			}	
		}
		
		Arrays.sort(pares);
		Arrays.sort(impares);
		
		System.out.println(Arrays.toString(pares));
		System.out.println(Arrays.toString(impares));

	}

}
