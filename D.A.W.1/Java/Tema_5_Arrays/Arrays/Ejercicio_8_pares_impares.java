package Arrays;

import java.util.Arrays;
import java.util.Iterator;
import java.util.Scanner;

public class Ejercicio_8_pares_impares {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		/*
		 * Pedir cuantos numero va a introducir
		 * Introducir n numeros
		 * Constrouir tabla con numeros par de la orginial 
		 * idem impar
		 */
		
		
		
		System.out.println("¿Cuantos numeros vas a introducir?");
		int num = sc.nextInt();
		
		
		int[] array = new int[num];
		System.out.println("Introduce los " + num + " numeros");
		for (int i = 0; i < array.length; i++) {
			array[i] = sc.nextInt();
		}
		
		
		int[] par = new int[0];
		int[] impar = new int[0];
		
		
		
		for (int i = 0; i < array.length; i++) {
			if(array[i] % 2  == 0) {
				par = Arrays.copyOf(par, par.length+1);
				par [par.length-1] = array[i];
			}else {
				impar = Arrays.copyOf(impar, impar.length+1);
				impar [impar.length-1] = array[i];
			}
		}
		
			Arrays.sort(par);
			Arrays.sort(impar);
			
			System.out.println(Arrays.toString(par));
			System.out.println(Arrays.toString(impar));
			
		
		
		
		

	}

}
