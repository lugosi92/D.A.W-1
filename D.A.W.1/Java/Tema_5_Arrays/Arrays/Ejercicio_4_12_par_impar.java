package Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class Ejercicio_4_12_par_impar {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("¿Cuantos numeros vas a introducir?");
		int numero = sc.nextInt();
		
		int[] arrayTotal = new int[numero];
		int[] arrayPar = new int[numero];
		int[] arrayImpar = new int[numero];
	
		
		
		
		for (int i = 0; i < arrayTotal.length; i++) {
			System.out.println("Introduce los "+numero+" numeros");
			arrayTotal[i] = sc.nextInt();
		}	
		
		int indicePar = 0;
		int indiceImpar = 0;
		
		for (int j = 0; j < arrayTotal.length; j++) {
			if(arrayTotal[j] %2==0) {
				arrayPar[indicePar] = arrayTotal[j];	
				indicePar++;
			}else {
				arrayImpar[indiceImpar] = arrayTotal[j];
				indiceImpar++;
			}
		}
			
		Arrays.sort(arrayPar);
		Arrays.sort(arrayImpar);
		
		
		System.out.println("El arreglo par es ");
		for (int num : arrayPar) {
			System.out.println(num +"");
		}
		System.out.println();
		
		System.out.println("El areglo impar es " + arrayImpar);
		for (int num : arrayImpar) {
			System.out.println(num +"");
		}
		System.out.println();
	}
}
